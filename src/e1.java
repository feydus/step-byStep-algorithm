import java.util.Scanner;

//klavyeden girilen 10 elemanlı diziyi tersten yazan program
public class e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Lütfen 10 elemanlı dizinin elemanlarını girin:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Dizi tersten yazıldığında:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
