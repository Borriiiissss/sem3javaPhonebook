import java.util.ArrayList;
import java.util.List;
public class Task1RemoveEvenNum {
    public static void RemoveEvenNum() {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
                numbersList.add(i);
        }
        System.out.println("создан массив  " + numbersList);
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            if ( numbersList.get(i) % 2 == 0){
                numbersList.remove(i);
            };
        }
        System.out.println("массив без четных чисел " + numbersList);       
    }
}