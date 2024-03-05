/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: Main.java
 * Description: The main entry point for the email generation application.
 * It demonstrates the creation of different customer types
 * and the generation of personalized emails.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Customer;
import edu.bu.met.cs665.example1.CustomerFactory;

public class Main {
  /**
   * This method creates instances of various customer types through the CustomerFactory,
   * and then prints the personalized email content for each customer type to the console.
   *
   * @param args The command-line arguments passed to the application.
   */
  public static void main(String[] args) {
    // Instantiate the CustomerFactory
    CustomerFactory factory = new CustomerFactory();

    // Create instances of each customer type using the factory
    Customer businessCustomer = factory.getCustomer("Business");
    Customer returningCustomer = factory.getCustomer("Returning");
    Customer frequentCustomer = factory.getCustomer("Frequent");
    Customer newCustomer = factory.getCustomer("New");
    Customer vipCustomer = factory.getCustomer("VIP");

    // Generate and display personalized emails for each customer type
    System.out.println("Business Email: " + businessCustomer.generateEmailContent());
    System.out.println("Returning Email: " + returningCustomer.generateEmailContent());
    System.out.println("Frequent Email: " + frequentCustomer.generateEmailContent());
    System.out.println("New Email: " + newCustomer.generateEmailContent());
    System.out.println("VIP Email: " + vipCustomer.generateEmailContent());
  }
}
