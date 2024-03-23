/* **********************************
File:       ServiceTimeRequiredException Definition
Author:     Vaidehi Garge
Date:       22 March 2024
Purpose:    Custom exception for invalid service time required
************************************* */

public class ServiceTimeRequiredException extends Exception {

    // exception code
    private static final long serialVersionUID = 4L;

    public ServiceTimeRequiredException(String message) {
        super(message);
    }
}