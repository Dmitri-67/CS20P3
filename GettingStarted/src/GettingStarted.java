
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class GettingStarted {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{
        
    	
    	
        //Create | Here you've created a DigitalInput object for your button. An object represents how you interact with your device. DigitalInput is a class from the Phidgets library that's used to read the state of your button.
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | This tells your program where to find the device you want to work with. Your button is connected to port 0 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);     
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true); 
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        //Use your Phidgets | Here is where you use your Phidgets! This code checks the state of the button and prints true/false when the button is pressed/released. The sleep function means the button state is only checked every 150 milliseconds. Sleeping is used to make it easier to read the console output and to put less stress on your CPU.
        int redscore = 0;
        boolean lastRedState = false;
        int greenscore = 0;
        boolean lastGreenState = false;
        boolean gameOver = false;  //game over varialbe
        while (!gameOver) {

            boolean currentRedState = redButton.getState();
            boolean currentGreenState = greenButton.getState();

            // red press
            if (currentRedState && !lastRedState) {
                redscore++;
                System.out.println("Green: " + greenscore + " --- Red: " + redscore);
            }

            // Red LED follows button
            redLED.setState(currentRedState);
            lastRedState = currentRedState;

            Thread.sleep(1);

            // green press
            if (currentGreenState && !lastGreenState) {
                greenscore++;
                System.out.println("Green: " + greenscore + " --- Red: " + redscore);
            }

            // Green LED follows button
            greenLED.setState(currentGreenState);
            lastGreenState = currentGreenState;

            Thread.sleep(1);

            // WIN CHECK
            if (redscore == 10 || greenscore == 10) {
                gameOver = true;

                // Flash bothLEDs 5 times
                for (int i = 0; i < 5; i++) {
                    redLED.setState(true);
                    greenLED.setState(true);
                    Thread.sleep(200);

                    redLED.setState(false);
                    greenLED.setState(false);
                    Thread.sleep(200);
                }

                // Leave the winner on 
                if (redscore == 10) {
                    System.out.println("Red Wins!");
                    redLED.setState(true);
                    greenLED.setState(false);
                } else {
                    System.out.println("Green Wins!");
                    greenLED.setState(true);
                    redLED.setState(false);
                }
            }
        }
    }
}

  