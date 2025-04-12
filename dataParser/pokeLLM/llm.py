from openai import OpenAI
from typing import List
import time
import os
def openFile(p:str, addPath=True)->str:
    with open(p) as f:
        c= f.read()
        if addPath:
            c=p+"// "+"\n"+c
        return c
token=open("/home/compf/data/gitgraf/tokens/CHATGPT_TOKEN").readline()
print(token)
PROMPT_TEXT="""
You are a programming assistant for a pokemon game in Java. 
I will provide with context files that contains exsting source code for various pokemon action.
YOur task is to implement a new effect (e. g. an item effect). A comment implemenenting the effect already exists, but is using Javascript and a different engine.

Try only to change the file of the effect and not the existing context files, but do change them if it necessary.

Use the following output format

// path1.java
``java
// The updated source code for path1.java
``

// path2.java
// The updated source code for path1.java
``
...
"""


PROMPT_EFFECT_FILES="Now come the new effect files that must be updated"
client = OpenAI(api_key=token)


def create_openai_messages(messages:List[str]):
    messages=[{"role":"developer","content":m } for m in messages]
    response=completion = client.chat.completions.create(
    model="gpt-4o",
    messages=messages
    
    )
    return response.choices[0].message.content


context_files = [
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/BattleEffect.java",
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/BattleEffectCollection.java",
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/BattleEffectService.java",
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/EffectName.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/EffectParam.java",
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/EffectTime.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/GlobalBattleEffect.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/ItemEffect.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/PokemonBattleEffect.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/RandomSwapPokemonEffect.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/StubPokemonEffect.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/SwapPokemonEffect.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/DamageInformation.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/DelayedMove.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/GlobalEffectMove.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/Move.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/MultipleAttacksMove.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/MultipleRoundsMove.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/PokemonEffectMove.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/OHKO_Move.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/Schedule.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/StatModifyingMove.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/moves/SwapPokemonMove.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/IStateCondition.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/Nature.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/PokedexEntry.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/Pokemon.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/PokemonStat.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/PokemonTypeHolder.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/Type.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/BattleAction.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/BattleRoundResult.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/BattleRule.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/BattleState.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/DetailedBattleState.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/Interrupt.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/Player.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/PokemonBattle.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/etc/MyObject.java", 
    "/home/compf/data/PokemonSirius/core/src/main/java/compf/core/etc/PokemonConstants.java"
]
context_files=[openFile(p) for p in context_files]
file_under_consideration=""
prompt_header=[PROMPT_TEXT,
               *context_files,
               PROMPT_EFFECT_FILES
]
error_files=[]
BASE_PATH="/home/compf/data/PokemonSirius/core/src/main/java/compf/core/engine/pokemon/effects/newEffects"
for p, dirs, files in os.walk(BASE_PATH):
    for filePath in files:
        content=openFile(os.path.join(BASE_PATH,p,filePath))
        print()
        print(" OLD ########################################################################################")
        print(content)
        print("#########################################################################################")
        print()
        res=create_openai_messages([*prompt_header,content])

        print("NEW ##############################################################################")
        print(res)
        print("####################################################################################")
        print()

        time.sleep(1)
