package com.nora.prometheus.week3.task2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by nora on 09.03.17.
 */
public class Deck {

    private Card[] cards = new Card[36];
    private int count ;

    public Deck() {
        this.count = 0 ;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        Card[] cards = deck.addAllCards();
        //deck.shuffle();
        for (Card card : cards) {
            System.out.println(card.getRank().getName() + "   " + card.getSuit().getName());
            Card drawOne = deck.drawOne();
            System.out.println("Take:  "+drawOne.getRank().getName()+"   "+ drawOne.getSuit().getName());
        }
        Card drawOneNull = deck.drawOne();
        System.out.println("Take:  "+drawOneNull);
    }

    public Card[] addAllCards() {

        int rankValue = 0;
        int cardCount = 0;
        int suitValue = 0;
        while (cardCount != 36) {

            if (rankValue >= Rank.values.length) {
                rankValue = 0;
            }
            if (suitValue >= Suit.values.length) {
                suitValue = 0;
            }

            this.cards[cardCount] = new Card(Rank.values[rankValue], Suit.values[suitValue]);
            ;
            cardCount++;
            suitValue++;
            rankValue++;

        }
        return cards;
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Random rnd = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card card = cards[index];
            cards[index] = cards[i];
            cards[i] = card;
        }
    }

    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getSuit().getName() == Suit.HEARTS.getName()){

                }
            }
        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (count < cards.length) {
            return true;
        } else {
            return false;
        }

    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (hasNext()) {
            return cards[count++];
        } else {
            return null;
        }
    }
}
