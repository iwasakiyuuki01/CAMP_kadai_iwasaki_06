package com.company;

public class ObjectPratice05 {
    public static void main(String[] args) {

        Person person1 = new Person("", "");
        Person person2 = new Person("森田", "奈良");
        Person person3 = new Person("木村", "埼玉");
        Person person4 = new Person("高山", "東京");
        Person person5 = new Person("茂木", "沖縄");

        person1.getSelfIntroduction2();
        person2.getSelfIntroduction3();
        person3.getSelfIntroduction3();
        person4.getSelfIntroduction3();
        person5.getSelfIntroduction3();

    }
}
