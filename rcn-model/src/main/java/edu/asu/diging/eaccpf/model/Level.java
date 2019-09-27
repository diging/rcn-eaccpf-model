package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Level {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<Level> getSubLevels();

    void setSubLevels(List<Level> subLevels);

    List<Item> getItems();

    void setItems(List<Item> items);

}