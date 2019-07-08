package main.java;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class PublicLibraries {


    private Map<LocalDate, String> registeringBooks;

    PublicLibraries() {
        registeringBooks = new TreeMap<>();
        registeringBooks.put(LocalDate.parse("2019-02-02"), "In Search of Lost Time by Marcel Proust");
        registeringBooks.put(LocalDate.parse("2003-03-03"), "Don Quixote by Miguel de Cervantes");
        registeringBooks.put(LocalDate.parse("2008-02-27"), "Ulysses by James Joyce");
        registeringBooks.put(LocalDate.parse("2015-12-31"), "The Great Gatsby by F. Scott Fitzgerald");
        registeringBooks.put(LocalDate.parse("2018-04-15"), "Moby Dick by Herman Melville");
        registeringBooks.put(LocalDate.parse("2019-07-01"), "Hamlet by William Shakespeare");
        registeringBooks.put(LocalDate.parse("2019-05-02"), "War and Peace by Leo Tolstoy");
        registeringBooks.put(LocalDate.parse("2019-02-05"), "The Odyssey by Homer");
    }

    public String getBooksOfDate(LocalDate registerDate){
        String books = registeringBooks.getOrDefault(registerDate, "No books found for entered date");
        return books;
    }




}
