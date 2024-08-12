public class NonDuplicateElement {
    public static void main(String[] args) {
        int []arr={4,5,6,4,7,8,5};
        int len=arr.length;
        int result=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len-i+1;j++){
                if(arr[i]!=arr[j])
                   len=arr[i];
            }
        }
        System.out.println(len);
    }
}
