/**
 * Created by ������� on 31.03.2015.
 */
public class ShellSort {

    public static void Sort(){
        int step = Array.getInstance().getSize()/2;
        while(step > 0){  //��������� ���, ���� ��   ����� �� �������
            SortTread[] myThready = new SortTread[step];
            for (int i = 0; i < myThready.length; i++) {
                myThready[i] = new SortTread(i, step);
                myThready[i].start();
            }  //������ ����, ����������� ������ � ������ step
            for (SortTread aMyThready : myThready) {
                try {
                    aMyThready.join();  //��� ���������� ���� ����������
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            step = step/2;
        }
    }




}
