//2-4-8-10-14-16-20-22 ... şeklinde giden serinin ilk 100 teriminin toplamını bulan java programı
public class e11 {
    public static void main(String[] args) {
        int n = 100; // İlk 100 terim
        int top = 0;
        int first = 2; // Seri başlangıç değeri
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            top += first;

            if (i % 2 == 0) {
                first += 2;
            } else {
                first += 4;
            }
        }

        System.out.println("\nSeri Toplamı: " + top);
    }
}
