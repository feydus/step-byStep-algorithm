import java.util.Scanner;

//klavyeden girilen stringin benzer olan karakterlerini string olarak ekrana yazdır
public class e10 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("1. stringi giriniz");
        String ilk = k.nextLine();
        System.out.println("2. stringi giriniz");
        String sec = k.nextLine();
         for (int i=0; i<ilk.length()-1; i++){
             char x = ilk.charAt(i);
             for (int j=0; j<sec.length()-1; j++){
                 if ( x == sec.charAt(j)){
                     System.out.print(x);
                 }
             }
         }


    }
}
