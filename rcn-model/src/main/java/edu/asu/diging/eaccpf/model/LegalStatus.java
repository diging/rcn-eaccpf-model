package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface LegalStatus {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<String> getCitations();

    void setCitations(List<String> citations);

    Date getDate();

    void setDate(Date date);

    DateRange getDateRange();

    void setDateRange(DateRange dateRange);

    DateSet getDateSet();

    void setDateSet(DateSet dateSet);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    PlaceEntry getPlaceEntry();

    void setPlaceEntry(PlaceEntry placeEntry);

    Term getTerm();

    void setTerm(Term term);

}