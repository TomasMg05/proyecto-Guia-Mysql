package vista;

import javax.swing.*;
import controlador.Servicios;

public class Formulario extends JFrame {
    private JTextField txtNombre;
    private JTextField txtDocumento;
    private JTextField txtEdad;
    private JComboBox<String> cbTipoAlquiler;
    private JButton btnGuardar;

    public Formulario() {
        setTitle("Formulario de Alquiler");
        setSize(400, 400);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 50, 100, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 50, 200, 30);
        add(txtNombre);

        JLabel lblDocumento = new JLabel("Documento:");
        lblDocumento.setBounds(50, 100, 100, 30);
        add(lblDocumento);

        txtDocumento = new JTextField();
        txtDocumento.setBounds(150, 100, 200, 30);
        add(txtDocumento);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 150, 100, 30);
        add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(150, 150, 200, 30);
        add(txtEdad);

        JLabel lblTipoAlquiler = new JLabel("Tipo de Alquiler:");
        lblTipoAlquiler.setBounds(50, 200, 100, 30);
        add(lblTipoAlquiler);

        cbTipoAlquiler = new JComboBox<>(new String[]{"Sencilla - $40.000", "Doble - $60.000", "Suite - $80.000"});
        cbTipoAlquiler.setBounds(150, 200, 200, 30);
        add(cbTipoAlquiler);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(150, 300, 100, 30);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            Servicios servicios = new Servicios();
            servicios.alquilar(txtNombre.getText(), txtDocumento.getText(), Integer.parseInt(txtEdad.getText()), cbTipoAlquiler.getSelectedItem().toString());
        });
    }
}
