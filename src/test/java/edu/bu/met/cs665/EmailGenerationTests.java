package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.example1.*;
import org.junit.Test;
import edu.bu.met.cs665.example1.VipCustomer;

/**
 * Unit tests for the Email Generation application.
 */
public class EmailGenerationTests {

  @Test
  public void testBusinessCustomerEmail() {
    BusinessCustomer businessCustomer = new BusinessCustomer();
    String email = businessCustomer.generateEmailContent();
    assertEquals("Dear Business Customer, lets get down to business!", email);
  }

  @Test
  public void testReturningCustomerEmail() {
    ReturningCustomer returningCustomer = new ReturningCustomer();
    String email = returningCustomer.generateEmailContent();
    assertEquals("Welcome! We are excited to have you back.", email);
  }

  @Test
  public void testFrequentCustomerEmail() {
    FrequentCustomer frequentCustomer = new FrequentCustomer();
    String email = frequentCustomer.generateEmailContent();
    assertEquals("Dear Frequent Customer, you are our most important customer!", email);
  }

  @Test
  public void testNewCustomerEmail() {
    NewCustomer newCustomer = new NewCustomer();
    String email = newCustomer.generateEmailContent();
    assertEquals("Welcome New Customer! Our job is to make your life easier!", email);
  }

  @Test
  public void testVIPCustomerEmail() {
    VipCustomer vipCustomer = new VipCustomer();
    String email = vipCustomer.generateEmailContent();
    assertEquals("Dear VIP Customer, enjoy a 5-star stay wherever you go!", email);
  }
}
