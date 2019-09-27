package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Record {

    String getId();

    void setId(String id);

    List<ConventionDeclaration> getConventionDeclarations();

    void setConventionDeclarations(List<ConventionDeclaration> conventionDeclarations);

    LanguageDeclaration getLanguageDeclaration();

    void setLanguageDeclaration(LanguageDeclaration languageDeclaration);

    List<LocalTypeDeclaration> getLocalTypeDeclarations();

    void setLocalTypeDeclarations(List<LocalTypeDeclaration> localTypeDeclarations);

    List<LocalControl> getLocalControls();

    void setLocalControls(List<LocalControl> localControls);

    MaintenanceAgency getMaintenanceAgency();

    void setMaintenanceAgency(MaintenanceAgency maintenanceAgency);

    String getMaintenanceStatus();

    void setMaintenanceStatus(String maintenanceStatus);

    String getOtherRecordId();

    void setOtherRecordId(String otherRecordId);

    List<MaintenanceEvent> getMaintenanceEventHistory();

    void setMaintenanceEventHistory(List<MaintenanceEvent> maintenanceEventHistory);

    String getPublicationStatus();

    void setPublicationStatus(String publicationStatus);

    String getRecordId();

    void setRecordId(String recordId);

    RightsDeclaration getRightsDeclaration();

    void setRightsDeclaration(RightsDeclaration rightsDeclaration);

    List<Source> getSources();

    void setSources(List<Source> sources);

    List<Identity> getIdentities();

    void setIdentities(List<Identity> identities);

    List<Description> getDescription();

    void setDescription(List<Description> description);

    List<Relations> getRelations();

    void setRelations(List<Relations> relations);

    List<SetComponent> getSetComponents();

    void setSetComponents(List<SetComponent> setComponents);

}