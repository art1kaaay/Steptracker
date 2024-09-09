import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthData = new MonthData[12];
    Converter converter = new Converter();
    int goalByStepsPerDay = 10_000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthData.length;i++){
            monthData[i] = new MonthData();
        }
    }
     void changeStepGoal(){
         System.out.println("Введите значение");
        goalByStepsPerDay = scanner.nextInt();
         System.out.println("Значение сохранено");
    }
    void  addNewNumberStepsPerDay(){
        System.out.println("номер месяца");
        int numberMonth = scanner.nextInt();
        if (numberMonth < 13){
            System.out.println("Сохранено");
        }else {
            System.out.println("Такого месяца нет)_)");
            return;
        }
        System.out.println("введите день от 1 до 30(включительно)");
        int numberDays = (scanner.nextInt());
        if (numberDays <= 30 && numberDays >= 1){
            System.out.println("Сохранено");
        } else {
            System.out.println("Нет такого дня!");
            return;
        }
        System.out.println("введите кол-во шагов");
        int counterSteps = scanner.nextInt();

        MonthData monthData = this.monthData[numberMonth-1];
        monthData.days[numberDays] = counterSteps;
        System.out.println("Сохранено");



    }
    void statisticFromMonth(){
        System.out.println("Какой месяц?");
        int numberMonth = scanner.nextInt();
        if (numberMonth < 13) {
            MonthData monthData = this.monthData[numberMonth - 1];
            monthData.printDaysAndStepsFromMonth();
            monthData.sumStepsFromMonth();
            System.out.println(monthData.sumStepsFromMonth() + " - Сумма шагов за месяц");
            System.out.println(monthData.maxStepsFromMonth() + " - Максимальное кол-во шагов за месяц");
            monthData.maxStepsFromMonth();
            System.out.println(monthData.midleStepsPerDay() + " - Ср-знач шагов");
            monthData.midleStepsPerDay();
            converter.convertToKm(monthData.sumStepsFromMonth());
            converter.converterStepsTocalories(monthData.sumStepsFromMonth());
            System.out.println(converter.convertToKm(monthData.sumStepsFromMonth()) + " - Километры ");
            System.out.println(converter.converterStepsTocalories(monthData.sumStepsFromMonth()) + " Киллокалории");
            monthData.bestSeries(goalByStepsPerDay);
            System.out.println(monthData.bestSeries(goalByStepsPerDay)+ " - Лучших дней ");
        }
    }
}
