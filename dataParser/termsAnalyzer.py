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
def load_json(filename:str)->dict:
    with open(filename) as f:
        return json.load(f)
def load_pokemon_terms():
    pokemon=load_json("pokedex.json")
    pokemon=[pokemon[p]["name"] for p in pokemon]

    moves=load_json("moves.json")
    moves=[moves[p]["name"] for p in moves]

    abilities=load_json("abilities.json")
    abilities=[abilities[p]["name"] for p in abilities]

    items=load_json("items.json")
    items=[items[p]["name"] for p in items]

    return set(pokemon)|set(moves)| set(abilities) | set(items)

counter={}
def shall_ignore(text:str)->bool:
    return text=="." or text=="," or text=="-" or text in common_terms
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
                
                for a in annotated:
                    if not a.is_stop and not shall_ignore(a.text):
                        if a.text not in counter:
                            counter[a.text]=0
                        counter[a.text]+=1
               
                
             
         

               

    #return name_desc


if __name__=="__main__":
    common_terms=load_pokemon_terms()
    desc=load_desc()
    counter_sorted=sorted([(counter[c],c) for c in counter])
    for c in counter_sorted:
        print(c)
   