public class SelectionSort{

    private int[] arr;
    private int done;

    public SelectionSort(int[] arr){
        this.arr = arr;
        this.done = 0;
    }

    public SelectionSort(){
        this.done = 0;
    }

    public void update(){
        int min = this.arr[this.done];
        int min_index = this.arr[this.done];

        for (int i = this.done + 1; i < this.arr.length; i++){
            if(min > this.arr[i]){
                min = this.arr[i];
                min_index = i;
            }
        }

        int temp = this.arr[this.done];
        this.arr[this.done] = this.arr[min_index];
        this.arr[min_index] = temp;

        this.done++;
    }

    public void setArray(int[] arr){
        this.arr = arr;
        this.done = 0;
    }

    public boolean isFinish(){
        return this.done > this.arr.length - 1;
    }

    public int[] getArray(){
        return this.arr;
    }
}