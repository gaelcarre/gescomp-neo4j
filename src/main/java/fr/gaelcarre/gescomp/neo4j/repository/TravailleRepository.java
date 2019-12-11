package fr.gaelcarre.gescomp.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import fr.gaelcarre.gescomp.neo4j.pojo.relation.Travaille;

public interface TravailleRepository extends Neo4jRepository<Travaille, Long> {

}
