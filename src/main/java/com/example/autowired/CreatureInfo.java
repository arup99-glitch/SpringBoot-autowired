package com.example.autowired;

import com.example.autowired.implementation.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatureInfo {
    @Autowired
    private Human creature;
    public void setInfo(String thinking,String emotion,String memory)
    {
        creature.setThinking(thinking);
        creature.setEmotion(emotion);
        creature.setMemory(memory);
    }
    public void print(){
        System.out.println(creature.getEmotion());
        System.out.println(creature.getMemory());
        System.out.println(creature.getThinking());
    }

}
