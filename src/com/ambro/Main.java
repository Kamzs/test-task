package com.ambro;

import java.util.List;

public class Main {

    //todo - tests

    public static void main(String[] args) {

        RetrieveData retrieveData = new RetrieveData();
        List<ModelObject> listOfUsers = retrieveData.getListOfUsers();
        System.out.println(listOfUsers.size());
        ModelObject oldestUserWithPhone = null;

        for (int i = 0; i < listOfUsers.size(); i++) {
            if (!(listOfUsers.get(i).getPhone() == null)) {
                oldestUserWithPhone = listOfUsers.get(i);
            }
        }
        if (oldestUserWithPhone == null){
            System.out.println("no user with phone number");
        }
        else for (ModelObject user : listOfUsers) {
            if (!(user.getPhone() == null) && user.getAge() > oldestUserWithPhone.getAge() )
                oldestUserWithPhone = user;
    }
        System.out.println(oldestUserWithPhone.getName()
        +" born " + oldestUserWithPhone.getDate()+ " is the oldest user with phone");

}}