package wl7;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MetricConversionAssitant extends JFrame {

	public MetricConversionAssitant() {
		setTitle("Metric Conversion Assistant");
		setSize(435, 230);
		setLocation(100, 100);
		setResizable(false);
		Container contentPane;
		JButton btnToMetric;
		JLabel lblMile, lblKilometer, lblPound, lblKilogram, lblGallon, lblLiters, lblFahrenheit, lblCentigrade;
		JTextField txtMile, txtKilometer, txtPound, txtKilogram, txtGallon, txtLiters, txtFahrenheit, txtCintigrade;

		int xBoundsMetricLabel =220;
		int xBoundsMetricTxt = 320;
		int lblLeftMarigin = 10;
		int xBoundsText = 90;
		
		lblMile = new JLabel("Mile:");
		lblMile.setBounds(lblLeftMarigin, 30, 100, 20);
		txtMile = new JTextField("", 25);
		txtMile.setBounds(xBoundsText, 30, 100, 20);
		lblKilometer = new JLabel("Kilometer:");
		lblKilometer.setBounds(xBoundsMetricLabel, 30, 100, 20);
		txtKilometer = new JTextField("", 25);
		txtKilometer.setBounds(xBoundsMetricTxt, 30, 100, 20);
		lblPound = new JLabel("Pound:");
		lblPound.setBounds(lblLeftMarigin, 60, 100, 20);
		txtPound = new JTextField("", 25);
		txtPound.setBounds(xBoundsText, 60, 100, 20);
		lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setBounds(xBoundsMetricLabel, 60, 100, 20);
		txtKilogram = new JTextField("", 25);
		txtKilogram.setBounds(xBoundsMetricTxt, 60, 100, 20);
		lblGallon = new JLabel("Gallon:");
		lblGallon.setBounds(lblLeftMarigin, 100, 100, 20);
		txtGallon = new JTextField("", 25);
		txtGallon.setBounds(xBoundsText, 100, 100, 20);
		lblLiters = new JLabel("Liters:");
		lblLiters.setBounds(xBoundsMetricLabel, 100, 100, 20);
		txtLiters = new JTextField("", 25);
		txtLiters.setBounds(xBoundsMetricTxt, 100, 100, 20);
		lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setBounds(5, 140, 100, 20);
		txtFahrenheit = new JTextField("", 25);
		txtFahrenheit.setBounds(xBoundsText, 140, 100, 20);
		lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setBounds(xBoundsMetricLabel, 140, 100, 20);
		txtCintigrade = new JTextField("", 25);
		txtCintigrade.setBounds(xBoundsMetricTxt, 140, 100, 20);

		btnToMetric = new JButton("Convert");
		btnToMetric.addActionListener(e -> {
			double mile, pound, gallon, fah;
			
			if(txtMile.getText() != "") {
				try {
					mile =  Double.parseDouble(txtMile.getText());
					double kiloMeter = 1.60934 * mile;
					String kilometerStr = String.format("%.2f", kiloMeter);
					txtKilometer.setText(kilometerStr);
					
					pound = Double.parseDouble(txtPound.getText());
					double kilogram = 0.453592 * pound; 
					String kilogramStr = String.format("%.2f", kilogram);
					txtKilogram.setText(kilogramStr);
					
					gallon = Double.parseDouble(txtGallon.getText());
					double liter = 3.78541 * gallon; 
					String litrStr = String.format("%.2f", liter);
					txtLiters.setText(litrStr);
					
					fah = Double.parseDouble(txtFahrenheit.getText());
					double celsius =  (fah - 32) / 1.8;
					String celsiusStr = String.format("%.2f", celsius);
					txtCintigrade.setText(celsiusStr);
					
				}catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(this, "Please insert a valid number");
				}
			}			
		});
		
		
		btnToMetric.setBounds(140, 190, 100, 25);

		contentPane = this.getContentPane();
		contentPane.setLayout(null);

		contentPane.add(lblMile);
		contentPane.add(txtMile);
		contentPane.add(lblKilometer);
		contentPane.add(txtKilometer);
		contentPane.add(lblPound);
		contentPane.add(txtPound);
		contentPane.add(lblKilogram);
		contentPane.add(txtKilogram);
		contentPane.add(lblGallon);
		contentPane.add(txtGallon);
		contentPane.add(lblLiters);
		contentPane.add(txtLiters);
		contentPane.add(lblFahrenheit);
		contentPane.add(txtFahrenheit);
		contentPane.add(lblCentigrade);
		contentPane.add(txtCintigrade);
		contentPane.add(btnToMetric);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MetricConversionAssitant();
	}

}
