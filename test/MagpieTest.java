import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MagpieTest {

  @Test
  @Order(0)
  @DisplayName("Test Magpie1: Random Response correctness")
  public void magpie1(){
    Magpie maggie = new Magpie();
    HashSet<String> res = new HashSet<>();
    for (int i = 0; i < 100; i++) {
      res.add(maggie.getResponse("adkfghaweufh"));
    }

    assertThat(res.contains("Interesting.")).isEqualTo(true);
    assertThat(res.contains("Okay.")).isEqualTo(true);
    assertThat(res.size()).isEqualTo(6);
    
  }

  @Test
  @Order(1)
  @DisplayName("Test Magpie2: Keyword Response correctness")
  public void magpie2(){
    Magpie maggie = new Magpie();
    String str;

    System.out.println("1. Favorite Class");
    str = maggie.getResponse("science").strip();
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("neuroscience").strip();
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("I have AP Environmental Science before Advisory.").strip();
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("math").strip();
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("mathematics").strip();
    assertThat(str).isEqualTo("Is that your favorite class?");
    str = maggie.getResponse("I have math after lunch.").strip();
    assertThat(str).isEqualTo("Is that your favorite class?");
    

    System.out.println("2. Pets");
    str = maggie.getResponse("cat").strip();
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("dog").strip();
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("I'm going to walk my dog when I get home.").strip();
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("My cat likes to scratch the furniture.").strip();
    assertThat(str).isEqualTo("Tell me more about your pets.");
    str = maggie.getResponse("I have two cats and three dogs.").strip();
    assertThat(str).isEqualTo("Tell me more about your pets.");

    System.out.println("3. Go Newman!");
    str = maggie.getResponse("the Isidore Newman School").strip();
    assertThat(str).isEqualTo("The Isidore Newman School is the best school!");
    str = maggie.getResponse("I'm a sophomore at the Isidore Newman School.").strip();
    assertThat(str).isEqualTo("The Isidore Newman School is the best school!");
    str = maggie.getResponse("I started going to the Isidore Newman School last fall.").strip();
    assertThat(str).isEqualTo("The Isidore Newman School is the best school!");
    
    System.out.println("4. Input Check");
    str = maggie.getResponse("").strip();
    assertThat(maggie.getResponse("").strip()).isEqualTo(str);
    assertThat(maggie.getResponse(" ").strip()).isEqualTo(str);
    assertThat(maggie.getResponse("      ").strip()).isEqualTo(str);
    assertThat(maggie.getResponse("/t").strip()).isEqualTo(str);
    assertThat(maggie.getResponse("/n").strip()).isEqualTo(str);
  }

  @Test
  @Order(2)
  @DisplayName("Test Magpie3: Custom Adaptive Response correctness")
  public void magpie1(){
    Magpie maggie = new Magpie();
    String str;
    
    System.out.println("1. I Want");
    str = maggie.getResponse("I want to go to the zoo.").strip();
    assertThat(str).isEqualTo("Why do you want to go to the zoo?");
    str = maggie.getResponse("I want cheese.").strip();
    assertThat(str).isEqualTo("Why do you want cheese?");
    str = maggie.getResponse("I want to sing a song.").strip();
    assertThat(str).isEqualTo("Why do you want to sing a song?");
    str = maggie.getResponse("When I'm tired, I want a nap.").strip();
    assertThat(str).isEqualTo("Why do you want a nap?");
    str = maggie.getResponse("I'm bored and I want to go outside.").strip();
    assertThat(str).isEqualTo("Why do you want to go outside?");

    System.out.println("2. I Like");
    str = maggie.getResponse("I like going to the zoo.").strip();
    assertThat(str).isEqualTo("What do you like about going to the zoo?");
    str = maggie.getResponse("I like cherries.").strip();
    assertThat(str).isEqualTo("What do you like about cherries?");
    str = maggie.getResponse("I like swimming in the ocean.").strip();
    assertThat(str).isEqualTo("What do you like about swimming in the ocean?");
    str = maggie.getResponse("In the morning I like coffee and tea.").strip();
    assertThat(str).isEqualTo("What do you like about coffee and tea?");
    
  }

  @Test
  @Order(3)
  @DisplayName("Test Magpie4: Improved Adaptive Response correctness")
  public void magpie1(){
    Magpie maggie = new Magpie();
    String str;
    
    System.out.println("1. You and Me");
    str = maggie.getResponse("I like talking to you.").strip();
    assertThat(str).isEqualTo("Why do you like talking to me?");
    str = maggie.getResponse("I usually talk to you.").strip();
    assertThat(str).isEqualTo("Why do you usually talk to me?");

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
    System.out.println("Response: " + maggie.getResponse("I told you yesterday!"));
    
  }

}