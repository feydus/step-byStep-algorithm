import java.util.Scanner;

//klavyeden girilen 20 kişinin adını tutup bu adları girildiği sırasına göre tersten yazan java programı
public class e14 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String [] dizi = new String[20];
        for (int i=0; i<20; i++){
            System.out.print(i + "."+ " indisi giriniz ");
            String isim = k.nextLine();
            dizi [i] = isim;
        }for (int i=19; i>=0; i--){
            System.out.println(dizi[i]);
        }
    }
}
