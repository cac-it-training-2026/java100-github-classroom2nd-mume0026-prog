/**
 * 第7章 武士のお仕事
 *
 * 問題9  getClass()メソッドの利用
 *
 * 侍クラスのサブクラスをまとめて扱う。
 *
 * 要素数5の侍クラスの配列を用意し、
 * 藩士クラス、浪人クラスの何れかをランダムで代入します。
 * getClass()メソッドを使いそれぞれの要素に何のクラスの
 * オブジェクトが入ったか表示してください。
 * （藩士クラス、浪人クラスともに
 *   デフォルトコンストラクタを用意します）
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれ表示してみます。
 *
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 * class lesson11_12.challenge09.Ronin
 * class lesson11_12.challenge09.Retainer
 *
 */

package lesson07.challenge09;

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

class Rounin extends Samurai {

	public Rounin(String name) {
		this.name = name;
	}

	public Rounin() {

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
				samurai[i] = new Rounin();
			}
		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれ表示してみます。\n");

		for (int i = 0; i < samurai.length; i++) {
			System.out.println(samurai[i].getClass());
		}

	}
}
