package edu.asu.diging.eaccpf.data;

import java.util.stream.Stream;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.asu.diging.eaccpf.model.impl.DatasetImpl;

public interface DatasetRepository extends PagingAndSortingRepository<DatasetImpl, String>  {

}
