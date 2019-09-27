package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Dataset {

    String getId();

    void setId(String id);

    List<Record> getFunctions();

    void setFunctions(List<Record> functions);

}