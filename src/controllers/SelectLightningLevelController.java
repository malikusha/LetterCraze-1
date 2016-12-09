package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.*;
import model.*;


public class SelectLightningLevelController extends MouseAdapter {
	Application app;
    Model model;
    int level;
	
	public SelectLightningLevelController(Application a, Model m, int lvl) {
		this.app = a;
		this.model = m;
		this.level = lvl;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Initiate new score board and board 
		ScoreBoard scoreBoard = new ScoreBoard(5, 7, 10);
		Tile[][] tiles = new Tile[6][6];
		Board board = new Board(tiles);
		
		// Initiate new Lightning builder and lightning view
		Lightning lightningLevel = new Lightning(this.level, board, scoreBoard, 100);
		
		// Assign lightning builder status to model
		this.model.assignLevel(lightningLevel);
		
		// Initiate new lightning view
		LightningPlayerPanel lightningView = new LightningPlayerPanel(app, model, level);
		
		// We want to call some method on current application that will switch to just created 
		// lightning view
		app.modifyFrameSize(100, 100, 680, 555);
		app.switchPanel(lightningView);
		
		
	}
}
