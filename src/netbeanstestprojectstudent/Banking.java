/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanstestprojectstudent;

/**
 *
 * @author michael.roy-diclemen
 */
/*
 * Bank.java: Simulates a bank and its cusomters.
 */
 /* A bank where accounts can be opened and customers can make transactions.*/
import java.util.Scanner;
import java.text.NumberFormat;

public class Banking {

    public static void main(String[] args) {
        //create a chequing account
        ChequingAccount munozAccount = new ChequingAccount(250, "Maria", "Munoz", "505 Pickering Cresc.", "Mytown", "ON", "L3Y1H2");
        Scanner input = new Scanner(System.in);
        double data;
        //print account info
        System.out.println(munozAccount);

        //run through a deposit for this account
        System.out.print("Enter deposit amount: ");
        data = input.nextDouble();
        Account.deposit(data);
        System.out.println("Balance is: " + munozAccount.getBalance());
        
        //run through a withdrawal
        System.out.print("Enter withdrawal amount: ");
        data = input.nextDouble();
        boolean isWithdrawn = munozAccount.withdrawal(data);
        if (isWithdrawn) {
            System.out.println("Success!!");
        } else {
            System.out.println("Insufficient Funds!!");
        }
        //print new balance
        System.out.println("Balance is: " + munozAccount.getBalance());
    }
}
