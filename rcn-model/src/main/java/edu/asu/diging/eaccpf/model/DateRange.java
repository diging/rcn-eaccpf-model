package edu.asu.diging.eaccpf.model;

public interface DateRange {

    String getId();

    void setId(String id);

    Date getFromDate();

    void setFromDate(Date fromDate);

    Date getToDate();

    void setToDate(Date toDate);

    void setLocalType(String localType);

    String getLocalType();

}