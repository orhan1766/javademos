package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'B';

		// Benim çözümüm
		char[] kalinHarfler = { 'A', 'O', 'U', 'I' };
		char[] inceHarfler = { 'E', 'Ö', 'Ü', 'İ' };

		for (char inceHarf : inceHarfler) {
			if (harf == inceHarf) {
				System.out.println("Girilen sesli harf incedir.");
			}
		}
		for (char kalinHarf : kalinHarfler) {
			if (harf == kalinHarf) {
				System.out.println("Girilen sesli harf kalındır.");
			}
		}

		System.out.println("----------------");

		// Engin Hocanın çözümü
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;

		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf");
			break;

		default:
			System.out.println("Sesli harf giriniz!");
			break;
		}
	}

}
