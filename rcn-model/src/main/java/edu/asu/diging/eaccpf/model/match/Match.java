package edu.asu.diging.eaccpf.model.match;

import java.time.OffsetDateTime;

public interface Match {

    String getId();

    void setId(String id);

    String getBaseDatasetId();

    void setBaseDatasetId(String baseDatasetId);

    String getBaseRecordId();

    void setBaseRecordId(String baseRecordId);

    String getCompareDatasetId();

    void setCompareDatasetId(String compoareDatasetId);

    String getCompareRecordId();

    void setCompareRecordId(String compareRecordId);

    float getCertainty();

    void setCertainty(float certainty);

    OffsetDateTime getMatchedOn();

    void setMatchedOn(OffsetDateTime matchedOn);

    String getInitiator();

    void setInitiator(String initiator);

    String getReason();

    void setReason(String reason);

    String getJobId();

    void setJobId(String jobId);

    void setLuceneScore(float luceneScore);

    float getLuceneScore();

    float getOverallScore();

    void setOverallScore(float overallScore);

    void setDateScore(float dateScore);

    float getDateScore();

    void setNameScore(float nameScore);

    float getNameScore();

}