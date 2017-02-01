package io.apptik.darksky.modelImpl;


import io.apptik.darksky.model.DataPoint;
import io.apptik.json.wrapper.JsonObjectWrapper;

public class DataPointImpl extends JsonObjectWrapper implements DataPoint {


    @Override
    public Long time() {
        return getJson().optLong("time");
    }

    @Override
    public String summary() {
        return getJson().optString("summary");
    }

    @Override
    public String icon() {
        return getJson().optString("icon");
    }

    @Override
    public String sunriseTime() {
        return getJson().optString("sunriseTime");
    }

    @Override
    public String sunsetTime() {
        return getJson().optString("sunsetTime");
    }

    @Override
    public String moonPhase() {
        return getJson().optString("moonPhase");
    }

    @Override
    public String nearestStormDistance() {
        return getJson().optString("nearestStormDistance");
    }

    @Override
    public String nearestStormBearing() {
        return getJson().optString("nearestStormBearing");
    }

    @Override
    public String precipIntensity() {
        return getJson().optString("precipIntensity");
    }

    @Override
    public String precipIntensityMax() {
        return getJson().optString("precipIntensityMax");
    }

    @Override
    public String precipIntensityMaxTime() {
        return getJson().optString("precipIntensityMaxTime");
    }

    @Override
    public String precipProbability() {
        return getJson().optString("precipProbability");
    }

    @Override
    public String precipType() {
        return getJson().optString("precipType");
    }

    @Override
    public String precipAccumulation() {
        return getJson().optString("precipAccumulation");
    }

    @Override
    public Double temperature() {
        return getJson().optDouble("temperature");
    }

    @Override
    public Double temperatureMin() {
        return getJson().optDouble("temperatureMin");
    }

    @Override
    public Double temperatureMinTime() {
        return getJson().optDouble("temperatureMinTime");
    }

    @Override
    public Double temperatureMax() {
        return getJson().optDouble("temperatureMax");
    }

    @Override
    public Double temperatureMaxTime() {
        return getJson().optDouble("temperatureMaxTime");
    }

    @Override
    public Double apparentTemperature() {
        return getJson().optDouble("apparentTemperature");
    }

    @Override
    public Double apparentTemperatureMin() {
        return getJson().optDouble("apparentTemperatureMin");
    }

    @Override
    public Double apparentTemperatureMinTime() {
        return getJson().optDouble("apparentTemperatureMinTime");
    }

    @Override
    public Double apparentTemperatureMax() {
        return getJson().optDouble("apparentTemperatureMax");
    }

    @Override
    public Double apparentTemperatureMaxTime() {
        return getJson().optDouble("apparentTemperatureMaxTime");
    }

    @Override
    public String dewPoint() {
        return getJson().optString("dewPoint");
    }

    @Override
    public String windSpeed() {
        return getJson().optString("windSpeed");
    }

    @Override
    public String windBearing() {
        return getJson().optString("windBearing");
    }

    @Override
    public String cloudClover() {
        return getJson().optString("cloudClover");
    }

    @Override
    public String humidity() {
        return getJson().optString("humidity");
    }

    @Override
    public String pressure() {
        return getJson().optString("pressure");
    }

    @Override
    public String visibility() {
        return getJson().optString("visibility");
    }

    @Override
    public String ozone() {
        return getJson().optString("ozone");
    }
}
