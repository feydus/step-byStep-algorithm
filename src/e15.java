import java.util.Scanner;

//klavyeden girilen 100 sayı içinde tek , çift ve sıfırların sayısını bulan ve ekrana yazan java programı
public class e15 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int tek=0;
        int cift=0;
        int sifir=0;
        for (int i=0; i<10; i++){
            System.out.println("sayı giriniz ");
            int sayi = k.nextInt();
            if (sayi == 0){
                sifir++;
            } else if (sayi % 2 != 0) {
                tek++;
            }else {
                cift++;
            }
        }
        System.out.println("tek sayıların sayısı : " + tek);
        System.out.println("cıft sayıların sayısı : " + cift);
        System.out.println("sıfır sayıların sayısı : " + sifir);
    }
}
