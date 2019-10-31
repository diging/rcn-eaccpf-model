package edu.asu.diging.eaccpf.model.match;

import java.util.List;

public interface MasterMatch {

    Match getMaster();

    void setMaster(Match master);

    float getScore();

    void setScore(float score);

    String getNamePart1();

    void setNamePart1(String namePart1);

    String getNamePart2();

    void setNamePart2(String namePart2);

    List<Match> getMatches();

    void setMatches(List<Match> matches);

    void setJobId(String jobId);

    String getJobId();

    void setMatchedRecordId(String matchedRecordId);

    String getMatchedRecordId();

    void setMatchedDatasetId(String matchedDatasetId);

    String getMatchedDatasetId();

    void setRecordId(String recordId);

    String getRecordId();

    void setDatasetId(String datasetId);

    String getDatasetId();

}