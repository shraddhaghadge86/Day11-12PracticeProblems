package com.bridgelabz.day11and12.deckofcards;

import java.util.Random;

public class DeckOfCards {
    String[] deckOfCard = new String[52];
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] players = new String[4][9];
    Random random = new Random();

    void assignCards(){
        int deckIndex = 0;
        for (int i = 0; i<suits.length; i++){
            for (int j = 0; j< ranks.length; j++){
                deckOfCard[deckIndex] = suits[i]+" of "+ranks[j];
                deckIndex++;
            }
        }
    }
    public String[] shuffleCards(){
        String temp;
        for (int i = 0;i<deckOfCard.length;i++){
            int j = random.nextInt(52);
            temp=deckOfCard[i];
            deckOfCard[i] = deckOfCard[j];
            deckOfCard[j] = temp;
        }
        return deckOfCard;
    }
    public void displayCards(String[]deckOfCard){
        int deckIndex = 0;
        for (int i = 0; i < players.length; i++){
            for (int j = 0; j < players[i].length; j++){
                players[i][j] = deckOfCard[deckIndex];
                deckIndex++;
                System.out.println(players[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        DeckOfCards cardGame=new DeckOfCards();
        cardGame.assignCards();
        String[]deckOfCard = cardGame.shuffleCards();
        cardGame.displayCards(deckOfCard);
    }
}
