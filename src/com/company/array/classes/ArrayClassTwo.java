package com.company.array.classes;

import java.util.*;

public class ArrayClassTwo {

    HashSet<Integer> set =new HashSet<Integer>(6);

    public HashSet<Integer> getSet() {


        return  set;
    }

    public ArrayClassTwo(){
        Random random = new Random() ;
        while (set.size()<7){
           int nextInt = random.nextInt(49)+1;
            set.add(nextInt);
        }
    }

//ArrayList<Integer> myArrayList = new ArrayList<Integer>(6);
//
//    public ArrayList<Integer> getMyArrayList() {
//        return myArrayList;
//    }
//
//
//
//
//    public ArrayClassTwo() {
//      initializeArray();
//    }
//
//    public void initializeArray(){
//        Random random = new Random() ;
//        while (myArrayList.size()<7){
//            int nextInt= random.nextInt(49)+1;
//            if(!myArrayList.contains(nextInt)){
//                myArrayList.add(nextInt);
//            }
//        }
//        Collections.sort(myArrayList);
//    }
//
}
