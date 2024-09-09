public class Converter {

    int convertToKm(int sumStepsPerMonth) {
        int km = (sumStepsPerMonth * 75) / 100000;
        return km;
    }



    int converterStepsTocalories(int sumStepsPerMonth){
        int cilocalories = (sumStepsPerMonth * 50) / 1000;
        return cilocalories;

    }
}
