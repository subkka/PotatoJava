package oop_metro.run;

import oop_metro.model.vo.Charger;
import oop_metro.model.vo.ClimateCard;
import oop_metro.model.vo.Gate;
import oop_metro.model.vo.Card;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Card[] cards = new Card[3];
        cards[0] = new Card(0, "정예진", 24, "climate");
        cards[1] = new Card(1, "나지영", 24, "prepaid");
        cards[2] = new Card(2, "박수빈", 25, "deferred");

        Scanner sc = new Scanner(System.in);
        Gate gate = new Gate();
        Charger charger = new Charger();

        System.out.print("ID를 입력하세요 : ");
        int userId = sc.nextInt();
        System.out.println("1. 지하철 이용 / 2. 충전 : ");
        int selected = sc.nextInt();

        switch (selected) {
            case 1 : gate.menu(); break;
            case 2 :
                charger.menu(cards[userId], userId);
                if (cards[userId].getCard().equals("climate")) {
                    System.out.println(cards[userId].getClimateCards()[userId]);
                } else if (cards[userId].getCard().equals("prepaid")) {
                    System.out.println(cards[userId].getPrepaidCards()[userId]);
                } else if (cards[userId].getCard().equals("deferred")) {
                    System.out.println(cards[userId].getDeferredCards()[userId]);
                }
        }
    }
}