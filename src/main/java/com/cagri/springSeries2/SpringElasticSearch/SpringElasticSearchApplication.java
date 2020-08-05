package com.cagri.springSeries2.SpringElasticSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class SpringElasticSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringElasticSearchApplication.class, args);
	}

}