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

        System.out.println("============== Books has been assigned on you =============");
        pbLibraries.printAllRegisterBooks();

        System.out.println("============== You read the book on such date: =============");
        pbLibraries.printAllDateRegisterBooks();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("============Please input date in format \"DD.MM.YYYY\"==========");

        boolean checkDateFormat = false;
        while (checkDateFormat == false) {
            try {
                String date = reader.readLine();
                LocalDate regisrDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

                System.out.println(pbLibraries.getBooksOfDate(regisrDate));
                checkDateFormat = true;

            } catch (DateTimeParseException o) {
                System.out.println("!!!You entered date incorrect format, please input date in format \"DD.MM.YYYY\"!!!");
                checkDateFormat = false;
            }
        }

        System.out.println("****Would you like to rent a book now? (please input \"y\" or \"n\")****");
        if (reader.readLine().equals("y")) {
            System.out.println("****Input please name book****");
            String addBook = reader.readLine();
            pbLibraries.addBookOfNow(addBook);
            System.out.println("You assigned book today - \"" + pbLibraries.getBooksOfDate(LocalDate.now()) + "\"");
        } else {
            System.out.println("****Thank you. Looking forward to seeing you again****");
        }

    }
}
