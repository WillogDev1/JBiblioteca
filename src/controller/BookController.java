/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.Book;
import java.util.Map;
import model.BookModel;

/**
 *
 *
 */
public class BookController {

    private Book book = new Book();
    BookModel createBook = new BookModel();

    public BookController() {
        //createBook.addBook(bookId, bookIsbn, bookTitle, bookAythor, bookDatePublish);
        //createBook.addBook(bookId, bookIsbn, bookTitle, bookAythor, bookDatePublish);
    }

    /**
     * Metodo para adicionar um livro ao Map return void
     */
    public void addBook(int bookId, int bookIsbn, String bookTitle, String bookAuthor, String bookDatePublish, boolean bookIsRent) {
        book.setBookId(bookId);
        book.setIsbnId(bookIsbn);
        book.setBookTitle(bookTitle);
        book.setBookAuthor(bookAuthor);
        book.setBookDatePublish(bookDatePublish);
        book.setBookIsRent(bookIsRent);

        createBook.addBook(book.getBookId(), book.getIsbnId(), book.getBookTitle(), book.getBookAuthor(), book.getBookDatePublish(), book.getBookIsRent());

    }

    public void editBook(int bookIsbn, String key, String newValue) {
        createBook.editBook(bookIsbn, key, newValue);
    }

    /**
     * Metodo para listar os livros cadastrados return Map
     */
    public Map listBook() {
        return createBook.listBook();
    }
}
