import com.phidget22.*;

public class AttachDetachEvents {

    public static void main(String[] args) throws Exception {

        // Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();

        // Hub configuration 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        // Temperature change event
        temperatureSensor.addTemperatureChangeListener(
            new TemperatureSensorTemperatureChangeListener() {
                public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                    System.out.println("Temperature: " + e.getTemperature() + "°C");
                }
            }
        );

        // Temperature Sensor Attach
        temperatureSensor.addAttachListener(e ->
            System.out.println("Attached Temperature Sensor")
        );

        // Temperature Sensor Detach
        temperatureSensor.addDetachListener(e ->
            System.out.println("Detached Temperature Sensor")
        );

        // Button Attach
        redButton.addAttachListener(e ->
            System.out.println("Attached Red Button")
        );

        // Button Detach
        redButton.addDetachListener(e ->
            System.out.println("Detached Red Button")
        );

        // LED Attach
        redLED.addAttachListener(e ->
            System.out.println("Attached Red LED")
        );

        // LED Detach
        redLED.addDetachListener(e ->
            System.out.println("Detached Red LED")
        );

        // Open
        temperatureSensor.open(1000);
        redButton.open(1000);
        redLED.open(1000);

        // Keep program running 
        while (true) {
            Thread.sleep(150);
        }
    }
}
