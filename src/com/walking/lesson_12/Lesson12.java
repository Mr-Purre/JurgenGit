package com.walking.lesson_12;

public class Lesson12 {
    private String name;



    public static void main(String[] args){
        Lesson12 l12 = new Lesson12();

        l12.setName("Jhon");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
