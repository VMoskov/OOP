class XO extends XOInterface {
    private int[] fields;
    private int currentPlayer;

    public XO() {
        this.currentPlayer = 0;
        this.fields = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        this.turn = 0;
    }

    public void start() {
        if (currentPlayer != 0)
            throw new XOException("Game already started");

        currentPlayer = 1;
    }

    public void stop() {
        if (currentPlayer == 0)
            throw new XOException("Game already stopped");

        currentPlayer = 0;
        resetFields();
    }

    private int turn;

    public boolean play(int field) {
        if (field < 0 || field > 8)
            throw new XOException("Invalid field");
        if (fields[field] != 0)
            throw new XOException("Field already taken");
        if (currentPlayer == 0)
            throw new XOException("Game not started");

        boolean done = setField(field, this.currentPlayer);

        if (done) {
            this.stop();
            return true;
        } else {
            if (turn == 8)
                return false;
            else {
                this.currentPlayer = (this.currentPlayer == 1) ? 2 : 1;
                turn++;
                return false;
            }
        }
    }

}