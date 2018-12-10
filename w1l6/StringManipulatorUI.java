package w1l6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StringManipulatorUI extends JFrame implements ActionListener {
	JButton btnCountLetters;
	JButton btnReversLetters;
	JButton btnRemoveDuplicates;
	JLabel lblInput;
	JTextField userInput;
	JTextField txtOutput;

	StringManipulatorUI() {

		this.setTitle("Simple Word Processor");
		this.setLayout(null);
		this.setSize(500, 150);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);

		btnCountLetters = new JButton("Count Letters");
		btnCountLetters.setBounds(10, 10, 200, 25);
		this.add(btnCountLetters);

		btnCountLetters.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (userInput.getText() != null) {
					String text = userInput.getText();
					txtOutput.setText((countLetters(text).toString()));
				}

			}
		});

		btnReversLetters = new JButton("Revers Letters");
		btnReversLetters.setBounds(10, 50, 200, 25);
		this.add(btnReversLetters);
		btnReversLetters.addActionListener(this);

		btnRemoveDuplicates = new JButton("Remove Duplicates");
		btnRemoveDuplicates.setBounds(10, 90, 200, 25);
		this.add(btnRemoveDuplicates);
		btnRemoveDuplicates.addActionListener(this);

		lblInput = new JLabel("Input");
		lblInput.setBounds(240, 20, 80, 25);
		this.add(lblInput);

		userInput = new JTextField(20);
		userInput.setBounds(240, 40, 200, 25);
		this.add(userInput);

		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(240, 70, 80, 25);
		this.add(lblOutput);

		txtOutput = new JTextField(20);
		txtOutput.setBounds(240, 90, 200, 25);
		this.add(txtOutput);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		new StringManipulatorUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnReversLetters) {
			if (userInput.getText() != null) {
				String text = userInput.getText();
				txtOutput.setText(reverseLetters(text));
			}
		}

		if (e.getSource() == btnRemoveDuplicates) {
			if (userInput.getText() != null) {
				String text = userInput.getText();
				txtOutput.setText(removeDuplicates(text));
			}
		}

	}

	private String reverseLetters(String text) {
		StringBuilder sBuilder = new StringBuilder();
		String temp = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			temp = String.valueOf(text.charAt(i));
			sBuilder.append(temp);
		}
		return sBuilder.toString();

	}

	private String removeDuplicates(String text) {
		if (text == null || text.length() == 0) {
			return "";
		}
		StringBuilder sBuilder = new StringBuilder();

		String temp = "";
		for (int i = 0; i < text.length(); i++) {
			boolean repeated = false;
			for (int j = i - 1; j >= 0; j--) {
				if (text.charAt(i) == text.charAt(j)) {
					repeated = true;
					break;
				}
			}

			if (!repeated) {
				temp = String.valueOf(text.charAt(i));
				sBuilder.append(temp);
			}
		}
		return sBuilder.toString();
	}

	private Integer countLetters(String text) {
		if (userInput.getText() != null) {
			return userInput.getText().length();
		}
		return 0;
	}

}
