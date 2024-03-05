/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: FrequentCustomer.java
 * Description: Represents a frequent customer and generates personalized email content for them.
 */

package edu.bu.met.cs665.example1;

public class FrequentCustomer implements Customer {
  @Override
  public String generateEmailContent() {
    return "Dear Frequent Customer, you are our most important customer!";
  }
}