package recapDemo1;

public class Main {

	public static void main(String[] args) {

		// En büyük sayıyı bulma

		int sayi1 = 32;
		int sayi2 = 25;
		int sayi3 = 2;

		// Benim çözümüm :)
		if (sayi1 > sayi2) {
			if (sayi1 > sayi3) {
				System.out.println("En büyük sayı :" + sayi1);
			}
		} else if (sayi2 > sayi3) {
			if (sayi2 > sayi1) {
				System.out.println("En büyük sayı :" + sayi2);
			}
		} else if (sayi3 > sayi2) {
			if (sayi3 > sayi1) {
				System.out.println("En büyük sayı :" + sayi3);
			}
		}

		// Engin Hocanın çözümü

		int enBüyük = sayi1;

		if (enBüyük < sayi2) {
			enBüyük = sayi2;
		}

		if (enBüyük < sayi3) {
			enBüyük = sayi3;
		}

		System.out.println(enBüyük);

	}

}