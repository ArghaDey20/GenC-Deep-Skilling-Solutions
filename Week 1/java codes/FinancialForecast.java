public class FinancialForecast {

    // Recursive function to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }

        // growthRate is in percentage, so divided by 100
        double nextValue = currentValue * (1 + growthRate / 100);
        return predictFutureValue(nextValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double current = 10000;
        double rate = 5; // 5% yearly growth
        int year = 3;

        double future = predictFutureValue(current, rate, year);
        System.out.println("Future value after " + year + " years = " + future);
    }
}


