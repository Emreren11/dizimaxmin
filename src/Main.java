import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 12, 788, 1, -1, -778, 2, 0};
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizi: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("Girilen sayı: ");
        int n = inp.nextInt();
        int max = 0, min = 0;
        for (int i : arr) {
            if (i < n)
                min = i;
            if (i > n) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en büyük sayı: " + min);
        System.out.println("Girilen sayıdan büyük en küçük sayı: " + max);

    }
}