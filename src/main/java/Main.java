package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args) throws IOException {

        PublicLibraries pb = new PublicLibraries();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
            System.out.println("Please input date in format dd.mm.yyyy");
            String date = reader.readLine();
            LocalDate regisrDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

            System.out.println(pb.getBooksOfDate(regisrDate));

        } catch (DateTimeParseException o){
            System.out.println("You entered date not format");
        }




    }
}
