/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題9  あとかたづけロボットの追加
 *
 * 引数として渡された食材を
 * 0でクリアするクラスを作成します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  あとかたづけをしてくれるロボットも欲しいところですね。
 *
 *  G博士：
 *  そうれはもう作ってあるぞ。
 *
 *  Rさん：
 *  えっ！どうやって使うんですか？
 *
 *  G博士：
 *  今まで使ってきた材料を一つにまとめて渡すときれいにしてくれるんじゃ。
 *
 *  Rさん：
 *  早速やってみます。
 *
 *  小麦粉の量を入力してください（グラム）＞○
 *
 *  砂糖の量を入力してください（グラム）＞○
 *
 *  卵の個数を入力してください＞○
 *
 *  バターの量を入力してください（グラム）＞○
 *
 *  【※調理できる料理】が出来ました。
 *
 *  あとかたづけをします。
 *
 *  小麦粉  ：0g
 *  砂糖    ：0g
 *  卵      ：0個
 *  バター  ：0g
 *
 *  きれいになりました。
 *
 */

package lesson05.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {
	int energy;
	String name;
	int water;

	public void randumWater() {
		water = (int) (Math.random() * 9) + 1;
	}

	public void pumpWater() {
		System.out.println("\n水を" + water + "リットル出します");
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void makeOmlet(int eggNum, int butterNum) {
		int bestEgg = eggNum / 2;
		int bestButter = butterNum / 5;

		if (bestEgg > bestButter) {
			System.out.println("\n" + bestButter + "人分のオムレツを作成しました。\n");
		} else {
			System.out.println("\n" + bestEgg + "人分のオムレツを作成しました。\n");
		}
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {

		int needFlour = flourNum - 170;
		int needSugar = sugarNum - 50;
		int needEgg = eggNum - 2;
		int needButter = butterNum - 80;
		String menu = null;

		if (needFlour >= 0 && needSugar >= 0 && needEgg >= -1 && needButter >= 0) {
			menu = "クッキー";
		} else if (needEgg >= 0 && needButter >= -75) {
			menu = "オムレツ";
		} else if (needEgg >= -1) {
			menu = "ゆで卵";
		} else {
			menu = null;
		}
		return menu;

	}
}

class ClearRobot {
	void clearTable(int[] ingredients) {
		ingredients[0] = 0;
		ingredients[1] = 0;
		ingredients[2] = 0;
		ingredients[3] = 0;
	}
}

public class RobotMaker {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("あとかたづけをしてくれるロボットも欲しいところですね。\n");
		System.out.println("G博士：");
		System.out.println("そうれはもう作ってあるぞ。\n");
		System.out.println("Rさん：");
		System.out.println("えっ！どうやって使うんですか？\n");
		System.out.println("G博士：");
		System.out.println("今まで使ってきた材料をまとめて、料理と一緒に渡すときれいにしてくれるんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("早速やってみます。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		Robot robot = new Robot();
		String menu = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);
		if (menu == null) {
			System.out.println("\n何も作れません。");
		} else {
			System.out.println("\n" + menu + "ができました。");
		}

		System.out.println("\nあとかたづけをします。\n");
		int[] ingredients = new int[4];
		ingredients[0] = flourNum;
		ingredients[1] = sugarNum;
		ingredients[2] = eggNum;
		ingredients[3] = butterNum;

		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("小麦粉  ：" + ingredients[0] + "g");
		System.out.println("砂糖    ：" + ingredients[1] + "g");
		System.out.println("卵      ：" + ingredients[2] + "個");
		System.out.println("バター  ：" + ingredients[3] + "g");

		System.out.println("\nきれいになりました。");
	}

}
