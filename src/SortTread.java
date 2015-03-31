/**
 * Created by ִלטענטי on 31.03.2015.
 */
public class SortTread extends Thread {

    public static int step;
    public SortTread(int step) {
        SortTread.step = step;
    }
    @Override
    public void run() {
        sort_shell(step);
    }
    void sort_shell( int step){
        step = step / 2;
        for (int i = 0; i < (Array.getInstance().getSize() - step); i++)
        {
            int j = i;
            while (j >= 0 && Array.getInstance().getArr()[i] > Array.getInstance().getArr()[j + step])
            {
                int temp = Array.getInstance().getArr()[j];
                Array.getInstance().setElement(Array.getInstance().getArr()[j + step], j);
                Array.getInstance().setElement(temp, j + step);
                j--;
            }
        }
    }

}
