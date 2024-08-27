import java.util.Scanner;

//klavyeden girilen bir tam sayının kaç basamaklı olduğunu ekrana yazan java
public class e13 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("LÜTFEN SAYI GİRİNİZ");
        int sayi = k.nextInt();
        int bS=1;
        while (sayi >= 10 || sayi <=-10){
                    sayi = sayi / 10;
                    bS++;
                }
        System.out.println("sayı " + bS + " basamaklı");
    }
}
