package com.springinaction.knights;

/**
 * Created by arvin on 2017/12/11.
 */
public class BraveKnight implements Knight {
    private Quest quest;
    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest(){
        quest.embark();
    }
}
