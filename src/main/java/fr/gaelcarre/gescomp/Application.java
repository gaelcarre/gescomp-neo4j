package fr.gaelcarre.gescomp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("fr.gaelcarre.gescomp.neo4j.repository")
@EnableMongoRepositories("fr.gaelcarre.gescomp.mongo.repository")
@EntityScan(basePackages = { "fr.gaelcarre.gescomp.neo4j.pojo", "fr.gaelcarre.gescomp.mongo.pojo" })
@ComponentScan("fr.gaelcarre.*")
@EnableConfigurationProperties
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
