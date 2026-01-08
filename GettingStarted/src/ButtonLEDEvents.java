// Add Phidgets Library
import com.phidget22.*;

public class ButtonLEDEvents {

    public static void main(String[] args) throws Exception {

        // Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        // Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        // Open
        redButton.open(1000);
        greenButton.open(1000);
        redLED.open(1000);
        greenLED.open(1000);

        // Game variables
        int redScore = 0;
        int greenScore = 0;

        boolean lastRedState = false;
        boolean lastGreenState = false;

        boolean gameOver = false;

        // Game loop
        while (!gameOver) {

            boolean currentRedState = redButton.getState();
            boolean currentGreenState = greenButton.getState();

            // Red press (rising edge)
            if (currentRedState && !lastRedState) {
                redScore++;
                System.out.println("Green: " + greenScore + " --- Red: " + redScore);
            }
            redLED.setState(currentRedState);
            lastRedState = currentRedState;
            // Green press (rising edge)
            if (currentGreenState && !lastGreenState) {
                greenScore++;
                System.out.println("Green: " + greenScore + " --- Red: " + redScore);
            }
            greenLED.setState(currentGreenState);
            lastGreenState = currentGreenState;

            lastRedState = currentRedState;
            lastGreenState = currentGreenState;

            // Win check
            if (redScore == 10 || greenScore == 10) {
                gameOver = true;

                // Flash both LEDs 5 times
                for (int i = 0; i < 5; i++) {
                    redLED.setState(true);
                    greenLED.setState(true);
                    Thread.sleep(200);

                    redLED.setState(false);
                    greenLED.setState(false);
                    Thread.sleep(200);
                }

                // Winner stays on
                if (redScore == 10) {
                    System.out.println("Red Wins!");
                    redLED.setState(true);
                } else {
                    System.out.println("Green Wins!");
                    greenLED.setState(true);
                }
            }

            Thread.sleep(10);
        }
    }
}
