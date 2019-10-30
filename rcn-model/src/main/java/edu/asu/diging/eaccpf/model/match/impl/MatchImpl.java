package edu.asu.diging.eaccpf.model.match.impl;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.match.Match;

@Entity
public class MatchImpl implements Match {

    @Id
    @GeneratedValue(generator = "match_id_generator")
    @GenericGenerator(name = "match_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "MAT"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String baseDatasetId;
    private String baseRecordId;
    
    private String compareDatasetId;
    private String compareRecordId;
    
    private float luceneScore;
    private float overallScore;
    private float nameScore;
    private float dateScore;
    
    private float certainty;
    
    private OffsetDateTime matchedOn;
    
    private String initiator;
    
    @Lob
    private String reason;
    
    private String jobId;

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getBaseDatasetId()
     */
    @Override
    public String getBaseDatasetId() {
        return baseDatasetId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setBaseDatasetId(java.lang.String)
     */
    @Override
    public void setBaseDatasetId(String baseDatasetId) {
        this.baseDatasetId = baseDatasetId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getBaseRecordId()
     */
    @Override
    public String getBaseRecordId() {
        return baseRecordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setBaseRecordId(java.lang.String)
     */
    @Override
    public void setBaseRecordId(String baseRecordId) {
        this.baseRecordId = baseRecordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getCompoareDatasetId()
     */
    @Override
    public String getCompareDatasetId() {
        return compareDatasetId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setCompoareDatasetId(java.lang.String)
     */
    @Override
    public void setCompareDatasetId(String compoareDatasetId) {
        this.compareDatasetId = compoareDatasetId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getCompareRecordId()
     */
    @Override
    public String getCompareRecordId() {
        return compareRecordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setCompareRecordId(java.lang.String)
     */
    @Override
    public void setCompareRecordId(String compareRecordId) {
        this.compareRecordId = compareRecordId;
    }

    @Override
    public float getLuceneScore() {
        return luceneScore;
    }

    @Override
    public void setLuceneScore(float luceneScore) {
        this.luceneScore = luceneScore;
    }

    @Override
    public float getOverallScore() {
        return overallScore;
    }

    @Override
    public void setOverallScore(float overallScore) {
        this.overallScore = overallScore;
    }

    @Override
    public float getNameScore() {
        return nameScore;
    }

    @Override
    public void setNameScore(float nameScore) {
        this.nameScore = nameScore;
    }

    @Override
    public float getDateScore() {
        return dateScore;
    }

    @Override
    public void setDateScore(float dateScore) {
        this.dateScore = dateScore;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getCertainty()
     */
    @Override
    public float getCertainty() {
        return certainty;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setCertainty(float)
     */
    @Override
    public void setCertainty(float certainty) {
        this.certainty = certainty;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getMatchedOn()
     */
    @Override
    public OffsetDateTime getMatchedOn() {
        return matchedOn;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setMatchedOn(java.time.OffsetDateTime)
     */
    @Override
    public void setMatchedOn(OffsetDateTime matchedOn) {
        this.matchedOn = matchedOn;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getInitiator()
     */
    @Override
    public String getInitiator() {
        return initiator;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setInitiator(java.lang.String)
     */
    @Override
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getReason()
     */
    @Override
    public String getReason() {
        return reason;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setReason(java.lang.String)
     */
    @Override
    public void setReason(String reason) {
        this.reason = reason;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#getJobId()
     */
    @Override
    public String getJobId() {
        return jobId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.match.model.impl.Match#setJobId(java.lang.String)
     */
    @Override
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    
    
}
