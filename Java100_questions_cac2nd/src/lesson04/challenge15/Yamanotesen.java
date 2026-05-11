package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		String[] Stations = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿",
				"品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };

		boolean[] judge = new boolean[Stations.length];

		Arrays.fill(judge, true);

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("ゲームスタート！");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Random rand = new Random();

		boolean loop = false;

		int game = 0;

		do {
			String station = reader.readLine();

			for (int i = 0; i < Stations.length; i++) {
				if (Stations[i].equals(station)) {
					if (judge[i]) {
						loop = true;

						judge[i] = false;
						break;
					} else {

						System.out.println("ーーー既出ですーーー\n");
						break;
					}
				}
			}
			game++;

			if (!loop) {
				System.out.println("ーーー誤答ですーーー\n");
				break;
			} else if (game == Stations.length) {

				break;
			}

			loop = false;

			while (!loop) {

				int num = rand.nextInt(Stations.length);

				if (judge[num]) {
					System.out.println(Stations[num]);

					judge[num] = false;

					loop = true;
				}
			}
			game++;

			loop = false;

		} while (game != Stations.length);

		if (game == Stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
