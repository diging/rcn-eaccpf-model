package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.MaintenanceAgency;

@Entity
public class MaintenanceAgencyImpl implements MaintenanceAgency {
    
    @Id
    @GeneratedValue(generator = "agency_id_generator")
    @GenericGenerator(name = "agency_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "AG"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    private String name;
    private String code;
    private String otherAgencyCode;
    
    @ElementCollection
    @Lob
    private List<String> descriptiveNote;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#getId()
     */
    @Override
    public String getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#getName()
     */
    @Override
    public String getName() {
        return name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#setName(java.lang.String)
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#getCode()
     */
    @Override
    public String getCode() {
        return code;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#setCode(java.lang.String)
     */
    @Override
    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public String getOtherAgencyCode() {
        return otherAgencyCode;
    }
    @Override
    public void setOtherAgencyCode(String otherAgencyCode) {
        this.otherAgencyCode = otherAgencyCode;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.MaintenanceAgency#setDescriptiveNote(java.lang.String)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }
}
