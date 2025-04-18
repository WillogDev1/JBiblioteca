/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class Loan {
    private String loanDate;
    private String loanReturn;
    private String loanReturned;
    // Getter for loanDate
    public String getLoanDate() {
        return loanDate;
    }

    // Setter for loanDate
    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    // Getter for loanReturn
    public String getLoanReturn() {
        return loanReturn;
    }

    // Setter for loanReturn
    public void setLoanReturn(String loanReturn) {
        this.loanReturn = loanReturn;
    }
    
    public void setloanReturned(String loanReturned)
    {
        this.loanReturned = loanReturned;
    }
    
    public String getLoanReturned()
    {
        return loanReturned;
    }
}
