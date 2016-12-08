package com.codebind;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.itextpdf.text.log.SysoLogger;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 */

/**
 * @author yotti
 */
public class Presserei1 extends JFrame {

	private Dialog dialogPanel = new Dialog();
	private JDialog dialog;
	public Object object;
	public int tz;

	private JPanel contentPane;
	public String textField1;
	public JTextField textField;
	public static JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JComboBox comboBox;
	static JDialog pressereiDialog;

	/**
	 * Launch the application.
	 */

	private static void createAndShowUIE() {

		try {

			Presserei1 frame = new Presserei1();
			// frame.pack();
			// frame.setLocationRelativeTo(null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				// new Splashscreen();
				createAndShowUIE();

			}
		});

	}

	/**
	 * Create the frame.
	 */
	public Presserei1(String s) {
		textField = new JTextField();
		this.textField.setText(s);
	}

	public Presserei1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Bitte eingeben", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(6, 6, 1018, 726);
		contentPane.add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyDialog m = new MyDialog(textField,Presserei1.this);
				m.setVisible(true);
				//m.setModal(true);
			}
		});
		textField.setBounds(6, 62, 116, 32);
		// panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("ArbeitsplanNr");
		lblNewLabel.setBounds(14, 34, 108, 16);
		panel.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(243, 62, 179, 44);
		panel.add(textField_1);
		textField_1.setColumns(10);
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				object = e.getX();
				tz = e.getX();
				System.out.println(e.getX());
				System.out.println("a" + tz);
				MyDialog m = new MyDialog(textField_1,Presserei1.this);
				m.setVisible(true);
				//m.setModal(true);
				
				
				
				
			}
		});
		textField_1.setEditable(false);
		textField_1.setFocusable(false);

		// textField_1=JOptionPane.showInputDialog(null, "message");

		JLabel lblKomm = new JLabel("Komm.-Nr");
		lblKomm.setBounds(287, 34, 76, 16);
		panel.add(lblKomm);

		textField_2 = new JTextField();
		textField_2.setBounds(519, 62, 179, 44);
		panel.add(textField_2);
		textField_2.setColumns(10);
		/**
		 * You missed this. MouseListener was not set
		 */
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyDialog m = new MyDialog(textField_2,Presserei1.this);
				m.setVisible(true);
			}
		});

		JLabel lblPos = new JLabel("Pos.");
		lblPos.setBounds(575, 34, 61, 16);
		panel.add(lblPos);

		textField_3 = new JTextField();
		textField_3.setBounds(6, 168, 179, 44);
		panel.add(textField_3);
		textField_3.setColumns(10);

		/**
		 * And this too...
		 */
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyDialog m = new MyDialog(textField_3,Presserei1.this);
				m.setVisible(true);
			}
		});

		JLabel lblStr = new JLabel("Str.");
		lblStr.setBounds(28, 140, 61, 16);
		panel.add(lblStr);

		textField_4 = new JTextField();
		textField_4.setBounds(243, 168, 179, 44);
		panel.add(textField_4);
		textField_4.setColumns(10);

		/**
		 * This .....
		 */
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyDialog m = new MyDialog(textField_4,Presserei1.this);
				m.setVisible(true);
			}
		});

		JLabel lblKunde = new JLabel("Kunde");
		lblKunde.setBounds(302, 140, 61, 16);
		panel.add(lblKunde);

		textField_5 = new JTextField();
		textField_5.setBounds(519, 168, 179, 44);
		panel.add(textField_5);
		textField_5.setColumns(10);

		/**
		 * Lastly ....
		 */
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyDialog m = new MyDialog(textField_5,Presserei1.this);
				m.setVisible(true);
			}
		});

		JLabel lblStck = new JLabel("Stück");
		lblStck.setBounds(590, 140, 61, 16);
		panel.add(lblStck);

		JButton btnNewButton = new JButton("Weiter");
		btnNewButton.setBounds(820, 274, 179, 44);
		panel.add(btnNewButton);

		comboBox = new JComboBox();
		comboBox.setAutoscrolls(true);
		comboBox.setMaximumRowCount(20);
		comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		// comboBox.setPreferredSize(34,45);
		// comboBox.setPreferredSize(new Dimension(200, 10));
		// comboBox.setMaximumSize(new Dimension(200, 10));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText((String) comboBox.getSelectedItem());
			}
		});

		setDiscountNames s = new setDiscountNames(comboBox);
		comboBox.setBounds(6, 62, 179, 44);
		panel.add(comboBox);
		System.out.println(getValue(textField));
		JButton btnZurck = new JButton("Zurück");
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startpage s = new Startpage();
				s.frmAngebotsportal.setVisible(true);
				setVisible(false);
			}
		});
		btnZurck.setBounds(820, 373, 179, 38);
		panel.add(btnZurck);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					if (getValue(textField) > 0) {

						// this.setVisible(false);
						/**
						 * You need to set the data from this frame to this
						 * model
						 */
						Presserei1Data data = new Presserei1Data();
						data.setArbeitSplanNr(getValue(textField));
						// data.setKommNr(getValue(textField_1));
						// data.setPos(getValue(textField_2));
						// data.setStr(getValue(textField_3));
						// data.setKunde(getValue(textField_4));
						// data.setStuck(getValue(textField_5));

						Presserei pr = new Presserei(data, getUsername().getText(), Presserei1.this);

						// put these there
						pressereiDialog = new JDialog(Presserei1.this, "Presserei", true);
						pressereiDialog.getContentPane().add(pr);
						pressereiDialog.pack();
						pr.setVisible(true);
						pressereiDialog.setSize(1024, 800);
						pressereiDialog.setVisible(true);

						// pr.setVisible(true);
						// pr.setFocusableWindowState(true);
						// setEnabled(false);
						// setVisible(false);
						// pr.textField_KommmissionNr.setText(getKommission().getText());
						// pr.textFied_ArbeitsplanNr.setText(getUsername().getText());
						System.out.println("stop" + getUsername().getText());
						Table table = new Table(getUsername().getText(), Presserei1.this);

						// Presserei pra = new Presserei(getUsername());
					} else {

						JDialog.setDefaultLookAndFeelDecorated(true);
						int response = JOptionPane.showConfirmDialog(null, "Sie müssen Eine ArbeitsplatzNr geben!",
								"Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Sie müssen eine Wahl treffen!");
				}
			}
		});

	}

	public JTextField getUsername() {
		textField1 = textField.getText();
		System.out.println("wert von testfield1" + textField1);
		return textField;
	}

	private void openTableAction() {

		dialogPanel.setVisible(true); // here the modal dialog takes over

		// this line starts *after* the modal dialog has been disposed
		// **** here's the key where I get the String from JTextField in the GUI
		// held
		// by the JDialog and put it into this GUI's JTextField.
		textField_1.setText(dialogPanel.getFieldText());
	}

	public JTextField getKommission() {
		return textField_1;
	}

	private double getValue(JTextField textField) {
		if (textField.getText() == null || textField.getText().isEmpty()) {
			return 0;
		}
		return Double.valueOf(textField.getText());
	}

	public static void closeDialog() {
		pressereiDialog.dispose();
	}

	public JDialog rDialog() {
		return new JDialog(Presserei1.this, "Dialog", true);
	}
}
