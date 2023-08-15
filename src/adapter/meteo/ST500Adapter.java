package adapter.meteo;

import java.time.LocalDateTime;

public class ST500Adapter implements MeteoSensor {
    private SensorTemperature newSensor;

    public ST500Adapter(SensorTemperature newSensor) {
        this.newSensor = newSensor;
    }

    @Override
    public int getId() {
        return newSensor.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)newSensor.temperature();
    }

    @Override
    public Float getHumidity() {
        System.out.println("Данный датчик не поддерживает влажность");
        return null;
    }

    @Override
    public Float getPressure() {
        System.out.println("Данный датчик не поддерживает давление");
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime timeStamp = LocalDateTime.of(newSensor.year(), 8, 12, 0,0);
        timeStamp.plusDays(newSensor.day()).plusSeconds(newSensor.second());
        return  timeStamp;
    }
}
