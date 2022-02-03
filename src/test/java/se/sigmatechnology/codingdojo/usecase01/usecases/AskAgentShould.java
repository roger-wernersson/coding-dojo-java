package se.sigmatechnology.codingdojo.usecase01.usecases;

import org.junit.jupiter.api.Test;
import se.sigmatechnology.codingdojo.usecase01.core.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AskAgentShould {

  private static final Knowledge green = new KnowledgeWithText("green");
  private static final Subject color = new Subject("color");
  private static final Secret colorGreen = new Secret(color, green);
  private static final Agent mataHari = new FullAgent(new AgentName("Mata Hari"));
  private static final Agent jamesBond = new FullAgent(new AgentName("James Bond"))
      .plusKnowledge(colorGreen);
  private static final AgentRepository repository = new SimpleAgentRepository(mataHari, jamesBond);

  @Test
  void getKnowledgeFromAgent() {
    var ask = new AskAgent(jamesBond.getName(), color);

    var colorFromAgent = ask.execute(repository);

    assertEquals(green, colorFromAgent);
  }
}
