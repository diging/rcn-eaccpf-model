package edu.asu.diging.eaccpf.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import edu.asu.diging.eaccpf.model.match.impl.MatchImpl;

public interface MatchRepository extends PagingAndSortingRepository<MatchImpl, String>  {

    List<MatchImpl> findByJobId(String jobId, Pageable pageable);
    
    @Query("select distinct m.baseRecordId from MatchImpl m where m.jobId = :jobId")
    List<Object[]> getMatchedRecordIds(@Param("jobId") String jobId, Pageable pageable);
    
    @Query("select count(distinct m.baseRecordId) from MatchImpl m where m.jobId = :jobId")
    Integer countMatchedRecordIds(@Param("jobId") String jobId);
    
    MatchImpl findFirstByBaseRecordIdOrderByOverallScoreDesc(String baseRecordId);
}

