public class RevArray{
    void Reverse(int[] arr, int n){
            if(n<=arr.length/2){
                return;
            }

            int i=arr.length -n;

            int temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;

            Reverse(arr, n-1);
    }
}
class RevMain{
public static void main(String[] args){
    int[] arr={1,2,3,5,5};
    RevArray obj= new RevArray();
    obj.Reverse(arr,arr.length);

    for(int num:arr){
        System.out.print(num+" ");
    }
}
}

