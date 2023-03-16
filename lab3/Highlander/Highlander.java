class Highlander {

    static int pArg = 0;
    static Highlander star = null;

    private int sequel;
    static int brojac = 0;


    public static Highlander callMacLeod(int argument) throws OnlyOneException {
        if(brojac == 0)
        {
            pArg = argument;
            brojac++;

            star = new Highlander(argument);
            return star;
        }
        else{
            if(pArg == argument)
            {
                return star;
            }
            else{
                throw new OnlyOneException();
            }
        }

    }

    public int getSequel() {
        return sequel;
    }

    public Highlander() throws OnlyOneException {
        throw new OnlyOneException();
    }

    private Highlander(int sequel) {
        if(sequel < 1 || sequel > 5)
            throw new WaitForItException();
        this.sequel = sequel;
    }
}