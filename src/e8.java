import java.util.Scanner;

//klavyeden girilen 30 tam sayı içerisinde en büyüğünü , en küçüğünü ve a.o. bulup ekrana yazan java programı
public class e8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = -2147483648; // En küçük int değeri
        int min = 2147483647;  // En büyük int değeri
        int toplam = 0;
        int n = 30; // Kaç tane sayı girileceği

        System.out.println(n + " tam sayı girin:");

        for (int i = 0; i < n; i++) {
            int sayi = scanner.nextInt();

            if (sayi > max) {
                max = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }

            toplam += sayi;
        }
        double ortalama = (double) toplam / n;

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
        System.out.println("Toplam: " + toplam);
        System.out.println("Aritmetik Ortalama: " + ortalama);
    }
}

