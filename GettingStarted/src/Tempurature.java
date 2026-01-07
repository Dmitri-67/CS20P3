
//Add Phidgets Library
import com.phidget22.*;

public class Tempurature {
    public static void main(String[] args) throws Exception{

        //Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);  
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true); 
        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        //This will print humidity and temperature read by the sensor every 150ms.
        while(true){
        	 double Temperature = temperatureSensor.getTemperature();
        	if (Temperature >= 30 && Temperature <= 31) {
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	 else {
                 greenLED.setState(false);
                 redLED.setState(true);
             }
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
            Thread.sleep(150);
        }
    }
}
  