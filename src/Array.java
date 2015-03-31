/**
 * Created by ִלטענטי on 31.03.2015.
 */
public class Array {

    private static Array instance = new Array();
    private int[] arr;
    private int size;

    public static Array getInstance() {
        return instance;
    }

    private Array() {
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setElement(int x,int pos){
        arr[pos] = x;
    }
}
