/**
 * 第4章 倉庫番のお仕事
 *
 * 問題13 あいさつロボット
 *
 * XO商事では来客対応用にあいさつロボット「MISAKI○」を
 * 中古で購入しました。
 * しかし残念なことに前のオーナーが寿司屋だったらしく
 * MISAKI○には寿司屋用のあいさつ音声しか入っていません。
 *
 * そこでYさんは、MISAKI○の音声を録音し直すことにしました。
 * 音声のパターンは全部で三つあり、それぞれ
 *
 * 1...お客様が来社された時のあいさつ
 * 2...ご用件をうかがう際のあいさつ
 * 3...お客様がお帰りになる時のあいさつ
 *
 * となっています。
 * ただし、三つのパターンのうち、
 * 変更できるパターンは一つだけです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Yさん：
 *  まず、MISAKI○の今の状態を確かめようかな。
 *
 *  あいさつパターン1...「へい！らっしゃい！！」
 *
 *  あいさつパターン2...「何にしますか！今日は活きのいいコハダが入ってますよ」
 *
 *  あいさつパターン3...「まいどあり！！またどうぞ」
 *
 *  Yさん：
 *  うわぁ～。どれか変更しよう。
 *
 *  どのパターンを変更しますか＞2
 *
 *  あいさつを吹き込んでください＞ご用件をお伺い致します。
 *
 *  Yさん：
 *  よし。もう一度確かめてみよう。
 *
 *  あいさつパターン1...「へい！らっしゃい！！」
 *
 *  あいさつパターン2...「ご用件をお伺い致します。」
 *
 *  あいさつパターン3...「まいどあり！！またどうぞ」
 *
 *  Yさん：
 *  まあ少しはマシになったかな。
 *
 */

package lesson04.challenge13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		String[] greeting = { "へい！らっしゃい！！", "何にしますか！今日は活きのいいコハダが入ってますよ", "まいどあり！！またどうぞ" };

		System.out.println("Yさん：");
		System.out.println("まず、MISAKI○の今の状態を確かめようかな。\n");

		for (int i = 0; i < greeting.length; i++) {
			System.out.println("あいさつパターン" + (i + 1) + "...｢" + greeting[i] + "｣\n");
		}

		System.out.println("Yさん：");
		System.out.println("うわぁ～。どれか変更しよう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("どのパターンを変更しますか＞\n");
		String str1 = br.readLine();
		int choice = Integer.parseInt(str1);

		System.out.println("あいさつを吹き込んでください＞\n");
		String voice = br.readLine();

		if (choice == 1) {
			greeting[0] = voice;
		} else if (choice == 2) {
			greeting[1] = voice;
		} else if (choice == 3) {
			greeting[2] = voice;
		}

		System.out.println("\nYさん：");
		System.out.println("よし。もう一度確かめてみよう。\n");

		for (int i = 0; i < greeting.length; i++) {
			System.out.println("あいさつパターン" + (i + 1) + "...「" + greeting[i] + "｣\n");
		}

		System.out.println("Yさん：");
		System.out.println("まあ少しはマシになったかな。");
	}
}
