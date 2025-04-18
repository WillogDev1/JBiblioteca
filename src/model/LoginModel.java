/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

public class LoginModel {
        private Map<String, String> employeeDB;

        
     /**
     * Construtor de loginModel.
     * @return void
     */
    public LoginModel() {
        employeeDB = new HashMap<>();
        initializeDatabase(); // Chamada para inicializar o banco de dados
    }

    // Método privado para inicializar o banco de dados fictício com alguns usuários
    private void initializeDatabase() {
        employeeDB.put("admin1@example.com", "admin1");
        employeeDB.put("admin2@example.com", "admin2");
        employeeDB.put("admin3@example.com", "admin3");
        employeeDB.put("admin4@example.com", "admin4");
    }

    
     /**
     * Metodo para retornar lista de funcionarios cadastrados.
     * @return Map
     */
    public Map<String, String> getAllEmployees() {
        return employeeDB;
    }

     /**
     * Metodo para verificar sebha e username.
     * @return boolean
     */
    public boolean checkCredentials(String email, String password) {
        String storedPassword = employeeDB.get(email);
        return storedPassword != null && storedPassword.equals(password);
    }
}
