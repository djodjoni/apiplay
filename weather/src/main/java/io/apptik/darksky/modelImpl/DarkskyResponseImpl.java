package io.apptik.darksky.modelImpl;

import java.util.List;

import io.apptik.darksky.model.AlertBlock;
import io.apptik.darksky.model.DarkskyResponse;
import io.apptik.darksky.model.DataBlock;
import io.apptik.darksky.model.DataPoint;
import io.apptik.json.JsonElement;
import io.apptik.json.wrapper.CachedTypedJsonArray;
import io.apptik.json.wrapper.JsonElementWrapper;
import io.apptik.json.wrapper.JsonObjectWrapper;
import io.apptik.json.wrapper.TypedJsonArray;

public class DarkskyResponseImpl extends JsonObjectWrapper implements DarkskyResponse {

    DataPointImpl currently = new DataPointImpl();

    DataBlockImpl minutely = new DataBlockImpl();
    DataBlockImpl hourly = new DataBlockImpl();
    DataBlockImpl daily = new DataBlockImpl();
    TypedJsonArray<AlertBlock> alerts = new CachedTypedJsonArray<AlertBlock>() {
        @Override
        protected AlertBlockImpl get(JsonElement jsonElement, int pos) {
            return new AlertBlockImpl().wrap(jsonElement.asJsonObject());
        }

        @Override
        protected JsonElement to(AlertBlock value) {
            return ((JsonElementWrapper)value).getJson();
        }
    };

    @Override
    public double latitude() {
        return getJson().getDouble("latitude");
    }

    @Override
    public double longitude() {
        return getJson().getDouble("longitude");
    }

    @Override
    public String timezone() {
        return getJson().optString("timezone");
    }

    @Override
    public String offset() {
        return getJson().optString(offset());
    }

    @Override
    public DataPoint currently() {
        return currently.wrap(getJson().optJsonObject("currently"));
    }

    @Override
    public DataBlock minutely() {
        return minutely.wrap(getJson().optJsonObject("minutely"));
    }

    @Override
    public DataBlock hourly() {
        return hourly.wrap(getJson().optJsonObject("hourly"));
    }

    @Override
    public DataBlock daily() {
        return daily.wrap(getJson().optJsonObject("daily"));
    }

    @Override
    public List<? extends AlertBlock> alerts() {
        if(alerts.getJson().isEmpty()) {
            alerts.wrap(getJson().optJsonArray("alerts"));
        }
        return alerts;
    }
}
