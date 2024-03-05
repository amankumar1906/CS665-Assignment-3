/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: VipCustomer.java
 * Description: Represents a VIP customer and generates exclusive email content for them.
 */

package edu.bu.met.cs665.example1;

public class VipCustomer implements Customer {
  @Override
  public String generateEmailContent() {
    return "Dear VIP Customer, enjoy a 5-star stay wherever you go!";
  }
}
