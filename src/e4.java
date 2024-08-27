import java.util.Scanner;

//klavyeden girilen 10 elemanlı diziyi 1 sağa kaydıran program
public class e4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Lütfen 10 elemanlı dizinin elemanlarını girin:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Diziyi bir birim sağa kaydırma işlemi
        int temp = array[9];
        for (int i = 8; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = temp;

        System.out.println("Dizi sağa kaydırıldığında:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
