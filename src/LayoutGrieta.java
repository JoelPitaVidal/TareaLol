import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutGrieta extends JFrame{
    ListaDeCampeones liCa = new ListaDeCampeones();
    LuchaDeEquipos luEq = new LuchaDeEquipos();
    public LayoutGrieta(){

        //Configuramos el titulo del Layout y el cierre del mismo
        setTitle("Bienvenido al Instagrám de DAM1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Configuramos JPanel y establecemos FlowLayout como su gestor de layout
        JPanel panel = new JPanel(new FlowLayout());
        //Botones
        JButton SelectorCampeones = new JButton("Selección de Campeones y Roles");
        JButton SimularCombate = new JButton("Simulación de Combate");
        //añadir los botones al panel
        panel.add(SelectorCampeones);
        panel.add(SimularCombate);
        // Añadir el panel al JFrame
        add(panel);
        //Configuramos las acciónes de los botones
        //Seleccionar campeones
        SelectorCampeones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liCa.listaCampeones();
                liCa.listaCampeones2();

            }
        });
        //SimularCombate
        SimularCombate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                luEq.luchaDeCampeones();
            }
        });
        // Ajustar el tamaño del JFrame y hacerlo visible
        setSize(441, 147);
        setVisible(true);
    }
}
