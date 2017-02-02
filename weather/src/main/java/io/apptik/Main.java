package io.apptik;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import io.apptik.comm.jus.Jus;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.darksky.DarkskyApiImpl;
import io.apptik.darksky.model.DarkskyQuery;
import io.apptik.darksky.model.DarkskyResponse;
import io.apptik.darksky.modelImpl.DarkskyQueryImpl;

public class Main {

    public static void main(String[] args) {
        //JusLog.MarkerLog.on();
        ArrayList<DarkskyResponse> responses =  new ArrayList<>();
        RequestQueue requestQueue = Jus.newRequestQueue();
        try {
            DarkskyApiImpl client = new DarkskyApiImpl(requestQueue,
                    System.getProperty("darksky"));
            Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.println("Press \"ENTER\" to continue...");
                if(scanner.nextLine().equals("exit")) break;

                ArrayList<DarkskyQuery.Block> blocks2Exclude = new ArrayList<>();
                blocks2Exclude.add(DarkskyQuery.Block.DAILY);
                blocks2Exclude.add(DarkskyQuery.Block.ALERTS);
                responses.add(client.forecast("50.5039", "4.4699", new DarkskyQueryImpl()
                        .setExclude(blocks2Exclude)
                        .setLang(DarkskyQuery.Language.GREEK)
                        .build()).getFuture().get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Responses: " + responses.size());
            requestQueue.stopWhenDone();
        }

    }
}
