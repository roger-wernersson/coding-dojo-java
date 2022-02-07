package se.sigmatechnology.codingdojo.usecase01.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Immutable root aggregate
 * @author rwe
 */
public class FullAgent implements Agent {

	private final AgentName name;
	private final List<Secret> secretPack = new ArrayList<>();

	public FullAgent(AgentName name) {
		this.name = name;
	}

	public FullAgent(FullAgent agent, Secret secret) {
		this.name = agent.name;
		this.secretPack.addAll(agent.secretPack);
		this.secretPack.add(secret);
	}

	public Agent plusKnowledge(Secret secret) {
		return new FullAgent(this, secret);
	}

	public Knowledge knowledgeFromSubject(Subject subject) {
		for(var secret : secretPack) {
			if (secret.isOnSubject(subject)) {
				return secret.getKnowledge();
			}
		}
		return Knowledge.NONE;
	}

	public AgentName getName() {
		return name;
	}
}
