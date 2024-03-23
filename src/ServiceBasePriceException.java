/* **********************************
File:       ServiceBasePriceException Definition
Author:     Vaidehi Garge
Date:       22 March 2024
Purpose:    Custom exception for invalid service base price
************************************* */

public class ServiceBasePriceException extends Exception {

    // exception code
    private static final long serialVersionUID = 3L;

    public ServiceBasePriceException(String message) {
        super(message);
    }
}