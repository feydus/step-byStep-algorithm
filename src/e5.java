//ilk iki terimi 1 olan fibonacci dizisinin ilk 10 terimini 1-1-2-3-5-8-13-21-34-55 formatında ekrana yazan java programı
public class e5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 1;
        for (int i=2; i<10; i++){
            array[i] = array[i-1] + array[i-2];
        }
        for (int i=0; i<10; i++){
            System.out.println(array[i]);
        }

    }
}
