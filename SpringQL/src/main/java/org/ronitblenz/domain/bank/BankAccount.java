package org.ronitblenz.domain.bank;
import lombok.Builder;
import lombok.Value;
import org.springframework.expression.spel.CodeFlow;

import java.util.UUID;

@Builder
@Value
public class BankAccount {

    UUID id;
    String name;
    Currency currency;
    Client client;

}
