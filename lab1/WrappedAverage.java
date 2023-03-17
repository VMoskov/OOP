public class WrappedAverage {
    public static void main(String[] args) {

    }

    public static double[] wrappedAverage(double[] arr, int n){
        double arsr, sum=0;
        if(n==1){
            return null;
        }
        double[] noviarr=new double[arr.length];
        int cnt =0;
        for(int i=0;i<arr.length;i++){
            if(i<n) {
                for (int j = 0; j < n - i - 1; j++) {
                    sum += arr[arr.length - 1 - j];
                    cnt++;
                }
                for(int j=0;j<=i;j++){
                    sum+=arr[j];
                    cnt++;
                }
            }else{
                for(int j=i-n+1;j<=i;j++){
                    sum+=arr[j];
                    cnt++;
                }
            }


            arsr=sum/cnt;
            noviarr[i]=arsr;
            sum=cnt=0;
        }
        return noviarr;
    }
}
