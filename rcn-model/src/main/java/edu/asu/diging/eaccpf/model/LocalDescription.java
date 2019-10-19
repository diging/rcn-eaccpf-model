package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface LocalDescription {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<String> getCitations();

    void setCitations(List<String> citations);

    List<Date> getDates();

    void setDates(List<Date> dates);

    List<DateRange> getDateRanges();

    void setDateRanges(List<DateRange> dateRanges);

    List<DateSet> getDateSets();

    void setDateSets(List<DateSet> dateSets);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    List<PlaceEntry> getPlaceEntries();

    void setPlaceEntries(List<PlaceEntry> placeEntries);

    Term getTerm();

    void setTerm(Term term);

}