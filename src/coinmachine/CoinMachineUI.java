package coinmachine;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;


public class CoinMachineUI extends JFrame {

	private JButton one;
	private JButton five;
	private JButton ten;

	private JLabel balance;
	private JLabel status;
	private JLabel label;

	private JProgressBar progress;

	private int count;
	private int amount;

	public CoinMachineUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		setVisible(true);
		initComponent();
	}

	public void initComponent() {
		Container contents = new Container();
		contents.setLayout(new BoxLayout(contents, BoxLayout.Y_AXIS));

		Container first = new Container();
		first.setLayout(new FlowLayout());
		contents.add(first);

		JPanel second = new JPanel();
		second.setBorder(BorderFactory.createTitledBorder("Insert Money"));

		balance = new JLabel("Balance: ");
		first.add(balance);

		status = new JLabel();
		first.add(status);

		label = new JLabel("Status: ");
		first.add(label);

		progress = new JProgressBar();
		progress.setMaximum(10);
		first.add(progress);

		contents.add(second);

		ClassLoader loaderOne = this.getClass().getClassLoader();
		URL url1 = loaderOne.getResource("images/1baht.png");
		ImageIcon image1 = new ImageIcon(url1);
		one = new JButton(image1);
		second.add(one);

		ButtonActionListenerOne listenerOne = new ButtonActionListenerOne();
		one.addActionListener(listenerOne);

		ClassLoader loaderFive = this.getClass().getClassLoader();
		URL url5 = loaderFive.getResource("images/5baht.png");
		ImageIcon image5 = new ImageIcon(url5);
		five = new JButton(image5);
		second.add(five);

		ButtonActionListenerFive listenerFive = new ButtonActionListenerFive();
		five.addActionListener(listenerFive);

		ClassLoader loaderTen = this.getClass().getClassLoader();
		URL url10 = loaderTen.getResource("images/10baht.png");
		ImageIcon image10 = new ImageIcon(url10);
		ten = new JButton(image10);
		second.add(ten);

		ButtonActionListenerTen listenerTen = new ButtonActionListenerTen();
		ten.addActionListener(listenerTen);

		getContentPane().add(contents);
		pack();

	}

	class ButtonActionListenerOne implements ActionListener {
		public void actionPerformed (ActionEvent event) {

			if (count < 10) {
				CoinMachine machine = new CoinMachine(10);
				Coin oneBaht = new Coin(1);
				machine.insert(oneBaht);

				count += machine.getCount();
				amount += machine.getBalance();

				progress.setValue(count);
				status.setText(String.valueOf(amount));
			}

		}
	} 

	class ButtonActionListenerFive implements ActionListener {
		public void actionPerformed (ActionEvent event) {

			if(count < 10) {
				CoinMachine machine = new CoinMachine(10);
				Coin oneBaht = new Coin(5);
				machine.insert(oneBaht);

				count += machine.getCount();
				amount += machine.getBalance();

				progress.setValue(count);
				status.setText(String.valueOf(amount));
			}

		}
	} 

	class ButtonActionListenerTen implements ActionListener {
		public void actionPerformed (ActionEvent event) {

			if (count < 10) {
				CoinMachine machine = new CoinMachine(10);
				Coin oneBaht = new Coin(10);
				machine.insert(oneBaht);

				count += machine.getCount();
				amount += machine.getBalance();

				progress.setValue(count);
				status.setText(String.valueOf(amount));
			}

		}
	} 
	
}
