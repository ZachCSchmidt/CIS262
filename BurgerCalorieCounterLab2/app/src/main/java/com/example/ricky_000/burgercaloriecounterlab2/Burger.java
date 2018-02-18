package com.example.ricky_000.burgercaloriecounterlab2;

/**
 * Created by ricky_000 on 2/17/2018.
 */

public class Burger {

    /** Declare constant variables */
    static final int BEEF =100;
    static final int LAMB = 170;
    static final int OSTRICH = 150;
    static final int ASIAGO = 90;
    static final int CREME_FRAICHE = 120;
    static final int PROSCIUTTO = 115;

    /** Declare properties */
    private int _PattyCal;
    private int _CheeseCal;
    private int _ProsciuttoCal;
    private int _SauceCal;

    /** Constructor Method */
    public Burger()
    {
        _PattyCal = BEEF;
        _CheeseCal = ASIAGO;
        _ProsciuttoCal = 0;
        _SauceCal = 0;
    }

    /** Getters and Setters */
    public void setPattyCalories(int calories){
        _PattyCal = calories;
    }

    public void setCheeseCalories(int calories){
        _CheeseCal = calories;
    }

    public void setProsciuttoCalories(int calories){
        _ProsciuttoCal = calories;
    }

    public void clearProsciuttoCalories(){
        _ProsciuttoCal = 0;
    }

    public void setSauceCalories(int calories){
        _SauceCal = calories;
    }

    /** Return Method */
    public int getTotalCalories(){
        int totalCalories = _PattyCal + _CheeseCal + _ProsciuttoCal + _SauceCal;
        return totalCalories;
    }


}
