package cse360assignment02;

public class AddingMachine {
	 private int total;
	 private String print;
	
	public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    print = "";
	  }
	
	public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total = total + value;
		  if(print.equals("")) {
			  print = 0 + " + " + value;
		  }
		  else {
			  print = print + " + " + value;
		  }
	  }

	  public void subtract (int value) {
		  total = total - value;
		  if(print.equals("")) {
			  print = 0 + " - " + value;
		  }
		  else {
			  print = print + " - " + value;
		  }
	  }

	  public String toString () {
	    return print;
	  }

	  public void clear() {
		  total = 0;
		  print = "";
	  }
	  
	  public static void main(String[] args) {
		  AddingMachine myCalculator = new AddingMachine();
		  myCalculator.add(4);
		  myCalculator.subtract(2);
		  myCalculator.add(5);
		  System.out.println(myCalculator.toString());
	} 

}
