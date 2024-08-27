import java.util.Scanner;

//klavyeden girilen iki boyutlu string dizisi içinde tek karaktere sahip olanları ekrana yazan
public class e19 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("boyutları giriniz");
        int satir = k.nextInt();
        int sutun = k.nextInt();
        String [][] dizi = new String[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = k.next();
            }
        }
        for (int i=0; i<satir; i++){
            for (int j=0; j<sutun; j++){
                if (dizi[i][j].length() == 1){
                    System.out.println(dizi[i][j]);
                }
            }
        }

    }
}
