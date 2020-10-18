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
		String nm =JOptionPane.showInputDialog("Enter a number.");
		int wn = Integer.parseInt(nm);
		for (int i=0;i<wn;i++) {
		String randomword = Utilities.readRandomLineFromFile("dictionary.txt");
		words.push(randomword);
		words.contains(randomword);
		}
	 wrd =words.pop();
	System.out.println(wrd);
	
	for (int i=0;i<wrd.length();i++) {
	us=us+"_ ";
	}
		jframe.add(jlabel);
		jframe.setVisible(true);
		jlabel.setText(us);
		jframe.pack();
		jframe.addKeyListener(this);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letter = e.getKeyChar();
		boolean foundmatch=false;
		for (int i=0;i<wrd.length();i++) {
			if (letter==wrd.charAt(i)) {
				String cc=us.substring(0,i*2)+letter+us.substring(i*2+1);
				us=cc;
				foundmatch=true;
				//the thing on left side is receiving the value.//
			}
		}
		if (foundmatch==false) {
			life--;
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

