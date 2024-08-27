import java.util.Scanner;

//klavyeden girilen iki boyutlu sayısal dizide içindeki en büyük ve en küçük sayıyı bulup ekrana yazan java programı
public class e18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz (satır sütun): ");
        int satir = scanner.nextInt();
        int sutun = scanner.nextInt();

        int[][] dizi = new int[satir][sutun];

        System.out.println("Sayısal diziyi giriniz:");

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = scanner.nextInt();
            }
        }

        int enBuyuk = dizi[0][0];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (dizi[i][j] > enBuyuk) {
                    enBuyuk = dizi[i][j];
                }
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);

    }
}