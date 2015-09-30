public class Interest{
    
  public static void main(String[] args){
    
    int bankAccount = 1000;
    float interestRate = 0.02f;
    float interest = bankAccount * interestRate;
    float balance = bankAccount + interest;
    
    System.out.println("Account Balance = " + balance);
  }
}