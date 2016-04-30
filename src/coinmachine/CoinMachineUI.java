package coinmachine;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class CoinMachineUI extends JFrame {
	
	private JButton one;
	private JButton five;
	private JButton ten;
	
	private JLabel balance;
	private JLabel insert;
	
	private JProgressBar progress;
	
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
		
		Container second = new Container();
		second.setLayout(new GridLayout(1, 1));
		contents.add(second);
		
		Container third = new Container();
		third.setLayout(new GridLayout(1, 3));
		contents.add(third);
		
		balance = new JLabel("#Balance: ");
		first.add(balance);
		
		progress = new JProgressBar();
		first.add(progress);
		
		insert = new JLabel("Insert coin------------");
		second.add(insert);
		
		one = new JButton();
		one.setIcon(new ImageIcon("images/1baht.png"));
				
		five = new JButton();
		five.setIcon(new ImageIcon("images/5baht.png"));
		
		ten = new JButton();
		ten.setIcon(new ImageIcon("images/10baht.png"));
		
		third.add(one);
		third.add(five);
		third.add(ten);

		getContentPane().add(contents);
		pack();
		
	}
	
	public static void main(String[] args) {
		CoinMachineUI test = new CoinMachineUI();
		test.run();
	}

}
