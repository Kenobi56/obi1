package com.tactfactory.pub;

import java.util.List;

/**
 * Pour chaque question, faire l'UML, puis l'implémentation en Java.
 *
 * 1) Nous allons gérer un pub. Notre pub vends des victuailles : bouffe +
 * breuvages. Chaque produit vendu a : un nom, un prix HT/TCC, une description,
 * si c'est alcolisé ou non.
 *
 * 2) Nous avons eu des soucis avec la communauté végane, ils veulent savoir si
 * les différents produit contiennent de la viande.
 *
 * 3) Nous allons faire un programme qui initialise nos données avec plusieurs
 * boissons et nourritures
 *
 * 4) Nous mettons à disposition 3 flippers, 2 billard français, 1 jeux de
 * flêchettes L'accès au flipper coûte 1 €, billard => 5 €, flêchettes =>
 * gratuit
 *
 * 5) Nous allons gérer nos stocks de produits ainsi que les factures des
 * clients. Nous initialiserons nos stocks, nos clients ainsi que quelques
 * commandes
 *
 * 6) En fait, les véganes n'ont pas des soucis qu'avec la viande. Qui aurait pu
 * deviner ? Afin d'éviter d'autres soucis, et gérer en même temps les
 * allergies/régimes/... nous concerverrons la liste précise des ingrédients de
 * nos produits.
 *
 * 7) Faire un affichage "sympas" du menu avec prix ingrédients, ...
 *
 * 8) Nous vendons maintenant des menus snacks avec un produit de nourriture
 * et au moins une boisson.
 * Faire les modifications si nécessaires, et ajouter des commandes de snacks.
 *
 * 9) Nous lancerons désormais une exception si un client tente d'acheter
 * un produit dont on n'a plus de stock.
 *
 * 10) Ajouter une methode avec la signature suivante :
 * public void delivery(HashMap<Product, Integer> products)
 * qui permet d'ajouter des produit dans nos stocks
 *
 */
public class Application {

    public static void main(String[] args) {
        q5();
        List<Product> products=Pub.createProducts();
        afficherMenu(products);
    }

    private static void q5() {
        Pub pub = new Pub();

        Bill jules = new Bill();

        try {
            jules.addProduct(pub.getProduct("Monaco"), 1);
            jules.addProduct(pub.getProduct("Saucisson"), 2);
        } catch (Exception e) {
            System.out.println("Pas de bol");
        }

        System.out.println("Jules doit payer " + jules.computeAmount() + " �");

        pub.addBill(jules);
    }

    private static void q4() {
        List<Product> products = Pub.createProducts();
        List<Game> games = Pub.createGames();

        printAll(products);
        printAll(games);
    }

    private static void printAll(List<?> collection) {
        for (Object instance : collection) {
            // if (product.getClass().getName().equals(Drink.class.getName()))

            // if (product instanceof Drink) {
            // System.out.println("drink drink");
            // } else {
            // System.out.println("bouffie");
            // }
            System.out.println(instance);
            System.out.println();
     
        }
    }
    
    private static void afficherMenu(List<Product> products) {
    	for (Product product:products) {
    		System.out.println(product);
    	}
    }
}
