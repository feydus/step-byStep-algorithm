import java.util.Scanner;

//Klavyeden rastgele sayılar giriliyor. bunlar içinde 10 asal girildiğinde bu sayıları diziye tanımlayan ve dizideki en büyük sayıyı ekrana yazan java
public class e21 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int asal = 0;
         while (true) {
             System.out.println("rastgele sayı giriniz");
             int sayi = k.nextInt();
             for (int i=2; i<sayi/2; i++){
                 if (sayi%i != 0 ){
                     asal++;
                     if (asal == 10){
                         int [] dizi = new int[10];

                     }
                 }

             }
         }

    }
}
