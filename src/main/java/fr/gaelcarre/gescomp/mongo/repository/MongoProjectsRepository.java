package fr.gaelcarre.gescomp.mongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoProject;

public interface MongoProjectsRepository extends MongoRepository<MongoProject, ObjectId> {

}
