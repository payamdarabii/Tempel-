class Logger1 implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Logged:" + message);
    }
}