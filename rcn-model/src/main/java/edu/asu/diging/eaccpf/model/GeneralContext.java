package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface GeneralContext {

    String getId();

    void setId(String id);

    List<String> getCitations();

    void setCitations(List<String> citations);

    ItemList getItemList();

    void setItemList(ItemList itemList);

    Outline getOutline();

    void setOutline(Outline outline);

    List<String> getPs();

    void setPs(List<String> ps);

}