package DAY54.PracticeHandlingExceptions.Application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean sensorOn;

    private Random random;

    public TemperatureSensor() {
        this.sensorOn = false;  // false = off ; true = on
        this.random = new Random(); //s

    }

    @Override
    public boolean isOn() {
        return this.sensorOn;

    }

    @Override
    public void setOn() {
        sensorOn = true;
    }

    @Override
    public void setOff() {
        sensorOn = false;
    }

    @Override
    public int read() {
        if (!this.sensorOn) {
            throw new IllegalArgumentException("Error: The Temperature is off");
//            return random.nextInt(61) - 30;
        }
//        } else
//            throw new IllegalStateException("Error: The Temperature is off");

        return random.nextInt(61) - 30;
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.setOn();
        System.out.println(sensor.read());
    }
}



    /* Use the ready-made Java class Random to choose the random number.
    You'll get an integer in the range 0...60 by calling new Random().nextInt(61);
    — to get a random integer in the range -30...30 you'll have to subtract a suitable number from the random number in the range 0...60. */