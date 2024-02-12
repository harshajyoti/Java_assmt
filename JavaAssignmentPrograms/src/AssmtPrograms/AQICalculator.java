package AssmtPrograms;

import java.util.Scanner;

public class AQICalculator {

    /*
    Develop a Java program that calculates the Air Quality Index (AQI) based on the concentration of pollutants. Use conditional statements to classify the AQI into different categories (Good, Moderate, Unhealthy, etc.) based on predefined thresholds for different pollutants.
     */

    private static double calculateAQI(double pm25, double pm10, double ozone, double no2, double co) {
        double aqi_pm25 = calculateAQIForPollutant(pm25, 12.0, 35.4, 0, 12, 35.4, 55.4, 0, 50);
        double aqi_pm10 = calculateAQIForPollutant(pm10, 54, 154, 0, 55, 155, 254, 0, 50);
        double aqi_ozone = calculateAQIForPollutant(ozone, 0.0, 0.059, 0, 0.06, 0.124, 0.164, 0.125, 100);
        double aqi_no2 = calculateAQIForPollutant(no2, 0.0, 0.053, 0, 0.054, 0.649, 1.24, 0.625, 100);
        double aqi_co = calculateAQIForPollutant(co, 0.0, 4.4, 0, 4.5, 9.4, 12.4, 9.5, 100);

        return Math.max(aqi_pm25, Math.max(aqi_pm10, Math.max(aqi_ozone, Math.max(aqi_no2, aqi_co))));
    }

    private static double calculateAQIForPollutant(double concentration, double bp_lo, double bp_hi, double i_lo, double i_hi, double aqi_lo, double aqi_hi, double bp_i, double aqi_i) {
        return (aqi_hi - aqi_lo) / (bp_hi - bp_lo) * (concentration - bp_lo) + aqi_lo;
    }

    private static String classifyAQI(double aqi) {
        if (aqi <= 50) {
            return "Good";
        } else if (aqi <= 100) {
            return "Moderate";
        } else if (aqi <= 150) {
            return "Unhealthy for Sensitive Groups";
        } else if (aqi <= 200) {
            return "Unhealthy";
        } else if (aqi <= 300) {
            return "Very Unhealthy";
        } else {
            return "Hazardous";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the concentration of pollutants (in micrograms per cubic meter):");
        System.out.print("PM2.5: ");
        double pm25 = scan.nextDouble();
        System.out.print("PM10: ");
        double pm10 = scan.nextDouble();
        System.out.print("Ozone (O3): ");
        double ozone = scan.nextDouble();
        System.out.print("Nitrogen Dioxide (NO2): ");
        double no2 = scan.nextDouble();
        System.out.print("Carbon Monoxide (CO): ");
        double co = scan.nextDouble();

        double aqi = calculateAQI(pm25, pm10, ozone, no2, co);
        String category = classifyAQI(aqi);

        System.out.println("Air Quality Index (AQI): " + aqi);
        System.out.println("Category: " + category);
    }
}
