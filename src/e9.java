import java.util.Scanner;

//klavyeden girilen sayıyı pozitif tam sayı kabul ederek bu sayının asal olup olmadığını bulan java programı
public class e9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println(" asal bir sayı değil.");
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                System.out.println("sayı asal değil");
                break;
            }else {
                System.out.println("sayı asaldır");
            }

        }}}


