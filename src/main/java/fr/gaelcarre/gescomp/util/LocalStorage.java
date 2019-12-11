package fr.gaelcarre.gescomp.util;

import java.util.HashMap;

import org.bson.types.ObjectId;

import fr.gaelcarre.gescomp.neo4j.pojo.entity.Agence;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Competence;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Site;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Utilisateur;

public class LocalStorage {

	public static HashMap<ObjectId, Competence> competences = new HashMap<>();
	public static HashMap<ObjectId, Utilisateur> utilisateurs = new HashMap<>();
	public static HashMap<String, Site> sites = new HashMap<>();
	public static HashMap<String, Agence> agences = new HashMap<>();

}
