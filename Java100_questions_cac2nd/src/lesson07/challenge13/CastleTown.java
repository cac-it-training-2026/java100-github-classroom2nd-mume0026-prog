/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

interface IChiefTreasurer {
	abstract void learn();
}

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

class Retainer extends Samurai implements IChiefTreasurer {

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

	@Override
	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}
}

class Ronin extends Samurai implements IChiefTreasurer {

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

	@Override
	public void learn() {
		System.out.println("塾を開くよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		Retainer retainer = new Retainer();
		retainer.learn();

		System.out.println("\n浪人1：");

		Ronin ronin = new Ronin();
		ronin.learn();

	}
}
