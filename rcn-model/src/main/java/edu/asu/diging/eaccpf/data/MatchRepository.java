package edu.asu.diging.eaccpf.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.asu.diging.eaccpf.model.match.impl.MatchImpl;

public interface MatchRepository extends PagingAndSortingRepository<MatchImpl, String>  {

}
