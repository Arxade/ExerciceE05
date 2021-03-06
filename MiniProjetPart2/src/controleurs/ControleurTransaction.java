/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;
import classes.Catalogue;
import classes.Produit;
import dao.I_ProduitDAO;
import dao.ProduitDAOFactory;
import dao.ProduitDAORel;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author diazt
 */
public class ControleurTransaction extends ControleurPrincipal{
    
    public void enregistrerAchat(String nomProduit, int qteAchete, Component laFenetre)
    {
        boolean achete = catalogue.acheterStock(nomProduit, qteAchete);
        
        if(achete)
        {
            Produit produit = dao.read(nomProduit);
            produit.setQuantiteStock(produit.getQuantite() + qteAchete);
            dao.update(produit);
            JOptionPane.showMessageDialog(laFenetre, "Produit acheté");
        }
        else
        {
            JOptionPane.showMessageDialog(laFenetre, "Achat impossible");
        }
    }
    
    public void enregistrerVente(String nomProduit, int QteVendue, Component laFenetre)
    {
        boolean vendu = catalogue.vendreStock(nomProduit, QteVendue);
        
        if(vendu)
        {
            Produit produit = dao.read(nomProduit);
            produit.setQuantiteStock(produit.getQuantite() - QteVendue);
            dao.update(produit);
            JOptionPane.showMessageDialog(laFenetre, "Produit vendu");
        }
        else
        {
            JOptionPane.showMessageDialog(laFenetre, "Vente impossible");
        }
    }
    
}
