package com.jse.game;

import javax.swing.JOptionPane;

import com.jse.util.Constants;

public class GameController {
	public static void main(String[] args) {
		GameService gameService = new GameServiceImpl();
		Game game = null;
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.GAME_MENU)){
			case "0": return;
			case"1": 
				game = new Game();
				String pDice[] = JOptionPane.showInputDialog(Constants.GAME_DICE).split(",");
				game.setPlayerString(pDice[0]);
				game.setPlayerNumber(Integer.parseInt(pDice[1]));
				gameService.add(game);
				break;
			}
		}
	}
}
