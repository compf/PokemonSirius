import sys,json
import spacy

nlp = spacy.load('en_core_web_sm')

import nltk,re
def create_name_info_object(typ,desc):
    return {"type":typ,"desc":desc,"names":[]}
class StatsLowered:
    pass








replace={
    " one ":" 1 ",
    " two ":" 2 ",
    " three ":" 3 ",
    " four ":" 4 ",
    " five ":" 5 ",
    " six ":" 6 ",
    " seven ":" 7 ",
    " eight ":" 8 ",
    " nine ":" 9 ",
    " ten ":" 10 ",
    

}

pattern_name_dict={
    " stats? ":create_name_info_object(None,"Stats are changed"),
    r"raised by \d stages?":create_name_info_object(None,"Stats are raised"),
    r"lowered by \d stages?":create_name_info_object(None,"Stats are lowered"),

    "(?<!Special) Attack":create_name_info_object(None,"Physical  attack, not special affected"),
    "(?<!Special) Defense":create_name_info_object(None,"Physical  defense, not special affected"),
     "Special Attack":create_name_info_object(None,"Special attack affected "),
     "Special Defense":create_name_info_object(None,"Special defense affected "),
     "Speed":create_name_info_object(None,"speed affected "),

     "immun":create_name_info_object(None,"Immunity"),
     r"\d+% chance":create_name_info_object(None,"Probability"),
      r"next turn":create_name_info_object(None,"next turn"),
      r"\d(-\d)? turns":create_name_info_object(None,"multiple turns"),
    r"\d(-\d)? times":create_name_info_object(None,"multiple times"),
      r"\d+/\d+ of its maximum HP":create_name_info_object(None,"Dependent on maximum HP"),
        r"current HP":create_name_info_object(None,"Dependent on current HP"),
        "(D|d)eals damage":create_name_info_object(None,"Specific damage"),
        "critical hit":create_name_info_object(None,"critical hit"),
        "recovers":create_name_info_object(None,"HP recovering"),
        "(O| o)n switch":create_name_info_object(None,"If switching"),
        "(P| p)revent":create_name_info_object(None,"Prevents something"),
        "-type":create_name_info_object(None,"depends on type"),
        #"(T| t)he (user)|(holder)":create_name_info_object(None,"Affect the  user"),
        "No additional effect":create_name_info_object(None,"no additional effects"),
        "paralyze":create_name_info_object(None,"Something with paralysis"),
        "(p|P)oison( |ed|s)":create_name_info_object(None,"Something with poison"),
        "(a)?sleep":create_name_info_object(None,"Something with sleep"),
        "(c|C)onfus":create_name_info_object(None,"Something with confusion"),
        "(B|b)urn":create_name_info_object(None,"Something with burn"),
        "(F|f)reeze":create_name_info_object(None,"Something with freeze"),
        "recoil":create_name_info_object(None,"Something with recoil damage"),
        "held item":create_name_info_object(None,"Something to do with the held item"),
        "(((p|P)ower)|(D|d)amage)? doubled?":create_name_info_object(None,"Sometimes the power doubles"),
        "(A|a)ccuracy":create_name_info_object(None,"Something with Accuracy"),
        "(E|e)vasiveness":create_name_info_object(None,"Something to do with evasiveness"),
        "(I|i)f the target":create_name_info_object(None,"Conditional about target"),
        "(I|i)f the user":create_name_info_object(None,"Conditional about user"),
        "multiplied":create_name_info_object(None,"Something is multiplied")




}
name_pattern_dict={

}

def load_desc():
    name_desc=dict()
    with open(sys.argv[1]) as f:
        json_data=json.load(f)
        for key in json_data:
            if "desc" in json_data[key]:
                 
                name=json_data[key]["name"]
                name_desc[name]=json_data[key]["desc"]
                desc=json_data[key]["desc"]
                for r in replace:
                    desc=desc.replace(r,replace[r])
               
                annotated=nlp(desc)
                if name not in name_pattern_dict:
                    name_pattern_dict[name]={"desc":desc,"dep":"<HEAD>"+" ".join(["<"+a.dep_+">"+a.text+"</"+a.dep_+">" for a in annotated])+"</HEAD>","patterns":[]}
               
                
             
                for pattern in pattern_name_dict:
                    match=re.search(pattern,desc)
                    if match:
                     
                        pattern_name_dict[pattern]["names"].append(name)
                       
                        name_pattern_dict[name]["patterns"].append(pattern)
          

               

    #return name_desc


if __name__=="__main__":
  
    desc=load_desc()
    total=len(name_pattern_dict)
    pattern_name_dict["stats"]={}
    name_pattern_dict["stats"]={}
    for i in range(len(pattern_name_dict)):
        number=len([x for x in name_pattern_dict if x!="stats" and len(name_pattern_dict[x]["patterns"] )==i])
        pattern_name_dict["stats"][i]=number*100/total

    totalSum=sum([len(pattern_name_dict[x]["names"]) for x in pattern_name_dict if x!="stats"])
    for key in pattern_name_dict:
        if key=="stats":
            continue
        name_pattern_dict["stats"][key]=len(pattern_name_dict[key]["names"])*100/totalSum
       
    with open("pattern_name_dict_"+sys.argv[1],"w+") as f:
        json.dump(pattern_name_dict,f,indent=4)
    with open("name_pattern_dict_"+sys.argv[1],"w+") as f:
        json.dump(name_pattern_dict,f,indent=4)
     #tokens= nltk.word_tokenize(desc)
                    #tagged = nltk.pos_tag(tokens)
                    #entities = nltk.chunk.ne_chunk(tagged)
               # print(desc)
               # json_data[key]["descAnnotated"]=[]#str(entities).replace("\n","")
                #nltk.Tree.fromstring(str(entities)).pretty_print()
                #for e in entities:
                    #print(e)
                #print(entities)
                #print()
               
                #entities.draw()