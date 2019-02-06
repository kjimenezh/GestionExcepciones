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
public class DividendStock extends Stock{
    protected double dividents;

    public DividendStock(double dividents, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividents = dividents;
    }
    
    
    @Override
    public double getMarketValue() {
        return (this.totalCost* this.currentPrice)+this.dividents;
    }

}
