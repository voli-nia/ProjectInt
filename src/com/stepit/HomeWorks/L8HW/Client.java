package com.stepit.HomeWorks.L8HW;

public class Client {

        private String name;
        private int age;
        private int phone;
        private String email;
        private int idClubCard;
        private String cardName;
        private Instructor instructor;
        private ClubCard clubCard;

        public Client(String name, int age, int phone, int idClubCard, Instructor instructor, ClubCard.CardName cardName) {
                this.name = name;
                this.age = age;
                this.phone = phone;
                this.idClubCard = idClubCard;
                this.instructor = instructor;
                this.clubCard = new ClubCard(cardName);
        }

        @Override
        public String toString() {
                return "Client{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", phone=" + phone +
                        ", email='" + email + '\'' +
                        ", idClubCard=" + idClubCard +
                        ", cardName='" + cardName + '\'' +
                        ", instructor=" + instructor +
                        ", clubCard=" + clubCard +
                        '}';
        }

        public ClubCard getCard() {
                return clubCard;
        }
}
