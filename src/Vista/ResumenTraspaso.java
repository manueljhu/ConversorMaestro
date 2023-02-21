package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JProgressBar;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class ResumenTraspaso extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResumenTraspaso frame = new ResumenTraspaso();
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
	public ResumenTraspaso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][241.00,grow][163.00][357.00px][]", "[][27px][24px][][][grow][32.00][][]"));
		
		JLabel lblNewLabel = new JLabel("TRASPASAR DATOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblNewLabel, "cell 0 0 6 1,alignx center,aligny top");
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(8);
		progressBar.setForeground(new Color(128, 255, 0));
		progressBar.setStringPainted(true);
		progressBar.setMinimumSize(new Dimension(10, 24));
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(progressBar, "cell 0 2 6 1,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("Log:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 0 4 2 1");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "flowy,cell 1 5 5 1,grow");
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setMinimumSize(new Dimension(650, 0));
		separator.setForeground(Color.GRAY);
		contentPane.add(separator, "cell 1 6 5 1,alignx center");
		
		JButton btnCancelar = new JButton("Cancelar");
		contentPane.add(btnCancelar, "cell 3 7,alignx right");
		
		JButton btnAtras = new JButton("Atrás");
		contentPane.add(btnAtras, "cell 4 7,alignx center,aligny center");
		
		JButton btnSiguiente = new JButton("Siguiente");
		contentPane.add(btnSiguiente, "flowx,cell 5 7");
	}
}
