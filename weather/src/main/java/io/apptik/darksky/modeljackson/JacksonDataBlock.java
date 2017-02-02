
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

import io.apptik.darksky.model.DataBlock;
import io.apptik.darksky.model.DataPoint;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "icon",
    "summary"
})
public class JacksonDataBlock implements DataBlock {

    @JsonProperty("data")
    private List<JacksonDataPoint> data = null;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("summary")
    private String summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public List<JacksonDataPoint> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<JacksonDataPoint> data) {
        this.data = data;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
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
    public String summary() {
        return getSummary();
    }

    @Override
    public String icon() {
        return getIcon();
    }

    @Override
    public List<? extends DataPoint> data() {
        return data;
    }
}
