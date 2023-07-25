package compf.core.engine.pokemon.effects.moveSpecific;

import compf.core.engine.BattleAction;
import compf.core.engine.pokemon.Pokemon;
import compf.core.engine.pokemon.effects.EffectParam;
import compf.core.engine.pokemon.effects.PokemonBattleEffect;
import compf.core.engine.pokemon.moves.DamageInformation;
import compf.core.engine.pokemon.moves.Schedule;
import compf.core.engine.pokemon.moves.Schedule.ScheduleItem;
import compf.core.etc.services.SharedInformation;

public class FlyingEffect extends PokemonBattleEffect {
    private boolean newRound = false;
    private boolean isFlying = true;
    private DamageInformation dmg;
    private ScheduleItem item;

    public FlyingEffect(Pokemon pkmn) {
        super(pkmn);
    }

    @Override
    public void roundEnding(EffectParam param) {
        newRound = true;
    }

    @Override
    public void attack(EffectParam param) {
        if(!isMeAttacking(param))return;;
        SharedInformation.Instance.getLoggerService().log("Use attack fly",FlyingEffect.class);
        if (!(newRound)) {
            SharedInformation.Instance.getLoggerService().log("Flying killed",FlyingEffect.class);
            var additionData=(EffectParam.AdditionalDirectDamageData)param.additionalData() ;
            DamageInformation inf = additionData.getDamageInformation();
            item = additionData.getScheduleItem();
            this.dmg = inf.clone();
            inf.kill();

        } else {
            isFlying = false;
            SharedInformation.Instance.getLoggerService().log("use flying",FlyingEffect.class);
            disable();
        }

    }

    @Override
    public void delayedAttack(EffectParam param) {
        Schedule schedule = param.schedule();
        schedule.addMove(item.getAttackerPos(), item.getDefenderPos(), item.getMove(), 0);
    }

    @Override
    public boolean canAttack() {
        return newRound;
    }

    @Override
    public boolean canReceiveCommand() {
        return !isFlying;
    }

    @Override
    public BattleAction getBattleAction() {
        return null;
    }

    @Override
    public void defend(EffectParam param) {
        if(!isMeDefending(param))return;
        if (isEnabled()) {
            param.additionalData().killFully();
            addMessage(getPokemon() + " is flying and thus not vulnerable");
        }
    }
}
