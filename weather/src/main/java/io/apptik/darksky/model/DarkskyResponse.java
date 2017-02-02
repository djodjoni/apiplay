package io.apptik.darksky.model;

import java.util.List;

public interface DarkskyResponse  {
    double latitude();

    double longitude();

    String timezone();

    String offset();

    DataPoint currently();

    DataBlock minutely();

    DataBlock hourly();

    DataBlock daily();

    List<? extends AlertBlock> alerts();
}
