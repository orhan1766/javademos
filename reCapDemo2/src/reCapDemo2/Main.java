package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.2, 2.3, 3.4, 4.5, 5.6 };

		for (double number : myList) {
			System.out.println(number);
		}

		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (number > max) {
				max = number;
			}
			total += number;
		}
		System.out.println("Toplam : " + total);

		System.out.println("En büyük sayı : " + max);
	}

}
