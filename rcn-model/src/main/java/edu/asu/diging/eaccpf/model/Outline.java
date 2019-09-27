package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Outline {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<Level> getLevels();

    void setLevels(List<Level> levels);

}