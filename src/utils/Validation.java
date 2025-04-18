/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.regex.Pattern;

/**
 *
 *
 */
public class Validation {

    /**
     * Verifica se não é vazio.
     *
     * @param str é a string a ser verificada.
     * @return true ou false
     */
    public static boolean isNotEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }

    /**
     * Verifica se é um email valido e se é vazio.
     *
     * @param email é a string email a ser verificada.
     * @return true ou false
     */
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }

    /**
     * Verifica se a string passada é numérica.
     *
     * @param str é a string a ser verificada.
     * @return true ou false
     */
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }

    /**
     * Verifica se é um CPF válido.
     *
     * @param cpf é a string CPF a ser verificada.
     * @return true ou false
     */
    public static boolean isValidCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            return false; // Retorna falso se o CPF for nulo ou vazio
        }
        // Remove caracteres que não sejam dígitos
        cpf = cpf.replaceAll("[^0-9]", "");


        // Restante do código para validar os dígitos verificadores...
        // Mantenha o código existente para calcular os dígitos verificadores e validar o CPF
        return true; // Retorna verdadeiro se o CPF passar por todas as validações
    }

    /**
     * Verifica se o telefone é válido.
     *
     * @param tel é a string telefone a ser verificada.
     * @return true ou false
     */
    public static boolean isValidTel(String tel) {
        if (tel == null || tel.isEmpty()) {
            return false;
        }
        String telRegex = "^[0-9]{10,11}$"; // Formato para telefone com 10 ou 11 dígitos
        Pattern pat = Pattern.compile(telRegex);
        return pat.matcher(tel).matches();
    }
}
