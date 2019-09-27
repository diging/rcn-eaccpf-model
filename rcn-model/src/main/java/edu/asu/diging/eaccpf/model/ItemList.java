package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface ItemList {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<Item> getItems();

    void setItems(List<Item> items);

}