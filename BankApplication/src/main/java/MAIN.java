import org.example.Execution;
import org.example.Operations;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class MAIN {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "12345";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from bank");
            System.out.println("Bank info");
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------------");
            System.out.println("   Banking Application  ");
            System.out.println("------------------------------");
            System.out.println("Enter 1 for fetch all Accounts"+"\nEnter 2 for Create Account" + "\nEnter 3 for deposit Amount" + "\nEnter 4 for Withdraw Amount" + "\nEnter 5 for Demo Account" + "\nEnter 6 for Exit" + "\n\nEnter your choice::");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Execution.fetchdata(resultSet);
                    System.out.println("MAIN Menu::Press 1");
                    if(scanner.next().equals("1")){
                        return;
                    }
                    break;
                    case 2:
                        System.out.println("Enter AccNO");
                        int accNO=sc.nextInt();
                        System.out.println("Enter Acc_name");
                        String acc_name=sc.next();
                        System.out.println("Enter Acc_type");
                        String acc_type=sc.next();
                        System.out.println("Enter Acc_balance");
                        int acc_balance=sc.nextInt();

                        int rowcount=statement.executeUpdate("insert into bank values("+accNO+",'"+acc_name+"','"+acc_type+"',"+acc_balance+")");
                        if(rowcount>0){
                            System.out.println("Data Inserted");
                        }
                        else{
                            System.out.println("Data Not Inserted");
                        }

                        break;

                case 3:
                    Operations.deposit(resultSet);
                    break;


                        case 4:
                            Operations.demoaccount();
                            break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}
