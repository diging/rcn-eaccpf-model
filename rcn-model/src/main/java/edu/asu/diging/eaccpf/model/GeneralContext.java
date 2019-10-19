package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface GeneralContext {

    String getId();

    void setId(String id);

    List<String> getCitations();

    void setCitations(List<String> citations);

    List<ItemList> getItemLists();

    void setItemLists(List<ItemList> itemLists);

    List<Outline> getOutlines();

    void setOutlines(List<Outline> outlines);

    List<String> getPs();

    void setPs(List<String> ps);

}