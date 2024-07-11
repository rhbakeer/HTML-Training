import java.util.*;

class PrimeDirective {
  
  public boolean isPrime(int number){
  
    for(int i = 2; i < number; i++){
      if(number % i == 0){
        return true;
      } 
      else if(number == 2){
        return true;
      }
      else if(number < 2){
        return false;
      }
      else{
        return false;
      }
    }
    return false;
  }
  
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();

    for(int number : numbers){
      if (isPrime(number)){
      primes.add(number);
      }
    }
    return primes;
  }


  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.isPrime(numbers[6]));
  
  }  

}
