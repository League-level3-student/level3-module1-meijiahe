package _06_Intro_To_Hash_Maps;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements MouseListener {
	
	public _02_LogSearch () {
		run();
	}
	
	HashMap <Integer, String> logs = new HashMap <Integer, String> ();
	JFrame frame = new JFrame();
	JButton entryb = new JButton();
	JButton idb = new JButton();
	JButton viewb = new JButton();
	JButton renb = new JButton();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		new _02_LogSearch ();
	}
	
	public void run(){
		frame.addMouseListener(this);
		panel.add(entryb);
		panel.add(idb);
		panel.add(renb);
		panel.add(viewb);
		panel.add(label);
		frame.add(panel);
		entryb.addMouseListener(this);
		idb.addMouseListener(this);
		renb.addMouseListener(this);
		viewb.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == entryb) {
			String idn = JOptionPane.showInputDialog(null, "Enter your ID number.");
			String name = JOptionPane.showInputDialog(null,"Enter your name please.");
			int idnn = Integer.parseInt(idn);
			logs.put(idnn, name);
		}
		
		if (e.getSource()==idb) {
			String check = JOptionPane.showInputDialog(null, "Enter ID Number.");
			int cck = Integer.parseInt(check);
			if (logs.get(cck)!= null) {
				JOptionPane.showMessageDialog(null,"ID: "+ cck + " Name: " + logs.get(cck)+"");
			}
			else {
				JOptionPane.showInputDialog(null, "Not exist.");
			}
		}
		
		if (e.getSource()==viewb) {
			String message="";
			for (int key:logs.keySet()) {
				message+="ID: "+ key + " Name: " + logs.get(key)+"\n";
			}
			JOptionPane.showMessageDialog(null, message);
		}
		
		if (e.getSource()==renb) {
			String re = JOptionPane.showInputDialog(null, "ENTER UR ID");
			int rr = Integer.parseInt(re);
			if (logs.get(rr)!= null) {
				logs.put(rr, null);
			}
			else { 
				JOptionPane.showInputDialog(null, "ID is not in the list. ");
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
