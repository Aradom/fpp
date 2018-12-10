package w1l6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rainbow extends JFrame implements ActionListener {
	static final Dimension PREFERED_DIMENSION = new Dimension(90, 100);

	JButton btnRed;
	JButton btnYellow;
	JButton btnGreen;
	JButton btnPink;
	JButton btnWhite;
	JButton btnPurple;
	JButton btnBlue;

	Rainbow() {

		this.setTitle("Rainbow Colors");
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(0, 0, 700, 150);
		this.setResizable(false);

		btnRed = new JButton();
		btnYellow = new JButton();
		btnGreen = new JButton();
		btnPink = new JButton();
		btnWhite = new JButton();
		btnPurple = new JButton();
		btnBlue = new JButton();

		btnRed.setPreferredSize(PREFERED_DIMENSION);
		btnWhite.setPreferredSize(PREFERED_DIMENSION);
		btnYellow.setPreferredSize(PREFERED_DIMENSION);
		btnGreen.setPreferredSize(PREFERED_DIMENSION);
		btnBlue.setPreferredSize(PREFERED_DIMENSION);
		btnPurple.setPreferredSize(PREFERED_DIMENSION);
		btnPink.setPreferredSize(PREFERED_DIMENSION);

		btnRed.addActionListener(this);
		btnYellow.addActionListener(this);
		btnGreen.addActionListener(this);
		btnPink.addActionListener(this);
		btnWhite.addActionListener(this);
		btnPurple.addActionListener(this);
		btnBlue.addActionListener(this);

		btnRed.setBackground(Color.RED);
		btnYellow.setBackground(Color.YELLOW);
		btnGreen.setBackground(Color.GREEN);
		btnPink.setBackground(Color.PINK);
		btnWhite.setBackground(Color.WHITE);
		btnPurple.setBackground(new Color(128, 0, 128));
		btnBlue.setBackground(Color.BLUE);

		add(btnRed);
		add(btnYellow);
		add(btnGreen);
		add(btnPink);
		add(btnWhite);
		add(btnPurple);
		add(btnBlue);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		new Rainbow();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String quote = "";
		JButton sourceBtn = (JButton) e.getSource();

		if (sourceBtn == btnRed) {
			quote = "Angel Uriel ( wisdom/energy)";
			JOptionPane.showMessageDialog(sourceBtn, quote);
		}

		if (sourceBtn == btnYellow) {
			quote = " Angel Jophiel (Thoughts/Wisdom)";
			JOptionPane.showMessageDialog(sourceBtn, quote);
		}

		if (sourceBtn == btnGreen) {
			quote = "Angel Uriel ( wisdom/energy)";
			JOptionPane.showMessageDialog(sourceBtn, quote);
		}

		if (sourceBtn == btnPurple) {
			quote = "Angel Zadkeil  (angel of Mercy)";
			JOptionPane.showMessageDialog(sourceBtn, quote);
		}

		if (sourceBtn == btnPink) {
			quote = " Angel Chamuel- ( relationships)";
			JOptionPane.showMessageDialog(sourceBtn, quote);
		}

		if (e.getSource() == btnWhite) {
			quote = "Angel Gabriel ( revelation)";
			JOptionPane.showMessageDialog(sourceBtn, quote);
		}

		if (e.getSource() == btnBlue) {
			quote = "Angel Michael (the leader of all angels)";
			JOptionPane.showMessageDialog(sourceBtn, quote);
		}
	}
}
