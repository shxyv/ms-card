package com.learning.mscard.dao.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "cards")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Card {
    @Id
    @GeneratedValue
    private Long id;
    private Long accountId;
    private String cardNumber;
    private String cardType;
    private BigDecimal totalLimit;
    private BigDecimal availableAmount;
    @CreationTimestamp
    private LocalDate createdAt;





}
