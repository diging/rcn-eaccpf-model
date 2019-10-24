package edu.asu.diging.eaccpf.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import edu.asu.diging.eaccpf.model.impl.NameEntryImpl;

public interface NameEntryRepository extends PagingAndSortingRepository<NameEntryImpl, String> {

    @Query("Select n from NameEntryImpl n, NamePartImpl p where p member n.parts and p.part like %:part%")
    List<NameEntryImpl> findWherePartsIsLikePart(@Param("part") String part);
}
