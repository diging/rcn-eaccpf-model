package edu.asu.diging.eaccpf.data;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import edu.asu.diging.eaccpf.model.NameEntry;
import edu.asu.diging.eaccpf.model.impl.RecordImpl;

public interface RecordRepository extends PagingAndSortingRepository<RecordImpl, String> {
    
    @Query("Select r from RecordImpl r, DatasetImpl d where :nameentry member r.identity.nameEntries and r member d.records and d.id = :datasetId")
    List<RecordImpl> findWhereNameEntryIsInNameEntries(@Param("nameentry") NameEntry entry, @Param("datasetId") String datasetId);
    
    //@QueryHints(@javax.persistence.QueryHint(name="org.hibernate.fetchSize", value="50"))
    @Query("Select r from RecordImpl r, DatasetImpl d where r member d.records and d.id = :datasetId")
    Stream<RecordImpl> getByDataset(@Param("datasetId") String datasetId);
}
