package com.company;

public class Word {
    String word;
    String meaning;

    public Word(String input_word, String input_meaning) {
        word = input_word;
        meaning= input_meaning;
    }
    public void WordMeaning(){
        System.out.println("言葉: " + word + "意味: " + meaning);
    };

}
