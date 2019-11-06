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

import edu.asu.diging.eaccpf.model.CpfRelation;
import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;
import edu.asu.diging.eaccpf.model.DateSet;
import edu.asu.diging.eaccpf.model.PlaceEntry;
import edu.asu.diging.eaccpf.model.RelationEntry;

@Entity
public class CpfRelationImpl implements CpfRelation {

    @Id
    @GeneratedValue(generator = "cpfRelation_id_generator")
    @GenericGenerator(name = "cpfRelation_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "CPFR"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String cpfRelationType;
    private String lastDateTimeVerified;
    private String href;
    
    @OneToMany(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Date> dates;
    
    @OneToMany(targetEntity=DateRangeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateRange> dateRanges;
    
    @OneToMany(targetEntity=DateSetImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateSet> dateSets;
    
    @ElementCollection
    @Lob
    private List<String> descriptiveNote;
    
    // we'll ignore  objectBinWrap mand objectXMLWrap
    
    @OneToMany(targetEntity=PlaceEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlaceEntry> placeEntries;
    
    @OneToMany(targetEntity=RelationEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<RelationEntry> relationEntries;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getCpfRelationType()
     */
    @Override
    public String getCpfRelationType() {
        return cpfRelationType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setCpfRelationType(java.lang.String)
     */
    @Override
    public void setCpfRelationType(String cpfRelationType) {
        this.cpfRelationType = cpfRelationType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getLastDateTimeVerified()
     */
    @Override
    public String getLastDateTimeVerified() {
        return lastDateTimeVerified;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setLastDateTimeVerified(java.lang.String)
     */
    @Override
    public void setLastDateTimeVerified(String lastDateTimeVerified) {
        this.lastDateTimeVerified = lastDateTimeVerified;
    }

    @Override
    public String getHref() {
        return href;
    }

    @Override
    public void setHref(String href) {
        this.href = href;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getDate()
     */
    @Override
    public List<Date> getDates() {
        return dates;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setDate(java.util.List)
     */
    @Override
    public void setDates(List<Date> date) {
        this.dates = date;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getDateRange()
     */
    @Override
    public List<DateRange> getDateRanges() {
        return dateRanges;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setDateRange(java.util.List)
     */
    @Override
    public void setDateRanges(List<DateRange> dateRange) {
        this.dateRanges = dateRange;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getDateSet()
     */
    @Override
    public List<DateSet> getDateSets() {
        return dateSets;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setDateSet(java.util.List)
     */
    @Override
    public void setDateSets(List<DateSet> dateSet) {
        this.dateSets = dateSet;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getPlaceEntries()
     */
    @Override
    public List<PlaceEntry> getPlaceEntries() {
        return placeEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setPlaceEntries(java.util.List)
     */
    @Override
    public void setPlaceEntries(List<PlaceEntry> placeEntries) {
        this.placeEntries = placeEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#getRelationEntries()
     */
    @Override
    public List<RelationEntry> getRelationEntries() {
        return relationEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.CpfRelation#setRelationEntries(java.util.List)
     */
    @Override
    public void setRelationEntries(List<RelationEntry> relationEntries) {
        this.relationEntries = relationEntries;
    }
    
}
