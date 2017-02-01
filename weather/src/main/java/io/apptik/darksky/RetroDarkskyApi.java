package io.apptik.darksky;


import java.util.Map;

import io.apptik.comm.jus.Request;
import io.apptik.comm.jus.retro.http.GET;
import io.apptik.comm.jus.retro.http.Path;
import io.apptik.comm.jus.retro.http.QueryMap;
import io.apptik.darksky.model.DarkskyResponse;

public interface RetroDarkskyApi extends DarkskyApi {

    @GET("/{lat},{lon}")
    Request<DarkskyResponse> forecast(@Path("lat") String lat, @Path("lon") String lon);

    @GET("/{lat},{lon},{time}")
    Request<DarkskyResponse> forecast(@Path("lat") String lat, @Path("lon") String lon
            , @Path("time") String time);

    @GET("/{lat},{lon}")
    Request<DarkskyResponse> forecast(@Path("lat") String lat, @Path("lon") String lon,
                  @QueryMap Map<String, String> query);

    @GET("/{lat},{lon},{time}")
    Request<DarkskyResponse> forecast(@Path("lat") String lat, @Path("lon") String lon
            , @Path("time") String time, @QueryMap Map<String, String> query);


}
