package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Book collection");
        IntStream.iterate(1, n -> n +1)
                .limit(7)
                .forEach(n -> library.getBooks().add(new Book("Title no1" + n, "Author no1" +n, LocalDate.now())));

        Book bookToRemove = new Book("Title no2", "Author no2", LocalDate.now());
        library.getBooks().add(bookToRemove);

        //making a shallow clone of object library
        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Library Shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(bookToRemove);
        //Then
        System.out.println(library.getBooks());
        System.out.println(shallowCopyLibrary.getBooks());
        System.out.println(deepCloneLibrary.getBooks());
        assertEquals(7,library.getBooks().size());
        assertEquals(7, shallowCopyLibrary.getBooks().size());
        assertEquals(8, deepCloneLibrary.getBooks().size());


    }
}
