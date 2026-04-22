/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] Baggage = new int[5];
		int intputNum = 0;
		boolean loopFlag = false;

		for (int i = 0; i < Baggage.length; i++) {

			do {
				loopFlag = false;
				intputNum = (int) (Math.random() * 10) % 5 + 1;

				for (int j = 0; j < Baggage.length; j++) {

					if (intputNum == Baggage[j]) {
						loopFlag = true;
						break;
					}
				}
			} while (loopFlag);

			Baggage[i] = intputNum;
		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < Baggage.length; i++) {
			System.out.print(Baggage[i]);
			if (i != (Baggage.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		for (int i = 0; i < Baggage.length; i++) {
			if (Baggage[i] == 1) {
				Baggage[i] = 3;
			} else if (Baggage[i] == 2) {
				Baggage[i] = 4;
			} else if (Baggage[i] == 3) {
				Baggage[i] = 1;
			} else if (Baggage[i] == 4) {
				Baggage[i] = 2;
			}
		}

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < Baggage.length; i++) {
			System.out.print(Baggage[i]);
			if (i != (Baggage.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
