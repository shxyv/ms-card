package com.learning.mscard;

import com.learning.mscard.dao.entity.Card;
import com.learning.mscard.dao.repository.CardRepository;
import java.math.BigDecimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@RequiredArgsConstructor
@EnableDiscoveryClient
public class MsCardApplication implements CommandLineRunner {

    private final CardRepository cardRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsCardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Card card = Card.builder()
                .cardNumber("12345678")
                .cardType("CREDIT")
                .accountId(1L)
                .availableAmount(BigDecimal.valueOf(1200))
                .totalLimit(BigDecimal.valueOf(5000))
                .build();

        Card card2 = Card.builder()
                .cardNumber("12345678")
                .cardType("CREDIT")
                .accountId(1L)
                .availableAmount(BigDecimal.valueOf(1200))
                .totalLimit(BigDecimal.valueOf(5000))
                .build();

        Card card3 = Card.builder()
                .cardNumber("12345678")
                .cardType("CREDIT")
                .accountId(1L)
                .availableAmount(BigDecimal.valueOf(1200))
                .totalLimit(BigDecimal.valueOf(5000))
                .build();

        cardRepository.saveAll(List.of(card, card2, card3));
    }
}
