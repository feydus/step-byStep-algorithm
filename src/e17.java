import java.util.Scanner;

//klavyeden girilen stringte kaç tane küçük harf , büyük harf ve boşluk olduğunu bulan ekrana yazan
public class e17 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("string giriniz");
        String str = k.nextLine();
        int kc = 0;
        int b = 0;
        int bos = 0;
        for (int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            if (Character.isLowerCase(x)){
                kc++;
            } else if (Character.isUpperCase(x)) {
                b++;
            } else if (Character.isWhitespace(x)) {
                bos++;

            }
        }
        System.out.println(kc);
        System.out.println(b);
        System.out.println(bos);

    }
}
