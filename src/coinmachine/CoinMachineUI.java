package coinmachine;

import java.awt.*;
import java.net.URL;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class CoinMachineUI extends JFrame {
	
	private JButton one;
	private JButton five;
	private JButton ten;
	
	private JLabel balance;
	private JLabel insert;
	
	private JProgressBar progress;
	
	private  TitledBorder insertBorder;
	
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
		
		balance = new JLabel("#Balance: ");
		first.add(balance);
		
		progress = new JProgressBar();
		first.add(progress);
	
		contents.add(second);
		
		ClassLoader loader1 = this.getClass().getClassLoader();
		URL url1 = loader1.getResource("images/1baht.png");
		ImageIcon image1 = new ImageIcon(url1);
		one = new JButton(image1);
		second.add(one);
		
		ClassLoader loader5 = this.getClass().getClassLoader();
		URL url5 = loader5.getResource("images/5baht.png");
		ImageIcon image5 = new ImageIcon(url5);
		five = new JButton(image5);
		second.add(five);
		
		ClassLoader loader10 = this.getClass().getClassLoader();
		URL url10 = loader10.getResource("images/10baht.png");
		ImageIcon image10 = new ImageIcon(url10);
		ten = new JButton(image10);
		second.add(ten);
		
//		ClassLoader test = this.getClass().getClassLoader();
//		URL url = test.getResource("images/1baht.png");
//		ImageIcon image = new ImageIcon(url);
//		JLabel a = new JLabel("image");
//		contents.add(a);
		
		getContentPane().add(contents);
		pack();
		
	}
	
	public static void main(String[] args) {
		CoinMachineUI test = new CoinMachineUI();
		test.run();
	}

}
