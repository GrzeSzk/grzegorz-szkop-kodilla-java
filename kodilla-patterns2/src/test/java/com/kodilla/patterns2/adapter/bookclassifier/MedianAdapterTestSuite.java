package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        for (int n = 0; n <=8; n++) {
            Book book = new Book("Author" + n, "Title" + n, 2000 + n, "ABC" + n);
            books.add(book);
        }
        //When
        int result = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2004, result);
    }
}
