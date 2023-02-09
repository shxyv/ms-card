package com.learning.mscard.service;

import com.learning.mscard.dao.entity.Card;
import com.learning.mscard.dao.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    public Card getCardById(Long id) {
        return cardRepository.findCardById(id)
                .orElseThrow();
    }

}
