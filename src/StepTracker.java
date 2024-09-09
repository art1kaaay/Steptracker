import java.util.Scanner;

// Green
// Очень здорово, что в этом классе нет лишних переменных, объектов, импортов и комментариев!

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
         // Red
         // Пользователь может сохранить отрицательное или равное нулю количество шагов
         System.out.println("Значение сохранено");
    }
    void  addNewNumberStepsPerDay(){
        System.out.println("номер месяца");
        int numberMonth = scanner.nextInt();
        if (numberMonth < 13){
            // Yellow
            // Непонятно, что сохранено здесь
            // Ничего же еще не сохранено
            System.out.println("Сохранено");
        }else {
            System.out.println("Такого месяца нет)_)");
            return;
        }
        System.out.println("введите день от 1 до 30(включительно)");
        int numberDays = (scanner.nextInt());
        if (numberDays <= 30 && numberDays >= 1){
            // Yellow
            // Непонятно, что сохранено здесь
            // Ничего же еще не сохранено
            System.out.println("Сохранено");
        } else {
            System.out.println("Нет такого дня!");
            return;
        }
        System.out.println("введите кол-во шагов");
        int counterSteps = scanner.nextInt();

        MonthData monthData = this.monthData[numberMonth-1];
        // Red
        // 0-нулевой элемент в массиве игнорируется
        monthData.days[numberDays] = counterSteps;
        System.out.println("Сохранено");



    }
    void statisticFromMonth(){
        System.out.println("Какой месяц?");
        int numberMonth = scanner.nextInt();
        // Red
        // При отрицательном вводе месяца, программа вылетает с исключением
        if (numberMonth < 13) {
            MonthData monthData = this.monthData[numberMonth - 1];
            monthData.printDaysAndStepsFromMonth();
            monthData.sumStepsFromMonth();
            System.out.println(monthData.sumStepsFromMonth() + " - Сумма шагов за месяц");
            System.out.println(monthData.maxStepsFromMonth() + " - Максимальное кол-во шагов за месяц");
            // Red
            // Метод вызывается просто так
            monthData.maxStepsFromMonth();
            System.out.println(monthData.midleStepsPerDay() + " - Ср-знач шагов");
            // Red
            // Метод вызывается просто так
            monthData.midleStepsPerDay();
            // Red
            // Метод вызывается просто так
            converter.convertToKm(monthData.sumStepsFromMonth());
            // Red
            // Метод вызывается просто так
            converter.converterStepsTocalories(monthData.sumStepsFromMonth());
            System.out.println(converter.convertToKm(monthData.sumStepsFromMonth()) + " - Километры ");
            System.out.println(converter.converterStepsTocalories(monthData.sumStepsFromMonth()) + " Киллокалории");
            // Red
            // Метод вызывается просто так
            monthData.bestSeries(goalByStepsPerDay);
            System.out.println(monthData.bestSeries(goalByStepsPerDay)+ " - Лучших дней ");
        }
    }
}
