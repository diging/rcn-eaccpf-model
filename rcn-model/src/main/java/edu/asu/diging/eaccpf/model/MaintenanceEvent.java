package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface MaintenanceEvent {

    String getId();

    void setId(String id);

    String getAgent();

    void setAgent(String agent);

    String getAgentType();

    void setAgentType(String agentType);

    String getEventType();

    void setEventType(String eventType);

    List<String> getEventDescription();

    void setEventDescription(List<String> eventDescription);

    DateTime getEventDateTime();

    void setEventDateTime(DateTime eventDateTime);

}