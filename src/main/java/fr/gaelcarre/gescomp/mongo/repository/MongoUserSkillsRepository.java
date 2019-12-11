package fr.gaelcarre.gescomp.mongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoUserSkills;

public interface MongoUserSkillsRepository extends MongoRepository<MongoUserSkills, ObjectId> {

}
