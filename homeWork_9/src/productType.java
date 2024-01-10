public enum productType {
    FRUIT("Owoc", 0.08),
    VEGETABLE("Warzywo", 0.08),
    OTHER("Inny", 0.23);

    private String nameInPolish;
    private double vat;

    private productType(String nameInPolish, double vat) {
        this.nameInPolish = nameInPolish;
        this.vat = vat;
    }
    public String getNameInPolish() {
        return nameInPolish;
    }

    public double getVat() {
        return vat;
    }
}