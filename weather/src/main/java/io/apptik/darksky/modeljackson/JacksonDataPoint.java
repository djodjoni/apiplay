
package io.apptik.darksky.modeljackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

import io.apptik.darksky.model.DataPoint;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "summary",
        "icon",
        "sunriseTime",
        "sunsetTime",
        "precipIntensity",
        "precipIntensityError",
        "precipIntensityMax",
        "precipIntensityMaxTime",
        "precipIntensityMaxError",
        "precipProbability",
        "precipProbabilityError",
        "precipType",
        "precipAccumulation",
        "precipAccumulationError",
        "temperature",
        "temperatureError",
        "temperatureMin",
        "temperatureMinTime",
        "temperatureMinError",
        "temperatureMax",
        "temperatureMaxTime",
        "temperatureMaxError",
        "dewPoint",
        "dewPointError",
        "windSpeed",
        "windSpeedError",
        "windBearing",
        "windBearingError",
        "cloudCover",
        "cloudCoverError",
        "humidity",
        "humidityError",
        "pressure",
        "pressureError",
        "visibility",
        "visibilityError",
        "ozone",
        "ozoneError"
})
public class JacksonDataPoint implements DataPoint {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("time")
    private Long time;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("sunriseTime")
    private Float sunriseTime;
    @JsonProperty("sunsetTime")
    private Float sunsetTime;
    @JsonProperty("precipIntensity")
    private Float precipIntensity;
    @JsonProperty("precipIntensityError")
    private Float precipIntensityError;
    @JsonProperty("precipIntensityMax")
    private Float precipIntensityMax;
    @JsonProperty("precipIntensityMaxTime")
    private Float precipIntensityMaxTime;
    @JsonProperty("precipIntensityMaxError")
    private Float precipIntensityMaxError;
    @JsonProperty("precipProbability")
    private Float precipProbability;
    @JsonProperty("precipProbabilityError")
    private Float precipProbabilityError;
    @JsonProperty("precipType")
    private String precipType;
    @JsonProperty("precipAccumulation")
    private Float precipAccumulation;
    @JsonProperty("precipAccumulationError")
    private Float precipAccumulationError;
    @JsonProperty("temperature")
    private Float temperature;
    @JsonProperty("temperatureError")
    private Float temperatureError;
    @JsonProperty("temperatureMin")
    private Float temperatureMin;
    @JsonProperty("temperatureMinTime")
    private Float temperatureMinTime;
    @JsonProperty("temperatureMinError")
    private Float temperatureMinError;
    @JsonProperty("temperatureMax")
    private Float temperatureMax;
    @JsonProperty("temperatureMaxTime")
    private Float temperatureMaxTime;
    @JsonProperty("temperatureMaxError")
    private Float temperatureMaxError;
    @JsonProperty("dewPoint")
    private Float dewPoint;
    @JsonProperty("dewPointError")
    private Float dewPointError;
    @JsonProperty("windSpeed")
    private Float windSpeed;
    @JsonProperty("windSpeedError")
    private Float windSpeedError;
    @JsonProperty("windBearing")
    private Float windBearing;
    @JsonProperty("windBearingError")
    private Float windBearingError;
    @JsonProperty("cloudCover")
    private Float cloudCover;
    @JsonProperty("cloudCoverError")
    private Float cloudCoverError;
    @JsonProperty("humidity")
    private Float humidity;
    @JsonProperty("humidityError")
    private Float humidityError;
    @JsonProperty("pressure")
    private Float pressure;
    @JsonProperty("pressureError")
    private Float pressureError;
    @JsonProperty("visibility")
    private Float visibility;
    @JsonProperty("visibilityError")
    private Float visibilityError;
    @JsonProperty("ozone")
    private Float ozone;
    @JsonProperty("ozoneError")
    private Float ozoneError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("time")
    public Long getTime() {
        return time;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("time")
    public void setTime(Long time) {
        this.time = time;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("sunriseTime")
    public Float getSunriseTime() {
        return sunriseTime;
    }

    @JsonProperty("sunriseTime")
    public void setSunriseTime(Float sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    @JsonProperty("sunsetTime")
    public Float getSunsetTime() {
        return sunsetTime;
    }

    @JsonProperty("sunsetTime")
    public void setSunsetTime(Float sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    @JsonProperty("precipIntensity")
    public Float getPrecipIntensity() {
        return precipIntensity;
    }

    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(Float precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    @JsonProperty("precipIntensityError")
    public Float getPrecipIntensityError() {
        return precipIntensityError;
    }

    @JsonProperty("precipIntensityError")
    public void setPrecipIntensityError(Float precipIntensityError) {
        this.precipIntensityError = precipIntensityError;
    }

    @JsonProperty("precipIntensityMax")
    public Float getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    @JsonProperty("precipIntensityMax")
    public void setPrecipIntensityMax(Float precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    @JsonProperty("precipIntensityMaxTime")
    public Float getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    @JsonProperty("precipIntensityMaxTime")
    public void setPrecipIntensityMaxTime(Float precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    @JsonProperty("precipIntensityMaxError")
    public Float getPrecipIntensityMaxError() {
        return precipIntensityMaxError;
    }

    @JsonProperty("precipIntensityMaxError")
    public void setPrecipIntensityMaxError(Float precipIntensityMaxError) {
        this.precipIntensityMaxError = precipIntensityMaxError;
    }

    @JsonProperty("precipProbability")
    public Float getPrecipProbability() {
        return precipProbability;
    }

    @JsonProperty("precipProbability")
    public void setPrecipProbability(Float precipProbability) {
        this.precipProbability = precipProbability;
    }

    @JsonProperty("precipProbabilityError")
    public Float getPrecipProbabilityError() {
        return precipProbabilityError;
    }

    @JsonProperty("precipProbabilityError")
    public void setPrecipProbabilityError(Float precipProbabilityError) {
        this.precipProbabilityError = precipProbabilityError;
    }

    @JsonProperty("precipType")
    public String getPrecipType() {
        return precipType;
    }

    @JsonProperty("precipType")
    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    @JsonProperty("precipAccumulation")
    public Float getPrecipAccumulation() {
        return precipAccumulation;
    }

    @JsonProperty("precipAccumulation")
    public void setPrecipAccumulation(Float precipAccumulation) {
        this.precipAccumulation = precipAccumulation;
    }

    @JsonProperty("precipAccumulationError")
    public Float getPrecipAccumulationError() {
        return precipAccumulationError;
    }

    @JsonProperty("precipAccumulationError")
    public void setPrecipAccumulationError(Float precipAccumulationError) {
        this.precipAccumulationError = precipAccumulationError;
    }

    @JsonProperty("temperature")
    public Float getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("temperatureError")
    public Float getTemperatureError() {
        return temperatureError;
    }

    @JsonProperty("temperatureError")
    public void setTemperatureError(Float temperatureError) {
        this.temperatureError = temperatureError;
    }

    @JsonProperty("temperatureMin")
    public Float getTemperatureMin() {
        return temperatureMin;
    }

    @JsonProperty("temperatureMin")
    public void setTemperatureMin(Float temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    @JsonProperty("temperatureMinTime")
    public Float getTemperatureMinTime() {
        return temperatureMinTime;
    }

    @JsonProperty("temperatureMinTime")
    public void setTemperatureMinTime(Float temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    @JsonProperty("temperatureMinError")
    public Float getTemperatureMinError() {
        return temperatureMinError;
    }

    @JsonProperty("temperatureMinError")
    public void setTemperatureMinError(Float temperatureMinError) {
        this.temperatureMinError = temperatureMinError;
    }

    @JsonProperty("temperatureMax")
    public Float getTemperatureMax() {
        return temperatureMax;
    }

    @JsonProperty("temperatureMax")
    public void setTemperatureMax(Float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    @JsonProperty("temperatureMaxTime")
    public Float getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    @JsonProperty("temperatureMaxTime")
    public void setTemperatureMaxTime(Float temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    @JsonProperty("temperatureMaxError")
    public Float getTemperatureMaxError() {
        return temperatureMaxError;
    }

    @JsonProperty("temperatureMaxError")
    public void setTemperatureMaxError(Float temperatureMaxError) {
        this.temperatureMaxError = temperatureMaxError;
    }

    @JsonProperty("dewPoint")
    public Float getDewPoint() {
        return dewPoint;
    }

    @JsonProperty("dewPoint")
    public void setDewPoint(Float dewPoint) {
        this.dewPoint = dewPoint;
    }

    @JsonProperty("dewPointError")
    public Float getDewPointError() {
        return dewPointError;
    }

    @JsonProperty("dewPointError")
    public void setDewPointError(Float dewPointError) {
        this.dewPointError = dewPointError;
    }

    @JsonProperty("windSpeed")
    public Float getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("windSpeed")
    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("windSpeedError")
    public Float getWindSpeedError() {
        return windSpeedError;
    }

    @JsonProperty("windSpeedError")
    public void setWindSpeedError(Float windSpeedError) {
        this.windSpeedError = windSpeedError;
    }

    @JsonProperty("windBearing")
    public Float getWindBearing() {
        return windBearing;
    }

    @JsonProperty("windBearing")
    public void setWindBearing(Float windBearing) {
        this.windBearing = windBearing;
    }

    @JsonProperty("windBearingError")
    public Float getWindBearingError() {
        return windBearingError;
    }

    @JsonProperty("windBearingError")
    public void setWindBearingError(Float windBearingError) {
        this.windBearingError = windBearingError;
    }

    @JsonProperty("cloudCover")
    public Float getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloudCover")
    public void setCloudCover(Float cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("cloudCoverError")
    public Float getCloudCoverError() {
        return cloudCoverError;
    }

    @JsonProperty("cloudCoverError")
    public void setCloudCoverError(Float cloudCoverError) {
        this.cloudCoverError = cloudCoverError;
    }

    @JsonProperty("humidity")
    public Float getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("humidityError")
    public Float getHumidityError() {
        return humidityError;
    }

    @JsonProperty("humidityError")
    public void setHumidityError(Float humidityError) {
        this.humidityError = humidityError;
    }

    @JsonProperty("pressure")
    public Float getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("pressureError")
    public Float getPressureError() {
        return pressureError;
    }

    @JsonProperty("pressureError")
    public void setPressureError(Float pressureError) {
        this.pressureError = pressureError;
    }

    @JsonProperty("visibility")
    public Float getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Float visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("visibilityError")
    public Float getVisibilityError() {
        return visibilityError;
    }

    @JsonProperty("visibilityError")
    public void setVisibilityError(Float visibilityError) {
        this.visibilityError = visibilityError;
    }

    @JsonProperty("ozone")
    public Float getOzone() {
        return ozone;
    }

    @JsonProperty("ozone")
    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

    @JsonProperty("ozoneError")
    public Float getOzoneError() {
        return ozoneError;
    }

    @JsonProperty("ozoneError")
    public void setOzoneError(Float ozoneError) {
        this.ozoneError = ozoneError;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public Long time() {
        return time;
    }

    @Override
    public String summary() {
        return summary;
    }

    @Override
    public String icon() {
        return icon;
    }

    @Override
    public String sunriseTime() {
        return sunriseTime.toString();
    }

    @Override
    public String sunsetTime() {
        return sunsetTime.toString();
    }

    @Override
    public String moonPhase() {
        //todo
        return null;
    }

    @Override
    public String nearestStormDistance() {
        return null;
    }

    @Override
    public String nearestStormBearing() {
        return null;
    }

    @Override
    public String precipIntensity() {
        return precipIntensity.toString();
    }

    @Override
    public String precipIntensityMax() {
        return precipIntensityMax.toString();
    }

    @Override
    public String precipIntensityMaxTime() {
        return precipIntensityMaxTime.toString();
    }

    @Override
    public String precipProbability() {
        return null;
    }

    @Override
    public String precipType() {
        return null;
    }

    @Override
    public String precipAccumulation() {
        return null;
    }

    @Override
    public Double temperature() {
        return null;
    }

    @Override
    public Double temperatureMin() {
        return null;
    }

    @Override
    public Double temperatureMinTime() {
        return null;
    }

    @Override
    public Double temperatureMax() {
        return null;
    }

    @Override
    public Double temperatureMaxTime() {
        return null;
    }

    @Override
    public Double apparentTemperature() {
        return null;
    }

    @Override
    public Double apparentTemperatureMin() {
        return null;
    }

    @Override
    public Double apparentTemperatureMinTime() {
        return null;
    }

    @Override
    public Double apparentTemperatureMax() {
        return null;
    }

    @Override
    public Double apparentTemperatureMaxTime() {
        return null;
    }

    @Override
    public String dewPoint() {
        return null;
    }

    @Override
    public String windSpeed() {
        return null;
    }

    @Override
    public String windBearing() {
        return null;
    }

    @Override
    public String cloudClover() {
        return null;
    }

    @Override
    public String humidity() {
        return null;
    }

    @Override
    public String pressure() {
        return null;
    }

    @Override
    public String visibility() {
        return null;
    }

    @Override
    public String ozone() {
        return null;
    }
}
