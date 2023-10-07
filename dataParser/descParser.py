import sys,json
import spacy
from descAnalyzer import pattern_name_dict
nlp = spacy.load('en_core_web_sm')

import nltk,re

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


pattern_desc_dict=dict((k,[]) for k in pattern_name_dict)
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
                    name_pattern_dict[name]={"desc":desc,"dep":"<HEAD>"+" ".join(["<"+a.dep_+">"+a.text+"</"+a.dep_+">" for a in annotated])+"</HEAD>","patterns":[],"positions":[a.idx for a in annotated]}
               
                for pattern in pattern_name_dict:
                    if "type" in pattern_name_dict[pattern]:
                        del pattern_name_dict[pattern]["type"]
                for pattern in pattern_name_dict:
                    match=re.search(pattern,desc)
                    if match:
                     
                        pattern_name_dict[pattern]["names"].append(name)
                        pattern_desc_dict[pattern].append(desc)
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
    with open("pattern_desc_dict_"+sys.argv[1],"w+") as f:
        json.dump(pattern_desc_dict,f,indent=4)
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