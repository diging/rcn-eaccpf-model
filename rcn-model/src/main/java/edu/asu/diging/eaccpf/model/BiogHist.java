package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface BiogHist {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<String> getPs();

    void setPs(List<String> ps);

    Abstract getAbstractText();

    void setAbstractText(Abstract abstractText);

    ChronList getChronList();

    void setChronList(ChronList chronList);

    List<String> getCitations();

    void setCitations(List<String> citations);

    ItemList getItemList();

    void setItemList(ItemList itemList);

    List<Outline> getOutlines();

    void setOutlines(List<Outline> outline);

}