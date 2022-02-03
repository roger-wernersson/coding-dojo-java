package se.sigmatechnology.codingdojo.usecase01.usecases;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

class TellAgentShould {

  private static final Knowledge green = new KnowledgeWithText("green");
  private static final Subject color = new Subject("color");
  private static final Secret colorGreen = new Secret(color, green);
  private static final Agent mataHari = new FullAgent(new AgentName("Mata Hari"));
  private static final Agent jamesBond = new FullAgent(new AgentName("James Bond"));
  private static final AgentRepository repository = new SimpleAgentRepository(mataHari, jamesBond);
  private static final AskAgent colorFromJamesBond = new AskAgent(jamesBond.getName(), color);

  @Test
  void addKnowledgeToAgent() {
    var tell = new TellAgent(jamesBond.getName(), colorGreen);

    tell.execute(repository);

    assertEquals(green, colorFromJamesBond.execute(repository));
  }
}
