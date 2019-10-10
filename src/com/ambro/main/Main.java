package com.ambro.main;

import java.util.List;

public class Main {

    //todo - tests

    public static void main(String[] args) {

        RetrieveData retrieveData = new RetrieveData();
        List<ModelObject> listOfUsers = retrieveData.getListOfUsers();

        ModelObject oldestUserWithPhone = retrieveData.getOldestUserWithPhone(listOfUsers);

        System.out.println("number of users is: " + listOfUsers.size());

        System.out.println(
                "the oldest user having phone is: " + "\n" +
                        "name: " + oldestUserWithPhone.getName() + "\n" +
                        "surname: " + oldestUserWithPhone.getSurname() + "\n" +
                        "age in days: " + oldestUserWithPhone.getAge() + "\n" +
                        "phone no.: " + oldestUserWithPhone.getPhone());

    }
}