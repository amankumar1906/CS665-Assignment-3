/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: NewCustomer.java
 * Description: Represents a new customer and generates a welcoming email content for them.
 */

package edu.bu.met.cs665.example1;

public class NewCustomer implements Customer {
  @Override
  public String generateEmailContent() {
    return "Welcome New Customer! Our job is to make your life easier!";
  }
}