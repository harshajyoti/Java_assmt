package AssmtPrograms;

/*
Create a Java program that simulates a traffic light. Implement a system where the light changes based on predefined time intervals. Use conditional statements to determine which color (Red, Yellow, Green) should be displayed at any given time.
 */

class TrafficLight {
    private String color;

    public TrafficLight() {
        color = "Red";
    }

    public void change() {
        switch (color) {
            case "Red":
                color = "Green";
                break;
            case "Green":
                color = "Yellow";
                break;
            case "Yellow":
                color = "Red";
                break;
            default:
                System.out.println("Invalid color!");
        }
    }

    public String getColor() {
        return color;
    }
}

public class TrafficLightSimulation {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Simulate the traffic light for a certain number of cycles
        for (int i = 0; i < 10; i++) {
            trafficLight.change();
            System.out.println("Cycle " + (i + 1) + ": " + trafficLight.getColor());

        }
    }
}



