package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}
	
	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() { 
		// ADD MISSING CODE
		SLLStack<Character> stack = new SLLStack<Character>(); 
		for (int i=0; i < s.length(); i++) { 
	        char c = stack.top(); 
	        if (Character.isLetter(c))
	           if (Character.isUpperCase(c))
	              stack.pop(); 
	           else if (Character.isLowerCase(c))
	                 return true; 
	               else {
	                 char t = stack.top() ; 
	                 if (t == Character.toUpperCase(c))
	                   stack.pop();  
	                 else 
	                    return false; 
	                }
	            else 
	                return false; 
	    } 
	    return true; 
	}

	
	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
	throws StringIsNotSymmetricException 
	{
		// ADD MISSING CODE
		
		return null;  // need to change if necessary....
	}

}
