package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ConfiguracionConexion extends JFrame {

	private JPanel contentPane;
	private JTextField textServidor;
	private JTextField textUsuario;
	private JTextField textClave;
	private JTextField textNumEmpresa;
	private JTextField textEjercicio;
	private JTextField textAlmacenDestino;
	private JTextField textServidorOrigen;
	private JTextField textRutaDBF;
	private JTextField textRutaExcel;
	private JTextField textUsuarioOrigen;
	private JTextField textClaveOrigen;
	private JTextField textNombreBD;
	private final ButtonGroup Grupo1 = new ButtonGroup();
	private final ButtonGroup Grupo2 = new ButtonGroup();
	private Controlador miControlador;
	private JRadioButton rdbtnSQL;
	private JRadioButton rdbtnDBF;
	private JRadioButton rdbtnEXCEL;
	private JButton btnProbarConexionOrigen;
	private JButton btnFicheroExcel;
	private JButton btnFicheroDBF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfiguracionConexion frame = new ConfiguracionConexion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConfiguracionConexion() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONFIGURACIÓN CONEXIÓN DESTINO");
		lblNewLabel.setBounds(355, 41, 238, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 74, 880, 2);
		separator.setMinimumSize(new Dimension(880, 0));
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Servidor");
		lblNewLabel_1.setBounds(28, 91, 40, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setBounds(521, 91, 36, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Clave");
		lblNewLabel_3.setBounds(651, 91, 27, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nº Empresa");
		lblNewLabel_4.setBounds(810, 91, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		textServidor = new JTextField();
		textServidor.setText("TECNICO-PC\\GPBUSINESS");
		textServidor.setBounds(28, 109, 489, 20);
		contentPane.add(textServidor);
		textServidor.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setText("sa");
		textUsuario.setBounds(521, 109, 126, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textClave = new JTextField();
		textClave.setText("Fsgpsql00");
		textClave.setBounds(651, 109, 155, 20);
		contentPane.add(textClave);
		textClave.setColumns(10);
		
		textNumEmpresa = new JTextField();
		textNumEmpresa.setText("01");
		textNumEmpresa.setBounds(810, 109, 113, 20);
		contentPane.add(textNumEmpresa);
		textNumEmpresa.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Ejercicio:");
		lblNewLabel_5.setBounds(28, 137, 43, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Dígitos cuentas:");
		lblNewLabel_6.setBounds(188, 137, 77, 14);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboDigitosCuentas = new JComboBox();
		comboDigitosCuentas.setModel(new DefaultComboBoxModel(new String[] {"9", "10", "11", "12"}));
		comboDigitosCuentas.setBounds(269, 134, 45, 22);
		contentPane.add(comboDigitosCuentas);
		
		JLabel lblNewLabel_7 = new JLabel("Dígitos grupos:");
		lblNewLabel_7.setBounds(390, 137, 72, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboDigitosGrupos = new JComboBox();
		comboDigitosGrupos.setModel(new DefaultComboBoxModel(new String[] {"3", "4", "5"}));
		comboDigitosGrupos.setBounds(466, 134, 51, 22);
		contentPane.add(comboDigitosGrupos);
		
		JLabel lblNewLabel_8 = new JLabel("Almacén destino:");
		lblNewLabel_8.setBounds(521, 137, 82, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Probar Conexión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				probarConexionDestino();
			}
		});
		btnNewButton.setBounds(810, 133, 113, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("SELECCIÓN DE ORIGEN DE DATOS");
		lblNewLabel_9.setBounds(299, 189, 212, 14);
		contentPane.add(lblNewLabel_9);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 219, 880, 2);
		separator_1.setMinimumSize(new Dimension(880, 0));
		contentPane.add(separator_1);
		
		rdbtnSQL = new JRadioButton("SQL");
		rdbtnSQL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlSeleccionOrigen();
			}
		});
		rdbtnSQL.setSelected(true);
		Grupo1.add(rdbtnSQL);
		rdbtnSQL.setBounds(269, 236, 45, 23);
		contentPane.add(rdbtnSQL);
		
		rdbtnDBF = new JRadioButton("DBF");
		rdbtnDBF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlSeleccionOrigen();
			}
		});
		Grupo1.add(rdbtnDBF);
		rdbtnDBF.setBounds(368, 236, 45, 23);
		contentPane.add(rdbtnDBF);
		
		rdbtnEXCEL = new JRadioButton("Excel");
		rdbtnEXCEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlSeleccionOrigen();
			}
		});
		Grupo1.add(rdbtnEXCEL);
		rdbtnEXCEL.setBounds(466, 236, 51, 23);
		contentPane.add(rdbtnEXCEL);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 275, 880, 2);
		separator_2.setMinimumSize(new Dimension(880, 0));
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_10 = new JLabel("CONF. CONEXIÓN SQL ORIGEN");
		lblNewLabel_10.setBounds(28, 292, 152, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("CONF. FICHERO DBF ORIGEN");
		lblNewLabel_11.setBounds(318, 292, 144, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("CONF. FICHERO EXCEL ORIGEN");
		lblNewLabel_12.setBounds(651, 292, 155, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Servidor");
		lblNewLabel_13.setBounds(28, 310, 40, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Ruta fichero");
		lblNewLabel_14.setBounds(318, 310, 59, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Ruta fichero");
		lblNewLabel_15.setBounds(651, 310, 59, 14);
		contentPane.add(lblNewLabel_15);
		
		textServidorOrigen = new JTextField();
		textServidorOrigen.setText("TECNICO-PC\\SQLEXPRESS");
		textServidorOrigen.setBounds(28, 329, 152, 20);
		contentPane.add(textServidorOrigen);
		textServidorOrigen.setColumns(10);
		
		textRutaDBF = new JTextField();
		textRutaDBF.setEnabled(false);
		textRutaDBF.setEditable(false);
		textRutaDBF.setBounds(318, 329, 144, 20);
		contentPane.add(textRutaDBF);
		textRutaDBF.setColumns(10);
		
		textEjercicio = new JTextField();
		textEjercicio.setText("2022");
		textEjercicio.setBounds(75, 134, 105, 20);
		contentPane.add(textEjercicio);
		textEjercicio.setColumns(10);
		
		textAlmacenDestino = new JTextField();
		textAlmacenDestino.setBounds(607, 134, 40, 20);
		contentPane.add(textAlmacenDestino);
		textAlmacenDestino.setColumns(10);
		
		btnFicheroDBF = new JButton("...");
		btnFicheroDBF.setEnabled(false);
		btnFicheroDBF.setBounds(466, 328, 45, 23);
		contentPane.add(btnFicheroDBF);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(583, 292, 2, 200);
		separator_4.setMinimumSize(new Dimension(0, 200));
		separator_4.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator_4);
		
		textRutaExcel = new JTextField();
		textRutaExcel.setEnabled(false);
		textRutaExcel.setEditable(false);
		textRutaExcel.setBounds(651, 329, 155, 20);
		contentPane.add(textRutaExcel);
		textRutaExcel.setColumns(10);
		
		btnFicheroExcel = new JButton("...");
		btnFicheroExcel.setEnabled(false);
		btnFicheroExcel.setBounds(810, 328, 45, 23);
		contentPane.add(btnFicheroExcel);
		
		JLabel lblNewLabel_16 = new JLabel("Usuario");
		lblNewLabel_16.setBounds(28, 355, 36, 14);
		contentPane.add(lblNewLabel_16);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(226, 292, 2, 200);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setMinimumSize(new Dimension(0, 200));
		contentPane.add(separator_3);
		
		textUsuarioOrigen = new JTextField();
		textUsuarioOrigen.setText("sa");
		textUsuarioOrigen.setBounds(28, 373, 74, 20);
		contentPane.add(textUsuarioOrigen);
		textUsuarioOrigen.setColumns(10);
		
		textClaveOrigen = new JTextField();
		textClaveOrigen.setText("ew#211218");
		textClaveOrigen.setBounds(106, 373, 74, 20);
		contentPane.add(textClaveOrigen);
		textClaveOrigen.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Nombre BBDD");
		lblNewLabel_18.setBounds(28, 397, 66, 14);
		contentPane.add(lblNewLabel_18);
		
		textNombreBD = new JTextField();
		textNombreBD.setText("2022VJ");
		textNombreBD.setBounds(28, 415, 152, 20);
		contentPane.add(textNombreBD);
		textNombreBD.setColumns(10);
		
		btnProbarConexionOrigen = new JButton("Probar Conexión");
		btnProbarConexionOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				probarConexionOrigen();

				
			}
		});
		btnProbarConexionOrigen.setBounds(48, 439, 113, 23);
		contentPane.add(btnProbarConexionOrigen);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Tablas");
		rdbtnNewRadioButton_3.setSelected(true);
		Grupo2.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(28, 468, 57, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Vistas");
		Grupo2.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(89, 468, 53, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JLabel lblNewLabel_17 = new JLabel("Clave");
		lblNewLabel_17.setBounds(106, 355, 27, 14);
		contentPane.add(lblNewLabel_17);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(247, 505, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.setBounds(398, 505, 89, 23);
		contentPane.add(btnAtras);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(558, 503, 89, 23);
		contentPane.add(btnSiguiente);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(28, 498, 880, 9);
		contentPane.add(separator_5);
	}

	protected void probarConexionOrigen() {
		String servidor = textServidorOrigen.getText().replace("\\", "%");
		String [] partesConexion = servidor.split("%");
		
		String ipServidorOrigen = partesConexion[0];
		String instanciaOrigen = partesConexion[1];
		String usuarioOrigen = textUsuarioOrigen.getText();
		String claveOrigen = textClaveOrigen.getText();
		String nombreBDOrigen = textNombreBD.getText();
		
		String cadenaConexionOrigen = "jdbc:jtds:sqlserver://" + ipServidorOrigen + ";instance=" + instanciaOrigen + ";DatabaseName=[" + nombreBDOrigen + "]";
		System.out.println(cadenaConexionOrigen+" "+usuarioOrigen+" "+claveOrigen);
		miControlador.setConexionOrigen(cadenaConexionOrigen, usuarioOrigen, claveOrigen);
		 
	}
	
	

	protected void probarConexionDestino() {
		String servidor = textServidor.getText().replace("\\", "%");
		String [] partesConexion = servidor.split("%");
		
		String ipServidorDestino = partesConexion[0];
		String instanciaDestino = partesConexion[1];
		String usuarioDestino = textUsuarioOrigen.getText();
		String claveDestino = textClave.getText();
		String empresa = textNumEmpresa.getText();
		
		String cadenaConexionDestino = "jdbc:jtds:sqlserver://" + ipServidorDestino + ";instance=" + instanciaDestino + ";DatabaseName=GpBusiness" + empresa;
		System.out.println(cadenaConexionDestino+" "+usuarioDestino+" "+claveDestino);
		miControlador.setConexionDestino(cadenaConexionDestino, usuarioDestino, claveDestino);

		
	}
	
	private void controlSeleccionOrigen() {
		miControlador.controlSeleccionOrigen(rdbtnSQL, rdbtnDBF, rdbtnEXCEL);
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador=miControlador;
		
	}

	public JTextField getTextServidorOrigen() {
		return textServidorOrigen;
	}

	public void setTextServidorOrigen(JTextField textServidorOrigen) {
		this.textServidorOrigen = textServidorOrigen;
	}

	public JTextField getTextRutaDBF() {
		return textRutaDBF;
	}

	public void setTextRutaDBF(JTextField textRutaDBF) {
		this.textRutaDBF = textRutaDBF;
	}

	public JTextField getTextRutaExcel() {
		return textRutaExcel;
	}

	public void setTextRutaExcel(JTextField textRutaExcel) {
		this.textRutaExcel = textRutaExcel;
	}

	public JTextField getTextUsuarioOrigen() {
		return textUsuarioOrigen;
	}

	public void setTextUsuarioOrigen(JTextField textUsuarioOrigen) {
		this.textUsuarioOrigen = textUsuarioOrigen;
	}

	public JTextField getTextClaveOrigen() {
		return textClaveOrigen;
	}

	public void setTextClaveOrigen(JTextField textClaveOrigen) {
		this.textClaveOrigen = textClaveOrigen;
	}

	public JTextField getTextNombreBD() {
		return textNombreBD;
	}

	public void setTextNombreBD(JTextField textNombreBD) {
		this.textNombreBD = textNombreBD;
	}

	public JRadioButton getRdbtnSQL() {
		return rdbtnSQL;
	}

	public void setRdbtnSQL(JRadioButton rdbtnSQL) {
		this.rdbtnSQL = rdbtnSQL;
	}

	public JRadioButton getRdbtnDBF() {
		return rdbtnDBF;
	}

	public void setRdbtnDBF(JRadioButton rdbtnDBF) {
		this.rdbtnDBF = rdbtnDBF;
	}

	public JRadioButton getRdbtnEXCEL() {
		return rdbtnEXCEL;
	}

	public void setRdbtnEXCEL(JRadioButton rdbtnEXCEL) {
		this.rdbtnEXCEL = rdbtnEXCEL;
	}

	public JButton getBtnProbarConexionOrigen() {
		return btnProbarConexionOrigen;
	}

	public void setBtnProbarConexionOrigen(JButton btnProbarConexionOrigen) {
		this.btnProbarConexionOrigen = btnProbarConexionOrigen;
	}

	public JButton getBtnFicheroExcel() {
		return btnFicheroExcel;
	}

	public void setBtnFicheroExcel(JButton btnFicheroExcel) {
		this.btnFicheroExcel = btnFicheroExcel;
	}

	public JButton getBtnFicheroDBF() {
		return btnFicheroDBF;
	}

	public void setBtnFicheroDBF(JButton btnFicheroDBF) {
		this.btnFicheroDBF = btnFicheroDBF;
	}
	
	
	
	

}