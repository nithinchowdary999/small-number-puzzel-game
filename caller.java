# small-number-puzzel-game
A small game with numbers



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class caller {
	
	
	public static void main(String[]  args) {
		X obj = new X();
		
	}

}


class X extends JFrame{
	
	public X() {
		
		
		super("welcome to puzzle game");
		JButton e = new JButton(" Easy");
		
		e.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				game g = new game();
				
				dispose();
				
			}
		});
		
		
		
JButton m = new JButton(" Medium");
		
		m.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent m) {
				game4 g4 = new game4();
				
				dispose();
				
			}
		});
		
		
		
JButton h = new JButton(" Hard");
		
		h.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent h) {
				game5 g5 = new game5();
				
				dispose();
				
			}
		});
		
		
		
		
		add(e);
		
		add(m);
		
		add(h);
		setLayout(new FlowLayout());
		setVisible(true);
		
		setSize(400,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		   
	}
	
	

	
	
	
	
} 
