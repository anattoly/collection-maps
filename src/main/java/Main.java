package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Please input date in format dd.mm.yyyy");
        String date = reader.readLine();
        LocalDate regisrDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(regisrDate);
    }
}
