package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;
import edu.asu.diging.eaccpf.model.DateSet;
import edu.asu.diging.eaccpf.model.LocalDescription;
import edu.asu.diging.eaccpf.model.PlaceEntry;
import edu.asu.diging.eaccpf.model.Term;

@Entity
public class LocalDescriptionImpl implements LocalDescription {

    @Id
    @GeneratedValue(generator = "localDesc_id_generator")
    @GenericGenerator(name = "localDesc_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "LDE"), 
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
    
    @OneToMany(targetEntity=PlaceEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlaceEntry> placeEntries;
    
    @OneToOne(targetEntity=TermImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private Term term;

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
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getDate()
     */
    @Override
    public List<Date> getDates() {
        return dates;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setDate(edu.asu.diging.rcn.core.model.Date)
     */
    @Override
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getDateRange()
     */
    @Override
    public List<DateRange> getDateRanges() {
        return dateRanges;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setDateRange(edu.asu.diging.rcn.core.model.DateRange)
     */
    @Override
    public void setDateRanges(List<DateRange> dateRanges) {
        this.dateRanges = dateRanges;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getDateSet()
     */
    @Override
    public List<DateSet> getDateSets() {
        return dateSets;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setDateSet(edu.asu.diging.rcn.core.model.DateSet)
     */
    @Override
    public void setDateSets(List<DateSet> dateSets) {
        this.dateSets = dateSets;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getPlaceEntry()
     */
    @Override
    public List<PlaceEntry> getPlaceEntries() {
        return placeEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setPlaceEntry(edu.asu.diging.rcn.core.model.PlaceEntry)
     */
    @Override
    public void setPlaceEntries(List<PlaceEntry> placeEntries) {
        this.placeEntries = placeEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#getTerm()
     */
    @Override
    public Term getTerm() {
        return term;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalDescription#setTerm(edu.asu.diging.rcn.core.model.Term)
     */
    @Override
    public void setTerm(Term term) {
        this.term = term;
    }
    
}
