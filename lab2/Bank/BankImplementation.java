public class BankImplementation implements Bank {
    private int numberOfCounters;
    private int clients = 0;
    private int occupiedCounters = 0;
    private int queue = 0;

    public BankImplementation(int numberOfCounters) {
        this.numberOfCounters = numberOfCounters;
    }

    @Override
    public void clientArrived(){
        clients++;
        if(numberOfCounters > occupiedCounters){
            occupiedCounters++;
        }else{
            queue++;
        }
    }

    @Override
    public void clientLeft(){
        if(queue > 0){
            queue--;
        }else if (occupiedCounters > 0){
            occupiedCounters--;
        }
    }

    @Override
    public int getNumberOfCounters(){
        return numberOfCounters;
    }

    @Override
    public int getOccupiedCounters(){
        return occupiedCounters;
    }

    @Override
    public int getQueueLength(){
        return queue;
    }
}