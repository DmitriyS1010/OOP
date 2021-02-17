import javafx.concurrent.Task;

public class MainClass {
static  MyClass myClass = new MyClass();

    public static void main(String[] args) {

 Task1();
 Task2();
 Task3();
 Task4();
 Task5();




    }

    private static void Task5() {
        int[] array = {5, 2, 3, 13, 1, 7};
        myClass.arrayContainsNumber(array, 10);

        double[] array1 = {2.4d, 56.6d, 76.3d, 1.3d};

        myClass.arrayContainsDNumber(array1, 2.4d);
    }

    private static void Task4() {
        int[] array = {5, 2, 3, 13, 1, 7};
        myClass.arraySort(array);

    }

    private static void Task3() {
        myClass.myNumber(20);
    }

    private static void Task2() {

        myClass.currency(150, 27.5);
    }


    private static void  Task1(){

        myClass.bank(100);
        myClass.bank(300);
        myClass.bank(300);
        myClass.bank(300);
    }

}
