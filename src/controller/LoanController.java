/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import classes.Loan;
import classes.Book;
import classes.Person;
import java.util.Map;
import model.LoanModel;

/**
 *
 * @author Will
 */
public class LoanController {

    Book book = new Book();
    Person person = new Person();
    Loan loan = new Loan();
    private LoanModel loanModel = new LoanModel();
    public LoanController() {

    }

    public void addLoan(int bookId, int readerId, String bookName, String readerName, String loanDate, String loanRetur, String loanReturned) throws Person.InvalidNameException {
        
        book.setBookId(bookId);
        book.setBookTitle(bookName);
        person.setPersonId(readerId);
        person.setPersonName(readerName);
        loan.setLoanDate(loanDate);
        loan.setLoanReturn(loanRetur);
        loan.setloanReturned(loanReturned);
        
        loanModel.addLoan(
                book.getBookId(), 
                person.getPersonId(), 
                book.getBookTitle(), 
                person.getPersonName(), 
                loan.getLoanDate(), 
                loan.getLoanReturn(),
                loan.getLoanReturned());
    }
    
    public Map listLoan()
    {
        return loanModel.getListLoans();
    }
}
