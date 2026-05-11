/**
 * 第7章 武士のお仕事
 *
 * 問題11 instanceof演算子
 *
 * instanceof演算子を利用する。
 *
 * 侍クラスの配列に（藩士、浪人）をランダムに入れ、
 * それぞれの人数を表示してください。
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれの人数を表示してみます。
 *
 * 藩士：3人
 *
 * 浪人：2人
 *
 */

package lesson07.challenge11;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

class Retainer extends Samurai {

	public Retainer(String name) {
		this.name = name;
	}

	public Retainer() {

	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");

	}

	@Override
	public String toString() {
		return "拙者は○△□藩士、" + name + "ともうす。";

	}
}

class Ronin extends Samurai {

	public Ronin(String name) {
		this.name = name;
	}

	public Ronin() {

	}

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	@Override
	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";

	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		Samurai[] samurai = new Samurai[5];

		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 10) % 2;
			if (num == 0) {
				samurai[i] = new Retainer();
			} else {
				samurai[i] = new Ronin();
			}
		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれの人数を表示してみます。\n");

		int retainerCount = 0;
		int roninCount = 0;

		for (Object obj : samurai) {
			if (obj instanceof Retainer) {
				retainerCount++;
			} else {
				roninCount++;
			}
		}

		System.out.println("藩士：" + retainerCount + "人");
		System.out.println("\n浪人：" + roninCount + "人");
	}
}
