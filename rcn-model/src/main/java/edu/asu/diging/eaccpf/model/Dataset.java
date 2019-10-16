package edu.asu.diging.eaccpf.model;

import java.time.OffsetDateTime;
import java.util.List;

public interface Dataset {

    String getId();

    void setId(String id);

    List<Record> getRecords();

    void setRecords(List<Record> records);

    void setDescription(String description);

    String getDescription();

    void setTitle(String title);

    String getTitle();

    void setModifiedBy(String modifiedBy);

    String getModifiedBy();

    void setModificationDate(OffsetDateTime modificationDate);

    OffsetDateTime getModificationDate();

    void setCreationDate(OffsetDateTime creationDate);

    OffsetDateTime getCreationDate();

    void setCreator(String creator);

    String getCreator();

}