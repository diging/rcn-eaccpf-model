package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Places {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<String> getCitations();

    void setCitations(List<String> citations);

    List<ItemList> getItemLists();

    void setItemLists(List<ItemList> itemList);

    List<Outline> getOutlines();

    void setOutlines(List<Outline> outline);

    List<String> getPs();

    void setPs(List<String> ps);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    List<Place> getPlaces();

    void setPlaces(List<Place> places);

}