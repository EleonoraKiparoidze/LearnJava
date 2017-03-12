package com.nora.prometheus.week3.task2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by nora on 09.03.17.
 */
public class Deck {

    private Card[] cards;
    private int count;

    public Deck() {
        this.count = 36;
        this.cards = new Card[this.count];
        this.addAllCards();

    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.order();
        System.out.println(deck.count);

        for (Card card : deck.cards) {
            System.out.println(card.getRank().getName() + "   " + card.getSuit().getName());
            deck.drawOne();
        }
        Card card1 = deck.drawOne();
        System.out.println(card1);
    }

    public void addAllCards() {

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
            cardCount++;
            suitValue++;
            rankValue++;

        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
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
            cardCount++;
            suitValue++;
            rankValue++;

        }
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
        int powerRank1 = 0;
        int powerRank2 = 0;

        int powerCard1 = 0;
        int powerCard2 = 0;
        for (int i = 0; i < cards.length-1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                String suit1 = cards[i].getSuit().getName();
                String suit2 = cards[j].getSuit().getName();

                String power4 = Suit.values[0].getName();
                String power3 = Suit.values[1].getName();
                String power2 = Suit.values[2].getName();
                String power1 = Suit.values[3].getName();

                for (int a = 0; a < Suit.values.length; a++) {
                    if (suit1.equals(power4)) {
                        powerCard1 = 4;
                    } else if (suit1.equals(power3)) {
                        powerCard1 = 3;
                    } else if (suit1.equals(power2)) {
                        powerCard1 = 2;
                    } else if (suit1.equals(power1)) {
                        powerCard1 = 1;
                    }
                }

                for (int b = 0; b < Suit.values.length; b++) {
                    if (suit2.equals(power4)) {
                        powerCard2 = 4;
                    } else if (suit2.equals(power3)) {
                        powerCard2 = 3;
                    } else if (suit2.equals(power2)) {
                        powerCard2 = 2;
                    } else if (suit2.equals(power1)) {
                        powerCard2 = 1;
                    }
                }

                if (powerCard1 < powerCard2) {
                    Card temp = cards[i];
                    cards[i] = cards[j];
                    cards[j] = temp;
                }else if (powerCard1 == powerCard2){

                            String rank1 = cards[i].getRank().getName();
                            String rank2 = cards[j].getRank().getName();

                            String powerR9 = Rank.values[0].getName();
                            String powerR8 = Rank.values[1].getName();
                            String powerR7 = Rank.values[2].getName();
                            String powerR6 = Rank.values[3].getName();
                            String powerR5 = Rank.values[4].getName();
                            String powerR4 = Rank.values[5].getName();
                            String powerR3 = Rank.values[6].getName();
                            String powerR2 = Rank.values[7].getName();
                            String powerR1 = Rank.values[8].getName();

                            for (int a = 0; a < Suit.values.length; a++) {
                                if (rank1.equals(powerR9)) {
                                    powerRank1 = 9;
                                } else if (rank1.equals(powerR8)) {
                                    powerRank1 = 8;
                                } else if (rank1.equals(powerR7)) {
                                    powerRank1 = 7;
                                } else if (rank1.equals(powerR6)) {
                                    powerRank1 = 6;
                                } else if (rank1.equals(powerR5)) {
                                    powerRank1 = 5;
                                } else if (rank1.equals(powerR4)) {
                                    powerRank1 = 4;
                                } else if (rank1.equals(powerR3)) {
                                    powerRank1 = 3;
                                } else if (rank1.equals(powerR2)) {
                                    powerRank1 = 2;
                                } else if (rank1.equals(powerR1)) {
                                    powerRank1 = 1;
                                }
                            }

                            for (int b = 0; b < Suit.values.length; b++) {
                                if (rank2.equals(powerR9)) {
                                    powerRank2 = 9;
                                } else if (rank2.equals(powerR8)) {
                                    powerRank2 = 8;
                                } else if (rank2.equals(powerR7)) {
                                    powerRank2 = 7;
                                } else if (rank2.equals(powerR6)) {
                                    powerRank2 = 6;
                                } else if (rank2.equals(powerR5)) {
                                    powerRank2 = 5;
                                } else if (rank2.equals(powerR4)) {
                                    powerRank2 = 4;
                                } else if (rank2.equals(powerR3)) {
                                    powerRank2 = 3;
                                } else if (rank2.equals(powerR2)) {
                                    powerRank2 = 2;
                                } else if (rank2.equals(powerR1)) {
                                    powerRank2 = 1;
                                }
                            }
                            if (powerRank1 < powerRank2) {
                                Card temp = cards[i];
                                cards[i] = cards[j];
                                cards[j] = temp;
                            }

                        }
                    }
                }
            }





    //Повертає true у випадку коли в колоді ще доступні карти

    public boolean hasNext() {
        if (count > 0) {
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
            return cards[--count];
        } else {
            return null;
        }
    }
}
