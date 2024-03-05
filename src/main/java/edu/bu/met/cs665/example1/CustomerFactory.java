/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: CustomerFactory.java
 * Description: This factory class is responsible for creating instances of different customer type.
 */

package edu.bu.met.cs665.example1;


public class CustomerFactory {
  /**
   * This method serves as a factory method for creating instances of different
   * types of customers such as Business, Returning, Frequent, New, and VIP customers.
   *
   * @param customerType A string representing the type of customer to create.
   * @return A Customer object corresponding to the specified type.
   * @throws IllegalArgumentException If the provided customerType is not recognized.
   */
  public Customer getCustomer(String customerType) {
    switch (customerType) {
      case "Business":
        return new BusinessCustomer();
      case "Returning":
        return new ReturningCustomer();
      case "Frequent":
        return new FrequentCustomer();
      case "New":
        return new NewCustomer();
      case "VIP":
        return new VipCustomer();
      default:
        throw new IllegalArgumentException("Unknown customer type: " + customerType);
    }
  }
}
