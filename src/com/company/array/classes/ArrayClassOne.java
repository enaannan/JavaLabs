package com.company.array.classes;

public class ArrayClassOne {

    int[] myArr= new int[20];

    public int getMyArr(int i) {
        return myArr[i];
    }

    public ArrayClassOne(){

        for (int i=0;i< myArr.length;i++){
            this.myArr[i]=i+1;
        }

    }
}
