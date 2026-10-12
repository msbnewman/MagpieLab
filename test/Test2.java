import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.HashSet;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MagpieTest {

  @Test
  @Order(0)
  @DisplayName("Test Magpie1: Random Response correctness")
  public void magpie1(){
    Magpie maggie = new Magpie();
    HashSet<String> res = new HashSet<>();
    for (int i = 0; i < 60; i++) {
      res.add(maggie.getResponse("adkfghaweufh"));
    }

    assertWithMessage("Expected: Interesting. as one of your random responses").that(res).contains("Interesting.");
    assertWithMessage("Expected: Okay. as one of your random responses").that(res).contains("Okay.");
    assertWithMessage("Expected: 6 unique random responses").that(res.size()).isEqualTo(6);    
  }

  @Test
  @Order(1)
  @DisplayName("Test Magpie2: Keyword Response 1. Favorite Class")
  public void magpie21(){
    Magpie maggie = new Magpie();
    String str;

    str = maggie.getResponse("science");
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("neuroscience");
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("I have AP Environmental Science before Advisory.");
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("math");
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("mathematics");
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("I have math after lunch.");
    assertThat(str).isEqualTo("Is that your favorite class?");
  }

  @Test
  @Order(2)
  @DisplayName("Test Magpie2: Keyword Response 2. Pets")
  public void magpie22(){
    Magpie maggie = new Magpie();
    String str;

    str = maggie.getResponse("cat");
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("dog");
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("I'm going to walk my dog when I get home.");
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("My cat likes to scratch the furniture.");
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("I have two cats and three dogs.");
    assertThat(str).isEqualTo("Tell me more about your pets.");
  }

  @Test
  @Order(3)
  @DisplayName("Test Magpie2: Keyword Response 3. Go Newman!")
  public void magpie23(){
    Magpie maggie = new Magpie();
    String str;

    str = maggie.getResponse("the Isidore Newman School");
    assertThat(str).isEqualTo("The Isidore Newman School is the best school!");
    str = maggie.getResponse("I'm a sophomore at the Isidore Newman School.");
    assertThat(str).isEqualTo("The Isidore Newman School is the best school!");
    str = maggie.getResponse("I started going to the Isidore Newman School last fall.");
    assertThat(str).isEqualTo("The Isidore Newman School is the best school!");
  }
  @Test
  @Order(4)
  @DisplayName("Test Magpie2: Keyword Response 4. Input Checks")
  public void magpie24(){
    Magpie maggie = new Magpie();
    String str;

    str = maggie.getResponse("");
    assertThat(maggie.getResponse("")).isEqualTo(str);
    assertThat(maggie.getResponse(" ")).isEqualTo(str);
    assertThat(maggie.getResponse("      ")).isEqualTo(str);
    assertThat(maggie.getResponse("\t")).isEqualTo(str);
    assertThat(maggie.getResponse("\n")).isEqualTo(str);
  }

}