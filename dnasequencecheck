public class DNA {
  
/*
The purpose of this program is to mark when a sequence of DNA has a valid protein in it - A DNA sequence begins with ATG, ends in GTA, and is in a sequence divisible by 3
*/

  public static void main(String[] args) {
             
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    //select your nucleotide from above
    String dna = ;

    System.out.println("The sequence for " + dna + " is " + dna.length() + " nucleotides long.");

    int startCodon = dna.indexOf("ATG");
    int stopCodon = dna.indexOf("TGA");

    if(startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {

      String protein = dna.substring(startCodon, stopCodon+3);
      System.out.println("All conditions satisfied! " + protein + " is a protein within the polypeptide!");
    } else {
      String protein = dna.substring(startCodon, stopCodon+3);
      System.out.println("The polypeptide " + protein + " is not a protein.");
    }
    
  }
  
}

