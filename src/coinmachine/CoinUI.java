package coinmachine;

import java.awt.*;
import javax.swing.*;

public class CoinUI extends JFrame {
	
	private JLabel coin;
	private JLabel status;
	private JTextField numCoin;
	
	private int count;
	
	public CoinUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void run() {
		setVisible(true);
		initComponent();
	}
	
	public void initComponent() {
		
		CoinMachine machine = new CoinMachine(10);
		count += machine.getCount();
		
		Container content = new Container();
		content.setLayout(new GridLayout(2, 1));
		this.add(content);
		
		Container first = new Container();
		first.setLayout(new FlowLayout());
		content.add(first);
		
		Container second = new Container();
		second.setLayout(new FlowLayout());
		content.add(second);
		
		coin = new JLabel("#Coins: ");
		first.add(coin);
		
		numCoin = new JTextField(5);
		numCoin.setText(String.valueOf(count));
		first.add(numCoin);
		
		status = new JLabel("Accepting Coins");
		status.setForeground(Color.GREEN);
		second.add(status);
		
		getContentPane().add(content);
		
		pack();
	}
	
}
