package io.apptik;

import java.util.ArrayList;

import io.apptik.comm.jus.Jus;
import io.apptik.comm.jus.JusLog;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.darksky.DarkskyApiImpl;
import io.apptik.darksky.model.DarkskyQuery;
import io.apptik.darksky.modelImpl.DarkskyQueryImpl;

public class Main {

    public static void main(String[] args) {
        JusLog.MarkerLog.on();
        RequestQueue requestQueue = Jus.newRequestQueue();
        try {
            DarkskyApiImpl client = new DarkskyApiImpl(requestQueue,
                    System.getProperty("darksky"));

            ArrayList<DarkskyQuery.Block> blocks2Exclude = new ArrayList<>();
            blocks2Exclude.add(DarkskyQuery.Block.DAILY);
            blocks2Exclude.add(DarkskyQuery.Block.ALERTS);
            client.forecast("50.5039", "4.4699", new DarkskyQueryImpl()
                    .setExclude(blocks2Exclude)
                    .setLang(DarkskyQuery.Language.GREEK)
                            .build());
        } finally {
            requestQueue.stopWhenDone();
        }

    }
}
