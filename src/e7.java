import java.util.Scanner;

//klavyeden girilen stringler içerisinde ilk harfi a ve A olanları ekrana yazan , ilk karakteri q girildiği zaman programdan çıkan java programı
public class e7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stringleri girin (Çıkmak için 'q' girin):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break; // 'q' girilirse döngüden çık
            }

            if (input.charAt(0) == 'a' || input.charAt(0) == 'A') {
                System.out.println("İlk harfi 'a' veya 'A' olan string: " + input);
            }
        }
    }
}
