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
public class Test1 {

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

}