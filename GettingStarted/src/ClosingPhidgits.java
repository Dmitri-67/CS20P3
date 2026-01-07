import com.phidget22.*;

public class ClosingPhidgits {
    public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        //Try to reopen
        temperatureSensor.open(1000);
        
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        //Trying while its closed
        temperatureSensor.close();
        
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
    }
}