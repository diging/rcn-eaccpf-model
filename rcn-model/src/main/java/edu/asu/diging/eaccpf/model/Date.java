package edu.asu.diging.eaccpf.model;

public interface Date {

    String getId();

    void setId(String id);

    String getDate();

    void setDate(String date);

    String getStandardDate();

    void setStandardDate(String standardDate);

    String getNotBefore();

    void setNotBefore(String notBefore);

    void setNotAfter(String notAfter);

    String getNotAfter();

}