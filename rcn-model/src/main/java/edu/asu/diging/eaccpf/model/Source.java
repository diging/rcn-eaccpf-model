package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Source {

    String getId();

    void setId(String id);

    void setSourceEntries(List<SourceEntry> relationEntries);

    List<SourceEntry> getSourceEntries();

    void setDescriptiveNote(List<String> descriptiveNote);

    List<String> getDescriptiveNote();

    void setLastDateTimeVerified(String lastDateTimeVerified);

    String getLastDateTimeVerified();

}