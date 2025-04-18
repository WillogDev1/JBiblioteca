/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotech;

import java.util.Map;
import controller.BookController;
import controller.ReaderController;
import view.NewLoginView;

/**
 *
 * @author matheus.rvieira5
 */
public class BiblioTech {

    private BookController createBook = new BookController();
    private ReaderController readerController = new ReaderController();

    Map<Integer, Map<String, String>> bookMap = createBook.listBook();
    Map<Integer, Map<String, String>> readerMap = readerController.listReaders();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLoginView().setVisible(true);
            }
        });

    }

}
