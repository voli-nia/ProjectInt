package com.stepit.HomeWorks.L8HW;

import java.util.*;

public class FitClub {

    public String name;

    private ArrayList <Client> clients;
    private ArrayList <Instructor> powerCoach;
    private ArrayList <Schedule> schedule;
    private ArrayList <ClubCard> allCards;

    public FitClub(String name){
        this.name = name;
        clients = new ArrayList<Client>();
        powerCoach = new ArrayList<Instructor>();
        schedule = new ArrayList<Schedule>();
        allCards = new ArrayList<ClubCard>();
    }

    public void addNewStaff(Instructor instructor) {
        powerCoach.add(instructor);
    }

    public void addNewClient(Client client) {
        clients.add(client);
        ClubCard currentCard = client.getCard();
        allCards.add(currentCard);
        currentCard.setIdClubCard(allCards.size());
    }

    public String getName() {
        return name;
    }

    public ArrayList<Client> getClient() {
        return clients;
    }

    public ArrayList<Instructor> getPowerCoach() {
        return powerCoach;
    }

    public ArrayList<Schedule> getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "FitClub{" +
                "name='" + name + '\'' +
                ", \n clients=" + clients +
                ", \n powerCoach=" + powerCoach +
                ", \n schedule=" + schedule +
                '}';
    }
}
