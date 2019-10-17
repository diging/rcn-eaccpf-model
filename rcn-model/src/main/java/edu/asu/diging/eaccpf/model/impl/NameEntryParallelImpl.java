package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.NameEntry;
import edu.asu.diging.eaccpf.model.NameEntryParallel;
import edu.asu.diging.eaccpf.model.UseDates;

@Entity
public class NameEntryParallelImpl implements NameEntryParallel {

    @Id
    @GeneratedValue(generator = "nameEntryPar_id_generator")
    @GenericGenerator(name = "nameEntryPar_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "NP"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    
    @ElementCollection
    private List<String> alternativeForms;
    @ElementCollection
    private List<String> authorizedForms;
    
    @OneToMany(targetEntity=NameEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<NameEntry> nameEntries;
    
    @OneToOne(targetEntity=UseDatesImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private UseDates useDates;


    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntryParallel#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntryParallel#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntryParallel#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntryParallel#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    @Override
    public List<String> getAlternativeForms() {
        return alternativeForms;
    }

    @Override
    public void setAlternativeForms(List<String> alternativeForms) {
        this.alternativeForms = alternativeForms;
    }

    @Override
    public List<String> getAuthorizedForms() {
        return authorizedForms;
    }

    @Override
    public void setAuthorizedForms(List<String> authorizedForms) {
        this.authorizedForms = authorizedForms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntryParallel#getNameEntries()
     */
    @Override
    public List<NameEntry> getNameEntries() {
        return nameEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntryParallel#setNameEntries(java.util.List)
     */
    @Override
    public void setNameEntries(List<NameEntry> nameEntries) {
        this.nameEntries = nameEntries;
    }

    @Override
    public UseDates getUseDates() {
        return useDates;
    }

    @Override
    public void setUseDates(UseDates useDates) {
        this.useDates = useDates;
    } 
    
}
