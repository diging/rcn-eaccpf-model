package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface NameEntryParallel {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<NameEntry> getNameEntries();

    void setNameEntries(List<NameEntry> nameEntries);

}