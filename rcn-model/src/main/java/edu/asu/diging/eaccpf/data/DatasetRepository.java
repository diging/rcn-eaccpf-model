package edu.asu.diging.eaccpf.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import edu.asu.diging.eaccpf.model.impl.DatasetImpl;

public interface DatasetRepository extends PagingAndSortingRepository<DatasetImpl, String>  {

    public List<DatasetImpl> findByCreator(String creator, Pageable pageable);
}
