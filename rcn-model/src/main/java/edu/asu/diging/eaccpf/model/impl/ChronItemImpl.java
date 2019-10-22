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

import edu.asu.diging.eaccpf.model.ChronItem;
import edu.asu.diging.eaccpf.model.Date;
import edu.asu.diging.eaccpf.model.DateRange;
import edu.asu.diging.eaccpf.model.PlaceEntry;

@Entity
public class ChronItemImpl implements ChronItem {

    @Id
    @GeneratedValue(generator = "chronItem_id_generator")
    @GenericGenerator(name = "chronItem_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "CI"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    private String localType;
    
    @OneToMany(targetEntity=DateImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Date> dates;
    
    @OneToMany(targetEntity=DateRangeImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<DateRange> dateRanges;
    
    @Lob
    private String event;
    
    @OneToMany(targetEntity=PlaceEntryImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<PlaceEntry> placeEntries;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#getId()
     */
    @Override
    public String getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getLocalType() {
        return localType;
    }
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#getDate()
     */
    @Override
    public List<Date> getDates() {
        return dates;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#setDate(edu.asu.diging.rcn.core.model.Date)
     */
    @Override
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#getDateRange()
     */
    @Override
    public List<DateRange> getDateRanges() {
        return dateRanges;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#setDateRange(edu.asu.diging.rcn.core.model.DateRange)
     */
    @Override
    public void setDateRanges(List<DateRange> dateRanges) {
        this.dateRanges = dateRanges;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#getEvent()
     */
    @Override
    public String getEvent() {
        return event;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#setEvent(java.lang.String)
     */
    @Override
    public void setEvent(String event) {
        this.event = event;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#getPlaceEntry()
     */
    @Override
    public List<PlaceEntry> getPlaceEntries() {
        return placeEntries;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.ChronItem#setPlaceEntry(java.lang.String)
     */
    @Override
    public void setPlaceEntries(List<PlaceEntry> placeEntries) {
        this.placeEntries = placeEntries;
    }
    
}
