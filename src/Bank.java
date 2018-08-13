//


//class Bank
//{
//    public void deposit(int amount) {
//        Logger1 log = new Logger1();
//        log.logMessage("Deposited " + amount + " Sek");
//        System.out.println("Deposited " + amount + " Sek");
//    }
//}


//
//class Bank
//{
//    public void deposit(int amount) {
//        Logger1 log = new Logger1();
//        log.logMessage("Deposited " + amount + " Sek");
//        System.out.println("Deposited " + amount + " Sek");
//    }
//
//    public void deposit(int amount, boolean logToDB) {
//        if(logToDB) {
//            DBLogger log = new DBLogger();
//            log.logMessage("Deposited " + amount + " Sek");
//        }
//        else
//        {
//            Logger1 log = new Logger1();
//            log.logMessage("Deposited " + amount + " Sek");
//        }
//        System.out.println("Deposited " + amount + " Sek");
//    }
//}

//
//class Bank {
//    private Logger1 logger;
//    private DBLogger dblogger;
//
//    public Bank(Logger1 logger, DBLogger dblogger) {
//        this.logger = logger;
//        this.dblogger = dblogger;
//    }
//
//    public void deposit(int amount) {
//        if (logger != null) {
//            logger.logMessage("Deposited " + amount + " Sek");
//        }
//        if (dblogger != null) {
//            dblogger.logMessage("Deposited " + amount + " Sek");
//        }
//
//        System.out.println("Deposited " + amount + " Sek");
//    }
//}


class Bank {
    private Logger logger;

    public Bank(Logger logger) {
        this.logger = logger;
    }

    public void deposit(int amount) {
        logger.logMessage("Deposited " + amount + " Sek");
        System.out.println("Deposited " + amount + " Sek");
    }
}