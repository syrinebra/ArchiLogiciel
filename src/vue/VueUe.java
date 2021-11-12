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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Window.Type;

public class VueUe extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VueUe dialog = new VueUe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VueUe() {
		setType(Type.POPUP);
		setResizable(false);
		setModal(true);
		setTitle("Unité d'esignement");
		setForeground(Color.WHITE);
		setBounds(100, 100, 739, 735);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nom UE :");
			lblNewLabel.setBounds(68, 154, 61, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblCoefUe = new JLabel("Coef UE :");
			lblCoefUe.setBounds(68, 195, 61, 16);
			contentPanel.add(lblCoefUe);
		}
		{
			JLabel lblDescription = new JLabel("Description: ");
			lblDescription.setBounds(68, 248, 89, 16);
			contentPanel.add(lblDescription);
		}
		
		textField = new JTextField();
		textField.setBounds(172, 148, 433, 31);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(172, 191, 78, 31);
		contentPanel.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(182, 248, 426, 58);
		contentPanel.add(textArea);
		
		JButton btnNewButton = new JButton("Creer UE ");
		btnNewButton.setBounds(172, 330, 129, 29);
		contentPanel.add(btnNewButton);
		
		JButton btnRenitialiser = new JButton("Renitialiser ");
		btnRenitialiser.setBounds(311, 330, 138, 29);
		contentPanel.add(btnRenitialiser);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(183, 398, 325, 226);
		contentPanel.add(scrollPane);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(547, 398, 129, 29);
		contentPanel.add(btnModifier);
		
		JButton btnNewButton_1_1 = new JButton("Suprimer");
		btnNewButton_1_1.setBounds(547, 445, 129, 29);
		contentPanel.add(btnNewButton_1_1);
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
