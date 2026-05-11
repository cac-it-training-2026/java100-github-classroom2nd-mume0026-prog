/**
 * 第7章 武士のお仕事
 *
 * 問題10  抽象クラス
 *
 * 抽象クラス、抽象メソッドを作る。
 *
 * 侍クラスのwork()メソッドを抽象化してください。
 *
 * <実行例>
 * 侍は働きます。
 *
 * 具体的に言うと藩士は年貢を取り立てます。
 *
 * 藩士1：
 * 年貢を取り立てるよ～。
 *
 * 具体的に言うと浪人は傘張りをします。
 *
 * 浪人1：
 * 傘張るよ～。
 *
 */

package lesson07.challenge10;

//ここにSamuraiクラスを記述
abstract class Samurai {

	protected String name;
	protected String from;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {

	public Retainer(String name, String from) {
		this.name = name;
		this.from = from;
	}

	public Retainer() {

	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");

	}

	@Override
	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	@Override
	public String toString() {
		return "拙者は" + from + "藩士、" + name + "ともうす。";

	}

	public boolean equals(Object obj) {
		boolean Match;
		Retainer retainer = (Retainer) obj;
		if (this.from.equals(retainer.from)) {
			Match = true;
		} else {
			Match = false;
		}
		return Match;
	}
}

//ここにRoninクラスを記述
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
	void work() {
		System.out.println("傘張るよ～。");
	}

	@Override
	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";

	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("侍は働きます。");

		System.out.println("\n具体的に言うと藩士は年貢を取り立てます。\n");

		System.out.println("藩士1：");

		Retainer retainer = new Retainer();
		retainer.work();

		System.out.println("\n具体的に言うと浪人は傘張りをします。\n");

		System.out.println("浪人1：");

		Rounin rounin = new Rounin();
		rounin.work();

	}
}
