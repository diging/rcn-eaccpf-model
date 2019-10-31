package edu.asu.diging.eaccpf.model.match.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.match.MasterMatch;
import edu.asu.diging.eaccpf.model.match.Match;

@Entity
public class MasterMatchImpl implements MasterMatch {

    @Id
    @GeneratedValue(generator = "match_id_generator")
    @GenericGenerator(name = "match_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "MAT"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String datasetId;
    private String recordId;
    private String matchedDatasetId;
    private String matchedRecordId;
    
    @OneToOne(targetEntity=MatchImpl.class)
    private Match master;
    private float score;
    private String namePart1;
    private String namePart2;
    
    private String jobId;
    
    @OneToMany(targetEntity=MatchImpl.class)
    private List<Match> matches;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getDatasetId() {
        return datasetId;
    }

    @Override
    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    @Override
    public String getRecordId() {
        return recordId;
    }

    @Override
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Override
    public String getMatchedDatasetId() {
        return matchedDatasetId;
    }

    @Override
    public void setMatchedDatasetId(String matchedDatasetId) {
        this.matchedDatasetId = matchedDatasetId;
    }

    @Override
    public String getMatchedRecordId() {
        return matchedRecordId;
    }

    @Override
    public void setMatchedRecordId(String matchedRecordId) {
        this.matchedRecordId = matchedRecordId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#getMaster()
     */
    @Override
    public Match getMaster() {
        return master;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#setMaster(edu.asu.diging.eaccpf.model.match.Match)
     */
    @Override
    public void setMaster(Match master) {
        this.master = master;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#getScore()
     */
    @Override
    public float getScore() {
        return score;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#setScore(float)
     */
    @Override
    public void setScore(float score) {
        this.score = score;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#getNamePart1()
     */
    @Override
    public String getNamePart1() {
        return namePart1;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#setNamePart1(java.lang.String)
     */
    @Override
    public void setNamePart1(String namePart1) {
        this.namePart1 = namePart1;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#getNamePart2()
     */
    @Override
    public String getNamePart2() {
        return namePart2;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#setNamePart2(java.lang.String)
     */
    @Override
    public void setNamePart2(String namePart2) {
        this.namePart2 = namePart2;
    }

    @Override
    public String getJobId() {
        return jobId;
    }

    @Override
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#getMatches()
     */
    @Override
    public List<Match> getMatches() {
        return matches;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.eaccpf.model.match.impl.MasterMatch#setMatches(java.util.List)
     */
    @Override
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
    
}
