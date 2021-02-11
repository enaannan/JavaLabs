package com.company;

import com.company.enums.MembershipTypeEnum;


public class Client {
    private String firstName;
    private String lastName;
    private MembershipTypeEnum membershipTypeEnum;
    private Integer points;
  final  private static double maximumTradeAllowedForSilverType = 1000.0; // set this default value, can be assigned based on a different criteria

    // newly registered clients do not have a membership and a default point of zero
    public Client (String firstName, String lastName, MembershipTypeEnum membershipTypeEnum){
        this.firstName=firstName;
        this.lastName=lastName;
        this.points=0;

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MembershipTypeEnum getMembershipType() {
        return membershipTypeEnum;
    }

    public void setMembershipType(MembershipTypeEnum membershipType) {
        this.membershipTypeEnum = membershipType;
    }


public void addTrade(Trade trade){

}





    //a client can trade
    public void trade (){
        //bronze
        if (points<10){
            if(points ==0){
                // their first trade
                setMembershipType(membershipTypeEnum.BRONZE);
                points++;
                return;
            }
            points++;
            return;
        }
        else if (points >=10 && points <=19 ){

            if(points ==10){
                //upgrade to silver membership type

                setMembershipType(MembershipTypeEnum.SILVER);
                points++;
                return;
            }
            points++;
            return;
        }
        else if (points >=20){
            if (points ==20){
                // upgrade to golD
                setMembershipType(MembershipTypeEnum.GOLD);
                points++;
                return;
            }
            points++;
            return;
        }
    }

}
