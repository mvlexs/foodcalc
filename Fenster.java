package flori;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenster extends JFrame {

	private JPanel contentPane;
	private JTextField alterField;
	private JTextField größeField;
	private JTextField gewichtField;
	private int gewicht;
	private int größe; 
	private int alter;
	private double huhnEinheiten = 0;
	private double rindEinheiten = 0;
	private double fischEinheiten = 0;
	private double wurstEinheiten = 0;
	private double käseEinheiten = 0;
	private double butterEinheiten = 0;
	private double erdnussEinheiten = 0;
	private double brotEinheiten = 0;
	private double nudelnEinheiten = 0;
	private double reisEinheiten = 0;
	private double haferEinheiten = 0;
	private double quarkEinheiten = 0;
	private double milchEinheiten = 0;
	private double brokkoliEinheiten = 0;
	private double erbsenEinheiten = 0;
	private double tofuEinheiten = 0;
	
	public Fenster(int alter, int größe, int gewicht, double huhnEinheiten, double rindEinheiten, double fischEinheiten, double wurstEinheiten, double käseEinheiten, double butterEinheiten, double erdnussEinheiten, double brotEinheiten, double nudelnEinheiten, double reisEinheiten, double haferEinheiten, double quarkEinheiten,double milchEinheiten, double brokkoliEinheiten, double erbsenEinheiten, double tofuEinheiten) {
		 this.gewicht = gewicht;
		 this.größe = größe;
		 this.alter = alter;
		 this.huhnEinheiten = huhnEinheiten;
		 this.rindEinheiten = rindEinheiten;
		 this.fischEinheiten = fischEinheiten;
		 this.wurstEinheiten = wurstEinheiten;
		 this.käseEinheiten = käseEinheiten;
		 this.butterEinheiten = butterEinheiten;
		 this.erdnussEinheiten = erdnussEinheiten;
		 this.brotEinheiten = brotEinheiten;
		 this.nudelnEinheiten = nudelnEinheiten;
		 this.reisEinheiten = reisEinheiten;
		 this.haferEinheiten = haferEinheiten;
		 this.quarkEinheiten = quarkEinheiten;
		 this.milchEinheiten = milchEinheiten;
		 this.brokkoliEinheiten = brokkoliEinheiten;
		 this.erbsenEinheiten = erbsenEinheiten;
		 this.tofuEinheiten = tofuEinheiten;
	}

	Fenster fensterdaten = new Fenster(gewicht, größe, alter, huhnEinheiten, rindEinheiten, fischEinheiten, wurstEinheiten, käseEinheiten, butterEinheiten, erdnussEinheiten, brotEinheiten, nudelnEinheiten, reisEinheiten, haferEinheiten, quarkEinheiten, milchEinheiten, brokkoliEinheiten, erbsenEinheiten, tofuEinheiten);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenster frame = new Fenster();
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
	public Fenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBerechnen = new JButton("Go!");
		/*
		 * btnBerechnen.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { int gewicht =
		 * Integer.parseInt(gewichtField.getText());
		 * 
		 * int größe = Integer.parseInt(größeField.getText());
		 * 
		 * int alter = Integer.parseInt(alterField.getText());
		 * 
		 * int huhnEinheiten = huhnSpinner.getValue; } });
		 */

		btnBerechnen.setBounds(235, 514, 86, 20);
		contentPane.add(btnBerechnen);

		alterField = new JTextField();
		alterField.setBounds(235, 85, 86, 20);
		contentPane.add(alterField);
		alterField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Alter in Jahren:");
		lblNewLabel.setBounds(128, 88, 101, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gr\u00F6\u00DFe in cm:");
		lblNewLabel_1.setBounds(128, 150, 101, 14);
		contentPane.add(lblNewLabel_1);

		größeField = new JTextField();
		größeField.setBounds(235, 147, 86, 20);
		contentPane.add(größeField);
		größeField.setColumns(10);

		gewichtField = new JTextField();
		gewichtField.setBounds(235, 116, 86, 20);
		contentPane.add(gewichtField);
		gewichtField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Gewicht in kg:");
		lblNewLabel_2.setBounds(128, 119, 101, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Heute habe ich...");
		lblNewLabel_3.setBounds(25, 213, 165, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("...gegessen!");
		lblNewLabel_4.setBounds(452, 380, 92, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("H\u00FCnerfleisch");
		lblNewLabel_5.setBounds(65, 238, 79, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Rindfleisch");
		lblNewLabel_6.setBounds(65, 269, 79, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Fisch");
		lblNewLabel_7.setBounds(65, 300, 69, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Wurst");
		lblNewLabel_8.setBounds(65, 331, 79, 14);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("K\u00E4se");
		lblNewLabel_9.setBounds(184, 238, 79, 14);
		contentPane.add(lblNewLabel_9);

		JLabel lblNewLabel_9_1 = new JLabel("Butter");
		lblNewLabel_9_1.setBounds(184, 269, 79, 14);
		contentPane.add(lblNewLabel_9_1);

		JLabel lblNewLabel_9_2 = new JLabel("Erdnussbutter");
		lblNewLabel_9_2.setBounds(184, 300, 92, 14);
		contentPane.add(lblNewLabel_9_2);

		JLabel lblNewLabel_9_3 = new JLabel("Brot");
		lblNewLabel_9_3.setBounds(184, 331, 86, 14);
		contentPane.add(lblNewLabel_9_3);

		JLabel lblNewLabel_9_4 = new JLabel("Nudeln");
		lblNewLabel_9_4.setBounds(313, 238, 79, 14);
		contentPane.add(lblNewLabel_9_4);

		JLabel lblNewLabel_9_5 = new JLabel("Reis");
		lblNewLabel_9_5.setBounds(313, 269, 92, 14);
		contentPane.add(lblNewLabel_9_5);

		JLabel lblNewLabel_9_6 = new JLabel("Haferflocken");
		lblNewLabel_9_6.setBounds(313, 300, 79, 14);
		contentPane.add(lblNewLabel_9_6);

		JLabel lblNewLabel_9_7 = new JLabel("Quark");
		lblNewLabel_9_7.setBounds(313, 331, 79, 14);
		contentPane.add(lblNewLabel_9_7);

		JLabel lblNewLabel_9_8 = new JLabel("Milch");
		lblNewLabel_9_8.setBounds(452, 238, 92, 14);
		contentPane.add(lblNewLabel_9_8);

		JLabel lblNewLabel_9_9 = new JLabel("Brokkoli");
		lblNewLabel_9_9.setBounds(452, 269, 92, 14);
		contentPane.add(lblNewLabel_9_9);

		JLabel lblNewLabel_9_10 = new JLabel("Erbsen");
		lblNewLabel_9_10.setBounds(452, 300, 92, 14);
		contentPane.add(lblNewLabel_9_10);

		JLabel lblNewLabel_9_11 = new JLabel("Tofu");
		lblNewLabel_9_11.setBounds(452, 331, 92, 14);
		contentPane.add(lblNewLabel_9_11);

		JSpinner huhnSpinner = new JSpinner();
		huhnSpinner.setBounds(25, 235, 30, 20);
		contentPane.add(huhnSpinner);

		JSpinner rindSpinner = new JSpinner();
		rindSpinner.setBounds(25, 266, 30, 20);
		contentPane.add(rindSpinner);

		JSpinner fischSpinner = new JSpinner();
		fischSpinner.setBounds(25, 297, 30, 20);
		contentPane.add(fischSpinner);

		JSpinner wurstSpinner = new JSpinner();
		wurstSpinner.setBounds(25, 328, 30, 20);
		contentPane.add(wurstSpinner);

		JSpinner käseSpinner = new JSpinner();
		käseSpinner.setBounds(144, 235, 30, 20);
		contentPane.add(käseSpinner);

		JSpinner butterSpinner = new JSpinner();
		butterSpinner.setBounds(144, 266, 30, 20);
		contentPane.add(butterSpinner);

		JSpinner erdnussSpinner = new JSpinner();
		erdnussSpinner.setBounds(144, 297, 30, 20);
		contentPane.add(erdnussSpinner);

		JSpinner brotSpinner = new JSpinner();
		brotSpinner.setBounds(144, 328, 30, 20);
		contentPane.add(brotSpinner);

		JSpinner nudelnSpinner = new JSpinner();
		nudelnSpinner.setBounds(273, 235, 30, 20);
		contentPane.add(nudelnSpinner);

		JSpinner reisSpinner = new JSpinner();
		reisSpinner.setBounds(273, 266, 30, 20);
		contentPane.add(reisSpinner);

		JSpinner haferflockenSpinner = new JSpinner();
		haferflockenSpinner.setBounds(273, 297, 30, 20);
		contentPane.add(haferflockenSpinner);

		JSpinner quarkSpinner = new JSpinner();
		quarkSpinner.setBounds(273, 328, 30, 20);
		contentPane.add(quarkSpinner);

		JSpinner milchSpinner = new JSpinner();
		milchSpinner.setBounds(412, 235, 30, 20);
		contentPane.add(milchSpinner);

		JSpinner brokkoliSpinner = new JSpinner();
		brokkoliSpinner.setBounds(412, 266, 30, 20);
		contentPane.add(brokkoliSpinner);

		JSpinner erbsenSpinner = new JSpinner();
		erbsenSpinner.setBounds(412, 297, 30, 20);
		contentPane.add(erbsenSpinner);

		JSpinner tofuSpinner = new JSpinner();
		tofuSpinner.setBounds(412, 328, 30, 20);
		contentPane.add(tofuSpinner);

		JLabel lblNewLabel_10 = new JLabel("Bitte gib deine Daten unten ein.");
		lblNewLabel_10.setBounds(25, 11, 296, 20);
		contentPane.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("Beachte, dass eine Lebensmitteleinheit 100g entspricht.");
		lblNewLabel_11.setBounds(25, 31, 375, 14);
		contentPane.add(lblNewLabel_11);

		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*int gewicht = Integer.parseInt(gewichtField.getText());

				int größe = Integer.parseInt(größeField.getText());

				int alter = Integer.parseInt(alterField.getText());*/

				double huhnEinheiten = (Integer) huhnSpinner.getValue();

				double rindEinheiten = (Integer) rindSpinner.getValue();

				double fischEinheiten = (Integer) fischSpinner.getValue();

				double wurstEinheiten = (Integer) wurstSpinner.getValue();

				double käseEinheiten = (Integer) käseSpinner.getValue();

				double butterEinheiten = (Integer) butterSpinner.getValue();

				double erdnussEinheiten = (Integer) erdnussSpinner.getValue();

				double brotEinheiten = (Integer) brotSpinner.getValue();

				double nudelnEinheiten = (Integer) nudelnSpinner.getValue();

				double reisEinheiten = (Integer) reisSpinner.getValue();

				double haferEinheiten = (Integer) haferflockenSpinner.getValue();

				double quarkEinheiten = (Integer) quarkSpinner.getValue();

				double milchEinheiten = (Integer) milchSpinner.getValue();

				double brokkoliEinheiten = (Integer) brokkoliSpinner.getValue();

				double erbsenEinheiten = (Integer) erbsenSpinner.getValue();

				double tofuEinheiten = (Integer) tofuSpinner.getValue();
	
			}
				
			});
		
	}	
		
		public int getGewicht() {
			return gewicht;
		}

		public int getAlter() {
			 return alter; 
		}
		
		public int getGröße() {
			return größe;
		}

		public double getHuhn() {
			return huhnEinheiten;
		}

		public double getRing() {
			return rindEinheiten;
		}

		public double getFisch() {
			return fischEinheiten;
		}

		public double getWurst() {
			return wurstEinheiten;
		}

		public double getKäse() {
			return käseEinheiten;
		}

		public double getButter() {
			return butterEinheiten;
		}

		public double getErdnuss() {
			return erdnussEinheiten;
		}

		public double getBrot() {
			return brotEinheiten;
		}

		public double getNudeln() {
			return nudelnEinheiten;
		}

		public double getReis() {
			return reisEinheiten;
		}

		public double getHafer() {
			return haferEinheiten;
		}

		public double getQuark() {
			return quarkEinheiten;
		}

		public double getMilch() {
			return milchEinheiten;
		}

		public double getBrokkoli() {
			return brokkoliEinheiten;
		}

		public double getErbsen() {
			return erbsenEinheiten;
		}

		public double getTofu() {
			return tofuEinheiten;
		}
		
		public void setGewicht(double gewicht) {
			this.gewicht = Integer.parseInt(gewichtField.getText());
		}
		
		public void setGröße(double größe) {
			this.größe = Integer.parseInt(größeField.getText());
		}

		public void setAlter(double alter) {
			this.alter = Integer.parseInt(alterField.getText());
		}

		
	/*public int getGewicht() {
		return gewicht;
	}

	public int getAlter() {
		 return alter; 
	}
	
	public int getGröße() {
		return größe;
	}

	public double getHuhn() {
		return huhnEinheiten;
	}

	public double getRing() {
		return rindEinheiten;
	}

	public double getFisch() {
		return fischEinheiten;
	}

	public double getWurst() {
		return wurstEinheiten;
	}

	public double getKäse() {
		return käseEinheiten;
	}

	public double getButter() {
		return butterEinheiten;
	}

	public double getErdnuss() {
		return erdnussEinheiten;
	}

	public double getBrot() {
		return brotEinheiten;
	}

	public double getNudeln() {
		return nudelnEinheiten;
	}

	public double getReis() {
		return reisEinheiten;
	}

	public double getHafer() {
		return haferEinheiten;
	}

	public double getQuark() {
		return quarkEinheiten;
	}

	public double getMilch() {
		return milchEinheiten;
	}

	public double getBrokkoli() {
		return brokkoliEinheiten;
	}

	public double getErbsen() {
		return erbsenEinheiten;
	}

	public double getTofu() {
		return tofuEinheiten;
	}*/

	private void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
