package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 7;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			System.out.println("Aranan sayı dizide bulunmaktadır.");
		} else {
			System.out.println("Aranan sayı dizide bulunmamaktadır.");
		}

	}

}
