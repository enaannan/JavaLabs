package com.company.enums;

import com.company.Interfaces.IMembershipType;

import java.time.LocalDate;
import java.time.LocalTime;

public enum MembershipTypeEnum implements IMembershipType {
    BRONZE {
        private Integer totalTradesAllowedPerDay=5; // contains the limit on trades allowed by this membership type
        private LocalDate dateToday;
        private LocalDate dateYesterday= LocalDate.now();

   @Override
        public boolean canTrade(){
            LocalTime timeRestriction = LocalTime.parse("10:00:00.00");
            // restrict trade before 10am
            if (LocalTime.now().isBefore(timeRestriction)){
                return false;
            }


            // get current date
            this.dateToday= LocalDate.now();

            //is today the same date as the previous date?
            if (dateToday.equals(dateYesterday)){

                //is total allowed trades more than 0?
                if(totalTradesAllowedPerDay>0){
                    totalTradesAllowedPerDay--;
                    return true;
                }else{
                    //total allowed trades is 0
                    return false;
                }

            }else{
                //new day,
                totalTradesAllowedPerDay=5; //reset total allowed trades
                totalTradesAllowedPerDay--; //assumes trade is successful hence reduces by one
                dateYesterday=dateToday;
                return true;
            }

        }
    }
    ,
    SILVER
            {

                private Integer totalTradesAllowedPerDay=10; // contains the limit on trades allowed by this membership type
                private LocalDate dateToday;
                private LocalDate dateYesterday = LocalDate.now();
                private double maximumTradeValueAllowed=1000; // specifies the maximum trade value allowed per customer for this type
                private double totalTradeValue=0; // contains the value of the total trade performed by this membership type

            @Override
                public boolean canTrade(){

                    // get current date
                    this.dateToday= LocalDate.now();

                    //is today the same date as the previous date?
                    if (dateToday.equals(dateYesterday)){


                        if(totalTradeValue == maximumTradeValueAllowed){
                            return false;
                        }

                        //is total allowed trades more than 0?
                        if(totalTradesAllowedPerDay>0){
                            totalTradesAllowedPerDay--;
                            return true;
                        }else{
                            //total allowed trades is 0
                            return false;
                        }

                    }else{
                        //new day,
                        totalTradesAllowedPerDay=10; //reset total allowed trades
                        totalTradesAllowedPerDay--; //assumes trade is successful hence reduces by one
                        dateYesterday=dateToday;
                        return true;
                    }

                }


            },
    GOLD {


        private Integer totalTradesAllowedPerDay=20; // contains the limit on trades allowed by this membership type
        private LocalDate dateToday;
        private LocalDate dateYesterday=LocalDate.now();

        @Override
        public boolean canTrade(){
            // get current date
            this.dateToday= LocalDate.now();

            //is today the same date as the previous date?
            if (dateToday.equals(dateYesterday)){

                //is total allowed trades more than 0?
                if(totalTradesAllowedPerDay>0){
                    totalTradesAllowedPerDay--;
                    return true;
                }else{
                    //total allowed trades is 0
                    return false;
                }

            }else{
                //new day,
                totalTradesAllowedPerDay=20; //reset total allowed trades
                totalTradesAllowedPerDay--; //assumes trade is successful hence reduces by one
                dateYesterday=dateToday;
                return true;
            }

        }


    }
}
