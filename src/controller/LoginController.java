/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.LoginModel;
import classes.Person;
import view.NewBookView;
import view.NewReaderView;
import view.NewReaderViewE;


/**
 *
 *
 */
public class LoginController {

    /*  */
    LoginModel loginModel = new LoginModel();
    Person person = new Person();

    /**
     * Construtor de loginController.
     *
     * @param username Email digitado pelo usuário.
     * @param password Senha digitada pelo usuário.
     * @return void
     */
    public LoginController(String username, String password) throws Person.InvalidEmailException, Person.InvalidPasswordException {

        person.setPersonEmail(username);
        person.setPersonPassword(password);

        // Check credenciais chamando o loginModel
        if (loginModel.checkCredentials(person.getPersonEmail(), person.getPersonPassword())) {
            //new NewBookView().setVisible(true);
            new NewReaderViewE().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
        }

    }
}
