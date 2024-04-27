import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListaDeCampeones extends JFrame {

    protected FileWriter mostrarLista;
    String MensajeLeido = "";

    public void listaCampeones(){


        try {
            FileWriter fw = new FileWriter("ReporteMision.txt");
            fw.write(JOptionPane.showInputDialog("Introduce lós campeones para el primer equipo (5 max) : "));
            fw.close();
            mostrarLista=fw;
        } catch (IOException ex) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + ex.getMessage());
        }

    }
        
        public void mostrarLista() {
            try {
                FileReader lector = new FileReader("Lista de campeones.txt");
                BufferedReader BR = new BufferedReader(lector);
                MensajeLeido = BR.readLine();
            } catch (IOException ex) {
                System.out.println("Ocurrió un error al escribir en el archivo: " + ex.getMessage());
            }
     }

    public void listaCampeones2(){


        try {
            FileWriter fw2 = new FileWriter("ReporteMision.txt");
            fw2.write(JOptionPane.showInputDialog("Introduce lós campeones para el segundo equipo (5 max) : "));
            fw2.close();
        } catch (IOException ex) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + ex.getMessage());
        }
    }

    public void mostrarSegundaLista() {
        try {
            FileReader lector = new FileReader("Lista de campeones.txt");
            BufferedReader BR = new BufferedReader(lector);
            MensajeLeido = BR.readLine();
        } catch (IOException ex) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + ex.getMessage());
        }
    }
     
}


