package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int[row][column];
		
		posX = 0;
		posY = 0;
		map[posX][posY] = 2;
		
		generateTreasure();
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random() * map.length);
		treasureY = (int)(Math.random() * map[0].length); 
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		int x = posX;
		int y = posY;
		
		if(x >= map.length || y >= map[0].length){
			return false;
		}
		
		if(m == 1){
			x = x - 1;
		}
		else if (m == 2){
			x = x + 1;
		}
		else if (m == 3){
			y = y - 1;
		}
		else if (m == 4){
			y = y + 1;
		}
		else if (m == 5){
			x = x - 1;
			y = y - 1;
		}
		else if (m == 6){
			x = x - 1;
			y = y + 1;
		}
		else if (m == 7){
			x = x + 1;
			y = y - 1;
		}
		else if (m == 8){
			x = x + 1;
			y = y + 1;
		}
		else{
			return false;
		}
		
		
		if(map[x][y] == 2){
			map[x][y] = 0;
		}
		else if (map[x][y] == 1){
			map[x][y] = 3;
		}
		
		if(map[x][y] == 0){
			map[x][y] = 2;
		}
		else if (map[x][y] == 3){
			map[x][y] = 1;
		}
		
		
		if(x >= map.length || y >= map[0].length){
			return false;
		}
		
		return true;
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if(row >= map.length || col >= map[0].length){
			return false;
		}
		
		if(map[posX][posY] == 2){
			map[posX][posY] = 0;
		}
		else if (map[posX][posY] == 1){
			map[posX][posY] = 3;
		}
		
		if(map[row][col] == 0){
			map[row][col] = 2;
		}
		else if (map[row][col] == 3){
			map[row][col] = 1;
		}
		
		posX = row;
		posY = col;
		
		return true;
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if(posX == treasureX && posY == treasureY){
			return true;
		}
		
		if(map[posX][posY] == 0){
			map[posX][posY] = 1;
		}
		else if(map[posX][posY] == 2){
			map[posX][posY] = 3;
		}
		return false;	// Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		map[treasureX][treasureY] = 7;
		System.out.println("The treasure was at " + treasureX + "," + treasureY);
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		for(int r = 0; r < map.length; r++){
			for(int c = 0; c < map[r].length; c++){
				System.out.print(map[r][c] + " ");
			}
			System.out.println(" ");
		}
	}

}
