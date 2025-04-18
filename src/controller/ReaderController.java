/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import classes.Person;
import java.util.Map;
import javax.swing.JOptionPane;
import model.ReaderModel;

/**
 *
 *
 */
public class ReaderController {

    ReaderModel createReader = new ReaderModel();

    private Person person = new Person();

    public ReaderController() {

    }


public void addReader(int readerId, String readerName, String readerCpf, String readerTel, String readerEmail) {
    try {
        person.setPersonId(readerId);
        person.setPersonName(readerName);
        person.setPersonCpf(readerCpf); // Corrigido para usar readerCpf em vez de readerId
        person.setPersonTel(readerTel); // Corrigido para usar readerTel em vez de readerId
        person.setPersonEmail(readerEmail);

        createReader.addReader(readerId, readerName, readerCpf, readerTel, readerEmail);
    } catch (Person.InvalidNameException | Person.InvalidCpfException | Person.InvalidTelException | Person.InvalidEmailException  e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        // Interromper o processo, se necessário
    }
}

    public Map listReaders() {
        System.out.println("Controller: " + createReader.getListReaders());
        return createReader.getListReaders();
    }
}
