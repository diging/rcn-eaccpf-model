package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;
import edu.asu.diging.eaccpf.model.LocalControl;

@Entity
public class LocalControlImpl implements LocalControl {

    @Id
    @GeneratedValue(generator = "locCon_id_generator")
    @GenericGenerator(name = "locCon_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "LC"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    @OneToMany(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Date> dates;
    @OneToMany(targetEntity=DateRangeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateRange> dateRanges;
    
    @Lob
    private String term;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#getId()
     */
    @Override
    public String getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#getDate()
     */
    @Override
    public List<Date> getDates() {
        return dates;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#setDate(java.lang.String)
     */
    @Override
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#getDateRange()
     */
    @Override
    public List<DateRange> getDateRanges() {
        return dateRanges;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#setDateRange(edu.asu.diging.rcn.core.model.DateRange)
     */
    @Override
    public void setDateRanges(List<DateRange> dateRanges) {
        this.dateRanges = dateRanges;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#getTerm()
     */
    @Override
    public String getTerm() {
        return term;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.LocalControl#setTerm(java.lang.String)
     */
    @Override
    public void setTerm(String term) {
        this.term = term;
    }
    
}
