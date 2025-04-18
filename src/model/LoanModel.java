/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.BookModel;
import java.util.Date;

/**
 *
 * @author Will
 */
public class LoanModel {

    private Map<Integer, Map<String, String>> loanMap; // HashMap para armazenar livros
    private BookModel bookModel = new BookModel();

    public LoanModel() {
        this.loanMap = new HashMap<>();
        initializeDatabase(); // Inicializa o readerMap com alguns leitores pré-cadastrados
    }

    private void initializeDatabase() {
        // Inicializa o readerMap com alguns leitores pré-cadastrados
        Map<String, String> loan1Details = new HashMap<>();
        loan1Details.put("loandId", "123");
        loan1Details.put("bookId", "123456789");
        loan1Details.put("bookName", "Senhor dos Anéis: A Sociedade do Anel");
        loan1Details.put("readerId", "4503456");
        loan1Details.put("readerName", "Gandalf the Gray");
        loan1Details.put("loanDate", "30/05/2024");
        loan1Details.put("loanReturn", "30/06/2024");
        loan1Details.put("dateReturned", "");
        loanMap.put(4503456, loan1Details);

        Map<String, String> loan2Details = new HashMap<>();
        loan2Details.put("loandId", "345");
        loan2Details.put("bookId", "987654321");
        loan2Details.put("bookName", "Harry Potter e a Pedra Filosofal");
        loan2Details.put("readerId", "4562738");
        loan2Details.put("readerName", "Saruman the White");
        loan2Details.put("loanDate", "15/05/2024");
        loan2Details.put("loanReturn", "15/06/2024");
        loan2Details.put("dateReturned", "");
        loanMap.put(4562738, loan2Details);
    }

    public void addLoan(int bookId, int readerId, String bookName, String readerName, String loanDate, String loanRetur, String dateReturned) {
        // Verifica se o leitor já existe pelo ID
        
        // Cria um novo Map para armazenar os detalhes do leitor
        Map<String, String> readerDetails = new HashMap<>();
        readerDetails.put("bookId", Integer.toString(bookId));
        readerDetails.put("bookName", bookName);
        readerDetails.put("readerId", Integer.toString(readerId));
        readerDetails.put("readerName", readerName);
        readerDetails.put("loanDate", loanDate);
        readerDetails.put("loanReturn", loanRetur);
        readerDetails.put("dateReturned", dateReturned);
        //int loanId = loadIdString;
        loanMap.put(bookId + readerId, readerDetails);

        // Trocar para True o Livro no bookIsRent
    }

    public void removeLoan(int bookId) {
        bookModel.listBook().remove(1, "true");
    }

    // Método para retornar uma cópia do readerMap atualizado
    public Map<Integer, Map<String, String>> getListLoans() {
        System.out.println("Model" + loanMap);
        return loanMap; // Retorna uma cópia do readerMap para evitar modificações externas
    }
}
