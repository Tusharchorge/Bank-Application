//package org.example;
//
//import java.util.Scanner;
//
//public class Process {
//    Scanner sc = new Scanner(System.in);
//    static BankInfo bank1 = new BankInfo();
//
//    public void openAccount()
//    {
//        System.out.print("Enter Account No: ");
//        bank1.setAccNo(sc.next());
//        System.out.print("Enter Account type: ");
//        bank1.setAcc_type(sc.next());
//        System.out.print("Enter Name: ");
//        bank1.setName(sc.next());
//        System.out.print("Enter Balance: ");
//        bank1.setAcc_balance(sc.nextLong());
//
//        System.out.println("------YOUR ACCOUNT DETAILS IS -------");
//        System.out.println("Name of account holder :: " + bank1.getName());
//        System.out.println("Account no             :: " + bank1.getAccNo());
//        System.out.println("Account type           :: " + bank1.getAcc_type());
//        System.out.println("Balance                :: " + bank1.getAcc_balance());
//
//    }
//    public void demoaccount()
//    {
//        int  demobalance=50000;
//        System.out.println("Name of account holder :: " + "Demo user");
//        System.out.println("Account no             :: " + "8529637412");
//        System.out.println("Account type           :: " + "demo");
//        System.out.println("Balance                :: " + demobalance);
//
//    }
//    public void deposite()
//    {
//        System.out.println("Enter Account No");
//        bank1.setAccNo(sc.next());
//        System.out.println("------YOUR ACCOUNT DETAILS IS -------");
//        System.out.println("Name of account holder :: " + bank1.getName());
//        System.out.println("Account no             :: " + bank1.getAccNo());
//        System.out.println("Account type           :: " + bank1.getAcc_type());
//        System.out.println("Balance                :: " + bank1.getAcc_balance());
//            System.out.println("Enter the Amount you want to deposit ::");
//            int deposit = sc.nextInt();
//            int amount = (int) ((bank1.getAcc_balance()) + deposit);
//            bank1.setAcc_balance(amount);
//            System.out.println(deposit + " is deposited into your Account");
//            System.out.println("Current Available Balance is Rs = " + bank1.getAcc_balance());
//        }
//    public void withdraw()
//    {
//
//        System.out.println("Enter the Amount you want to withdraw:");
//        Scanner sc= new Scanner(System.in);
//        int withdraw =sc.nextInt();
//        if(withdraw<bank1.getAcc_balance())
//        {
//            bank1.setAcc_balance(bank1.getAcc_balance()-withdraw);
//            System.out.println(" "+ withdraw+" is withdrawn from your Account");
//            System.out.println("Current Available Balance is Rs  ::"+ bank1.getAcc_balance());
//        }
//        else
//        {
//            System.out.println("Low Balance");
//            System.out.println("Current Available Balance is Rs  ::"+ bank1.getAcc_balance());
//        }
//    }
//    public void checkbalance()
//    {
//        System.out.println("Your name is           :: "+bank1.getName());
//        System.out.println("Account no             :: " + bank1.getAccNo());
//        System.out.println("Account type           :: " + bank1.getAcc_type());
//        System.out.println("Balance                :: " + bank1.getAcc_balance());
//        System.out.println("THANKS FOR BALANCE CHECKING ");
//
//    }
//
//
//}

