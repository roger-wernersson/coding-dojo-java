package se.sigmatechnology.codingdojo.usecase01.core;

import java.util.ArrayList;
import java.util.List;
import se.sigmatechnology.codingdojo.usecase01.usecases.Goal;

/**
 * Immutable root aggregate
 * @author rwe
 */
public class FullAgent implements Agent {

	private final AgentName name;
	private final List<Secret> secretPack = new ArrayList<>();
	private final Goal goal;

	public FullAgent(AgentName name) {
		this.name = name;
		this.goal = null;
	}

	public FullAgent(FullAgent agent, Secret secret) {
		this.name = agent.name;
		this.secretPack.addAll(agent.secretPack);
		this.secretPack.add(secret);
		this.goal = null;
	}

	public FullAgent(FullAgent agent, Goal goal) {
		this.name = agent.name;
		this.goal = goal;
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

	@Override
	public Agent plusGoal(Goal goal) {
		return new FullAgent(this, goal);
	}

	@Override
	public boolean hasGoal(Goal goal) {
		return this.goal == goal;
	}
}
