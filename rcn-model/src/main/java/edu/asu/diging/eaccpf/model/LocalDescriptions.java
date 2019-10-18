package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface LocalDescriptions {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<String> getCitations();

    void setCitations(List<String> citations);

    ItemList getItemList();

    void setItemList(ItemList itemList);

    Outline getOutline();

    void setOutline(Outline outline);

    List<String> getPs();

    void setPs(List<String> ps);

    String getDescriptiveNote();

    void setDescriptiveNote(String descriptiveNote);

    List<LocalDescription> getLocalDescriptions();

    void setLocalDescriptions(List<LocalDescription> localDescriptions);

}