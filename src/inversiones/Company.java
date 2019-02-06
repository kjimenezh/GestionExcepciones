/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Company {
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Client> clients;

    public Company(String name) {
        this.name = name;
        this.assets = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    public boolean addClient(int id, String name, String lastName, String email){
       //Implementar la asignacion
        return false;
    }
    
    public boolean addCash(double amount){
        //Realizar la asignacion
        return false;
      
    }
    public boolean addStock(int totalShares, String symbol, double totalCost, double currentPrice){
        //Realizar la asignacion
        return false;
    }
    
    //...Otros metodos para adicinar activos
    public double getAllMarketValue(){
        double marketValue = 0;
        for (Client client : clients.values()) {
            for (Asset asset : client.getAssets()) {
                if (asset != null)
                   marketValue+=asset.getMarketValue();
            }
        }
      return marketValue;  
    }
    
    public double getAllProfit(){
      return 0;
    }
    
    public HashMap<String, Double> getMarketValueByRange(){
      return null;
    }
    
    public Client getMaxProfit(){
      return null;
    }
    
    public HashMap<Client,Double> getClientWithMarketValue(){
      return null;
    }
}
