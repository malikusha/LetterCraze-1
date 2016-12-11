package model;

import java.util.ArrayList;

public class Board {
	protected Tile[][] tiles = new Tile[6][6];
	protected Word selectedTiles;
	
	public Board(Tile[][] tiles) {
		this.tiles = tiles;
		this.selectedTiles = new Word();
	}
	
	public Board selectTile(Tile tile) {
		selectedTiles.add(tile);
		return this;
	}
	
	public Board selectTiles(ArrayList<Tile> tiles) {
		selectedTiles.addAll(tiles);
		return this;
	}
	
	public Board removeSelectedWord() {
		for(Tile tile : selectedTiles.getSelectedTiles()) {
			tiles[tile.getX()] [tile.getY()].removeLetter();
		}
		selectedTiles.clear();
		//applyGravity();
		return this;
	}
	/*
	public int applyGravity(int row, int column) throws Exception{
				
		if (tiles[row][column].predecessor != null && tiles[row][column].isEmpty()){
			return tiles[row][column].floatUp();
		}
		
		throw new Exception();
	}
	*/
	
	/** Usually call after <code>removeSelectedWord()</code> */
	public Board populateEmptyTiles() {
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				Tile tile = tiles[i][j];
				if(tile.isEmpty()) { tile.setRandLetter(); }
			}
		}
		return this;
	}

	public Tile[][] getTiles() {
		return tiles;
	}

	public Word getSelectedTiles() {
		return selectedTiles;
	}
	
	public void cleanUp() {
		for (int i=0; i < 6; i++) {
			for (int j=0; j < 6; j++) {
				tiles[i][j].removeLetter();;
			}
		}
		selectedTiles = new Word();
	}
	
	//TEMPORARY
	
	public void printBoard(){
		for (int i = 0; i < 6; i++){
			System.out.println();
			for (int j = 0; j < 6; j++){
				if(getTiles()[i][j] != null && !getTiles()[i][j].isEmpty()){
					System.out.print(getTiles()[i][j].getCharacter());
				}else{
					System.out.print("#");
				}
			}
		}
	}
	
	
	
	
}
