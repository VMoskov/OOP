class Product<T, V extends Number> {
    private T id;
    private V price;

    public Product(T id, V price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        char[] ajdi = id.toString().toCharArray();
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<ajdi.length;i++){
            if(i==ajdi.length-1){
                sb.append(ajdi[i]);
            }
            else{
                sb.append(ajdi[i]);
                sb.append("-");
            }
        }
        return sb.toString();
    }


    public void setId(T newid){
        if(newid.toString().equals(id.toString())){
            throw new IllegalArgumentException("Id " + id + " is the same.");
        }
        else {
            this.id = newid;
        }
    }

    public String getFirstNDigitsOfPrice(int nDigits){
        String cijena =price.toString();
        if(cijena.contains(".")){
            cijena=cijena.substring(0,cijena.lastIndexOf("."));
        }
        if(nDigits>cijena.length()){
            return cijena;
        }
        else{
            return cijena.substring(0,nDigits);
        }
    }
}