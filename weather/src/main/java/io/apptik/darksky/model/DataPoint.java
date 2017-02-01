package io.apptik.darksky.model;


public interface DataPoint {
    
    Long time();

    String summary();

    String icon();

    String sunriseTime();

    String sunsetTime();

    String moonPhase();

    String nearestStormDistance();

    String nearestStormBearing();

    String precipIntensity();

    String precipIntensityMax();

    String precipIntensityMaxTime();

    String precipProbability();

    String precipType();

    String precipAccumulation();

    Double temperature();

    Double temperatureMin();

    Double temperatureMinTime();

    Double temperatureMax();

    Double temperatureMaxTime();

    Double apparentTemperature();

    Double apparentTemperatureMin();

    Double apparentTemperatureMinTime();

    Double apparentTemperatureMax();

    Double apparentTemperatureMaxTime();

    String dewPoint();

    String windSpeed();

    String windBearing();

    String cloudClover();

    String humidity();

    String pressure();

    String visibility();

    String ozone();
}
