package fr.pizzeria.ihm;

import java.util.Map;

import com.github.lalyos.jfiglet.FigletFont;

public class Menu {
	
	private Map<Integer,OptionMenu> actions;

	public void afficher() {
		
		
		String asciiArt = FigletFont.convertOneLine("PIZZA APP");
	    System.out.println(asciiArt);
	    
		System.out.println("\n***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza ");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir\n");
	}
	
	
	public Map<Integer,OptionMenu> getActions() {
		return actions;
	}

	public void setActions(Map<Integer,OptionMenu> actions) {
		this.actions = actions;
	}
}
