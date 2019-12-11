package fr.gaelcarre.gescomp.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import fr.gaelcarre.gescomp.neo4j.pojo.entity.Utilisateur;

public interface UtilisateurRepository extends Neo4jRepository<Utilisateur, Long> {

}
