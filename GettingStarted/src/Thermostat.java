import com.phidget22.*;
public class Thermostat {
   public static void main(String[] args) throws Exception {

	   
       HumiditySensor humiditySensor = new HumiditySensor();
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();

       
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);    
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);

       
       humiditySensor.open(1000);
       temperatureSensor.open(1000);
       redButton.open(1000);
       redLED.open(1000);
       greenButton.open(1000);
       greenLED.open(1000);
       // Set temperature starts at 21°C 
       int setTemperature = 21;

       
       boolean lastRedState = false;
       boolean lastGreenState = false;

       
       long lastPrintTime = System.currentTimeMillis();

       
       while (true) {
        
           // Read the current temperature from the sensor
           double Temperature = temperatureSensor.getTemperature();
           // If the green button is pressed, increase set temperature by 1°C
           if (greenButton.getState() && !lastGreenState) {
               setTemperature++;
           }
           // If the red button is pressed, decrease set temperature by 1°C
           if (redButton.getState() && !lastRedState) {
               setTemperature--;
           }
           lastGreenState = greenButton.getState();
           lastRedState = redButton.getState();
           // Check if the current temperature is within the acceptable range,
           if (Temperature >= setTemperature - 2 && Temperature <= setTemperature + 2) {
               greenLED.setState(true);
               redLED.setState(false);
           } else {
               greenLED.setState(false);
               redLED.setState(true);
           }
           // Print the current temperature and set temperature every 5 seconds (10 sec was taking too long)
           if (System.currentTimeMillis() - lastPrintTime >= 5000) {
               System.out.println("Current Temperature: " + Temperature + " °C");
               System.out.println("Set Temperature: " + setTemperature + " °C");
               System.out.println("----------------------------------");
               lastPrintTime = System.currentTimeMillis();
           }
           Thread.sleep(150);
       }
   }
}
