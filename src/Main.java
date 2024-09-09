
import java.util.Scanner;

//R лишние комментарии лучше удалять

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();


            int command = scanner.nextInt();
            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();

            } else if (command == 3) {
                stepTracker.statisticFromMonth();

            } else if (command == 4) {
                System.out.println("Всего хорошего , досвидание !");
                return;

            } else {
                System.out.println("Такой команды нет)");

            }

        }
    }

    static void printMenu() {
        System.out.println("1 - введите количество шагов за определённый день" );
        System.out.println("2 - изменить цель по кол-ву шагов в день");
        System.out.println("3 - напечатать статистику за опредедённый день");
        System.out.println("4 - выйти из приложения ");
    }

}