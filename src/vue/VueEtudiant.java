package vue;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.Window.Type;

public class VueEtudiant extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VueEtudiant dialog = new VueEtudiant();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VueEtudiant() {
		setType(Type.POPUP);
		setModal(true);
		setResizable(false);
		setTitle("Etudiant");
		setForeground(Color.WHITE);
		setBounds(100, 100, 739, 735);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nom etudiant :");
			lblNewLabel.setBounds(82, 139, 116, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblPenomtudiant = new JLabel("Prénom étudiant:");
			lblPenomtudiant.setBounds(82, 173, 116, 16);
			contentPanel.add(lblPenomtudiant);
		}
		{
			JLabel lblAgetudiant = new JLabel("Age étudiant:");
			lblAgetudiant.setBounds(82, 223, 116, 16);
			contentPanel.add(lblAgetudiant);
		}
		{
			JLabel lblMailtudiant = new JLabel("Mail étudiant:");
			lblMailtudiant.setBounds(82, 268, 116, 16);
			contentPanel.add(lblMailtudiant);
		}
		{
			textField = new JTextField();
			textField.setBounds(210, 134, 372, 26);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(210, 168, 372, 26);
			contentPanel.add(textField_1);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(210, 219, 95, 26);
			contentPanel.add(comboBox);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(210, 263, 372, 26);
			contentPanel.add(textField_2);
		}
		{
			JButton btnNewButton = new JButton("Créer étudiant");
			btnNewButton.setBounds(210, 322, 133, 29);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnRnitialiser = new JButton("Rénitialiser");
			btnRnitialiser.setBounds(344, 322, 133, 29);
			contentPanel.add(btnRnitialiser);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(176, 393, 372, 254);
			contentPanel.add(scrollPane);
		}
		{
			JButton btnModifier = new JButton("Modifier");
			btnModifier.setBounds(560, 393, 133, 29);
			contentPanel.add(btnModifier);
		}
		{
			JButton btnSuprimer = new JButton("Suprimer");
			btnSuprimer.setBounds(560, 437, 133, 29);
			contentPanel.add(btnSuprimer);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
