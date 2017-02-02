package io.apptik.darksky;


import java.util.Map;

import io.apptik.comm.jus.Converter;
import io.apptik.comm.jus.Request;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.darksky.model.DarkskyResponse;

public abstract class DarkskyApiImpl implements DarkskyApi {

    private final RequestQueue requestQueue;
    private final String apiKey;

    public DarkskyApiImpl(RequestQueue requestQueue, String apiKey) {
        this.requestQueue = requestQueue;
        this.requestQueue.addConverterFactory(getConverter());
        this.apiKey = apiKey;
    }

    protected abstract Class getRespClass();
    protected abstract Converter.Factory  getConverter();

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
        return requestQueue.add(buildRequest(URI, apiKey, lat, lon, query));

    }

    @Override
    public Request<DarkskyResponse> forecast(String lat, String lon, String time, Map<String, String> query) {
        return requestQueue.add(buildRequest(URI, apiKey, lat, lon, time, query));
    }


    private Request<DarkskyResponse> buildRequest(String base, String key,
                                                  String lat, String lon, String time) {
        return new Request<>(Request.Method.GET, buildUri(base, key, lat, lon, time),
                getRespClass());
    }

    private Request<DarkskyResponse> buildRequest(String base, String key,
                                                  String lat, String lon) {
        return new Request<>(Request.Method.GET, buildUri(base, key, lat, lon),
                getRespClass());
    }

    private Request<DarkskyResponse> buildRequest(String base, String key,
                                                  String lat, String lon, String time, Map<String, String> query) {
        return new Request<>(Request.Method.GET, buildUri(base, key, lat, lon, time, query),
                getRespClass());
    }

    private Request<DarkskyResponse> buildRequest(String base, String key,
                                                  String lat, String lon, Map<String, String> query) {
        return new Request<>(Request.Method.GET, buildUri(base, key, lat, lon, query),
                getRespClass());
    }

    private String buildUri(String base, String key, String lat, String lon) {
        return base + "/" + key + "/" + lat + "," + lon ;
    }

    private String buildUri(String base, String key, String lat, String lon, String time) {
        return buildUri(base, key, lat, lon) + "," + time;
    }

    private String buildUri(String base, String key, String lat, String lon, String time, Map<String, String> query) {
        return buildUri(base, key, lat, lon, time) + "?" + buildQuery(query);
    }

    private String buildUri(String base, String key, String lat, String lon, Map<String, String> query) {
        return buildUri(base, key, lat, lon) + "?" + buildQuery(query);
    }

    private String buildQuery(Map<String,String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String entryKey = entry.getKey();
            if (entryKey == null) {
                throw new IllegalArgumentException("Query map contained null key.");
            }
            Object entryValue = entry.getValue();
            if (entryValue != null) { // Skip null values.
                sb.append(entryKey).append("=").append(entryValue).append("&");
            }
        }
        return sb.toString();
    }
}
