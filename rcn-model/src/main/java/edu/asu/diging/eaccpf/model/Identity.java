package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Identity {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    String getIdentityType();

    void setIdentityType(String identityType);

    List<EntityId> getEntityIds();

    void setEntityIds(List<EntityId> entityIds);

    String getEntityType();

    void setEntityType(String entityType);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    List<NameEntry> getNameEntries();

    void setNameEntries(List<NameEntry> nameEntries);

    List<NameEntryParallel> getNameEntriesParallel();

    void setNameEntriesParallel(List<NameEntryParallel> nameEntriesParallel);

}