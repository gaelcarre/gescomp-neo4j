package fr.gaelcarre.gescomp.mapping;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoCompetence;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Competence;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public abstract class CompetenceMapper {

	public Competence mapperCompetence(MongoCompetence c) {
		Competence competence = new Competence();
		competence.setNom(c.getName());
		return competence;
	}

	public abstract List<Competence> mapperCompetenceListe(List<MongoCompetence> cs);

}
