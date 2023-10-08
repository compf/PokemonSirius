from constants import NameConstants
from typing import List
import re,sys
import json
from xml.etree.ElementTree import  Element
from bisect import bisect_right
def find_le(a, x):
    'Find rightmost value less than or equal to x'
    i = bisect_right(a, x)
    if i:
        return i-1
    raise ValueError
class AbstractAnalyzer:
    WholeSentence="\."
    SentencesAndClauses=WholeSentence+"|,\(|\)"
    def fill_facts(self,text:str, facts:dict,positions:List[int],xml:Element,index:int,prev_index:int):
        pass
    def generate_code(self,text:str,facts:dict,code:str)->str:
        pass
    def get_regex(self)->str:
        pass
    def split_sentence(self,text:str,where:str)->List[str]:
        return re.split(where,text)
    def find_mentions(self,text:str,regex:str)->List[int]:
        result=[]
        for m in re.finditer(regex,text):
            if m:
                result.append(m.start())
        return result
    def find_my_mentions(self,text:str)->List[str]:
        return self.find_mentions(text,self.get_regex())

    def find_xml_indices(self,text:str,regex:str,positions:List[int])->List[int]:
        mentions=self.find_mentions(text,regex)
        result=[]
        for m in mentions:
            result.append(find_le(positions,m))
        return result

    def find_my_xml_indices(self,text:str, positions:List[int])->List[int]:
        return self.find_xml_indices(text,self.get_regex(),positions)


    

class ByStages(AbstractAnalyzer):
    NumberStages="NumberStages"
    StatsToChange="StatsToChange"
    statsRegex=[NameConstants.PhysicalAttack,NameConstants.PhysicalDefense,NameConstants.SpecialAttack,NameConstants.SpecialDefense,NameConstants.Speed]

    def fill_facts(self,text:str, facts:dict,positions:List[int],xml:Element,index:int,prev_index:int):
        
        for s in ByStages.statsRegex:
            nextIndex=max([i for i in self.find_xml_indices(text,s,positions) if i <index and i>prev_index ],default=None)
            factorIndex=max([i for i in self.find_xml_indices(text,"lower|raise",positions) if i <index and i>prev_index ],default=None)
            if nextIndex and factorIndex:
               facts[ByStages.StatsToChange+"_"+s]=int(xml[index+1].text)*(-1 if tree[factorIndex].text.startswith("lower")else +1)
    def generate_code(self,text:str,facts:dict,code:str)->str:
        statCodes=["ATT","DEF","SATT","SDEF","INIT"]
        for i in range(len(statCodes)):
            if (ByStages.StatsToChange+"_"+ByStages.statsRegex[i]) in facts:

                replace=f"param.additionalData().getCausingPokemon().changeStatStage(PokemonStat.{statCodes[i]}, {facts[(ByStages.StatsToChange+'_'+ByStages.statsRegex[i])]});"
                code=code.replace("//%code",replace+"\n//%code")
        return code
    def get_regex(self) -> str:
        return NameConstants.ByStages














































def create_name_info_object(typ,desc):
    return {"type":typ,"desc":desc,"names":[]}
pattern_name_dict={
NameConstants.Stats:create_name_info_object(None,None),
  NameConstants.ByStages :create_name_info_object(ByStages,None),
  NameConstants.PhysicalAttack :create_name_info_object(None,None),
  NameConstants.PhysicalDefense:create_name_info_object(None,None),
  NameConstants.SpecialAttack:create_name_info_object(None,None),
  NameConstants.SpecialDefense:create_name_info_object(None,None),
  NameConstants.Speed:create_name_info_object(None,None),
  NameConstants.Immune:create_name_info_object(None,None),
  NameConstants.Chance:create_name_info_object(None,None),
  NameConstants.NextTurn:create_name_info_object(None,None),
  NameConstants.MultipleTurns:create_name_info_object(None,None),
  NameConstants.MultipleTimes:create_name_info_object(None,None),
  NameConstants.DependentOnMaxHP:create_name_info_object(None,None),
  NameConstants.DependentOnCurrHP:create_name_info_object(None,None),
  NameConstants.DealsDamage:create_name_info_object(None,None),
  NameConstants.CriticalHit:create_name_info_object(None,None),
  NameConstants.Recovers:create_name_info_object(None,None),
  NameConstants.OnSwitch:create_name_info_object(None,None),
  NameConstants.Prevent:create_name_info_object(None,None),
  NameConstants.BasedOnType:create_name_info_object(None,None),
  NameConstants.NoEffect:create_name_info_object(None,None),
  NameConstants.Paraylzed:create_name_info_object(None,None),
  NameConstants.Poisoned:create_name_info_object(None,None),
  NameConstants.Asleep:create_name_info_object(None,None),
  NameConstants.Confused:create_name_info_object(None,None),
  NameConstants.Burn:create_name_info_object(None,None),
  NameConstants.Freeze:create_name_info_object(None,None),
  NameConstants.Recoil:create_name_info_object(None,None),
  NameConstants.HeldItem:create_name_info_object(None,None),
  NameConstants.PowerOrDamageDoubled :create_name_info_object(None,None),
  NameConstants.Accuracy:create_name_info_object(None,None),
  NameConstants.Evasiveness:create_name_info_object(None,None),
  NameConstants.IfTarget:create_name_info_object(None,None),
  NameConstants.IfUser:create_name_info_object(None,None),
  NameConstants.Multiplied:create_name_info_object(None,None),




}
def make_valid_identifier(name:str)->str:
    name= name.replace(" ","_").replace("-","_").replace("(","_").replace(")","_").replace("'","_")
    if re.match("\d",name):
        name="_"+name

    return name
import xml.etree.ElementTree as ET
code=""
if __name__=="__main__":
    with open("template.java") as f:
        code=f.read()
    with open("name_pattern_dict_"+sys.argv[1]) as f:
        json_obj=json.load(f)
    del json_obj["stats"]
    for key in json_obj:
        facts={}
        obj=json_obj[key]
        code_duplicate=code.replace("%Name",make_valid_identifier(key))
        code_duplicate=code_duplicate.replace("%Description",obj["desc"])
        code_duplicate=code_duplicate.replace("%Original_Name",key)

       
        tree=ET.fromstring(obj["dep"])
        for pattern in obj["patterns"]:
            if pattern_name_dict[pattern]["type"]!=None:
                anaylzer=pattern_name_dict[pattern]["type"]()
            else:
                continue
            indices=anaylzer.find_my_xml_indices(obj["desc"],obj["positions"])
            prev_index=-1
            for i in indices:
                anaylzer.fill_facts(obj["desc"],facts,obj["positions"],tree,i,prev_index)
                code_duplicate=anaylzer.generate_code(obj["desc"],facts,code_duplicate)
                prev_index=i
        
            #print(mentions)
        f_name=f"../core/src/main/java/compf/core/engine/pokemon/effects/newEffects/{sys.argv[1].replace('.json','')}/"+make_valid_identifier(key)+".java"
        if not  re.search("TR\d+",f.name):
            with open(f_name,"w+") as f:
                if not  re.search("TR\d+",f.name):
                    f.write(code_duplicate)
