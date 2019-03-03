package com.company;

public class Word {
    public String word;
    public String meaning;

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning= meaning;
    }

    @Override
    public String toString(){
        return "単語" + this.word + "意味" + this.meaning;
    }



//    public void WordMeaning(){
//        System.out.println("言葉: " + word + "意味: " + meaning);
//    };

}
