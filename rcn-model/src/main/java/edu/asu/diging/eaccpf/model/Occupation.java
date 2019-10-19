package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Occupation {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    List<Date> getDates();

    void setDates(List<Date> date);

    List<DateRange> getDateRanges();

    void setDateRanges(List<DateRange> dateRange);

    List<DateSet> getDateSets();

    void setDateSets(List<DateSet> dateSet);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    List<PlaceEntry> getPlaceEntries();

    void setPlaceEntries(List<PlaceEntry> placeEntries);

    Term getTerm();

    void setTerm(Term term);

    List<String> getCitations();

    void setCitations(List<String> citations);

}