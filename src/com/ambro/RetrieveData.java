package com.ambro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RetrieveData {

    public List<ModelObject> getListOfUsers() {

        String retrieveNameFromString;
        String retrieveSurnameFromString;
        LocalDate retrieveDateFromString;
        Integer retrievePhoneFromString;
        List<ModelObject> listOfUsers = new ArrayList<>();
        BufferedReader bufferedReader = null;


        try {
            bufferedReader = new BufferedReader(new FileReader("src\\com\\ambro\\file.txt"));
            String strCurrentLine;
            while ((strCurrentLine = bufferedReader.readLine()) != null) {

                int count = 0;

                for (int i = 0; i < strCurrentLine.length(); i++) {
                    if (strCurrentLine.charAt(i) == ',') {
                        count++;
                    }
                }
                String[] words = strCurrentLine.split(",");

                retrieveNameFromString = words[0];
                retrieveSurnameFromString = words[1];
                retrieveDateFromString = getAge(words[2]);

                if (count == 3) {
                    retrievePhoneFromString = Integer.parseInt(words[3]);
                } else retrievePhoneFromString = null;

                listOfUsers.add(new ModelObject(
                        retrieveNameFromString,
                        retrieveSurnameFromString,
                        retrieveDateFromString,
                        retrievePhoneFromString));
            }
        } catch (
                IOException e) {
            System.out.println("catch");
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();

            }
            return listOfUsers;

        }
    }

    private static LocalDate getAge(String date) {

        String[] dateTable = date.split("-");
        int year = Integer.parseInt(dateTable[0]);
        int month = Integer.parseInt(dateTable[1]);
        int day = Integer.parseInt(dateTable[2]);
        LocalDate time = LocalDate.of(year,month,day);
        return time;

    }
}

