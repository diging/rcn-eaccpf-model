package edu.asu.diging.eaccpf.model;

public interface MaintenanceAgency {

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    String getDescriptiveNote();

    void setDescriptiveNote(String descriptiveNote);

    Record getRecord();

    void setRecord(Record record);

}