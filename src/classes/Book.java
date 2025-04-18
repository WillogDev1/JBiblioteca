/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * 
 */
public class Book {

    private int bookId;
    private int isbnId;
    private String bookTitle;
    private String bookAuthor;
    private String bookDatePublish;
    private boolean bookIsRent;

    /**
     * Construtor padrão para a classe Book.
     */
    public Book() {
        // Construtor vazio padrão
    }

    /**
     * Obtém o ID do livro.
     * @return o ID do livro.
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * Define o ID do livro.
     * @param bookId o novo ID do livro.
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * Obtém o ID do ISBN do livro.
     * @return o ID do ISBN do livro.
     */
    public int getIsbnId() {
        return isbnId;
    }

    /**
     * Define o ID do ISBN do livro.
     * @param isbnId o novo ID do ISBN do livro.
     */
    public void setIsbnId(int isbnId) {
        this.isbnId = isbnId;
    }

    /**
     * Obtém o título do livro.
     * @return o título do livro.
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Define o título do livro.
     * @param bookTitle o novo título do livro.
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Obtém o autor do livro.
     * @return o autor do livro.
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * Define o autor do livro.
     * @param bookAuthor o novo autor do livro.
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * Obtém a data de publicação do livro.
     * @return a data de publicação do livro.
     */
    public String getBookDatePublish() {
        return bookDatePublish;
    }

    /**
     * Define a data de publicação do livro.
     * @param bookDatePublish a nova data de publicação do livro.
     */
    public void setBookDatePublish(String bookDatePublish) {
        this.bookDatePublish = bookDatePublish;
    }

    /**
     * Obtém o estado de aluguel do livro.
     * @return true se o livro está alugado, false caso contrário.
     */
    public boolean getBookIsRent() {
        return bookIsRent;
    }

    /**
     * Define o estado de aluguel do livro.
     * @param bookIsRent o novo estado de aluguel do livro.
     */
    public void setBookIsRent(boolean bookIsRent) {
        this.bookIsRent = bookIsRent;
    }
}