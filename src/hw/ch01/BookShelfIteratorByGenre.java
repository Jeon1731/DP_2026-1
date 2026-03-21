package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIteratorByGenre implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;
    private String genre;

    public BookShelfIteratorByGenre(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.index = 0;
        this.genre = genre;
    }

    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre().equals(genre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
         if (!hasNext()) {
            throw new NoSuchElementException();
         }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}