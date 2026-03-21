package hw.ch01;

import java.util.*;

public class BookShelfIteratorByYear implements Iterator<Book> {
    private List<Book> sortedBooks;
    private int index;

    public BookShelfIteratorByYear(BookShelf bookShelf) {
        // BookShelf의 모든 책을 가져와 리스트에 담기
        sortedBooks = new ArrayList<>();
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookAt(i));
        }

        // 연도 기준 내림차순 졍렬 (람다 표현식, 자료형 생략 가능)
        sortedBooks.sort((book1, book2) -> Integer.compare(book2.getYear(), book1.getYear()));
        // 연도 기준 내림차순 정렬 (익명 클래스)
        // sortedBooks.sort(new Comparator<Book>() {
        //     @Override
        //     public int compare(Book book1, Book book2) {
        //         return Integer.compare(book2.getYear(), book1.getYear());
        //     }
        // });

        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortedBooks.get(index++);
    }

}
