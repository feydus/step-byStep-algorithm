import java.util.Scanner;

//klavyeden  0 tam sayısı girilmediği sürece klavyeden girilen sayıların toplamını hesaplayan
public class e6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Sayıları girmeye başlayın (Çıkmak için 0 girin):");

        while (true) {
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break; // 0 girilirse döngüden çık
            }

            toplam += sayi;
        }

        System.out.println("Girilen sayıların toplamı: " + toplam);
    }
    }

