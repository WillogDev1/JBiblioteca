/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;
import utils.Validation;

/**
 *
 *
 */
public class Person {

    private int personId;
    private String personName;
    private String personCpf;
    private String personTel;
    private String personEmail;
    private String personPassword;
    Validation isValid = new Validation();

    /**
     * Construtor vazio padrão para a classe Person.
     */
    public Person() {
        // Construtor vazio padrão
    }

    /**
     * Obtém o ID da pessoa.
     *
     * @return o ID da pessoa.
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Define o ID da pessoa.
     *
     * @param personId o novo ID da pessoa.
     */
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return o nome da pessoa.
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Define o nome da pessoa. Verifica se o nome não está vazio antes de
     * definir.
     *
     * @param personName o novo nome da pessoa.
     */
    public void setPersonName(String personName) throws InvalidNameException {
        if (!isValid.isNotEmpty(personName)) {
            throw new InvalidNameException("Nome não deve ser vazio");
        }
        this.personName = personName;
    }

    public class InvalidNameException extends Exception {
        public InvalidNameException(String message) {
            super(message);
        }
    }

    /**
     * Obtém o CPF da pessoa.
     *
     * @return o CPF da pessoa.
     */
    public String getPersonCpf() {
        return personCpf;
    }

    /**
     * Define o CPF da pessoa.
     *
     * @param personCpf o novo CPF da pessoa.
     */
    public void setPersonCpf(String personCpf) throws InvalidCpfException {
        if (!isValid.isValidCpf(personCpf)) {
            throw new InvalidCpfException("CPF deve ser válido");
        }
        this.personCpf = personCpf;
    }

    public class InvalidCpfException extends Exception {
        public InvalidCpfException(String message) {
            super(message);
        }
    }

    /**
     * Obtém o telefone da pessoa.
     *
     * @return o telefone da pessoa.
     */
    public String getPersonTel() {
        return personTel;
    }

    /**
     * Define o telefone da pessoa.
     *
     * @param personTel o novo telefone da pessoa.
     */
    public void setPersonTel(String personTel) throws InvalidTelException {
        if (!isValid.isValidTel(personTel)) {
            throw new InvalidTelException("Telefone deve ser válido");
        }
        this.personTel = personTel;
    }

    public class InvalidTelException extends Exception {
        public InvalidTelException(String message) {
            super(message);
        }
    }

    /**
     * Obtém o email da pessoa.
     *
     * @return o email da pessoa.
     */
    public String getPersonEmail() {
        return personEmail;
    }

    /**
     * Define o email da pessoa. Verifica se o email não está vazio e se é
     * válido antes de definir.
     *
     * @param personEmail o novo email da pessoa.
     */
    public void setPersonEmail(String personEmail) throws InvalidEmailException {
        if (!isValid.isNotEmpty(personEmail)) {
            throw new InvalidEmailException("Email não deve ser vazio");
        }

        if (!isValid.isValidEmail(personEmail)) {
            throw new InvalidEmailException("Email deve ser válido");
        }
        this.personEmail = personEmail;
    }

    public class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    /**
     * Obtém a senha da pessoa.
     *
     * @return a senha da pessoa.
     */
    public String getPersonPassword() {
        return personPassword;
    }

    /**
     * Define a senha da pessoa.
     *
     * @param personPassword a nova senha da pessoa.
     */
    public void setPersonPassword(String personPassword) throws InvalidPasswordException {
        if (!isValid.isNotEmpty(personPassword)) {
            throw new InvalidPasswordException("Senha não deve ser vazia");
        }
        this.personPassword = personPassword;
    }

    public class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }
}
