package com.jse.card;

import javax.swing.JOptionPane;

import com.jse.util.Constants;

public class CardController {
	public static void main(String[] args) {
		CardService cardService = new CardServiceImpl();
		Card card = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] playerCard = JOptionPane.showInputDialog(Constants.CARD_START).split(",");
					card = new Card();
					card.setKind(playerCard[0]);
					card.setNumber(Integer.parseInt(playerCard[1]));
					cardService.add(card);
				}break;
			case "2":
				JOptionPane.showMessageDialog(null, cardService.getCards());
				break;
			}

		}
	}
}
