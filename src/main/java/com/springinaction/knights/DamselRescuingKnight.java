package com.springinaction.knights;

/**
 * Created by arvin on 2017/12/11.
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;
    public DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }
    public void embarkonQuest(){
        quest.embark();
    }
}
