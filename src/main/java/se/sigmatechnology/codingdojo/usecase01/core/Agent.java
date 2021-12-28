package se.sigmatechnology.codingdojo.usecase01.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Immutable root aggregate
 * @author rwe
 */
public class Agent {

	private final String name;
	private final List<Secret> secretPack = new ArrayList<>();

	public Agent(String name) {
		this.name = name;
	}

	public Agent(Agent agent, Secret secret) {
		this.name = agent.name;
		this.secretPack.addAll(agent.secretPack);
		this.secretPack.add(secret);
	}

	public Agent plusKnowledge(Secret secret) {
		return new Agent(this, secret);
	}

	public Knowledge knowledgeFromSubject(Subject subject) {
		for(Secret secret : secretPack) {
			if (secret.isOnSubject(subject)) {
				return secret.getKnowledge();
			}
		}
		return NoKnowledge.NONE;
	}
}
