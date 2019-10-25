package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface Record {

    String getId();

    void setId(String id);

    List<ConventionDeclaration> getConventionDeclarations();

    void setConventionDeclarations(List<ConventionDeclaration> conventionDeclarations);

    List<LanguageDeclaration> getLanguageDeclarations();

    void setLanguageDeclarations(List<LanguageDeclaration> languageDeclaration);

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

    List<RightsDeclaration> getRightsDeclarations();

    void setRightsDeclarations(List<RightsDeclaration> rightsDeclaration);

    List<Source> getSources();

    void setSources(List<Source> sources);

    Identity getIdentity();

    void setIdentity(Identity identities);

    Description getDescription();

    void setDescription(Description description);

    List<Relations> getRelations();

    void setRelations(List<Relations> relations);

    List<SetComponent> getSetComponents();

    void setSetComponents(List<SetComponent> setComponents);

    void setDatasetId(String datasetId);

    String getDatasetId();

}