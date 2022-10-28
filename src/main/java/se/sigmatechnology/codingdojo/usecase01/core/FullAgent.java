package se.sigmatechnology.codingdojo.usecase01.core;

import se.sigmatechnology.codingdojo.usecase01.usecases.Goal;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Immutable root aggregate
 *
 * @author rwe
 */
public class FullAgent extends WithInvariants implements Agent {

    private final AgentName name;
    private final List<Secret> secretPack = new ArrayList<>();
    private final Goal goal;

    @Override
    public void validateInvariants() {
        assert name != null;
    }

    public FullAgent(AgentName name) {
        this.name = name;
        this.goal = null;
        validateInvariants();
    }

    public FullAgent(FullAgent agent, Secret secret) {
        this.name = agent.name;
        this.secretPack.addAll(agent.secretPack);
        this.secretPack.add(secret);
        this.goal = null;
        assertEquals(secretPack.subList(0, agent.secretPack.size()), agent.secretPack);
        assertTrue(secretPack.contains(secret));
        assertEquals(agent.secretPack.size() + 1, secretPack.size());
        validateInvariants();
    }

    public FullAgent(FullAgent agent, Goal goal) {
        this.name = agent.name;
        this.goal = goal;
        validateInvariants();
    }

    public Agent plusKnowledge(Secret secret) {
        return new FullAgent(this, secret);
    }

    public Knowledge knowledgeFromSubject(Subject subject) {
        for (var secret : secretPack) {
            if (secret.isOnSubject(subject)) {
                return secret.getKnowledge();
            }
        }
        return Knowledge.NONE;
    }

    public AgentName getName() {
        return andValidateInvariants(name);
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
