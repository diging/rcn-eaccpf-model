package edu.asu.diging.eaccpf.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.asu.diging.eaccpf.model.impl.DatasetImpl;

public interface DatasetRepository extends PagingAndSortingRepository<DatasetImpl, String>  {

}
