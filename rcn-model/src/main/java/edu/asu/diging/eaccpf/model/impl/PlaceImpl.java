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

import edu.asu.diging.eaccpf.model.Address;
import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;
import edu.asu.diging.eaccpf.model.DateSet;
import edu.asu.diging.eaccpf.model.Place;
import edu.asu.diging.eaccpf.model.PlaceEntry;
import edu.asu.diging.eaccpf.model.PlaceRole;

@Entity
public class PlaceImpl implements Place {

    @Id
    @GeneratedValue(generator = "place_id_generator")
    @GenericGenerator(name = "place_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "PL"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    
    @ElementCollection
    @Lob
    private List<String> citations;
    
    @OneToMany(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Date> dates;
    
    @OneToMany(targetEntity=DateRangeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateRange> dateRanges;
    
    @OneToMany(targetEntity=DateSetImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateSet> dateSets;
    
    @ElementCollection
    @Lob
    private List<String> descriptiveNote;
    
    @OneToMany(targetEntity=AddressImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Address> addresses;
    
    @OneToMany(targetEntity=PlaceEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlaceEntry> placeEntries;
    
    @OneToMany(targetEntity=PlaceRoleImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlaceRole> placeRoles;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#getCitations()
     */
    @Override
    public List<String> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#setCitations(java.util.List)
     */
    @Override
    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandate#getDate()
     */
    @Override
    public List<Date> getDates() {
        return dates;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandate#setDate(edu.asu.diging.rcn.core.model.Date)
     */
    @Override
    public void setDates(List<Date> date) {
        this.dates = date;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandate#getDateRange()
     */
    @Override
    public List<DateRange> getDateRanges() {
        return dateRanges;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandate#setDateRange(edu.asu.diging.rcn.core.model.DateRange)
     */
    @Override
    public void setDateRanges(List<DateRange> dateRange) {
        this.dateRanges = dateRange;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandate#getDateSet()
     */
    @Override
    public List<DateSet> getDateSets() {
        return dateSets;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Mandate#setDateSet(edu.asu.diging.rcn.core.model.DateSet)
     */
    @Override
    public void setDateSets(List<DateSet> dateSet) {
        this.dateSets = dateSet;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#getAddresses()
     */
    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#setAddresses(java.util.List)
     */
    @Override
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#getPlaceEntries()
     */
    @Override
    public List<PlaceEntry> getPlaceEntries() {
        return placeEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#setPlaceEntries(java.util.List)
     */
    @Override
    public void setPlaceEntries(List<PlaceEntry> placeEntries) {
        this.placeEntries = placeEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#getPlaceRoles()
     */
    @Override
    public List<PlaceRole> getPlaceRoles() {
        return placeRoles;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Place#setPlaceRoles(java.util.List)
     */
    @Override
    public void setPlaceRoles(List<PlaceRole> placeRoles) {
        this.placeRoles = placeRoles;
    }
}
