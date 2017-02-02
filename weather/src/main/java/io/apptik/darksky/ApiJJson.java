package io.apptik.darksky;

import io.apptik.comm.jus.Converter;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.comm.jus.converter.JsonWrapperConverterFactory;
import io.apptik.comm.jus.converter.JsonWrapperResponseConverter;
import io.apptik.comm.jus.http.MediaType;
import io.apptik.darksky.modelImpl.DarkskyResponseImpl;
import io.apptik.json.wrapper.JsonElementWrapper;


public class ApiJJson extends DarkskyApiImpl {

    public ApiJJson(RequestQueue requestQueue, String apiKey) {
        super(requestQueue, apiKey);
    }

    @Override
    protected Class getRespClass() {
        return DarkskyResponseImpl.class;
    }

    @Override
    protected Converter.Factory getConverter() {
        return new JsonWrapperConverterFactory
                (new JsonWrapperResponseConverter.DefaultJsonWrapperFactory() {
                    @Override
                    public JsonElementWrapper getWrapper(MediaType mediaType) {
                        return new DarkskyResponseImpl();
                    }
                }) ;
    }
}
