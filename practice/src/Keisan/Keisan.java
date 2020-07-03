package Keisan;

/*******************/
/* 消費税計算        */
/*******************/

/*	-<keisan>--------------------------------------
 定価1000円の商品の税込価格を計算して表示するプログラムです。
 消費税は１０％で計算しています。
 --------------------------------------------------*/

public class Keisan {
	public static void main(String[] args) {

		int    teika   = 5000;
		double zeiritu = 1.1;
        double siharai = teika * zeiritu;

        System.out.println(siharai);
	}
}
