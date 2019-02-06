/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

/**
 *
 * @author Estudiante
 */
public class MutualFund extends ShareAsset{
    protected double totalShares;

    public MutualFund(double totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }

    
    @Override
    public double getMarketValue() {
        return this.totalCost* this.currentPrice;
    }

    @Override
    public double getProfit() {
         return (this.totalShares* this.currentPrice)-this.totalCost;
    }
    
}
