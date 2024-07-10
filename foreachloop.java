//7.9

import java.util.ArrayList;

class MostExpensive {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    //we're finding what's most expensive


    // Iterate over expenses
    for (double expense : expenses){
        //iterates over expenses and sets a double called expense
       if(expense > mostExpensive){
        //as it goes through the ArrayList, it finds the highest value and lands there
         mostExpensive = expense;
         //we want to set the value for mostExpensive as the largest expense in the ArrayList
       }
    }
    
    System.out.println(mostExpensive);
    
  }
}