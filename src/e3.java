import java.util.Scanner;

//klavyeden girilen 10 elamnlı tam sayı dizisindeki tek sayıların ortalamasının alan program
public class e3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int top=0;
        int tek=0;
        int[] dizi = new int[10];
        System.out.println("lütfen 10 adet sayı giriniz");
        for (int i=0; i<10; i++){
            dizi [i] = k.nextInt();
            if (dizi[i]%2 != 0){
                top += dizi[i];
                tek++;
            }
        }
        if (tek > 0) {
            double averageOfOddNumbers = (double) top / tek;
            System.out.println("Dizideki tek sayıların ortalaması: " + averageOfOddNumbers);
        } else {
            System.out.println("Dizide tek sayı bulunamadı.");
        }
    }
}
