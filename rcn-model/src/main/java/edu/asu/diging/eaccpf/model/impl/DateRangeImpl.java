package edu.asu.diging.eaccpf.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;

@Entity
public class DateRangeImpl implements DateRange {
    
    @Id
    @GeneratedValue(generator = "daterange_id_generator")
    @GenericGenerator(name = "daterange_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "DR"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    @OneToOne(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private Date fromDate;
    
    @OneToOne(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private Date toDate;
    
    private String localType;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.DateRange#getId()
     */
    @Override
    public String getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.DateRange#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.DateRange#getFromDate()
     */
    @Override
    public Date getFromDate() {
        return fromDate;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.DateRange#setFromDate(java.lang.String)
     */
    @Override
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.DateRange#getToDate()
     */
    @Override
    public Date getToDate() {
        return toDate;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.DateRange#setToDate(java.lang.String)
     */
    @Override
    public void setToDate(Date toDate) {
        this.toDate = toDate;
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

