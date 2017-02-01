package io.apptik.darksky;


import java.util.Map;

import io.apptik.comm.jus.Request;
import io.apptik.darksky.model.DarkskyResponse;


public interface DarkskyApi {

    String URI = "https://api.darksky.net/forecast";

    Request<DarkskyResponse> forecast(String lat, String lon);

    Request<DarkskyResponse> forecast(String lat,String lon, String time);

    Request<DarkskyResponse> forecast(String lat, String lon, Map<String,String> query);

    Request<DarkskyResponse> forecast(String lat,String lon, String time, Map<String,String> query);


}
