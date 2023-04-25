import json,sys
from typing import Tuple

def parse_interval(intervalStr:str)->Tuple[int,int]:
    splitted=intervalStr.split("-")
    if len(splitted)>1:
        return int(splitted[0]),int(splitted[1])
    else:
        return int(splitted[0]),int(splitted[0])

def add_matches(json_obj,result_json_obj, start:int,dest:int):
    for key in json_obj:
        if start<=json_obj[key]["num"] <=dest and "baseSpecies" not in json_obj[key]:
            result_json[key]=json_obj[key]









with open(sys.argv[1]) as f:
    json_obj=json.load(f)
out_path=sys.argv[2]
result_json={}
for interval in sys.argv[3:]:
    start,to=parse_interval(interval)
    add_matches(json_obj,result_json,start,to)
with open(out_path,"w+") as f:
    json.dump(result_json,f)