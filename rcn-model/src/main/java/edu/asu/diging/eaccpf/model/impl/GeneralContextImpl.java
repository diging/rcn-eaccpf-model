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

import edu.asu.diging.eaccpf.model.GeneralContext;
import edu.asu.diging.eaccpf.model.ItemList;
import edu.asu.diging.eaccpf.model.Outline;

@Entity
public class GeneralContextImpl implements GeneralContext {

    @Id
    @GeneratedValue(generator = "genCon_id_generator")
    @GenericGenerator(name = "genCon_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "GC"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator")
            
    private String id;
    
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

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#getCitations()
     */
    @Override
    public List<String> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#setCitations(java.util.List)
     */
    @Override
    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#getItemList()
     */
    @Override
    public List<ItemList> getItemLists() {
        return itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#setItemList(edu.asu.diging.rcn.core.model.ItemList)
     */
    @Override
    public void setItemLists(List<ItemList> itemLists) {
        this.itemLists = itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#getOutline()
     */
    @Override
    public List<Outline> getOutlines() {
        return outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#setOutline(edu.asu.diging.rcn.core.model.Outline)
     */
    @Override
    public void setOutlines(List<Outline> outlines) {
        this.outlines = outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#getPs()
     */
    @Override
    public List<String> getPs() {
        return ps;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.GeneralContext#setPs(java.util.List)
     */
    @Override
    public void setPs(List<String> ps) {
        this.ps = ps;
    }
    
}
