package com.jse.game;

import java.util.Random;

public class GameServiceImpl implements GameService {
	private Game[] games;
	private int count;

	public GameServiceImpl() {
		games = new Game[3];
		count = 0;
	}

	@Override
	public void add(Game game) {
		games[count] = game;
		count++;
	}

	@Override
	public Game[] getGame() {
		return games;
	}

	@Override
	public void setGame(Game[] games) {
		this.games = games;

	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}
	
	public void diceGame() {
		Random rd = new Random();
		int result = rd.nextInt(6)+1;
		String finData = "짝";
		switch(result) {
		case 1: case 3: case 5: finData = "홀"; break;
		}
			
		}
	}

