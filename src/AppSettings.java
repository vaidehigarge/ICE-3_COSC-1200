/* **********************************
File:       Main Class for Application Settings
Author:     Clint MacDonald
Date:       March 2024
Purpose:    To store static versions of application settings
            we will load these from a file on a later date!
************************************* */
import java.time.LocalDate;

public class AppSettings {

    //<editor-fold desc="Application Attributes">
    public static final String APP_AUTHOR = "Clint MacDonald";
    public static final LocalDate APP_VERSION_DATE = LocalDate.of(2024, 3, 18);
    //</editor-fold>

    //<editor-fold desc="Runtime Settings and Configuration">

    //<editor-fold desc="Services Settings">
    public static class Service {
        public static final int SERVICE_CODE_LENGTH = 4;
        public static final double MIN_BASE_PRICE = 0f;
        public static final double MAX_BASE_PRICE = 5000f;

        public static final String DEFAULT_SERVICE_CODE = "";
        public static final String DEFAULT_NAME = "";
        public static final String DEFAULT_DESCRIPTION = "";
        public static final double DEFAULT_BASE_PRICE = 0f;
        public static final double DEFAULT_TIME_REQUIRED = 0f;
        public static final boolean DEFAULT_IS_ACTIVE = false;
    }
    //</editor-fold>

    //<editor-fold desc="Car Settings">
    public static class Car {
        public static final int DEFAULT_YEAR = 0;
        public static final String DEFAULT_MAKE = "";
        public static final String DEFAULT_MODEL = "";
        public static final String DEFAULT_TRIM = "";
        public static final String DEFAULT_COLOR = "";
        public static final String DEFAULT_OWNER = "";

    }
    //</editor-fold>

    //<editor-fold desc="Maintenance Settings">
    public static class Maintenance {
            // Default maintenance attributes
            public static final int DEFAULT_INVOICE_ID = 0;
            public static final int DEFAULT_CAR_VIN = 0;
            public static final String DEFAULT_SERVICE_CODE = "";
            public static final double DEFAULT_PRICE = 0.0;
            public static final LocalDate DEFAULT_DATE = LocalDate.now();
            public static final String DEFAULT_NOTES = "";
    }
    //</editor-fold>

    //</editor-fold>
    // In the AppSettings class
    public static class Car {
        public static final int MIN_YEAR = 1890;
        public static final int MAX_YEAR = Calendar.getInstance().get(Calendar.YEAR) + 1;
    }

// In the Car class (setDefaults method)
this.year = AppSettings.Car.MAX_YEAR;


}