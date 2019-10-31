package edu.asu.diging.eaccpf.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import edu.asu.diging.eaccpf.model.match.impl.MasterMatchImpl;

public interface MasterMatchRepository extends PagingAndSortingRepository<MasterMatchImpl, String>  {

   List<MasterMatchImpl> findByJobId(String jobId, Pageable pageable);
   
   MasterMatchImpl findFirstByJobIdAndRecordId(String jobId, String recordId);
}
