class oddeven {
    public int[] oddeven(int[] arr){
        int countodd=0;
        int counteven=0;
    
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                counteven++;
            } else{
                countodd++;
            }
        }
        return new int[]{counteven, countodd};
    
    }



    public static void main(String args[]){
        int[] arr={2,2,2,5,5};
         oddeven obj = new oddeven();
        int[] result = obj.oddeven(arr);

        System.out.println("Even count: " + result[0]);
        System.out.println("Odd count: " + result[1]);
    }
}