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

import edu.asu.diging.eaccpf.model.Citation;
import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;
import edu.asu.diging.eaccpf.model.DateSet;
import edu.asu.diging.eaccpf.model.Occupation;
import edu.asu.diging.eaccpf.model.PlaceEntry;
import edu.asu.diging.eaccpf.model.Term;

@Entity
public class OccupationImpl implements Occupation {

    @Id
    @GeneratedValue(generator = "occu_id_generator")
    @GenericGenerator(name = "occu_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "OC"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    
    @OneToOne(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private Date date;
    
    @OneToOne(targetEntity=DateRangeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private DateRange dateRange;
    
    @OneToOne(targetEntity=DateSetImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private DateSet dateSet;
    
    @ElementCollection
    private List<String> descriptiveNote;
    
    @OneToOne(targetEntity=PlaceEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private PlaceEntry placeEntry;
    
    @OneToOne(targetEntity=TermImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private Term term;
    
    @OneToMany(targetEntity=CitationImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Citation> citations;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getDate()
     */
    @Override
    public Date getDate() {
        return date;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setDate(edu.asu.diging.rcn.core.model.Date)
     */
    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getDateRange()
     */
    @Override
    public DateRange getDateRange() {
        return dateRange;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setDateRange(edu.asu.diging.rcn.core.model.DateRange)
     */
    @Override
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getDateSet()
     */
    @Override
    public DateSet getDateSet() {
        return dateSet;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setDateSet(edu.asu.diging.rcn.core.model.DateSet)
     */
    @Override
    public void setDateSet(DateSet dateSet) {
        this.dateSet = dateSet;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getPlaceEntry()
     */
    @Override
    public PlaceEntry getPlaceEntry() {
        return placeEntry;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setPlaceEntry(edu.asu.diging.rcn.core.model.PlaceEntry)
     */
    @Override
    public void setPlaceEntry(PlaceEntry placeEntry) {
        this.placeEntry = placeEntry;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getTerm()
     */
    @Override
    public Term getTerm() {
        return term;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setTerm(edu.asu.diging.rcn.core.model.Term)
     */
    @Override
    public void setTerm(Term term) {
        this.term = term;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#getCitations()
     */
    @Override
    public List<Citation> getCitations() {
        return citations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.Occupation#setCitations(java.util.List)
     */
    @Override
    public void setCitations(List<Citation> citations) {
        this.citations = citations;
    }
}
