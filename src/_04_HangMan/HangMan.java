package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import _03_IntroToStacks._02_TextUndoRedo;

public class HangMan implements KeyListener{
	public HangMan() {
	
run();
	}
	Stack<String> words = new Stack<String>();
	int life=10;
	JLabel jlabel = new JLabel();
	JFrame jframe = new JFrame();
	public static void main(String[] args) {
		new HangMan();
	
	}
	
	String us="";
	String wrd;
	public void run(){
		starG();
		jframe.add(jlabel);
		jframe.setVisible(true);
		jframe.addKeyListener(this);
		newWord();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void starG () {
	String nm =JOptionPane.showInputDialog("Enter a number.");
	int wn = Integer.parseInt(nm);
	for (int i=0;i<wn;i++) {
	String randomword = Utilities.readRandomLineFromFile("dictionary.txt");
	words.push(randomword);
	words.contains(randomword);
	}
}
public void newWord() {
	 wrd =words.pop();
		System.out.println(wrd);
		us="";
		for (int i=0;i<wrd.length();i++) {
		us=us+"_ ";
		}
		jlabel.setText(us);
		jframe.pack();
		life=10;
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letter = e.getKeyChar();
		System.out.println(letter);
		boolean foundmatch=false;
		for (int i=0;i<wrd.length();i++) {
			if (letter==wrd.charAt(i)) {
				String cc=us.substring(0,i*2)+letter+us.substring(i*2+1);
				us=cc;
				jlabel.setText(cc);
				jframe.pack();
				foundmatch=true;
				//the thing on left side is receiving the value.//
			}
		}
		
		if (foundmatch==false) {
			life--;
		}
		if (!jlabel.getText().contains("_")) {
			newWord();
				}
		
		
		if (life==0) {
			JOptionPane.showMessageDialog(null, "Game Over");
			String usec=JOptionPane.showInputDialog("Do you want to play again? Please enter YES or NO.");
			if (usec.equalsIgnoreCase("YES")) {
				starG();
				newWord();
				jframe.pack();
			}
		}
		 
	
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

