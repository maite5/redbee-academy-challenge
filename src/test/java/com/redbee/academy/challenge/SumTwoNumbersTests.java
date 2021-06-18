package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SumTwoNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    Integer result = SumTwoNumbers.sum(3, 2);
   // assertNotNull(result, "The result cannot be null");
    //assertEquals(5, result);
    Integer a= 3;
    Integer b= 2; 
    Integer esperado= 5; 
    assertEquals(esperado, result); 
   
   
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues() {
	  Integer result = SumTwoNumbers.sum(null, 2);
  
    assertNotNull(result, "The result cannot be null");
  //  assertEquals(2, result);
    Integer Nam = Integer.parseInt(null);
 //   Integer Nam= null;
    
     assertEquals(Nam, result); 
     assertEquals(2, result);

    Integer anotherResult = SumTwoNumbers.sum(2, null);
   // assertNotNull(anotherResult, "The result cannot be null");
   // assertEquals(2, anotherResult);
    Integer nuev= 2;
    assertEquals(nuev, anotherResult);
  }
}
