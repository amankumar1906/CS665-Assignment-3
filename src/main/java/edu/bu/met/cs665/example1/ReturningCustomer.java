/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: ReturningCustomer.java
 * Description: Represents a returning customer and generates personalized email content for them.
 */

package edu.bu.met.cs665.example1;

public class ReturningCustomer implements Customer {
  @Override
  public String generateEmailContent() {
    return "Welcome! We are excited to have you back.";
  }
}
