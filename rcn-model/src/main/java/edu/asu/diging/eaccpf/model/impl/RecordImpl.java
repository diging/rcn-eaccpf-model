package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.ConventionDeclaration;
import edu.asu.diging.eaccpf.model.Description;
import edu.asu.diging.eaccpf.model.Identity;
import edu.asu.diging.eaccpf.model.LanguageDeclaration;
import edu.asu.diging.eaccpf.model.LocalControl;
import edu.asu.diging.eaccpf.model.LocalTypeDeclaration;
import edu.asu.diging.eaccpf.model.MaintenanceAgency;
import edu.asu.diging.eaccpf.model.MaintenanceEvent;
import edu.asu.diging.eaccpf.model.Record;
import edu.asu.diging.eaccpf.model.Relations;
import edu.asu.diging.eaccpf.model.RightsDeclaration;
import edu.asu.diging.eaccpf.model.SetComponent;
import edu.asu.diging.eaccpf.model.Source;

@Entity
public class RecordImpl implements Record {

    @Id
    @GeneratedValue(generator = "record_id_generator")
    @GenericGenerator(name = "record_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "RE"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    @OneToMany(targetEntity=ConventionDeclarationImpl.class)
    private List<ConventionDeclaration> conventionDeclarations;
    
    @OneToOne(targetEntity=LanguageDeclarationImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private LanguageDeclaration languageDeclaration;
    
    @OneToMany(targetEntity=LocalTypeDeclarationImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<LocalTypeDeclaration> localTypeDeclarations;
    
    @OneToMany(targetEntity=LocalControlImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<LocalControl> localControls;
    
    @OneToOne(targetEntity=MaintenanceAgencyImpl.class)
    private MaintenanceAgency maintenanceAgency;
    
    private String maintenanceStatus;
    
    private String otherRecordId;
    
    @OneToMany(targetEntity=MaintenanceEventImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<MaintenanceEvent> maintenanceEventHistory;
    
    private String publicationStatus;
    
    private String recordId;
    
    @OneToOne(targetEntity=RightsDeclarationImpl.class)
    private RightsDeclaration rightsDeclaration;
    
    @OneToMany(targetEntity=SourceImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Source> sources;
    
    @OneToMany(targetEntity=IdentityImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Identity> identities;
    
    @OneToMany(targetEntity=DescriptionImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Description> description;
    
    @OneToMany(targetEntity=RelationsImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Relations> relations;
    
    @OneToMany(targetEntity=SetComponentImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<SetComponent> setComponents;

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getConventionDeclarations()
     */
    @Override
    public List<ConventionDeclaration> getConventionDeclarations() {
        return conventionDeclarations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setConventionDeclarations(java.util.List)
     */
    @Override
    public void setConventionDeclarations(List<ConventionDeclaration> conventionDeclarations) {
        this.conventionDeclarations = conventionDeclarations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getLanguageDeclaration()
     */
    @Override
    public LanguageDeclaration getLanguageDeclaration() {
        return languageDeclaration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setLanguageDeclaration(edu.asu.diging.eaccpf.model.LanguageDeclaration)
     */
    @Override
    public void setLanguageDeclaration(LanguageDeclaration languageDeclaration) {
        this.languageDeclaration = languageDeclaration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getLocalTypeDeclarations()
     */
    @Override
    public List<LocalTypeDeclaration> getLocalTypeDeclarations() {
        return localTypeDeclarations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setLocalTypeDeclarations(java.util.List)
     */
    @Override
    public void setLocalTypeDeclarations(List<LocalTypeDeclaration> localTypeDeclarations) {
        this.localTypeDeclarations = localTypeDeclarations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getLocalControls()
     */
    @Override
    public List<LocalControl> getLocalControls() {
        return localControls;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setLocalControls(java.util.List)
     */
    @Override
    public void setLocalControls(List<LocalControl> localControls) {
        this.localControls = localControls;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getMaintenanceAgency()
     */
    @Override
    public MaintenanceAgency getMaintenanceAgency() {
        return maintenanceAgency;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setMaintenanceAgency(edu.asu.diging.eaccpf.model.MaintenanceAgency)
     */
    @Override
    public void setMaintenanceAgency(MaintenanceAgency maintenanceAgency) {
        this.maintenanceAgency = maintenanceAgency;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getMaintenanceStatus()
     */
    @Override
    public String getMaintenanceStatus() {
        return maintenanceStatus;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setMaintenanceStatus(java.lang.String)
     */
    @Override
    public void setMaintenanceStatus(String maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getOtherRecordId()
     */
    @Override
    public String getOtherRecordId() {
        return otherRecordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setOtherRecordId(java.lang.String)
     */
    @Override
    public void setOtherRecordId(String otherRecordId) {
        this.otherRecordId = otherRecordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getMaintenanceEventHistory()
     */
    @Override
    public List<MaintenanceEvent> getMaintenanceEventHistory() {
        return maintenanceEventHistory;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setMaintenanceEventHistory(java.util.List)
     */
    @Override
    public void setMaintenanceEventHistory(List<MaintenanceEvent> maintenanceEventHistory) {
        this.maintenanceEventHistory = maintenanceEventHistory;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getPublicationStatus()
     */
    @Override
    public String getPublicationStatus() {
        return publicationStatus;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setPublicationStatus(java.lang.String)
     */
    @Override
    public void setPublicationStatus(String publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getRecordId()
     */
    @Override
    public String getRecordId() {
        return recordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setRecordId(java.lang.String)
     */
    @Override
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getRightsDeclaration()
     */
    @Override
    public RightsDeclaration getRightsDeclaration() {
        return rightsDeclaration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setRightsDeclaration(edu.asu.diging.eaccpf.model.RightsDeclaration)
     */
    @Override
    public void setRightsDeclaration(RightsDeclaration rightsDeclaration) {
        this.rightsDeclaration = rightsDeclaration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getSources()
     */
    @Override
    public List<Source> getSources() {
        return sources;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setSources(java.util.List)
     */
    @Override
    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getIdentities()
     */
    @Override
    public List<Identity> getIdentities() {
        return identities;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setIdentities(java.util.List)
     */
    @Override
    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getDescription()
     */
    @Override
    public List<Description> getDescription() {
        return description;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setDescription(java.util.List)
     */
    @Override
    public void setDescription(List<Description> description) {
        this.description = description;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getRelations()
     */
    @Override
    public List<Relations> getRelations() {
        return relations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setRelations(java.util.List)
     */
    @Override
    public void setRelations(List<Relations> relations) {
        this.relations = relations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#getSetComponents()
     */
    @Override
    public List<SetComponent> getSetComponents() {
        return setComponents;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Record#setSetComponents(java.util.List)
     */
    @Override
    public void setSetComponents(List<SetComponent> setComponents) {
        this.setComponents = setComponents;
    }
    
}
