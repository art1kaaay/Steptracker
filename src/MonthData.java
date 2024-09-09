//R лишние импорты лучше удалять

import javax.xml.crypto.Data;
import java.io.DataOutput;
import java.util.Scanner;

public class MonthData {
    int[] days = new int[31];

    void printDaysAndStepsFromMonth() {
        for (int i = 1; i <(days.length); i++) {
            System.out.println(days[i] + " --- Номер дня - " + (i));
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < (days.length ); i++) {
            sumSteps = sumSteps + days[i];

        }
        return sumSteps;
    }

    int maxStepsFromMonth() {
        int maxSteps = 0;
        for (int i = 1; i < (days.length); i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currencySeries = 0;
        int finalSeries = 0;
        // Red
        // Баг связан с тем, что самый первый день в месяце не учитывается
        for (int i = 1; i < (days.length); i++) {
            // Red
            // Если цель 10000, а шагов так же 10000,
            // то программа не будет считать это как выполненный план
            if (days[i] > goalByStepsPerDay){
                currencySeries = currencySeries + 1;
            } else{
                currencySeries = 0;
            }
            if (currencySeries > finalSeries){
                finalSeries = currencySeries;
            }

        }
        return finalSeries;
    }
    int midleStepsPerDay(){
        sumStepsFromMonth();
        int midleStep = sumStepsFromMonth()  / 30;
        return midleStep;
    }

}


