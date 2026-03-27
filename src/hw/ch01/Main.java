package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        System.out.println("학번: 20230887, 이름: 전유정");

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        // 장르 필터 Iterator 테스트 // 이터레이터 이름 수정, 출력 수정
        Iterator <Book> itg = bookShelf.iteratorByGenre("소설");
        System.out.println("[장르 필터 Iterator 테스트]");
        while(itg.hasNext()) {
            Book book = itg.next();
            System.out.printf("%s | %s | %d | %.0f%n", book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }

        // 출판연도 역순 Iterator 테스트 // 이터레이터 이름 수정, 출력 수정
        Iterator <Book> ity = bookShelf.iteratorByYear();
        System.out.println("[출판연도 역순 Iterator 테스트]");
        while(ity.hasNext()) {
            Book book = ity.next();
            System.out.printf("%s | %s | %d | %.0f%n", book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
    }
}