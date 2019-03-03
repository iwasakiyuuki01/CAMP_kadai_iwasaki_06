package com.company;

public class Person {
    public String name;
    public String raduateg;


    public Person(String input_name, String input_raduateg) {
        name = input_name;
        raduateg = input_raduateg;
    }

    public void getSelfIntroduction() {
        System.out.println("私の名前は" + name + "です。" + raduateg + "出身です。");
    }

    public void getSelfIntroduction2() {
        System.out.println("名前 " + "出身");
    }

    public void getSelfIntroduction3() {
        System.out.println(name + " " + raduateg);

    }
}
