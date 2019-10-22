package edu.asu.diging.eaccpf.model.impl;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.Dataset;
import edu.asu.diging.eaccpf.model.Record;

@Entity
public class DatasetImpl implements Dataset {

    @Id
    @GeneratedValue(generator = "dataset_id_generator")
    @GenericGenerator(name = "dataset_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "DAS"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    @Lob
    private String title;
    
    @Lob
    private String description;
    
    private String creator;
    
    private OffsetDateTime creationDate;
    
    private OffsetDateTime modificationDate;
    
    private String modifiedBy;
    
    @OneToMany(targetEntity=RecordImpl.class)
    private List<Record> records;

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Dataset#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Dataset#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public OffsetDateTime getModificationDate() {
        return modificationDate;
    }

    @Override
    public void setModificationDate(OffsetDateTime modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Override
    public String getModifiedBy() {
        return modifiedBy;
    }

    @Override
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Dataset#getFunctions()
     */
    @Override
    public List<Record> getRecords() {
        return records;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Dataset#setFunctions(java.util.List)
     */
    @Override
    public void setRecords(List<Record> records) {
        this.records = records;
    }
    
}
