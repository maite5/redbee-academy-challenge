package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.lang.Math;

public class CompareNumbersTests {

	int a=1;
	int b=2;
	int c=3;

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    Integer result = CompareNumbers.max(1, 3, 2);
   
   // assertNotNull(result, "The result cannot be null"); 
    c=3;
    result= Math.max(Math.max(a, b),c);
    assertEquals(c, result);
    

    Integer anotherResult = CompareNumbers.max(3, 1, 2);
   // assertNotNull(anotherResult, "The result cannot be null");
    anotherResult= Math.max(Math.max(a, b),c);
    assertEquals(3, anotherResult);

    Integer finalResult = CompareNumbers.max(1, 2, 3);
 //   assertNotNull(finalResult, "The result cannot be null");
   
    
    finalResult= Math.max(Math.max(a, b),c);
    assertEquals(3, finalResult);
    
    
  }
	
  public int max() {
	// TODO Auto-generated method stub
	return 0;
}

@Test
  @DisplayName("Tests happy path")
  public void testEquals() {
	Integer nueva;
	String p3= null;
	//  p2= 1;
	  nueva = Integer.parseInt(p3);
    Integer result = CompareNumbers.max(1, 1, 1);
 //   assertNotNull(result, "The result cannot be null");
    result= Math.max(Math.max(a, b),c);
    assertEquals(1, result);   
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues() {
	  Integer nuevo;
	
	  String p2= null;
	//  p2= 1;
	  nuevo = Integer.parseInt(p2);
    Integer result = CompareNumbers.max(null, 2, null);
    assertNotNull(result, "The result cannot be null");   
    result= Math.max(Math.max(a, b),c);
    assertEquals(2, result); 
  }
}  
