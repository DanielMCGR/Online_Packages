package proj1;

/**
 * The "blueprint" for the client
 */
public class Client {
    private int clientCode;
    private String name;
    public Package aPackage;

    /**
     * Default constructor for the Client class
     *
     * @param clientCode the client's code
     * @param name the client's name
     */
    public Client(int clientCode, String name) {
        this.clientCode =clientCode;
        this.name = name;
    }

    /**
     * Gets the client's code
     *
     * @return the client's code
     */
    public int getClientCode() {
        return this.clientCode;
    }

    /**
     * Gets the client's name
     *
     * @return the client's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Adds a product to the client's current package (or creates a new package)
     *
     * @param productCode the product's code
     * @return whether or not the product was successfully added
     */
    public boolean addPackage(int productCode) {
        if(aPackage ==(null)||aPackage.getStatus().equals(Package.status.CLOSED)) {
            aPackage =new Package();
        }
        aPackage.addProduct(productCode);
        return true;
    }

    /**
     * Sets the status of the current package as CLOSED
     *
     * @return whether or not the package was successfully closed
     */
    public boolean closePackage() {
        aPackage.setStatus(Package.status.CLOSED);
        aPackage = new Package();
        return true;
    }

    /**
     * Gets the client's information and current package as a complete String
     *
     * @return information about the Client
     */
    public String toString() {
        return "Client Nº "+ clientCode +", Name: "+ name +", with an order of the products: "+ aPackage;
    }
}
