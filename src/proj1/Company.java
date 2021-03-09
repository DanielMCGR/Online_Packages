package proj1;

import java.util.ArrayList;

/**
 * The "blueprint" for the company
 */
public class Company {
    public ArrayList<Client> clients = new ArrayList<>();
    public ArrayList<Product> products = new ArrayList<>();
    public ArrayList<Package> closedPackages = new ArrayList<>();

    /**
     * Adds a client to the client list
     *
     * @param name the Client's name
     * @return false if client already exists, true if the method was able to add client
     */
    public boolean addClient(String name) {
        for(int i = 0; i< clients.size(); i++) {
            if(clients.get(i).getName().equals(name)) {
                return false;
            }
        }
        Client newClient = new Client(1+ clients.size(), name);
        clients.add(newClient);
        return true;
    }

    /**
     * Adds a product to the product list
     *
     * @param designation designation of the product
     * @param brand the product's brand
     * @return false if product already exists, true if it was added
     */
    public boolean addProduct(String designation, String brand) {
        for(int i = 0; i< products.size(); i++) {
            if(products.get(i).getDesignation().equals(designation)&& products.get(i).getBrand().equals(brand)) {
                return false;
            }
        }
        Product newProduct = new Product(100001+ products.size(), designation, brand);
        products.add(newProduct);
        return true;
    }

    /**
     * Checks if a product exists in the product list
     *
     * @param productCode the product's code
     * @return whether or not the product exists
     */
    public boolean productExists(int productCode) {
        for(int i = 0; i< products.size(); i++) {
            if(products.get(i).getProductCode()==(productCode)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a product exists in the product list
     *
     * @param clientCode the client's code
     * @return whether or not the client exists
     */
    public boolean clientExists(int clientCode) {
        for(int i = 0; i< clients.size(); i++) {
            if(clients.get(i).getClientCode()==(clientCode)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a product to a package for a certain client
     *
     * @param clientCode the client's code
     * @param productCode the product's code
     * @return false if it was unable to be added and true if successful
     */
    public boolean addProductPackage(int clientCode, int productCode) {
        if(!clientExists(clientCode)||!productExists(productCode)) {
            return false;
        }
        Client newClient = clients.get(clientCode-1);
        newClient.addPackage(productCode);
        clients.set(clientCode-1, newClient);
        return true;
    }

    /**
     * Closes the selected client's package
     *
     * @param clientCode the client's code
     * @return whether or nor the closing of the package was successful
     */
    public boolean closePackage(int clientCode) {
        if(!clientExists(clientCode)) {
            return false;
        }
        int clientID = 0;
        for(int i = 0; i< clients.size(); i++) {
            if(clients.get(i).getClientCode()==(clientCode)) {
               clientID=i;
            }
        }
        Client newClient = clients.get(clientID);
        Package closedPackage = newClient.aPackage;
        closedPackage.setPackageCode(closedPackages.size()+2000001);
        closedPackages.add(closedPackage);
        newClient.closePackage();
        return true;
    }

    /**
     * Gets the catalog (list of products) as a complete sentence
     *
     * @return the catalog as a String
     */
    public String catalogToString() {
        return "Product list: " + products.toString()+".";
    }

    /**
     * Gets the current list of clients as a complete sentence
     *
     * @return the client list as a String
     */
    public String clientsToString() {
        return "Client list: " + clients.toString()+".";
    }
}