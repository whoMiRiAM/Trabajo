import javax.swing.*;

public class Puerto extends JFrame{
    private JCheckBox inspeccionadoEnAduanasCheckBox;
    private JTextField txtIdentificador;
    private JTextField txtPeso;
    private JTextField txtRemitente;
    private JTextField txtReceptora;
    private JLabel lbIdentificador;
    private JLabel lbPeso;
    private JLabel lbPaisPro;
    private JLabel lbPrioridad;
    private JLabel lbDescripcion;
    private JLabel lbEmpresaEnvi;
    private JLabel lbEmpresareci;
    private JPanel PanelPuerto;
    private JButton btGuardar;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JTextArea txtDescripcion;
    private JComboBox BoxPais;
    private JTextArea txtEstado;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JButton mostrarDatosContenedorButton;
    private JButton cuantasButton;
    private JTextField numeroColumnaTextField;
    private JTextField IDContenedorTextField;
    private JComboBox BoxCuantas;
    private JTextField txtCuantas;
    private JLabel lbOperacion;
    private JLabel lbEstado;


    public Puerto() {
        setTitle("Gestion de contenedores");
        setContentPane(PanelPuerto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }
}
