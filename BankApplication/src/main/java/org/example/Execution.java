package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Execution {


    public static void fetchdata(ResultSet resultSet) throws SQLException {

        System.out.println("------------------------------");
        System.out.println("   Banking Application  ");
        System.out.println("------------------------------");
        System.out.println("Enter 1 for fetch all Accounts"+"\nEnter 2 for Create Account" + "\nEnter 3 for deposit Amount" + "\nEnter 4 for Withdraw Amount" + "\nEnter 5 for Demo Account" + "\nEnter 6 for Exit" + "\n\nEnter your choice::");
        while (resultSet.next()) {
            System.out.println("------YOUR ACCOUNT DETAILS IS -------");
            System.out.println("Account NO:" + resultSet.getInt("accNo"));
            System.out.println("Account holder Name:" + resultSet.getString("acc_name"));
            System.out.println("Account Type:" + resultSet.getString("acc_type"));
            System.out.println("Account Balance:" + resultSet.getInt("acc_balance"));
            System.out.println("----------------------------");


        }


    }
}


