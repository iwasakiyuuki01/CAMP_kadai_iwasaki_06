package com.company;

import java.util.Scanner;

public class ColLesson01 {
    public static Word[] words = new Word[10];

    public static void main(String[] args) {

        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int index = 0;
        while (!input.equals("e")) {
                String[] tmp = input.split(" ");
                Word wd = new Word(tmp[0], tmp[1]);
                words[index] = wd;
                index++;
                System.out.println("次の単語と意味を入力してください。”e”で終了します。");
                input = scanner.nextLine();
            }
            for(int i =0; i < index; i++){
                System.out.println(i+1 + "  単語:" + words[i].word + " 意味:" + words[i].meaning);
            }
            System.out.println(index + "件、登録しました。");
        }
    }
