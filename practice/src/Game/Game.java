package Game;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**************************/
/* アメリカの首都当てゲーム   */
/**************************/

public class Game {
	public static void main(String[] args) {

		int answer = 0;
		String message = "間違いです。";

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.println("[1] アメリカの首都はどこですか？");
		System.out.println("[2]１：ニューヨーク");
		System.out.println("[3]２：ワシントン");
		System.out.println("[4]３：ロサンゼルス");
		System.out.print("[5]答えを番号で入力し、改行を押してください。=>");

		try {
			String buf = bufferedReader.readLine();
			answer = Integer.parseInt(buf);
		} catch(Exception exception) {
			answer = 0;
			message = "答えを番号で入力してください。";
		}

		if(answer == 2) {
			message = "正解です。";
		}

        System.out.println(message);
	}

}



