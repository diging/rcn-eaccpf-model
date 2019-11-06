package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface CpfRelation {

    String getId();

    void setId(String id);

    String getCpfRelationType();

    void setCpfRelationType(String cpfRelationType);

    String getLastDateTimeVerified();

    void setLastDateTimeVerified(String lastDateTimeVerified);

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

    List<RelationEntry> getRelationEntries();

    void setRelationEntries(List<RelationEntry> relationEntries);

    void setHref(String href);

    String getHref();

}