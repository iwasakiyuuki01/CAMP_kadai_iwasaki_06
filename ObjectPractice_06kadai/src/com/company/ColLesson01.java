package com.company;

import java.util.Scanner;

public class ColLesson01 {
    public static String[] word = new String[10];
    public static int[] count = new int[10];
    public static String[] mean = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        keyType: while (true) {
            System.out.println("リストに登録：1  リストの表示：2  終了：3");
            if (!scanner.hasNextInt()) {
                System.out.println("数字を入力してください");
                scanner.nextLine();
                continue;
            }
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    scanner.nextLine();
                    registerWord();
                    break;
                case 2:
                    scanner.nextLine();
                    showList();
                    break;
                case 3:
                    scanner.nextLine();
                    break keyType;
                default:
                    scanner.nextLine();
            }
        }
        System.out.println("プログラムを終了しました");
    }

    private static void registerWord() {
//             単語の登録
        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        Scanner scan = new Scanner(System.in);
        String words = scan.next();
        String meaning = scan.next();

        for (int i = 0; i < word.length; i++) {
            if (word[i] == null) {
                word[i] = words;
                mean[i] = meaning;
                count[i] = 1;
                i++;
                break;
            }
        }
    }

    private static void showList() {
//             登録リストの表示
        if (word[0] == null) {
            System.out.println("登録件数0件です");
            return;
        }
        for ( int i = 0 ; word[i] != null; i++) {
            System.out.print( "言葉:" + word[i] + " " );
            System.out.println("意味:" +  mean[i] );
        }
        System.out.println(count + "件、登録しました。");
    }

}
