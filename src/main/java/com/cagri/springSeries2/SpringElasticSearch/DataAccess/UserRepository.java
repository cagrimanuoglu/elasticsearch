package com.cagri.springSeries2.SpringElasticSearch.DataAccess;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.cagri.springSeries2.SpringElasticSearch.Entity.User;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {
	
	
	@Query("{\"bool\": {\"must\": [{\"match\": {\"name\": \"?0\"}}]}}")
	List<User> getByCustomQuery(String search);
	
	
	
	
}
