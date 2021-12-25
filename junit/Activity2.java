package Junit_Activities;

import org.junit.jupiter.api.Test;
import Junit_Activities.BankAccount;
import Junit_Activities.NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;

class ExpectedExceptionTest {

    @Test
    void notEnoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(9);

        // Assertion for exception
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }

    @Test
    void enoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);
    
        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}