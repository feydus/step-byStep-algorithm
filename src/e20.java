import java.util.Scanner;

//klavyeden girilen stringin boşluklarını silip ekrana yazan java programı
public class e20 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("string giriniz");
        String str = k.nextLine();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) != ' '){
                System.out.print(str.charAt(i));
            }
        }
    }
}
