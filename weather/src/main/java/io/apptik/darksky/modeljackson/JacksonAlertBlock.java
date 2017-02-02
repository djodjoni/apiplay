
package io.apptik.darksky.modeljackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import io.apptik.darksky.model.AlertBlock;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "expires",
    "description",
    "uri"
})
public class JacksonAlertBlock implements AlertBlock {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("expires")
    private double expires;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uri")
    private URI uri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("expires")
    public double getExpires() {
        return expires;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("expires")
    public void setExpires(double expires) {
        this.expires = expires;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uri")
    public URI getUri() {
        return uri;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uri")
    public void setUri(URI uri) {
        this.uri = uri;
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
    public String title() {
        return getTitle();
    }

    @Override
    public Long time() {
        //todo
        return null;
    }

    @Override
    public Long expires() {
        return expires();
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public String uri() {
        return uri.toString();
    }
}
