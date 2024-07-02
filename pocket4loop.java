//this method iterates through an array

class Numbers {
  public static void main(String[] args) {
    for (int i = 0; i < 101; i++) {
      // Add your code below
      if ( i % 5 != 0){
        //what we're looking for here is if a number in our array is NOT divisible by 5

        /*if i was looking for all even numbers to print then it would look like (i % 2 !=0)
         * this is because if a number is not divisible by 2 (divide by 2 and 0 remainder) then we will continue
         * for odd numbers it looks like (i %2 !=1) which means if we divide a number by 2 and there IS a remainder, then we will continue
         */

        continue;
        //when we continue, it breaks the iteration and starts at the next point.

        //break; breaks the interation and completely exits the method
      }
    System.out.println(i);  

    }
  }
}