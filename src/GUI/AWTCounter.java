package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCounter extends Frame implements ActionListener{
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	public AWTCounter() {
		setLayout(new FlowLayout());
		lblCount = new Label("Counter"); add(lblCount);
		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false); add(tfCount);
		btnCount = new Button("Count"); add(btnCount);
		btnCount.addActionListener(this);
		setTitle("AWT Counter");
		setSize(250, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		AWTCounter app = new AWTCounter();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		++count;
		tfCount.setText(count +" ");
	}
	
}
