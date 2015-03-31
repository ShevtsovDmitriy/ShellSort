import java.util.Arrays;
import java.util.Random;

/**
 * Created by Дмитрий on 23.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }
        Array.getInstance().setSize(arr.length);
        Array.getInstance().setArr(arr);
        long startTime = System.currentTimeMillis();
        ShellSort.Sort();
        long endTime = System.currentTimeMillis();
        System.out.print(Arrays.toString(Array.getInstance().getArr()) + "\n");
        System.out.print("Shell sort: " + (endTime - startTime) + " " + Array.getInstance().getSize() + "\n");
        startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        endTime = System.currentTimeMillis();
        System.out.print(Arrays.toString(arr) + "\n");
        System.out.print("Standard sort: " + (endTime - startTime) + " " + arr.length + "\n");
    }
}
