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

  @Test
  @Order(5)
  @DisplayName("Test Magpie3: Custom Adaptive Response 1. I Want")
  public void magpie31(){
    Magpie maggie = new Magpie();
    String str;
    
    str = maggie.getResponse("I want to go to the zoo.");
    assertThat(str).isEqualTo("Why do you want to go to the zoo?");
    str = maggie.getResponse("I want cheese.");
    assertThat(str).isEqualTo("Why do you want cheese?");
    str = maggie.getResponse("I want to sing a song.");
    assertThat(str).isEqualTo("Why do you want to sing a song?");
    str = maggie.getResponse("When I'm tired, I want a nap.");
    assertThat(str).isEqualTo("Why do you want a nap?");
    str = maggie.getResponse("I'm bored and I want to go outside.");
    assertThat(str).isEqualTo("Why do you want to go outside?");
  }
  @Test
  @Order(6)
  @DisplayName("Test Magpie3: Custom Adaptive Response 2. I Like")
  public void magpie32(){
    Magpie maggie = new Magpie();
    String str;
    
    str = maggie.getResponse("I like going to the zoo.");
    assertThat(str).isEqualTo("What do you like about going to the zoo?");
    str = maggie.getResponse("I like cherries.");
    assertThat(str).isEqualTo("What do you like about cherries?");
    str = maggie.getResponse("I like swimming in the ocean.");
    assertThat(str).isEqualTo("What do you like about swimming in the ocean?");
    str = maggie.getResponse("In the morning I like coffee and tea.");
    assertThat(str).isEqualTo("What do you like about coffee and tea?");
    
  }

  @Test
  @Order(7)
  @DisplayName("Test Magpie4: Improved Adaptive Response 1. You and Me")
  public void magpie41(){
    Magpie maggie = new Magpie();
    String str;
    
    str = maggie.getResponse("I like talking to you.");
    assertThat(str).isEqualTo("Why do you like talking to me?");
    str = maggie.getResponse("I usually talk to you.");
    assertThat(str).isEqualTo("Why do you usually talk to me?");
    str = maggie.getResponse("I want to do homework with you.");
    assertThat(str).isEqualTo("Why do you want to do homework with me?");

    /*
    System.out.println("Phrases to test:");
    System.out.println("Input: I think you are funny.");
    System.out.println("Response: " + maggie.getResponse("I think you are funny."));
    System.out.println("Input: I don't like you.");
    System.out.println("Response: " + maggie.getResponse("I don't like."));
    System.out.println("Input: I was talking about you with Ada.");
    System.out.println("Response: " + maggie.getResponse("I was talking about you with Ada."));
    System.out.println("Input: I think you're good at coding.");
    System.out.println("Response: " + maggie.getResponse("I think you're good at coding."));
    System.out.println("When I talk to you I'm sometimes confused.");
    System.out.println("Response: " + maggie.getResponse("When I talk to you I'm sometimes confused."));
    System.out.println("I told you yesterday!");
    System.out.println("Response: " + maggie.getResponse("I told you yesterday!")); */
  }

  @Test
  @Order(8)
  @DisplayName("Test Magpie4: Improved Adaptive Response 2. Why Not")
  public void magpie42(){
    Magpie maggie = new Magpie();
    String str;
    
    str = maggie.getResponse("I don't like mustard.");
    assertThat(str).isEqualTo("Why don't you like mustard?");
    str = maggie.getResponse("I don't want to eat cake.");
    assertThat(str).isEqualTo("Why don't you want to eat cake?");
    str = maggie.getResponse("I don't want flip-flops.");
    assertThat(str).isEqualTo("Why don't you want flip-flops?");
    str = maggie.getResponse("I don't think that's true.");
    assertThat(str).isEqualTo("Why don't you think that's true?");
    str = maggie.getResponse("I don't think I should do that.");
    assertThat(str).isEqualTo("Why don't you think you should do that?");
  }

  @Test
  @Order(9)
  @DisplayName("Test Magpie4: Improved Adaptive Response (1 & 2). I don't like you")
  public void magpie43(){
    Magpie maggie = new Magpie();
    String str;

    str = maggie.getResponse("I don't like talking to you.");
    assertThat(str).isEqualTo("Why don't you like talking to me?");
    
    str = maggie.getResponse("I don't want to talk to you anymore.");
    assertThat(str).isEqualTo("Why don't you want to talk to me anymore?");

    str = maggie.getResponse("I don't want to talk to you anymore.");
    assertThat(str).isEqualTo("Why don't you want to talk to me anymore?");

    str = maggie.getResponse("I don't need help from you.");
    assertThat(str).isEqualTo("Why don't you need help from me?");
  }

  @Test
  @Order(10)
  @DisplayName("Test Magpie5: Arrays 1. Refactored Random Response")
  public void magpie51(){
    Magpie maggie = new Magpie();
    HashSet<String> res = new HashSet<>();
    for (int i = 0; i < 100; i++) {
      res.add(maggie.getResponse("adkfghawlkjheufh"));
    }

    assertWithMessage("Expected: Interesting. as one of your random responses").that(res).contains("Interesting.");
    assertWithMessage("Expected: Okay. as one of your random responses").that(res).contains("Okay.");
    assertWithMessage("Expected: 6 unique random responses").that(res.size()).isEqualTo(6);    
  
  }

  @Test
  @Order(11)
  @DisplayName("Test Magpie5: Arrays 2. Student Shout-out")
  public void magpie52(){
    Magpie maggie = new Magpie();
    HashSet<String> res = new HashSet<>();
    for (int i = 0; i < 180; i++) {
      res.add(maggie.getResponse("I'm in Ms. B's class"));
    }

    String[] names = {"Amelia Grace", "Ann", "Beau", "Braeden", "Caleb", 
                      "Charlie", "Rivers", "Gaura", "Jack", "Oliver",
                      "Marshall", "McGowen", "Michael", "Miles", "Trey"};
    for (int i = 0; i < 15; i++) {
      assertThat(res).contains("Oh, you're in Ms. B's class!  Do you know " + names[i] + "?");
    }

    assertThat(res.size()).isAtLeast(15);
    assertThat(res.add(maggie.getResponse("My teacher is Ms. B"))).isFalse();
    
  }

}