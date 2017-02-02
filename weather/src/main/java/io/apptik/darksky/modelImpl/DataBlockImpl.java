package io.apptik.darksky.modelImpl;


import java.util.List;

import io.apptik.darksky.model.DataBlock;
import io.apptik.darksky.model.DataPoint;
import io.apptik.json.wrapper.JsonObjectWrapper;

public class DataBlockImpl extends JsonObjectWrapper implements DataBlock {

    @Override
    public String summary() {
        return getJson().optString("summary");
    }

    @Override
    public String icon() {
        return getJson().optString("icon");
    }

    @Override
    public List<? extends DataPoint> data() {
        return null;
    }
}
