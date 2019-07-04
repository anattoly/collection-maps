package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args) throws IOException {

        PublicLibraries pbLibraries = new PublicLibraries();

        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Please input date in format dd.mm.yyyy");

        try {
            String date = reader.readLine();
            LocalDate regisrDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

            System.out.println(pbLibraries.getBooksOfDate(regisrDate));

        } catch (DateTimeParseException o){
            System.out.println("You entered date not format");
        }

        pbLibraries.printAllRegisterBooks();

        pbLibraries.printAllDateRegisterBooks();


    }
}
