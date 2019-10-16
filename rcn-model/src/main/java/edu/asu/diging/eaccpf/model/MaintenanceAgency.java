package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface MaintenanceAgency {

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    List<String> getDescriptiveNote();

    void setDescriptiveNote(List<String> descriptiveNote);

    void setOtherAgencyCode(String otherAgencyCode);

    String getOtherAgencyCode();
}