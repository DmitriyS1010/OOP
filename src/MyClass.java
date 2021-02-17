import java.util.Arrays;

public class MyClass {


    private int creditTotal = 700;
    private int moneyTotal = 0;


    //1
    public void bank(int money) {
        moneyTotal = moneyTotal + money;


        if (moneyTotal < creditTotal) {

            System.out.println("Кредит не погашен, остаток кредита = " + (creditTotal - moneyTotal));

        } else if (moneyTotal > creditTotal) {

            System.out.println("Клиент переплатил на " + (moneyTotal - creditTotal));
        } else {
            System.out.println("Долга нет");
        }


    }


    //2
    private double currMoney;

    public void currency(int sumMoney, double currencyRate) {

        if (sumMoney > 0 && currencyRate > 0) {
            currMoney = sumMoney * currencyRate;
            System.out.println("Ваши деньги в размере " + sumMoney + " ,и при курсе в " + currencyRate + " будут равны = " + currMoney);
        } else System.out.println("не верное значение");

    }


//3

    public void myNumber(int myNumber) {
        if (myNumber >= 0) {
            System.out.println("Число " + myNumber + " Положтельное");

        } else System.out.println("Число " + myNumber + " Отрицательное");


        if (myNumber % 2 == 0 || myNumber % 3 == 0 || myNumber % 5 == 0) {
            System.out.println("Число " + myNumber + " Непростое");
        } else System.out.println("Число " + myNumber + " простое");


        if (myNumber % 2 == 0 && myNumber % 5 == 0 && myNumber % 3 == 0 && myNumber % 6 == 0 && myNumber % 9 == 0) {
            System.out.println("число " + myNumber + " делится без остатка на 2,5,3,6,9");
        } else System.out.println("число " + myNumber + " НЕделится без остатка на 2,5,3,6,9");

    }


    //4


    public void arraySort(int[] array) {
        arraySOUT(array);
        int temp;
        boolean isSort = false;

        while (isSort == false) {
            isSort = true;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSort = false;
                }

            }
        }
        arraySOUT(array);

    }


    private void arraySOUT(int[] array) {

        System.out.println(Arrays.toString(array));

    }


    //5
    public void arrayContainsNumber(int[] array, int number) {
        boolean isContains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isContains = true;
            }
        }
        System.out.println(isContains);
    }





    public void arrayContainsDNumber(double[]array,double number) {
        boolean isContains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isContains = true;
            }
        }
        System.out.println(isContains);


    }


}
