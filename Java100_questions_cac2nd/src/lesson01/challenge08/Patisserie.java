/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		double c = 30;
		double s = 30;
		double p = 30;

		System.out.println("大変お待たせいたしました。");
		System.out.println("【ポエール・エルメ】");
		System.out.println("ただいまより開店です！");

		System.out.println("本日のおすすめ商品です \n");
		System.out.println("シトロン     \\" + 250 + "・・・残り" + c + "個");
		System.out.println("ショコラ     \\" + 280 + "・・・残り" + s + "個");
		System.out.println("ピスターシュ \\" + 320 + "・・・残り" + p + "個");

		System.out.println("それぞれ何個ずつ買いますか？　(最大30個まで)\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("シトロン　>");
		String str1 = reader.readLine();
		double num1 = Double.parseDouble(str1);

		System.out.println("ショコラ　>");
		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);

		System.out.println("ピスターシュ　>");
		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("シトロン" + num1 + "個");
		System.out.println("ショコラ" + num2 + "個");
		System.out.println("ピスターシュ" + num3 + "個　\n");

		double TotalCount = num1 + num2 + num3;
		int TotalPrice = (int) (250 * num1 + 280 * num2 + 320 * num3);

		System.out.println("合計個数　　" + TotalCount + "個");
		System.out.println("合計金額　" + TotalPrice + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		c = (int) (c - num1);
		s = (int) (s - num2);
		p = (int) (p - num3);
		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン     \\" + 250 + "・・・残り" + c + "個");
		System.out.println("ショコラ     \\" + 280 + "・・・残り" + s + "個");
		System.out.println("ピスターシュ \\" + 320 + "・・・残り" + p + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売り上げの割合");
		System.out.println("売上合計　\\" + TotalPrice);

		System.out.println("\n内訳");
		double Pricec = (250 * num1);
		double Prices = (280 * num2);
		double Pricep = (320 * num3);

		double Percent1 = Pricec / TotalPrice * 100;
		double Percent2 = Prices / TotalPrice * 100;
		double Percent3 = Pricep / TotalPrice * 100;

		System.out.println("シトロン　　　\\" + (int) Pricec + "・・・" + (int) Percent1 + "%");
		System.out.println("ショコラ　　　\\" + (int) Prices + "・・・" + (int) Percent2 + "%");
		System.out.println("ピスターシュ　\\" + (int) Pricep + "・・・" + (int) Percent3 + "%");

	}
}
