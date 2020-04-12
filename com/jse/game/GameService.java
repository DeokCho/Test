package com.jse.game;

public interface GameService {
	public void add(Game game);
	public Game[] getGame();
	public void setGame(Game[] games);
	public int getCount();
	public void setCount(int count);
}
