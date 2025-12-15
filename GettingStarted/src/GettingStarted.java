
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
//Im setting up a score counter for green ngl just copy and paste the red stuff to make it work FOR TUG OF WAR
        while (true) {
            boolean currentRedState = redButton.getState();

            // Detect a NEW press (false → true)
            if (currentRedState && !lastRedState) {
                redscore++;
            }
            if( redButton.getState()){
                redLED.setState(true);
            } else {
                redLED.setState(false);
            }
            if(greenButton.getState()){
                greenLED.setState(true);
                System.out.println("Score: " + redscore);
                Thread.sleep(150);
            } else {
                greenLED.setState(false);
            }

            lastRedState = currentRedState;
            Thread.sleep(1);
        }  
    }
}
  