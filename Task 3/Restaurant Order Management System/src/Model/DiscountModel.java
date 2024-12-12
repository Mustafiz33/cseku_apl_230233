package model;

public class DiscountModel {
    private String discountType;
    private double discountValue;

    public DiscountModel(String discountType, double discountValue) {
        this.discountType = discountType;
        this.discountValue = discountValue;
    }


    public double applyDiscount(double totalAmount) {
        return totalAmount - (totalAmount * discountValue / 100);
    }


    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }
}
