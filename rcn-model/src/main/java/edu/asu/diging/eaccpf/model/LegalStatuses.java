package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface LegalStatuses {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<String> getCitations();

    void setCitations(List<String> citations);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    List<LegalStatus> getLegalStatuses();

    void setLegalStatuses(List<LegalStatus> legalStatuses);

    List<ItemList> getItemList();

    void setItemList(List<ItemList> itemList);

    List<Outline> getOutline();

    void setOutline(List<Outline> outline);

    List<String> getPs();

    void setPs(List<String> ps);

}