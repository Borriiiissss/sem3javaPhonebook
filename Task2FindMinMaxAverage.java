import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Collections;

public class Task2FindMinMaxAverage {
    public static void InfoAboutArray() {
        List<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int number = (int) (Math.random() * 10);
            numsList.add(number);           
        }
        System.out.println(numsList);
        System.out.println("мин = " + Collections.min(numsList));
        System.out.println("макс = " + Collections.max(numsList));
        int result = 0;
        System.out.println("среднее арифм = " + average(numsList, numsList.size(), result));
    }
    public static double average(List<Integer> numList, int sizeOfArray, int result) {
        sizeOfArray --;
        if (sizeOfArray < 0){
            System.out.println(result + " - сумма элементов массива, " + numList.size() + " размер массива");
            return (result / numList.size());
        }
        result += numList.get(sizeOfArray);
        return average (numList, sizeOfArray, result);
    }
}
