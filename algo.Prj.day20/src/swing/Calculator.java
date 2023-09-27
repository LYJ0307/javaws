package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator extends JFrame implements ActionListener{
	
	private JLabel lblNum;
	private JButton btnone;
	private JButton btntwo;
	private JButton btnthree;
	private JButton btnfour;
	private JButton btnfive;
	private JButton btnsix;
	private JButton btnseven;
	private JButton btneight;
	private JButton btnnine;
	
	private JButton btnplus;
	private JButton btnminus;
	private JButton btnmulti;
	private JButton btndivide;
	
	
	
	private void init() {
		lblNum = new JLabel();
	}
	
	
	private void setDisply() {
		btnplus.addActionListener(this);
		btnminus.addActionListener(this);
		btnmulti.addActionListener(this);
		btndivide.addActionListener(this);
	}
	
	
	private void showFrame() {
		setTitle("Calculator");
		setSize(500,500);
	}

		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

