package com.iut.produit;

abstract  class AbstractProduct {

    private String prName;
    private double prCost;

    protected AbstractProduct(String name, double cost) {
        this.prName = name;
        this.prCost = cost;
    }

    public double getCost() {
        return prCost;
    }

    public double calculatePrice() {
        // Exception non gérée (division par zéro)
        return prCost / 0;
    }

}
