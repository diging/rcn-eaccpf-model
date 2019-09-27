package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface ConventionDeclaration {

    String getId();

    void setId(String id);

    String getAbbreviation();

    void setAbbreviation(String abbreviation);

    String getCitation();

    void setCitation(String citation);

    void setDescriptiveNote(List<String> descriptiveNote);

    List<String> getDescriptiveNote();

}