package fr.gaelcarre.gescomp.mongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoCompetence;

public interface MongoCompetenceRepository extends MongoRepository<MongoCompetence, ObjectId> {

}
