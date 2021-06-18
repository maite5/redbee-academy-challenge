package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SumArrayNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public int testHappyPath() {
	 
    Integer result = SumArrayNumbers.sum(List.of(1, 2, 3));
  
Integer array = result; 

 var sum = 0;
 for (int i = 0; i <result.size() ; i++) { 
     sum += result.get(i);
	
	 
	
 }
    
  
 
 //   assertNotNull(result, "The result cannot be null");
//    if(result!=null) { result = 6; }
    assertEquals(6, result); 
    return result; 
  }

  @Test
  @DisplayName("Test empty list")
  public void testEmpty() {
    Integer result = SumArrayNumbers.sum(Collections.emptyList());
    
    
    assertNotNull(result, "The result cannot be null");
    assertEquals(0, result);
  }
}
