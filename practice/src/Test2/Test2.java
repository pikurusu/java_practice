package Test2;
import java.util.Random;
import java.util.Scanner;


/*******************/
/* 数字当てゲーム    */
/*******************/

class Test2 {
	public static void main(String[] args) {
		Integer answer = new Random().nextInt(10) + 1;
		Integer count  = 0;

		while(true) {
			System.out.println("Please enter a number from 1 to 10");

			Integer guess = new Scanner(System.in).nextInt();
			//count=count +1;
			//count+=1;

			count++;

			if(answer == guess) {
				System.out.println("Bingo! It took" + count + "guesses!");
				break;
			}else if(answer > guess) {
				System.out.println("The answer is higher!");
			}else {
				System.out.println("The answer is lower!");
			}
		}
	}
}
