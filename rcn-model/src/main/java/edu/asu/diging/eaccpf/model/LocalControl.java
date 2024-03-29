package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface LocalControl {

    String getId();

    void setId(String id);

    List<Date> getDates();

    void setDates(List<Date> date);

    List<DateRange> getDateRanges();

    void setDateRanges(List<DateRange> dateRange);

    String getTerm();

    void setTerm(String term);

}