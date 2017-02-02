package io.apptik.darksky;

import io.apptik.comm.jus.Converter;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.comm.jus.converter.JacksonConverterFactory;
import io.apptik.darksky.modeljackson.JacksonDarkskyResponse;


public class ApiJackson extends DarkskyApiImpl {

    public ApiJackson(RequestQueue requestQueue, String apiKey) {
        super(requestQueue, apiKey);
    }

    @Override
    protected Class getRespClass() {
        return JacksonDarkskyResponse.class;
    }

    @Override
    protected Converter.Factory getConverter() {
        return JacksonConverterFactory.create();
    }
}
