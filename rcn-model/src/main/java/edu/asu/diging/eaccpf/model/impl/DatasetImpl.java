package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
                    strategy = "edu.asu.diging.rcn.core.data.IdGenerator"
            )
    private String id;
    
    @OneToMany(targetEntity=RecordImpl.class)
    private List<Record> functions;

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

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Dataset#getFunctions()
     */
    @Override
    public List<Record> getFunctions() {
        return functions;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.impl.Dataset#setFunctions(java.util.List)
     */
    @Override
    public void setFunctions(List<Record> functions) {
        this.functions = functions;
    }
    
}
