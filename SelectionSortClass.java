public class SelectionSortClass {

    int[] array;

    public SelectionSortClass(int[] inputArray){
        this.array = inputArray;
    }

    public int[] sort(){
        int[] outputArray = this.array;
        for(int i = 1; i < outputArray.length; i++){
            if(outputArray[i] < outputArray[i-1]){
                int temp = outputArray[i];
                outputArray[i] = outputArray[i-1];
                outputArray[i-1] = temp;
                for(int j = i; j > 0; j--){
                    if(outputArray[j] < outputArray[j-1]){
                        int temp2 = outputArray[j];
                        outputArray[j] = outputArray[j-1];
                        outputArray[j-1] = temp;
                    } 
                }
            }
        }
        return outputArray;
    }

    public void printArray(){
        for(int i : this.array){
            System.out.println(i + ", ");
        }
        System.out.println();
    }

}
