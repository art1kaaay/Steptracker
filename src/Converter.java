public class Converter {

    int convertToKm(int sumStepsPerMonth) {
        // Y необязательно в данном случае создавать целую переменную
        // нужное значение можно сразу возвращать
        // return (sumStepsPerMonth * 75) / 100000;
        int km = (sumStepsPerMonth * 75) / 100000;
        return km;
    }



    int converterStepsTocalories(int sumStepsPerMonth){
        // Y необязательно в данном случае создавать целую переменную
        // нужное значение можно сразу возвращать
        int cilocalories = (sumStepsPerMonth * 50) / 1000;
        return cilocalories;

    }
}
