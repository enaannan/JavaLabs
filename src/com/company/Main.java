package com.company;

import com.company.array.classes.ArrayClassTwo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
     //   Trade trade = new Trade("T1", "APPL", 10);
//        System.out.println(trade.toString());


//
//        BondTrades bondTrades = new BondTrades("T1","APPL",10,15,100);
//
//        System.out.println(bondTrades.calcDividend());
//        System.out.println(bondTrades.getPrice());
//
//
//
//
//        FundTrades fundTrades = new FundTrades("T1","APPL",10,100,0.1);
//
//        System.out.println(fundTrades.calcDividend());
//        System.out.println(fundTrades.getPrice());
//
//
//        ExceptionExample exceptionExample = new ExceptionExample();
//
//        // Deliberately created a class that throws an indexoutofbounds error
//        //  System.out.println(exceptionExample.getLastCar());
//

//LocalDate dateToday = LocalDate.now();
//LocalDate dateYesterday = LocalDate.of(2021,02,9);
//        LocalDateTime startOfDay = dateToday.atStartOfDay();
//        LocalTime timeNow = LocalTime.parse("11:00:00.00");


//        System.out.println(startOfDay);
     //  System.out.println(dateToday.now());
        //System.out.println(LocalDateTime.now());
//        System.out.println(dateToday);
//        System.out.println(dateYesterday);
//        System.out.println(dateYesterday.equals(dateToday));
//        System.out.println(dateToday.equals(dateYesterday));



//        LocalTime timeRestriction = LocalTime.parse("10:00:00.00");
        // restrict trade before 10am
//       System.out.println(timeRestriction);
//        System.out.println(timeNow);
//        System.out.println(timeRestriction.isAfter(timeNow));

        //        if (LocalTime.now().isBefore(timeRestriction)){}

//        ArrayClassTwo arrayClassTwo = new ArrayClassTwo();
//        arrayClassTwo.initializeArray();
//        System.out.println(arrayClassTwo.getMyArr().toString());


        ArrayClassTwo arrayClassTwo=new ArrayClassTwo();
        System.out.println(arrayClassTwo.getSet());
//        Client client = new Client("Emmanuel"," Annan", MembershipTypeEnum.BRONZE);

//        MembershipTypeEnum bronze = MembershipTypeEnum.BRONZE;
//
//        bronze.canTrade();
//        bronze.canTrade();
//        System.out.println(bronze.canTrade());
//        bronze.canTrade();
//        bronze.canTrade();
//        System.out.println(bronze.canTrade());

        //        System.out.println(client.getMembershipType());
//        client.trade();
//        client.trade();
//        client.trade();
//        client.trade();
//        client.trade();
//        client.trade();
//        client.trade();
//        client.trade();
//        System.out.println(client.getMembershipType());
//        client.trade();
//        client.trade();
//        client.trade();
//        System.out.println(client.getMembershipType());
    }
}
