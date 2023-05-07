package school.mjc.stage0.conditions.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        ArrayList<Integer> threeOne = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        if(month <= 12 && month >= 1){
            if(threeOne.contains(month)){
                System.out.println(31);
            } else if (month == 2) {
                System.out.println(28);
            }
            else
                System.out.println(30);
        }
        else
            System.out.println("wrong number!");
    }
}
