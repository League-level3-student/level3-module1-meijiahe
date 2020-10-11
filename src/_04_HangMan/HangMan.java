package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import _03_IntroToStacks._02_TextUndoRedo;

public class HangMan{
	public HangMan() {
	
run();
	}
	Stack<String> words = new Stack<String>();
	JLabel jlabel = new JLabel();
	JFrame jframe = new JFrame();
	public static void main(String[] args) {
		new HangMan();
	
	}
	
	
	public void run(){
		String nm =JOptionPane.showInputDialog("Enter a number.");
		int wn = Integer.parseInt(nm);
		for (int i=0;i<wn;i++) {
		String randomword = Utilities.readRandomLineFromFile("dictionary.txt");
		words.push(randomword);
		}
	String wrd =words.pop();
	System.out.println(wrd);
	String us="";
	for (int i=0;i<wrd.length();i++) {
	us=us+"_ ";
	}
		jframe.add(jlabel);
		jframe.setVisible(true);
		jlabel.setText(us);
		jframe.pack();
	}

}

