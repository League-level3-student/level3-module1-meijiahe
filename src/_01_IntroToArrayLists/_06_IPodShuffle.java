package _01_IntroToArrayLists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements MouseListener{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
			Song song = new Song("demo.mp3");
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	ArrayList<Song> songs = new ArrayList<Song>();
	JButton button = new JButton();
	public static void main(String[] args) {
		new _06_IPodShuffle();
		
	}
	void run(){
		button.setText("Surprise Me!");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
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