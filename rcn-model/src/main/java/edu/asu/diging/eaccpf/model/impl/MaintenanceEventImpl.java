package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.DateTime;
import edu.asu.diging.eaccpf.model.MaintenanceEvent;

@Entity
public class MaintenanceEventImpl implements MaintenanceEvent {

    @Id
    @GeneratedValue(generator = "mainEvent_id_generator")
    @GenericGenerator(name = "mainEvent_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "ME"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String agent;
    private String agentType;
    private String eventType;
    
    @ElementCollection
    @Lob
    private List<String> eventDescription;
    
    @OneToOne(targetEntity=DateTimeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private DateTime eventDateTime;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#getId()
     */
    @Override
    public String getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#getAgent()
     */
    @Override
    public String getAgent() {
        return agent;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#setAgent(java.lang.String)
     */
    @Override
    public void setAgent(String agent) {
        this.agent = agent;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#getAgentType()
     */
    @Override
    public String getAgentType() {
        return agentType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#setAgentType(java.lang.String)
     */
    @Override
    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#getEventType()
     */
    @Override
    public String getEventType() {
        return eventType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#setEventType(java.lang.String)
     */
    @Override
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#getEventDescription()
     */
    @Override
    public List<String> getEventDescription() {
        return eventDescription;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#setEventDescription(java.lang.String)
     */
    @Override
    public void setEventDescription(List<String> eventDescription) {
        this.eventDescription = eventDescription;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#getEventDateTime()
     */
    @Override
    public DateTime getEventDateTime() {
        return eventDateTime;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceEvent#setEventDateTime(edu.asu.diging.rcn.core.model.DateTime)
     */
    @Override
    public void setEventDateTime(DateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
    
}
