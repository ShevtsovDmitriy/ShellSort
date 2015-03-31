/**
 * Created by ִלטענטי on 31.03.2015.
 */
public class SortTread extends Thread {

    public int step;
    public  int start;

    public SortTread(int start, int step){
        this.start = start;
        this.step = step;
    }

    @Override
    public void run() {
        sort_shell(step);
    }

    private void sort_shell( int step){
        for (int i = start; i < (Array.getInstance().getSize() - step); i+=step)
        {
            int j = i;
            while (j >= 0 && Array.getInstance().getArr()[j] > Array.getInstance().getArr()[j + step])
            {
                int temp = Array.getInstance().getArr()[j];
                Array.getInstance().setElement(Array.getInstance().getArr()[j + step], j);
                Array.getInstance().setElement(temp, j + step);
                j-=step;
            }
        }
    }

}
