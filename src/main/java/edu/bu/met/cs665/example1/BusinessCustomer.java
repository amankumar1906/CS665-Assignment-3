/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: BusinessCustomer.java
 * Description: Represents a business customer and generates personalized email content for them.
 */

package edu.bu.met.cs665.example1;

public class BusinessCustomer implements Customer {
  @Override
  public String generateEmailContent() {
    return "Dear Business Customer, lets get down to business!";
  }
}
