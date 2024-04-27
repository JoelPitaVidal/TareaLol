import javax.swing.*;

public class LuchaDeEquipos extends ListaDeCampeones{
    ListaDeCampeones liCa = new ListaDeCampeones();
    public void luchaDeCampeones(){

        JOptionPane.showMessageDialog(null,"Los equipos 1 y 2 han realizado un combate\n" +
                "el ganador es el equipo1  compuesto de :"+ liCa.mostrarLista);
    }
}
