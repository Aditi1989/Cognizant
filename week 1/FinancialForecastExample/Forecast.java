public class Forecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        } else {
            return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        double currentValue = 10000;   // Example starting value
        double growthRate = 0.05;      // 5% annual growth
        int years = 5;                 // Predict 5 years into future

        double futureValue = predictFutureValue(currentValue, growthRate, years);

        System.out.printf("Predicted value after %d years: %.2f\n", years, futureValue);
    }
}
