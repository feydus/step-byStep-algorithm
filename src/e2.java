import java.util.Scanner;

//klavyeden girilen 10 elemanlı tam sayı dizisindeki tek sayıları toplayan
public class e2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int [] dizi = new int [10];
        int top = 0;
        System.out.println("lütfen 10 adet sayı giriniz");
        for (int i=0; i<10; i++){
            dizi[i]= k.nextInt();
            if (dizi[i]%2 != 0){
                top += dizi[i];
            }
        }
        System.out.println(top);
    }
}
