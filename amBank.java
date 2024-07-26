public class amBank{
  public static void main(String[] args){
    CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
    CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2");

    accountOne.setBalance(5000);
    System.out.println(accountOne.getBalance());
    
  }
}
