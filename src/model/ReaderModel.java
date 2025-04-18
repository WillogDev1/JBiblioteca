/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class ReaderModel {

    private Map<Integer, Map<String, String>> readerMap; // HashMap para armazenar livros

    public ReaderModel() {
        this.readerMap = new HashMap<>();
        initializeDatabase(); // Inicializa o readerMap com alguns leitores pré-cadastrados
    }

    private void initializeDatabase() {
        // Inicializa o readerMap com alguns leitores pré-cadastrados
        Map<String, String> reader1Details = new HashMap<>();
        reader1Details.put("readerId", "1");
        reader1Details.put("readerName", "Gandalf the Gray");
        reader1Details.put("readerCpf", "4503456");
        reader1Details.put("readerTel", "1599676554");
        reader1Details.put("readerEmail", "gandalf.gray@istari.com");
        readerMap.put(45034562, reader1Details);

        Map<String, String> reader2Details = new HashMap<>();
        reader2Details.put("readerId", "2");
        reader2Details.put("readerName", "Saruman the White");
        reader2Details.put("readerCpf", "4509999");
        reader2Details.put("readerTel", "1598372748");
        reader2Details.put("readerEmail", "saruman.white@istari.com");
        readerMap.put(456273873, reader2Details);
    }

    public void addReader(int readerId, String readerName, String readerCpf, String readerTel, String readerEmail) {
        // Verifica se o leitor já existe pelo ID
        if (!readerMap.containsKey(readerId)) {
            // Cria um novo Map para armazenar os detalhes do leitor
            Map<String, String> readerDetails = new HashMap<>();
            readerDetails.put("readerId", Integer.toString(readerId));
            readerDetails.put("readerName", readerName);
            readerDetails.put("readerCpf", readerCpf);
            readerDetails.put("readerTel", readerTel);
            readerDetails.put("readerEmail", readerEmail);
            // Adiciona o leitor ao readerMap usando o ID como chave
            readerMap.put(readerId, readerDetails);
            JOptionPane.showMessageDialog(null, "Leitor inserido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Leitor já existe");
        }
    }

    // Método para retornar uma cópia do readerMap atualizado
    public Map<Integer, Map<String, String>> getListReaders() {
        System.out.println("Model" + readerMap);
         return readerMap; // Retorna uma cópia do readerMap para evitar modificações externas
    }
}
