package proj1;

/**
 * The "blueprint" for the product
 */
public class Product {
    private int productCode;
    private String designation;
    private String brand;

    /**
     * Default constructor for the Product class
     *
     * @param productCode the product's code
     * @param designation the product's designation
     * @param brand the product's brand
     */
    public Product(int productCode, String designation, String brand) {
        this.productCode = productCode;
        this.designation = designation;
        this.brand = brand;
    }

    /**
     * Gets the product's code
     *
     * @return the product's code
     */
    public int getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the product's designation
     *
     * @return the product's designation
     */
    public String getDesignation() {
        return this.designation;
    }

    /**
     * Gets the product's brand
     *
     * @return the product's brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Gets the product as a complete String
     *
     * @return the product as a String
     */
    public String toString() {
        return "Product nº " + this.productCode + ", Brand: " + this.brand + ", Designation: " + this.designation;
    }
}
