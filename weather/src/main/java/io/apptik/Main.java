package io.apptik;

import io.apptik.comm.jus.Jus;
import io.apptik.comm.jus.JusLog;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.darksky.DarkskyApiImpl;

public class Main {

    public static void main(String[] args) {
        JusLog.MarkerLog.on();
        RequestQueue requestQueue = Jus.newRequestQueue();
        try {
            DarkskyApiImpl client = new DarkskyApiImpl(requestQueue,
                    System.getProperty("darksky"));

            client.forecast("50.5039", "4.4699");
        } finally {
            requestQueue.stopWhenDone();
        }

    }
}
