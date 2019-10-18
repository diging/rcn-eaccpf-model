package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Function {

    String getId();

    void setId(String id);

    List<Date> getDates();

    void setDates(List<Date> dates);

    List<DateRange> getDateRanges();

    void setDateRanges(List<DateRange> dateRanges);

    List<DateSet> getDateSets();

    void setDateSets(List<DateSet> dateSets);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    List<String> getCitations();

    void setCitations(List<String> citations);

    List<PlaceEntry> getPlaceEntries();

    void setPlaceEntries(List<PlaceEntry> placeEntry);

    Term getTerm();

    void setTerm(Term term);

}