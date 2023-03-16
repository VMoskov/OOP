class Friends extends Couple<String> {
    public Friends(String prvi,String drugi) {
        super(prvi,drugi);
    }
    public static boolean friendOfAFriend(Couple<String> f1,Couple<String> f2){
        if(f1.getElement(1).equals(f2.getElement(1)) || f1.getElement(1).equals(f2.getElement(2))) {
            return true;
        }
        if(f1.getElement(2).equals(f2.getElement(1)) || f1.getElement(2).equals(f2.getElement(2))) {
            return true;
        } else {
            return false;
        }
    }
}