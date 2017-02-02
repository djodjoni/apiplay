
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "darksky-unavailable",
    "darksky-stations",
    "datapoint-stations",
    "isd-stations",
    "lamp-stations",
    "metar-stations",
    "sources",
    "metno-license",
    "units"
})
public class Flags {

    @JsonProperty("darksky-unavailable")
    private String darkskyUnavailable;
    @JsonProperty("darksky-stations")
    private List<String> darkskyStations = null;
    @JsonProperty("datapoint-stations")
    private List<String> datapointStations = null;
    @JsonProperty("isd-stations")
    private List<String> isdStations = null;
    @JsonProperty("lamp-stations")
    private List<String> lampStations = null;
    @JsonProperty("metar-stations")
    private List<String> metarStations = null;
    @JsonProperty("sources")
    private List<String> sources = null;
    @JsonProperty("metno-license")
    private String metnoLicense;
    @JsonProperty("units")
    private String units;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("darksky-unavailable")
    public String getDarkskyUnavailable() {
        return darkskyUnavailable;
    }

    @JsonProperty("darksky-unavailable")
    public void setDarkskyUnavailable(String darkskyUnavailable) {
        this.darkskyUnavailable = darkskyUnavailable;
    }

    @JsonProperty("darksky-stations")
    public List<String> getDarkskyStations() {
        return darkskyStations;
    }

    @JsonProperty("darksky-stations")
    public void setDarkskyStations(List<String> darkskyStations) {
        this.darkskyStations = darkskyStations;
    }

    @JsonProperty("datapoint-stations")
    public List<String> getDatapointStations() {
        return datapointStations;
    }

    @JsonProperty("datapoint-stations")
    public void setDatapointStations(List<String> datapointStations) {
        this.datapointStations = datapointStations;
    }

    @JsonProperty("isd-stations")
    public List<String> getIsdStations() {
        return isdStations;
    }

    @JsonProperty("isd-stations")
    public void setIsdStations(List<String> isdStations) {
        this.isdStations = isdStations;
    }

    @JsonProperty("lamp-stations")
    public List<String> getLampStations() {
        return lampStations;
    }

    @JsonProperty("lamp-stations")
    public void setLampStations(List<String> lampStations) {
        this.lampStations = lampStations;
    }

    @JsonProperty("metar-stations")
    public List<String> getMetarStations() {
        return metarStations;
    }

    @JsonProperty("metar-stations")
    public void setMetarStations(List<String> metarStations) {
        this.metarStations = metarStations;
    }

    @JsonProperty("sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    @JsonProperty("metno-license")
    public String getMetnoLicense() {
        return metnoLicense;
    }

    @JsonProperty("metno-license")
    public void setMetnoLicense(String metnoLicense) {
        this.metnoLicense = metnoLicense;
    }

    @JsonProperty("units")
    public String getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(String units) {
        this.units = units;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
