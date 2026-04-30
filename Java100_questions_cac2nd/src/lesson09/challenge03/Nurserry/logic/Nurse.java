package lesson09.challenge03.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void divide(int cakes, int childs) {
		try {
			int result = cakes / childs;
			System.out.println("1人" + result + "個になります。");
			System.out.println("\nケーキの分配が終わりました。");
		} catch (ArithmeticException e) {
			System.out.println("\nケーキを食べる園児がいません。");
			System.out.println("\nケーキの分配が終わりました。");
		}

	}
}
