package io.apptik.darksky.model;


import java.util.List;

public interface DataBlock {
    String summary();

    String icon();

    List<DataPoint> data();
}
