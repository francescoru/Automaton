package com.twodimensionalarray.dfa;
/**
 * A deterministic finite-state automaton that 
 * recognizes strings over {a,b} that have an a as 
 * one of the last 3 characters. 
 */

public class Dfa {

  
  private int state;

  
  
  //  State transition diagram in two dimensional array form.
  
  static private int[][] delta =
    {{1,0},{2,3},{4,5},{6,7},{4,5},{6,7},{2,3},{1,0}};
  
  
  
  // Reset the current state to the start state.
   
  public void reset() {
    state = 0;
  }


   //@param in the String to use
  public void process(String in) throws Exception{
    for (int i = 0; i < in.length(); i++) {
    	 //Make one transition on each char in the given string.
      char c = in.charAt(i);
     if(c == 'a') {
    	  state = delta [state][0]; 
     }
     else if (c == 'b') {
        	  state = delta [state][1]; 
     }
     else {throw new Exception ("Given string contains invalid characters");}
    	 
     }
  }
       
  
  /**
   * Test whether the DFA accepted the string.
 * @return accepted state
   */
  public boolean accepted() {
	return(state <=7 && state >=1);
  }

  }  
  
