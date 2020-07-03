package BigDe;

/**************************/
/* 小数演算                */
/**************************/

import java.math.BigDecimal;

public class BigDe {
	public static void main(String[] args) {

				System.out.println(1.5 - 6 * 0.1);

				BigDecimal b1 = new BigDecimal("1.5");
				BigDecimal b2 = new BigDecimal("-6");
				BigDecimal b3 = new BigDecimal("0.1");

				BigDecimal result = b1.add(b2.multiply(b3));

				System.out.println(result);
	}
}
