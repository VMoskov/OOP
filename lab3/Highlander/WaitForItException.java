class WaitForItException extends RuntimeException{
    public WaitForItException() {
        super("Budget loading...");
    }
}