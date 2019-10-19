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
import edu.asu.diging.eaccpf.model.Outline;
import edu.asu.diging.eaccpf.model.StructureOrGenealogy;

@Entity
public class StructureOrGenealogyImpl implements StructureOrGenealogy {

    @Id
    @GeneratedValue(generator = "strGen_id_generator")
    @GenericGenerator(name = "strGen_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "SOG"), 
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

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#getCitations()
     */
    @Override
    public List<String> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#setCitations(java.util.List)
     */
    @Override
    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandates#getItemList()
     */
    @Override
    public List<ItemList> getItemLists() {
        return itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandates#setItemList(edu.asu.diging.rcn.core.model.ItemList)
     */
    @Override
    public void setItemLists(List<ItemList> itemLists) {
        this.itemLists = itemLists;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandates#getOutline()
     */
    @Override
    public List<Outline> getOutlines() {
        return outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandates#setOutline(edu.asu.diging.rcn.core.model.Outline)
     */
    @Override
    public void setOutlines(List<Outline> outlines) {
        this.outlines = outlines;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#getPs()
     */
    @Override
    public List<String> getPs() {
        return ps;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.StructureOrGenealogy#setPs(java.util.List)
     */
    @Override
    public void setPs(List<String> ps) {
        this.ps = ps;
    }
    
}
