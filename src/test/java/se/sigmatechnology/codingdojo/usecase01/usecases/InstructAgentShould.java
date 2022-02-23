package se.sigmatechnology.codingdojo.usecase01.usecases;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import se.sigmatechnology.codingdojo.usecase01.core.Agent;
import se.sigmatechnology.codingdojo.usecase01.core.AgentName;
import se.sigmatechnology.codingdojo.usecase01.core.AgentRepository;
import se.sigmatechnology.codingdojo.usecase01.core.FullAgent;
import se.sigmatechnology.codingdojo.usecase01.core.Knowledge;
import se.sigmatechnology.codingdojo.usecase01.core.KnowledgeWithText;
import se.sigmatechnology.codingdojo.usecase01.core.Secret;
import se.sigmatechnology.codingdojo.usecase01.core.SimpleAgentRepository;
import se.sigmatechnology.codingdojo.usecase01.core.Subject;

class InstructAgentShould {

  private static final Agent mataHari = new FullAgent(new AgentName("Mata Hari"));
  private static final Agent jamesBond = new FullAgent(new AgentName("James Bond"));
  private static final AgentRepository repository = new SimpleAgentRepository(mataHari, jamesBond);
  private static final Goal getRich = new Goal();
  private static final Goal getPoor = new Goal();

  @Test
  void giveAgentAGoal() {
    var instruct = new InstructAgent(jamesBond.getName(), getRich);

    instruct.execute(repository);

    var stored = repository.findByName(jamesBond.getName());
    assertTrue(stored.hasGoal(getRich));
    assertFalse(stored.hasGoal(getPoor));
  }
}
