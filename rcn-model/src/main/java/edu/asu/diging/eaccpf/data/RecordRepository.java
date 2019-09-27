package edu.asu.diging.eaccpf.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.asu.diging.eaccpf.model.impl.RecordImpl;

public interface RecordRepository extends PagingAndSortingRepository<RecordImpl, String> {

}
