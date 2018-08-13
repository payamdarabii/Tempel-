public class XMLLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("XMLLogged:" + message);
    }
}
