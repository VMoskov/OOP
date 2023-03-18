public interface Bank {
    public void clientArrived();
    public void clientLeft();
    public int getNumberOfCounters();
    public int getOccupiedCounters();
    public int getQueueLength();
}