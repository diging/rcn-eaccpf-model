package edu.asu.diging.eaccpf.model;

public interface LocalControl {

    String getId();

    void setId(String id);

    String getDate();

    void setDate(String date);

    DateRange getDateRange();

    void setDateRange(DateRange dateRange);

    String getTerm();

    void setTerm(String term);

}