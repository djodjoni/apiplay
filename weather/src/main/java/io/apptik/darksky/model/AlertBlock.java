package io.apptik.darksky.model;


public interface AlertBlock {
    String title();
    Long time();
    Long expires();
    String description();
    String uri();
}
