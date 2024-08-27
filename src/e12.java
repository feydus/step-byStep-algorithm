import java.util.Scanner;

//Klavyeden girilen 10 tam sayı içerisindeki en büyük tek sayıyı ekrana yazan java programı
public class e12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enBuyukTekSayi = Integer.MIN_VALUE; // Başlangıçta en küçük olası değer
        int girilenSayi;

        System.out.println("10 tam sayı giriniz:");

        for (int i = 0; i < 10; i++) {
            girilenSayi = scanner.nextInt();

            if (girilenSayi % 2 == 1 && girilenSayi > enBuyukTekSayi) {
                enBuyukTekSayi = girilenSayi;
            }
        }

        if (enBuyukTekSayi != Integer.MIN_VALUE) {
            System.out.println("En büyük tek sayı: " + enBuyukTekSayi);
        } else {
            System.out.println("Hiç tek sayı girilmedi.");
        }

        scanner.close();
    }
}
