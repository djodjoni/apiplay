
package io.apptik.darksky.modeljackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.apptik.darksky.model.AlertBlock;
import io.apptik.darksky.model.DarkskyResponse;
import io.apptik.darksky.model.DataBlock;
import io.apptik.darksky.model.DataPoint;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "offset",
    "timezone",
    "currently",
    "minutely",
    "hourly",
    "daily",
    "alerts",
    "flags"
})
public class JacksonDarkskyResponse implements DarkskyResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    private double latitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("offset")
    private double offset;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("currently")
    private JacksonDataPoint currently;
    @JsonProperty("minutely")
    private JacksonDataBlock minutely;
    @JsonProperty("hourly")
    private JacksonDataBlock hourly;
    @JsonProperty("daily")
    private JacksonDataBlock daily;
    @JsonProperty("alerts")
    private List<JacksonAlertBlock> alerts = null;
    @JsonProperty("flags")
    private Flags flags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("offset")
    public double getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(double offset) {
        this.offset = offset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("currently")
    public JacksonDataPoint getCurrently() {
        return currently;
    }

    @JsonProperty("currently")
    public void setCurrently(JacksonDataPoint currently) {
        this.currently = currently;
    }

    @JsonProperty("minutely")
    public JacksonDataBlock getMinutely() {
        return minutely;
    }

    @JsonProperty("minutely")
    public void setMinutely(JacksonDataBlock minutely) {
        this.minutely = minutely;
    }

    @JsonProperty("hourly")
    public JacksonDataBlock getHourly() {
        return hourly;
    }

    @JsonProperty("hourly")
    public void setHourly(JacksonDataBlock hourly) {
        this.hourly = hourly;
    }

    @JsonProperty("daily")
    public JacksonDataBlock getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(JacksonDataBlock daily) {
        this.daily = daily;
    }

    @JsonProperty("alerts")
    public List<JacksonAlertBlock> getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(List<JacksonAlertBlock> alerts) {
        this.alerts = alerts;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
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
    public double latitude() {
        return 0;
    }

    @Override
    public double longitude() {
        return 0;
    }

    @Override
    public String timezone() {
        return timezone;
    }

    @Override
    public String offset() {
        return ""+offset;
    }

    @Override
    public DataPoint currently() {
        return currently;
    }

    @Override
    public DataBlock minutely() {
        return minutely;
    }

    @Override
    public DataBlock hourly() {
        return hourly;
    }

    @Override
    public DataBlock daily() {
        return daily;
    }

    @Override
    public List<? extends AlertBlock> alerts() {
        return alerts;
    }
}
