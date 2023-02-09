package com.learning.mscard.dao.repository;

import com.learning.mscard.dao.entity.Card;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findCardById(Long id);

}
