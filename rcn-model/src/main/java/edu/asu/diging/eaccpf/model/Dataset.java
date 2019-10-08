package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Dataset {

    String getId();

    void setId(String id);

    List<Record> getRecords();

    void setRecords(List<Record> records);

    void setDescription(String description);

    String getDescription();

    void setTitle(String title);

    String getTitle();

}