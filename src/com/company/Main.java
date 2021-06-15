package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        A();
        B();
    }

    public static void A(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Ветер с моря дул");
        stringArrayList.add("Нагонял беду");
        stringArrayList.add("И сказал ты мне");
        stringArrayList.add("Больше не приду");

        for (int i = 0; i < stringArrayList.size(); i++) {
            if(i % 2 == 0){
                stringArrayList.add(i + 1, stringArrayList.get(i));
            }
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        String s = "";
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        for (int i = 0; i < stringArrayList.size(); i++) {
            s = stringArrayList.get(i);
            if(s.length() >= 15) {
                stringArrayList1.add(s);
            }
        }

        for (int i = 0; i < stringArrayList1.size(); i++) {
            if(stringArrayList1.get(i).equals("И сказал ты мне")){
                stringArrayList1.remove(i);
                i--;
            }
        }
        System.out.println(stringArrayList1.toString());
    }

    public static void B() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList2 = new ArrayList<>();
        ArrayList<Integer> integerArrayList3 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integerArrayList.add(1 + random.nextInt(100));
            if(integerArrayList.get(i) % 2 == 0){
                integerArrayList2.add(integerArrayList.get(i));
            }
            else{
                integerArrayList3.add(integerArrayList.get(i));
            }
        }
        System.out.println(integerArrayList.toString());
        System.out.println(integerArrayList2.toString());
        System.out.println(integerArrayList3.toString());
    }
}
