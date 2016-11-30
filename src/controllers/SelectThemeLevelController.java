package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import boundary.*;
import model.*;


public class SelectThemeLevelController extends MouseAdapter {
	Application app;
    Model model;
	
	public SelectThemeLevelController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Initiate new score board and board 
		ScoreBoard scoreBoard = new ScoreBoard(5, 7, 10);
		Tile[][] tiles = new Tile[6][6];
		Board board = new Board(tiles);
		ArrayList<String> wordList = new ArrayList<String>(3);
		Theme themeLevel = new Theme(board, scoreBoard, "Colors", wordList);
		
		this.model.assignLevel(themeLevel);
		
		ThemePlayerPanel puzzleView = new ThemePlayerPanel();
		
		app.modifyFrameSize(100, 100, 750, 575);
		app.switchPanel(puzzleView);
		
		
	}
}