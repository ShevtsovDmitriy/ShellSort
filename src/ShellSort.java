/**
 * Created by ƒмитрий on 31.03.2015.
 */
public class ShellSort {

    public static void Sort(){
        int step = Array.getInstance().getSize()/2;
        while(step > 0){  //уменьшаем шаг, пока не   дойдЄм до единицы
            SortTread[] myThready = new SortTread[step];
            for (int i = 0; i < myThready.length; i++) {
                myThready[i] = new SortTread(i, step);
                myThready[i].start();
            }  //создаЄм нити, сортирующие массив с шангом step
            for (SortTread aMyThready : myThready) {
                try {
                    aMyThready.join();  //ждЄм завершени€ всех сортировок
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            step = step/2;
        }
    }




}
