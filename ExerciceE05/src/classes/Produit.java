/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author diazt
 */
public class Produit implements I_Produit {

    private int quantiteStock;
    private String nom;
    private double prixUnitaireHT;
    static private double tauxTVA = 0.2;
            
    public Produit() {
        
    }

    public Produit(int quantiteStock, String nom, double prixUnitaireHT) {
        this.quantiteStock = quantiteStock;
        this.nom = nom;
        this.prixUnitaireHT = prixUnitaireHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaireHT() {
        return prixUnitaireHT;
    }

    public void setPrixUnitaireHT(double prixUnitaireHT) {
        this.prixUnitaireHT = prixUnitaireHT;
    }

    public static double getTauxTVA() {
        return tauxTVA;
    }

    public static void setTauxTVA(double tauxTVA) {
        Produit.tauxTVA = tauxTVA;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ajouter(int qteAchetee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enlever(int qteVendue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getQuantite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrixUnitaireTTC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrixStockTTC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
