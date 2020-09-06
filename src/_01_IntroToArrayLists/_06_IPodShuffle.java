package _01_IntroToArrayLists;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements MouseListener{
	ArrayList<Song> songs = new ArrayList<Song>();
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
			Song song = new Song("demo.mp3");
			Song song2 = new Song("425556__planetronik__rock-808-beat.mp3");
			Song song4 = new Song ("479157__brokai__solo.mp3");
			/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
			run();
			songs.add(song);
			songs.add(song2);
			songs.add(song4);
		
	}
	
	JButton button = new JButton();
	JFrame frame = new JFrame();
    int frameWidth = 1000;
    int frameHeight = 1000;
	public static void main(String[] args) {
		new _06_IPodShuffle();
		
		
	}
	public void run(){
		frame.addMouseListener(this);
		frame.add(button);
		button.addMouseListener(this);
		 setPreferredSize(new Dimension(frameWidth, frameHeight));
	   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	 frame.setVisible(true);
		button.setText("Surprise Me!");
		 frame.pack();
		
	}
	private void setPreferredSize(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int r = random.nextInt(3);
		for (int i =0; i<songs.size();i++) {
			songs.get(i).stop();
		}
		songs.get(r).play();
		
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