import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Finiquitos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidoPaterno;
	private JTextField textFieldApellidoMaterno;
	private JTextField textFieldRfc;
	private JTextField textFieldFechaPago;
	private JTextField textFieldNumeroAnosServicios;
	private JTextField textFieldUltimoSueldoMensOrd;
	private JTextField textFieldIngresoAcumulable;
	private JTextField textFieldIngresoNoAcumulable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finiquitos frame = new Finiquitos();
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
	public Finiquitos() {
		setTitle("FINIQUITOS - UNIVERSIDAD AUT\u00D3NOMA DE BAJA CALIFORNIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1100, 650);
				
				JMenuBar menuBar = new JMenuBar();
				setJMenuBar(menuBar);
				
				JMenu mnArchivo = new JMenu("Archivo");
				menuBar.add(mnArchivo);
				
				JMenuItem menuItem = new JMenuItem("Salir");
				mnArchivo.add(menuItem);
				
				JMenu mnAcerca = new JMenu("Acerca");
				menuBar.add(mnAcerca);
				
				JMenuItem mntmVersin = new JMenuItem("Versi\u00F3n 1.0");
				mnAcerca.add(mntmVersin);
				
				contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelReceptor = new JPanel();
		panelReceptor.setBorder(new TitledBorder(null, "Receptor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "N\u00F3mina Finiquito", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panelReceptor, GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelReceptor, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(250, Short.MAX_VALUE))
		);
		
		JLabel lblIntroducirLaInformacin = new JLabel("Introducir la informaci\u00F3n del solicitada: (Datos requeridos)");
		lblIntroducirLaInformacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblFechaDePago = new JLabel("Fecha de Pago: *");
		lblFechaDePago.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldFechaPago = new JTextField();
		textFieldFechaPago.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldFechaPago.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					char vchar = e.getKeyChar();
					if (!Character.isDigit(vchar) || (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) 
						e.consume();
			}
		});
		textFieldFechaPago.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldFechaPago.setColumns(10);
		
		JLabel lblNmeroDeAnos = new JLabel("N\u00FAmero de A\u00F1os de Servicio: *");
		lblNmeroDeAnos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldNumeroAnosServicios = new JTextField();
		textFieldNumeroAnosServicios.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldNumeroAnosServicios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNumeroAnosServicios.setColumns(10);
		
		JLabel lblUltimoSueldoMensual = new JLabel("\u00DAltimo Sueldo Mensual Ordinario: *");
		lblUltimoSueldoMensual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldUltimoSueldoMensOrd = new JTextField();
		textFieldUltimoSueldoMensOrd.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldUltimoSueldoMensOrd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldUltimoSueldoMensOrd.setColumns(10);
		
		JLabel lblIngresoAcumulable = new JLabel("Ingreso Acumulable:");
		lblIngresoAcumulable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldIngresoAcumulable = new JTextField();
		textFieldIngresoAcumulable.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldIngresoAcumulable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldIngresoAcumulable.setColumns(10);
		
		JLabel lblIngresoNoAcumulable = new JLabel("Ingreso No Acumulable: *");
		lblIngresoNoAcumulable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldIngresoNoAcumulable = new JTextField();
		textFieldIngresoNoAcumulable.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldIngresoNoAcumulable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldIngresoNoAcumulable.setColumns(10);
		GroupLayout gl_panelNominaFiniquito = new GroupLayout(panel_1);
		gl_panelNominaFiniquito.setHorizontalGroup(
			gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelNominaFiniquito.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIntroducirLaInformacin, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelNominaFiniquito.createSequentialGroup()
							.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panelNominaFiniquito.createSequentialGroup()
									.addComponent(lblFechaDePago)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textFieldFechaPago, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panelNominaFiniquito.createSequentialGroup()
									.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNmeroDeAnos)
										.addComponent(lblIngresoAcumulable))
									.addGap(50)
									.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textFieldIngresoAcumulable)
										.addComponent(textFieldNumeroAnosServicios, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))))
							.addGap(179)
							.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUltimoSueldoMensual)
								.addComponent(lblIngresoNoAcumulable))
							.addGap(18)
							.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textFieldIngresoNoAcumulable)
								.addComponent(textFieldUltimoSueldoMensOrd, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
					.addGap(156))
		);
		gl_panelNominaFiniquito.setVerticalGroup(
			gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelNominaFiniquito.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIntroducirLaInformacin, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaDePago)
						.addComponent(textFieldFechaPago, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelNominaFiniquito.createSequentialGroup()
							.addComponent(lblUltimoSueldoMensual)
							.addGap(24)
							.addComponent(lblIngresoNoAcumulable))
						.addGroup(gl_panelNominaFiniquito.createSequentialGroup()
							.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNmeroDeAnos)
								.addComponent(textFieldUltimoSueldoMensOrd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panelNominaFiniquito.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIngresoAcumulable)
								.addComponent(textFieldIngresoNoAcumulable, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelNominaFiniquito.createSequentialGroup()
							.addComponent(textFieldNumeroAnosServicios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textFieldIngresoAcumulable, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panelNominaFiniquito);
		
		JLabel lblIntroducirLosDatos = new JLabel("Introducir la informaci\u00F3n del Receptor: (Datos requeridos)");
		lblIntroducirLosDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNombres = new JLabel("Nombre(s): *");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldNombre = new JTextField();
		textFieldNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if (Character.isDigit(vchar) || (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) 
					e.consume();
			}
		});
		lblNombres.setLabelFor(textFieldNombre);
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNombre.setColumns(10);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno: *");
		lblApellidoPaterno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldApellidoPaterno = new JTextField();
		textFieldApellidoPaterno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if (Character.isDigit(vchar) || (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) 
					e.consume();
			}
		});
		lblApellidoPaterno.setLabelFor(textFieldApellidoPaterno);
		textFieldApellidoPaterno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldApellidoPaterno.setColumns(10);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno: *");
		lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldApellidoMaterno = new JTextField();
		textFieldApellidoMaterno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char vchar = e.getKeyChar();
				if (Character.isDigit(vchar) || (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) 
					e.consume();
			}
		});
		lblApellidoMaterno.setLabelFor(textFieldApellidoMaterno);
		textFieldApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldApellidoMaterno.setColumns(10);
		
		JLabel lblRfc = new JLabel("RFC: *");
		lblRfc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldRfc = new JTextField();
		textFieldRfc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldRfc.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar Datos Receptor");
		GroupLayout gl_panelReceptor = new GroupLayout(panelReceptor);
		gl_panelReceptor.setHorizontalGroup(
			gl_panelReceptor.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelReceptor.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panelReceptor.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRfc)
						.addComponent(lblIntroducirLosDatos)
						.addGroup(gl_panelReceptor.createSequentialGroup()
							.addComponent(lblNombres)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelReceptor.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldRfc, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panelReceptor.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelReceptor.createSequentialGroup()
									.addGap(58)
									.addComponent(btnBuscar))
								.addGroup(gl_panelReceptor.createSequentialGroup()
									.addGap(49)
									.addComponent(lblApellidoPaterno)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldApellidoPaterno, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
									.addGap(42)
									.addComponent(lblApellidoMaterno)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldApellidoMaterno, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(149, Short.MAX_VALUE))
		);
		gl_panelReceptor.setVerticalGroup(
			gl_panelReceptor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReceptor.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIntroducirLosDatos)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelReceptor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombres)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellidoPaterno)
						.addComponent(textFieldApellidoPaterno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellidoMaterno)
						.addComponent(textFieldApellidoMaterno, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelReceptor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRfc)
						.addComponent(textFieldRfc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panelReceptor.setLayout(gl_panelReceptor);
		contentPane.setLayout(gl_contentPane);
	}
}
