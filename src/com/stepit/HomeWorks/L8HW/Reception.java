package com.stepit.HomeWorks.L8HW;


public class Reception {
    public static void main(String[] args) {
        FitClub myFitClub = new FitClub("Power");

        Instructor instructor1 = new Instructor("Bob", 28, "YOGA");
        myFitClub.addNewStaff(instructor1);

        Client client1 = new Client("Jane", 23, 353227430, 123456, instructor1, ClubCard.CardName.BUSINESS);
        myFitClub.addNewClient(client1);

        System.out.println(myFitClub);
    }
}
