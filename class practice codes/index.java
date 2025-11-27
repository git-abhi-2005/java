// class account{
//     private double balance;
//     public void deposit (double amount){
//         if(amount<=0){
//             throw new IllegalArgumentException("Deposit amount must be positive");
//         }
//         balance+=amount;
//         System.out.println("Deposited: "+amount);
            
// }
// public void withdraw(double amount) throws Exception{
//     if(amount<=0){
//         throw new IllegalArgumentException("Withdraw amount must be positive");
//     }
//     else if(amount>balance){
//         throw new Exception ("Insufficient funds");
//     }
//     else{
//         balance-=amount;
//         System.out.println("Withdrawn: "+amount);
//     }
// }
//     public double getBalance(){
//          return balance;
//     }
// }
// public class index {
//     public static void main(String[] args) {
//         account a = new account();
//     try{
//         a.deposit(1000);
//         a.withdraw(15000);
//     }catch(IllegalArgumentException e){
//         System.out.println("Error: "+e.getMessage());
//     }catch(Exception e){
//         System.out.println("Error: "+e.getMessage());
//     }
//     System.out.println("Current Balance: "+a.getBalance());
//     }
// }