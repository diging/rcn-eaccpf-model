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
import edu.asu.diging.eaccpf.model.LegalStatus;
import edu.asu.diging.eaccpf.model.PlaceEntry;
import edu.asu.diging.eaccpf.model.Term;

@Entity
public class LegalStatusImpl implements LegalStatus {

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
    
    @OneToMany(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Date> dates;
    
    @OneToMany(targetEntity=DateRangeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateRange> dateRanges;
    
    @OneToOne(targetEntity=DateSetImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateSet> dateSets;
    
    @ElementCollection
    @Lob
    private List<String> descriptiveNote;
    
    @OneToOne(targetEntity=PlaceEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlaceEntry> placeEntries;
    
    @OneToOne(targetEntity=TermImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private Term term;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getCitations()
     */
    @Override
    public List<String> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setCitations(java.util.List)
     */
    @Override
    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getDate()
     */
    @Override
    public List<Date> getDates() {
        return dates;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setDate(edu.asu.diging.rcn.core.model.Date)
     */
    @Override
    public void setDates(List<Date> date) {
        this.dates = date;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getDateRange()
     */
    @Override
    public List<DateRange> getDateRanges() {
        return dateRanges;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setDateRange(edu.asu.diging.rcn.core.model.DateRange)
     */
    @Override
    public void setDateRanges(List<DateRange> dateRanges) {
        this.dateRanges = dateRanges;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getDateSet()
     */
    @Override
    public List<DateSet> getDateSets() {
        return dateSets;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setDateSet(edu.asu.diging.rcn.core.model.DateSet)
     */
    @Override
    public void setDateSets(List<DateSet> dateSets) {
        this.dateSets = dateSets;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getPlaceEntry()
     */
    @Override
    public List<PlaceEntry> getPlaceEntry() {
        return placeEntries;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setPlaceEntry(edu.asu.diging.rcn.core.model.PlaceEntry)
     */
    @Override
    public void setPlaceEntry(List<PlaceEntry> placeEntry) {
        this.placeEntries = placeEntry;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#getTerm()
     */
    @Override
    public Term getTerm() {
        return term;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LegalStatus#setTerm(edu.asu.diging.rcn.core.model.Term)
     */
    @Override
    public void setTerm(Term term) {
        this.term = term;
    }
    
}
