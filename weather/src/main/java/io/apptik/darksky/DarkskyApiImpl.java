package io.apptik.darksky;


import java.util.Map;

import io.apptik.comm.jus.Request;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.comm.jus.converter.JsonWrapperConverterFactory;
import io.apptik.comm.jus.converter.JsonWrapperResponseConverter;
import io.apptik.comm.jus.http.MediaType;
import io.apptik.darksky.model.DarkskyResponse;
import io.apptik.darksky.modelImpl.DarkskyResponseImpl;
import io.apptik.json.wrapper.JsonElementWrapper;

public class DarkskyApiImpl implements DarkskyApi {

    private final RequestQueue requestQueue;
    private final String apiKey;

    public DarkskyApiImpl(RequestQueue requestQueue, String apiKey) {
        this.requestQueue = requestQueue;
        this.requestQueue.addConverterFactory(new JsonWrapperConverterFactory
                (new JsonWrapperResponseConverter.DefaultJsonWrapperFactory() {
            @Override
            public JsonElementWrapper getWrapper(MediaType mediaType) {
                return new DarkskyResponseImpl();
            }
        }));
        this.apiKey = apiKey;
    }

    @Override
    public Request<DarkskyResponse> forecast(String lat, String lon) {
        return requestQueue.add(buildRequest(URI, apiKey, lat, lon));
    }

    @Override
    public Request<DarkskyResponse> forecast(String lat, String lon, String time) {
        return requestQueue.add(buildRequest(URI, apiKey, lat, lon, time));

    }

    @Override
    public Request<DarkskyResponse> forecast(String lat, String lon, Map<String, String> query) {
        return requestQueue.add(buildRequest(URI, apiKey, lat, lon));

    }

    @Override
    public Request<DarkskyResponse> forecast(String lat, String lon, String time, Map<String, String> query) {
        return requestQueue.add(buildRequest(URI, apiKey, lat, lon, time));
    }


    private Request<DarkskyResponse> buildRequest(String base, String key,
                                                              String lat, String lon, String time) {
        return new Request<>(Request.Method.GET, buildUri(base, key, lat, lon, time),
                DarkskyResponseImpl.class);
    }

    private Request<DarkskyResponse> buildRequest(String base, String key,
                                                              String lat, String lon) {
        return new Request<>(Request.Method.GET, buildUri(base, key, lat, lon),
                DarkskyResponseImpl.class);
    }

    private String buildUri(String base, String key, String lat, String lon, String time) {
        return base + "/" + key + "/" + lat + "," + lon + "," + time;
    }

    private String buildUri(String base, String key, String lat, String lon) {
        return base + "/" + key + "/" + lat + "," + lon ;
    }
}
