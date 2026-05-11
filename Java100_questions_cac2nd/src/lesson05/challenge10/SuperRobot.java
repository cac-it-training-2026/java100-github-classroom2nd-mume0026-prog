package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {
	String makeEggDishes(int porkNum, int beefNum, int eggNum, int onionNum) {

		int needPork = porkNum - 100;
		int needBeef = beefNum - 100;
		int needEgg = eggNum - 2;
		int needonion = onionNum - 50;
		String menu = null;

		if (needPork >= 0 && needBeef >= 0 && needEgg >= 0 && needonion >= 0) {
			menu = "ハンバーグ";
		} else if (needEgg >= -1) {
			menu = "卵焼き";
		} else {
			menu = null;
		}
		return menu;

	}
}

public class SuperRobot {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("豚ひき肉の量を入力してください（グラム）＞");
		String porkString = br.readLine();
		int porkNum = Integer.parseInt(porkString);

		System.out.print("\n牛ひき肉の量を入力してください（グラム）＞");
		String beefString = br.readLine();
		int beefNum = Integer.parseInt(beefString);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\n玉ねぎの量を入力してください（グラム）＞");
		String onionString = br.readLine();
		int onionNum = Integer.parseInt(onionString);

		Robot robot = new Robot();
		String menu = robot.makeEggDishes(porkNum, beefNum, eggNum, onionNum);
		if (menu == null) {
			System.out.println("\n何も作れません。");
		} else {

			System.out.println("\n" + menu + "ができました。");
		}
	}
}
