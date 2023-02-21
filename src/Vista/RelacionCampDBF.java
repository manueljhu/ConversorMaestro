package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.ComponentOrientation;
/**
 * 
 * @author Ryder
 *
 */
public class RelacionCampDBF extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBoxOrigen;
	private JButton btnBorrarRelacion;
	private JButton btnOriToRela;
	private JButton btnBorrarRelaciones;
	private JButton btnCancelar;
	private JButton btnAtras;
	private JButton btnSiguiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelacionCampDBF frame = new RelacionCampDBF();
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
	public RelacionCampDBF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1361, 783);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][237.00,grow][][205.00,grow][grow][grow]", "[][][][][452.00][32.00,top][31.00][56.00]"));
		
		JLabel lblNewLabel = new JLabel("CREACIÓN DE CAMPOS DE ORIGEN DBF\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel, "cell 0 0 7 1,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Tabla Origen");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 0 2");
		
		JLabel lblNewLabel_1_1 = new JLabel("Tabla Destino");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_1, "cell 6 2,alignx right");
		
		comboBoxOrigen = new JComboBox();
		comboBoxOrigen.setMinimumSize(new Dimension(0, 0));
		contentPane.add(comboBoxOrigen, "cell 0 3,growx");
		
		btnBorrarRelacion = new JButton("Borrar Relacion");
		btnBorrarRelacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnBorrarRelacion.setEnabled(false);
		contentPane.add(btnBorrarRelacion, "cell 2 3,alignx center");
		
		btnBorrarRelaciones = new JButton("Borrar Relaciones");
		btnBorrarRelaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnBorrarRelaciones.setEnabled(false);
		contentPane.add(btnBorrarRelaciones, "cell 4 3,alignx center");
		
		JComboBox comboBoxDestino = new JComboBox();
		comboBoxDestino.setMinimumSize(new Dimension(0, 0));
		contentPane.add(comboBoxDestino, "cell 6 3,growx");
		
		JTextPane textPaneOrigen = new JTextPane();
		contentPane.add(textPaneOrigen, "cell 0 4,grow");
		
		btnOriToRela = new JButton("=>");
		btnOriToRela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btnOriToRela.setPreferredSize(new Dimension(100, 300));
		contentPane.add(btnOriToRela, "cell 1 4,alignx center,aligny center");
		
		JTextPane textPaneProceso = new JTextPane();
		contentPane.add(textPaneProceso, "cell 2 4 3 1,grow");
		
		JButton btnDestToRela = new JButton("<=");
		btnDestToRela.setPreferredSize(new Dimension(100, 300));
		contentPane.add(btnDestToRela, "cell 5 4,alignx center");
		
		JTextPane textPaneDestino = new JTextPane();
		contentPane.add(textPaneDestino, "cell 6 4,grow");
		
		JRadioButton rdbtnActualizar = new JRadioButton("Actualizar");
		rdbtnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonGroup.add(rdbtnActualizar);
		rdbtnActualizar.setSelected(true);
		contentPane.add(rdbtnActualizar, "flowx,cell 2 5,alignx right");
		
		JRadioButton rdbtnInsertar = new JRadioButton("Insertar");
		buttonGroup.add(rdbtnInsertar);
		rdbtnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnInsertar.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(rdbtnInsertar, "cell 4 5");
		
		JSeparator separator = new JSeparator();
		separator.setMinimumSize(new Dimension(1000, 0));
		separator.setForeground(new Color(128, 128, 128));
		separator.setOpaque(true);
		contentPane.add(separator, "flowx,cell 0 6 7 1,alignx center");
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnCancelar.setEnabled(false);
		contentPane.add(btnCancelar, "cell 2 7,alignx center");
		
		btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setEnabled(false);
		contentPane.add(btnAtras, "cell 3 7");
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguiente.setEnabled(false);
		contentPane.add(btnSiguiente, "cell 4 7,alignx center");
	}

}
