package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 496;
		int controlNumber = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				controlNumber += i;
			}
		}

		if (controlNumber == number) {
			System.out.println("Girilen sayı mükemmeldir.");
		} else {
			System.out.println("Girilen sayı mükemmel değildir.");
		}

	}

}
