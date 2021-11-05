package com.stepit.HomeWorks.L8HW;

import java.util.Date;

public class ClubCard {

    CardName cardName;
    int price;
    Date validity;
    int idClubCard;

    public void setPrice(int price) {
        this.price = price;
    }

    enum CardName {
        ECONOMY,
        BUSINESS,
        PREMIUM
    }

    public ClubCard(CardName cardName) {
        this.cardName = cardName;
        switch (cardName) {
            case ECONOMY:
                setPrice(500);
                break;
            case BUSINESS:
                setPrice(1000);
                break;
            case PREMIUM:
                setPrice(1500);
                break;
        }
    }

    public int getPrice() {
        return price;
    }

    public CardName getCardName() {
        return cardName;
    }

    public void setIdClubCard(int idClubCard) {
        this.idClubCard = idClubCard;
    }


}
