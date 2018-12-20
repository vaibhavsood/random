import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class CustomerConfig {
    @Bean
    @Lazy(value=true)
    Customer customer() {
        return new Customer(null, null, account());
    }

    @Bean
    Account account() {
        return new SavingsAccount();
    }
}
