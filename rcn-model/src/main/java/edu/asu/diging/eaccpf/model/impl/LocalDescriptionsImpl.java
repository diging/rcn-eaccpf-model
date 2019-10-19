package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.ItemList;
import edu.asu.diging.eaccpf.model.LocalDescription;
import edu.asu.diging.eaccpf.model.LocalDescriptions;
import edu.asu.diging.eaccpf.model.Outline;

@Entity
public class LocalDescriptionsImpl implements LocalDescriptions {

    @Id
    @GeneratedValue(generator = "localDescs_id_generator")
    @GenericGenerator(name = "localDescs_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "LDS"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    
    @ElementCollection
    @Lob
    private List<String> citations;
    
    @OneToMany(targetEntity=ItemListImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<ItemList> itemLists;
    
    @OneToMany(targetEntity=OutlineImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Outline> outlines;
    
    @ElementCollection
    @Lob
    private List<String> ps;
    
    @ElementCollection
    @Lob
    private List<String> descriptiveNote;
    
    @OneToMany(targetEntity=LocalDescriptionImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<LocalDescription> localDescriptions;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getCitations()
     */
    @Override
    public List<String> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setCitations(java.util.List)
     */
    @Override
    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getItemList()
     */
    @Override
    public List<ItemList> getItemList() {
        return itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setItemList(edu.asu.diging.rcn.core.model.ItemList)
     */
    @Override
    public void setItemList(List<ItemList> itemLists) {
        this.itemLists = itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getOutline()
     */
    @Override
    public List<Outline> getOutline() {
        return outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setOutline(edu.asu.diging.rcn.core.model.Outline)
     */
    @Override
    public void setOutline(List<Outline> outlines) {
        this.outlines = outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getPs()
     */
    @Override
    public List<String> getPs() {
        return ps;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setPs(java.util.List)
     */
    @Override
    public void setPs(List<String> ps) {
        this.ps = ps;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setDescriptiveNote(java.lang.String)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getLocalDescriptions()
     */
    @Override
    public List<LocalDescription> getLocalDescriptions() {
        return localDescriptions;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setLocalDescriptions(java.util.List)
     */
    @Override
    public void setLocalDescriptions(List<LocalDescription> localDescriptions) {
        this.localDescriptions = localDescriptions;
    }
    
}
