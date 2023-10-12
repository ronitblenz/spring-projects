package org.ronitblenz.resolver;


import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.ronitblenz.domain.bank.BankAccount;
import org.ronitblenz.domain.bank.Currency;
import org.ronitblenz.domain.bank.Client;
import org.springframework.stereotype.Component;


import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        log.info("Retrieving bank account id: {}", id);

        var clientA = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Ronit")
                .lastName("Banerjee")
                .build();

        var clientB = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Subhrakamal")
                .lastName("Das")
                .build();

        clientA.setClient(clientB);
        clientB.setClient(clientA);

        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .client(clientA)
                .build();

    }

}