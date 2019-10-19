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
import edu.asu.diging.eaccpf.model.Place;
import edu.asu.diging.eaccpf.model.Places;

@Entity
public class PlacesImpl implements Places {

    @Id
    @GeneratedValue(generator = "places_id_generator")
    @GenericGenerator(name = "places_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "PLS"), 
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
    
    @OneToMany(targetEntity=PlaceImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Place> places;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#getCitations()
     */
    @Override
    public List<String> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#setCitations(java.util.List)
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
     * @see edu.asu.diging.rcn.core.model.impl.Places#getPs()
     */
    @Override
    public List<String> getPs() {
        return ps;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#setPs(java.util.List)
     */
    @Override
    public void setPs(List<String> ps) {
        this.ps = ps;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#getPlaces()
     */
    @Override
    public List<Place> getPlaces() {
        return places;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Places#setPlaces(java.util.List)
     */
    @Override
    public void setPlaces(List<Place> places) {
        this.places = places;
    }
    
}
