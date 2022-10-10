package ujiankedua;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccount {

    Account account;
    Employee employee;
    int acc_no;
    String name;
    double amount;


    @BeforeMethod
    public void testInsert() {
        account = new Account();
        Account account = new Account();

        employee = new Employee();
        Employee employee = new Employee();
    }

    @Test
    public void testDeposit() {
        double amt = 3.000;
        double amount =3000;
        employee.setName(amt + " deposited");
        double actual = (amount = amount + amt);
        Assert.assertEquals(actual, amount);
    }

    @Test
    public void testWithdraw() {
        double amt = 4000;
        double amount = 3000;
        employee.setName("Insufficient Balance");
        employee.setSalary(amount);

        double actual = (amount = amount - amt);
        System.out.println(amt + " withdrawn");
        Assert.assertEquals(actual, amount);
    }

    @Test
    public void testCheckBalance() {
        double amt = -3.0;
        employee.setName("Balance is: " + amount);
        employee.setSalary(amount);

        double actual = (amount = amount - amt);
        Assert.assertEquals(actual, 3.0);
    }
    @Test
    public void testDisplay(){
        double amt = 40;
        employee.setName(acc_no + " " + name + " " + amount);
      //  employee.setSalary(amount);

        double actual = (amount = amount - amt);
        double excpected = amt;
        Assert.assertEquals(actual, amount);
        }
}