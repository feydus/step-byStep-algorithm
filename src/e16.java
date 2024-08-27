import java.util.Scanner;

//klavyeden girilen iki boyutlu string dizisi içinde 3 karakterli olan stringleri ekrana yazan
public class e16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz (satır sütun): ");
        int satir = scanner.nextInt();
        int sutun = scanner.nextInt();

        String[][] dizi = new String[satir][sutun];

        System.out.println("String dizisini giriniz:");

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = scanner.next();
            }
        }

        System.out.println("3 karakterli stringler:");

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (dizi[i][j].length() == 3) {
                    System.out.println(dizi[i][j]);
                }
            }
        }

        scanner.close();
    }
}
