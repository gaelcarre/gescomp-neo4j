package fr.gaelcarre.gescomp.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import fr.gaelcarre.gescomp.neo4j.pojo.relation.ACompetence;

public interface ACompetenceRepository extends Neo4jRepository<ACompetence, Long> {

}
