package com.example.autowired.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human{
    private String thinking;
    private String emotion;
    private  String memory;
    public Human(){
        System.out.println("Human Created");
    }
    public  Human(String thinking,String emotion,String memory)
    {
        this.thinking=thinking;
        this.emotion=emotion;
        this.memory=memory;
    }

    public void printConfiguration()
    {
        System.out.println("Thinking : "+this.thinking);
        System.out.println("Emotion : "+this.emotion);
        System.out.println("Memory : "+this.memory);
    }
    public String getThinking(){
        return thinking;
    }
    public void setThinking(String thinking){
        this.thinking=thinking;
    }
    public String getEmotion(){
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
