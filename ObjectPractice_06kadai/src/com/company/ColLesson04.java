package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ColLesson04 {

    public static void main(String[] args) {
        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
//        Scanner scanner = new Scanner(System.in);
        ArrayList<Word> word_array = new ArrayList<>();
            word_array.add(new Word("ぬるぽ","nul pointer?"));
            word_array.add(new Word("kotoba","imi"));

        for(int i = 0; i < word_array.size(); i++) {
            System.out.println(word_array.get(i));
        }
        System.out.println(word_array.size() + "件、登録しました。" );
    }

}
