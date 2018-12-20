import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.mockito.Mockito.*;

class CustomerTest {
    @Test
    public void testCustomer() {
        Account mockAccount = mock(CheckingAccount.class);
        Customer customer = new Customer("foo", "bar", null);
        assertNotNull(customer);
        assertNotNull(mockAccount);
        System.out.println(customer.account.getAccountType());
        System.out.println(customer.getFirstName());
    }
}