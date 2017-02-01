package io.apptik.darksky.modelImpl;


import io.apptik.darksky.model.AlertBlock;
import io.apptik.json.wrapper.JsonObjectWrapper;

public class AlertBlockImpl extends JsonObjectWrapper implements AlertBlock {

    @Override
    public String title() {
        return getJson().optString("title");
    }

    @Override
    public Long time() {
        return getJson().optLong("time");
    }

    @Override
    public Long expires() {
        return getJson().optLong("expires");
    }

    @Override
    public String description() {
        return getJson().optString("description");
    }

    @Override
    public String uri() {
        return getJson().optString("uri");
    }
}
