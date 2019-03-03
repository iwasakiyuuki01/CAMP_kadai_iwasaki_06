import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 質問を格納する配列の宣言・初期化
        String[] questions = {"私はハンバーグが好きだ",
                "休日に運動をよくする",
                "麻雀が好きだ",
                "8時間以上睡眠しないと駄目だ",
                "ボウリングが好きだ"};
        // スキャナー変数の宣言
        Scanner scanner = new Scanner(System.in);
        // 値の合計値を集計する変数の宣言
        int sum = 0;
        // 答えを答えた数を集計する変数の宣言
        int answer_count = 0;
        // 入力した内容を格納する変数の宣言
        int input_num = 0;


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("1: あてはまらない 2: あまりあてはらまらない 3: まあまああてはまる 4: あてはまる");

            input_num = scanner.nextInt();

            // 99と入力されたら抜ける
            if (input_num == 99) {
                break;
            }

            sum += input_num;
            //sumにたし合わせる
            answer_count++;
        }

        System.out.println("診断結果");
        if (sum <= 4 * answer_count && sum > 3 * answer_count) {
            System.out.println("あなたと私の相性は抜群です！めっちゃ相性いいですねー");
        } else if (sum <= 3 * answer_count && sum > 2 * answer_count) {
            System.out.println("あなたと私の相性はまあまあです！今度一緒にごはんたべましょう");
        } else if (sum <= 2 * answer_count && sum > 1 * answer_count) {
            System.out.println("あなたと私の相性は微妙です。まずはお友達から...");
        } else {
            System.out.println("あなたと私の相性は最悪です。どこかで会っても無視しないでくださいね。");
        }
    }
}
