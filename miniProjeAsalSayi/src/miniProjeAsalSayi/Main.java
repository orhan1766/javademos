package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		int number = -2;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Sayı asal değil.");
			return;
		}
		
		if (number<2) {
			System.out.println("Geçersiz sayı girdiniz!");
			
		}

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				isPrime = false;
			}
			
		}
		if (isPrime) {
			System.out.println("Sayı asal.");
		} else {
			System.out.println("Sayı asal değil.");
		}

	}

}
