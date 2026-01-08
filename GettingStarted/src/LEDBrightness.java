
//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
        double brightness = 0.0;
        boolean goingUp = true;

        while (true) {
            redLED.setDutyCycle(brightness);
            Thread.sleep(100);
            //I made it go up and down by 0.05 to make it last longer and see more  
            if (goingUp) {
                brightness += 0.05;
                if (brightness >= 1.0) {
                    brightness = 1.0;
                    goingUp = false;
                }
            } else {
                brightness -= 0.05;
                if (brightness <= 0.0) {
                    brightness = 0.0;
                    break;
                }
            }
        }
    }
}
  