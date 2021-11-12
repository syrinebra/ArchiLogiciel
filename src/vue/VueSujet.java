package vue;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JScrollPane;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.TextArea;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Window.Type;

public class VueSujet extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VueSujet dialog = new VueSujet();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VueSujet() {
		setResizable(false);
		setModal(true);
		setType(Type.POPUP);
		setTitle("Sujet");
		setForeground(Color.WHITE);
		setBounds(100, 100, 739, 735);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reference sujet :");
		lblNewLabel.setBounds(64, 118, 150, 30);
		contentPanel.add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(64, 177, 150, 30);
		contentPanel.add(lblDate);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(64, 241, 112, 30);
		contentPanel.add(lblDescription);
		
		textField = new JTextField();
		textField.setBounds(215, 114, 407, 39);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(215, 181, 407, 26);
		contentPanel.add(dateChooser);
		
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(215, 229, 407, 77);
		contentPanel.add(textArea);
		
		JButton btnNewButton = new JButton("Creer Sujet");
		btnNewButton.setBounds(209, 371, 201, 29);
		contentPanel.add(btnNewButton);
		
		JLabel lblGroupe = new JLabel("Groupe:");
		lblGroupe.setBounds(64, 312, 112, 30);
		contentPanel.add(lblGroupe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(209, 312, 419, 26);
		contentPanel.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 440, 532, 232);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(598, 440, 112, 29);
		contentPanel.add(btnModifier);
		
		JButton btnNewButton_1_1 = new JButton("Suprimer");
		btnNewButton_1_1.setBounds(598, 481, 112, 29);
		contentPanel.add(btnNewButton_1_1);
		
		JButton btnRenitialiser = new JButton("Renitialiser");
		btnRenitialiser.setBounds(421, 371, 201, 29);
		contentPanel.add(btnRenitialiser);
	}
}
