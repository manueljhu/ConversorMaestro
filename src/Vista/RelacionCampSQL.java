package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

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
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
/**
 * 
 * @author Ryder
 *
 */
public class RelacionCampSQL extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBoxOrigen;
	private JButton btnBorrarRelacion;
	private JButton btnOriToRela;
	private JButton btnBorrarRelaciones;
	private JButton btnCancelar;
	private JButton btnAtras;
	private JButton btnSiguiente;
	private Controlador controlador;
	private JComboBox comboBoxDestino;
	private JTable tableColumOrigen;
	private JTable tableColumDestino;
	private JTable tableRelacionCampos;
	private JFileChooser guardarRelacion;
	private JFileChooser leerRelacion;
	public JRadioButton rdbtnActualizar;
	private JRadioButton rdbtnInsertar;
	public JCheckBox chckbxVaciarDestino;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelacionCampSQL frame = new RelacionCampSQL();
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
	public RelacionCampSQL() {
		
		setBounds(100, 100, 1361, 783);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmGuardarRelacion = new JMenuItem("Guardar Relacion");
		mntmGuardarRelacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarRelacion.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				String rutaGuardado ="";
				try {
					if (guardarRelacion.showSaveDialog(null)==guardarRelacion.APPROVE_OPTION) {
						rutaGuardado = guardarRelacion.getSelectedFile().getAbsolutePath()+".crin";
						controlador.guardarFicheroRelacion(rutaGuardado, "SQL");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		mnNewMenu.add(mntmGuardarRelacion);
		
		JMenuItem mntmRecuperarRElacion = new JMenuItem("Recuperar Relacion");
		mntmRecuperarRElacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		mnNewMenu.add(mntmRecuperarRElacion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[117.00,grow][grow][237.00,grow][][205.00,grow][grow][116.00,grow]", "[][][][452.00,grow][32.00,top][31.00][56.00]"));
		
		JLabel lblNewLabel = new JLabel("CREACI??N DE CAMPOS DE ORIGEN SQL");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(lblNewLabel, "cell 0 0 7 1,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Tabla Origen");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		JLabel lblNewLabel_1_1 = new JLabel("Tabla Destino");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_1, "cell 6 1,alignx right");
		
		comboBoxOrigen = new JComboBox();
		comboBoxOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controlador.rellenaTablaOrigen("SQL");
			}
		});
		comboBoxOrigen.setMinimumSize(new Dimension(0, 0));
		contentPane.add(comboBoxOrigen, "cell 0 2,growx");
		
		btnBorrarRelacion = new JButton("Borrar Relacion");
		btnBorrarRelacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.borrarRelacionSeleccionada("SQL");	
				
			}
		});
		contentPane.add(btnBorrarRelacion, "cell 2 2,alignx center");
		
		btnBorrarRelaciones = new JButton("Borrar Relaciones");
		btnBorrarRelaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controlador.borrarRelaciones("SQL");
				
				
			}
		});
		contentPane.add(btnBorrarRelaciones, "cell 4 2,alignx center");
		
		comboBoxDestino = new JComboBox();
		comboBoxDestino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.rellenaTablaDestino("SQL");
			}
		});
		comboBoxDestino.setMinimumSize(new Dimension(0, 0));
		contentPane.add(comboBoxDestino, "cell 6 2,growx");
		
		btnOriToRela = new JButton("=>");
		btnOriToRela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controlador.traspasoCamposEntreTablas("SQL", 1);
				
				
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 3,grow");
		
		tableColumOrigen = new JTable();
		tableColumOrigen.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre Columna"
			}
		));
		scrollPane.setViewportView(tableColumOrigen);
		btnOriToRela.setPreferredSize(new Dimension(100, 300));
		contentPane.add(btnOriToRela, "cell 1 3,alignx center,aligny center");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		contentPane.add(scrollPane_2, "cell 2 3 3 1,grow");
		
		tableRelacionCampos = new JTable();
		tableRelacionCampos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Campo Origen", "Campo Destino"
			}
		));
		scrollPane_2.setViewportView(tableRelacionCampos);
		
		JButton btnDestToRela = new JButton("<=");
		btnDestToRela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controlador.traspasoCamposEntreTablas("SQL", 2);
				
				
				
			}
		});
		btnDestToRela.setPreferredSize(new Dimension(100, 300));
		contentPane.add(btnDestToRela, "cell 5 3,alignx center");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "cell 6 3,grow");
		
		tableColumDestino = new JTable();
		tableColumDestino.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre Columna"
			}
		));
		scrollPane_1.setViewportView(tableColumDestino);
		
		rdbtnActualizar = new JRadioButton("Actualizar");
		rdbtnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonGroup.add(rdbtnActualizar);
		rdbtnActualizar.setSelected(true);
		contentPane.add(rdbtnActualizar, "flowx,cell 2 4,alignx right");
		
		rdbtnInsertar = new JRadioButton("Insertar");
		buttonGroup.add(rdbtnInsertar);
		rdbtnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnInsertar.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(rdbtnInsertar, "cell 4 4");
		
		chckbxVaciarDestino = new JCheckBox("Vaciar Destino");
		chckbxVaciarDestino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(chckbxVaciarDestino, "cell 5 4");
		
		JSeparator separator = new JSeparator();
		separator.setMinimumSize(new Dimension(1000, 0));
		separator.setForeground(new Color(128, 128, 128));
		separator.setOpaque(true);
		contentPane.add(separator, "flowx,cell 0 5 7 1,alignx center");
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				controlador.cerrarVentanaSQL();
			}
		});
		contentPane.add(btnCancelar, "cell 2 6,alignx center");
		
		btnAtras = new JButton("Atr??s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				controlador.inciarPrograma();

			}
		});
		btnAtras.setEnabled(false);
		contentPane.add(btnAtras, "cell 3 6");
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguiente.setEnabled(false);
		contentPane.add(btnSiguiente, "cell 4 6,alignx center");
		
		guardarRelacion = new JFileChooser();
		guardarRelacion.setDialogType(JFileChooser.OPEN_DIALOG);
		guardarRelacion.setDialogTitle("Selcciona donde guardar el fichero");
		
		
		
	}
	
	private void rellenarComboTablasOrigen() {
		controlador.rellenaComboTablasOrigen();
	}

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}

	public JComboBox getComboBoxOrigen() {
		return comboBoxOrigen;
	}

	public void setComboBoxOrigen(JComboBox comboBoxOrigen) {
		this.comboBoxOrigen = comboBoxOrigen;
	}

	public JComboBox getComboBoxDestino() {
		return comboBoxDestino;
	}

	public void setComboBoxDestino(JComboBox comboBoxDestino) {
		this.comboBoxDestino = comboBoxDestino;
	}

	public JTable getTableColumOrigen() {
		return tableColumOrigen;
	}

	public void setTableColumOrigen(JTable tableColumOrigen) {
		this.tableColumOrigen = tableColumOrigen;
	}

	public JTable getTableColumDestino() {
		return tableColumDestino;
	}

	public void setTableColumDestino(JTable tableColumDestino) {
		this.tableColumDestino = tableColumDestino;
	}

	public JTable getTableRelacionCampos() {
		return tableRelacionCampos;
	}

	public void setTableRelacionCampos(JTable tableRelacionCampos) {
		this.tableRelacionCampos = tableRelacionCampos;
	}

	public JRadioButton getRdbtnActualizar() {
		return rdbtnActualizar;
	}

	public void setRdbtnActualizar(JRadioButton rdbtnActualizar) {
		this.rdbtnActualizar = rdbtnActualizar;
	}

	public JRadioButton getRdbtnInsertar() {
		return rdbtnInsertar;
	}

	public void setRdbtnInsertar(JRadioButton rdbtnInsertar) {
		this.rdbtnInsertar = rdbtnInsertar;
	}

	public JCheckBox getChckbxVaciarDestino() {
		return chckbxVaciarDestino;
	}

	public void setChckbxVaciarDestino(JCheckBox chckbxVaciarDestino) {
		this.chckbxVaciarDestino = chckbxVaciarDestino;
	}
	
	
	
	
	
}
