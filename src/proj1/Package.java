package proj1;

import java.util.ArrayList;

/**
 * The "blueprint" for the package
 */
public class Package {
    private int packageCode;
    public enum status {
        OPENED,
        CLOSED
    }
    private status status;
    private ArrayList<Integer> products = new ArrayList<Integer>();

    /**
     * Default constructor for the class
     */
    public Package() {
        this.packageCode = 0;
        this.status = status.OPENED;
    }

    /**
     * Gets the current package status (OPENED or CLOSED)
     *
     * @return the status
     */
    public status getStatus() {
        return this.status;
    }

    /**
     * Defines the current status of the package
     *
     * @param status either OPENED or CLOSED
     */
    public void setStatus(status status) {
        this.status = status;
    }

    /**
     * Defines the current package's code
     *
     * @param packageCode the code
     */
    public void setPackageCode(int packageCode) {
        this.packageCode = packageCode;
    }

    /**
     * Adds a product to the package
     *
     * @param productCode the product's code
     * @return whether or not the product was added
     */
    public boolean addProduct(int productCode) {
        this.products.add(productCode);
        return true;
    }
    public String toString() {
        return "Products: "+ products.toString();
    }
}
