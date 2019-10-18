package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface ChronItem {

    String getId();

    void setId(String id);

    List<Date> getDates();

    void setDates(List<Date> date);

    List<DateRange> getDateRanges();

    void setDateRanges(List<DateRange> dateRanges);

    String getEvent();

    void setEvent(String event);

    List<PlaceEntry> getPlaceEntries();

    void setPlaceEntries(List<PlaceEntry> placeEntries);

    void setLocalType(String localType);

    String getLocalType();

}