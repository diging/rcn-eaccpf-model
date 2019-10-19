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
import edu.asu.diging.eaccpf.model.LegalStatus;
import edu.asu.diging.eaccpf.model.LegalStatuses;
import edu.asu.diging.eaccpf.model.Outline;

@Entity
public class LegalStatusesImpl implements LegalStatuses {

    @Id
    @GeneratedValue(generator = "legalStat_id_generator")
    @GenericGenerator(name = "legalStat_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "LS"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    
    @ElementCollection
    @Lob
    private List<String> citations;
    
    @ElementCollection
    @Lob
    private List<String> descriptiveNote;
    
    @OneToMany(targetEntity=LegalStatusImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<LegalStatus> legalStatuses;
    
    @OneToMany(targetEntity=ItemListImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<ItemList> itemLists;
    
    @OneToMany(targetEntity=OutlineImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Outline> outlines;
    
    @ElementCollection
    @Lob
    private List<String> ps;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getCitations()
     */
    @Override
    public List<String> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setCitations(java.util.List)
     */
    @Override
    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getLegalStatuses()
     */
    @Override
    public List<LegalStatus> getLegalStatuses() {
        return legalStatuses;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setLegalStatuses(java.util.List)
     */
    @Override
    public void setLegalStatuses(List<LegalStatus> legalStatuses) {
        this.legalStatuses = legalStatuses;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getItemList()
     */
    @Override
    public List<ItemList> getItemList() {
        return itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setItemList(edu.asu.diging.rcn.core.model.ItemList)
     */
    @Override
    public void setItemList(List<ItemList> itemLists) {
        this.itemLists = itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getOutline()
     */
    @Override
    public List<Outline> getOutline() {
        return outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setOutline(edu.asu.diging.rcn.core.model.Outline)
     */
    @Override
    public void setOutline(List<Outline> outlines) {
        this.outlines = outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#getPs()
     */
    @Override
    public List<String> getPs() {
        return ps;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatuses#setPs(java.util.List)
     */
    @Override
    public void setPs(List<String> ps) {
        this.ps = ps;
    }
    
}
