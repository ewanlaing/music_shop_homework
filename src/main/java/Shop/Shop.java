package Shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }

    public double calculateTotalPotentialProfit(){
        double total = 0;
        ArrayList<ISell> stock = this.getStock();
        for(int i = 0; i < stock.size(); i++){
            double currentMarkup = stock.get(i).calculateMarkup();
            total += currentMarkup;
        }
        return total;
    }
}
