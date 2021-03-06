package com.company;

public class Commodity {
    private int id;
    private int productCode;
    private String name;
    private int wholesalePrice;
    private int retailPrice;
    private String description;

    public Commodity(int id, int productCode, String name, int wholesalePrice, int retailPrice, String description) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRetailPrices() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }


    public String toString() {
        return "Идентификатор: " + id+ "; Код товара: " +productCode+ "; Наименование: " +name+ "; Оптовая цена: " +wholesalePrice+ "; Розничная цена: " +retailPrice+ "; Описание: " + description+".";

    }

}
