package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface LocalTypeDeclaration {

    String getId();

    void setId(String id);

    String getAbbreviation();

    void setAbbreviation(String abbreviation);

    String getCitation();

    void setCitation(String citation);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

}