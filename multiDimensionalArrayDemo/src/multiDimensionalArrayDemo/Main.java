package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Kocaeli";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Yozgat";
		sehirler[2][0] = "Trabzon";
		sehirler[2][1] = "Samsun";
		sehirler[2][2] = "Rize";

		for (int i = 0; i < sehirler.length; i++) {
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

		System.out.println("-------------");

		for (int i = 0; i < sehirler.length; i++) {
			System.out.println(sehirler[1][i]);
		}

	}

}
