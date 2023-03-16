class DataProcessor {

    public static int process() {
        int umnozak = 1;
        for (int i = 0; i < DataSource.size(); i++) {
            Integer next = null;
            try {
                next = DataSource.getNextNumber();
                try {
                    Integer processedNext = DataProcessUtil.processOneNumber(next);
                    umnozak *= processedNext;
                } catch (Exception e) {
                    umnozak*=DataProcessUtil.handleException(e, next);
                }
            } catch (Exception e) {

            }
        }
        return umnozak;
    }
}