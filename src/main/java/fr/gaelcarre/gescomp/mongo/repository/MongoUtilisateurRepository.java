package fr.gaelcarre.gescomp.mongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoUtilisateur;

public interface MongoUtilisateurRepository extends MongoRepository<MongoUtilisateur, ObjectId> {

}
