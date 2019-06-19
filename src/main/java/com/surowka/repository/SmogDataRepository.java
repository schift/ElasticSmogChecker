//package repository;
//
//import SmogData;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.annotations.Query;
//import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
//
//public interface SmogDataRepository extends ElasticsearchCrudRepository {
//    Page<SmogData> findByStationName(String stationName, Pageable pageable);
//
//    @Query
//    Page<SmogData> findByStationNameCustomQuery(String stationName, Pageable pageable);
//}
