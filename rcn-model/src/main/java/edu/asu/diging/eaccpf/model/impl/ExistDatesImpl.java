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

import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;
import edu.asu.diging.eaccpf.model.DateSet;
import edu.asu.diging.eaccpf.model.ExistDates;

@Entity
public class ExistDatesImpl implements ExistDates {

    @Id
    @GeneratedValue(generator = "desc_id_generator")
    @GenericGenerator(name = "desc_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "DE"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    @OneToMany(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Date> dates;
    
    @OneToMany(targetEntity=DateRangeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateRange> dateRanges;
    
    @OneToMany(targetEntity=DateSetImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateSet> dateSets;
    
    @ElementCollection
    @Lob
    private List<String> descriptiveNote;
    
    private String localType;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#getDate()
     */
    @Override
    public List<Date> getDates() {
        return dates;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#setDate(edu.asu.diging.rcn.core.model.Date)
     */
    @Override
    public void setDates(List<Date> date) {
        this.dates = date;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#getDateRange()
     */
    @Override
    public List<DateRange> getDateRanges() {
        return dateRanges;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#setDateRange(edu.asu.diging.rcn.core.model.DateRange)
     */
    @Override
    public void setDateRanges(List<DateRange> dateRange) {
        this.dateRanges = dateRange;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#getDateSet()
     */
    @Override
    public List<DateSet> getDateSets() {
        return dateSets;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#setDateSet(edu.asu.diging.rcn.core.model.DateSet)
     */
    @Override
    public void setDateSets(List<DateSet> dateSet) {
        this.dateSets = dateSet;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#getDescriptiveNote()
     */
    @Override
    public List<String> getDescriptiveNote() {
        return descriptiveNote;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ExistDates#setDescriptiveNote(java.util.List)
     */
    @Override
    public void setDescriptiveNote(List<String> descriptiveNote) {
        this.descriptiveNote = descriptiveNote;
    }

    @Override
    public String getLocalType() {
        return localType;
    }

    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }
    
}
