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
        int max = this.arr[this.done];
        int min_index = this.done;
        int max_index = this.done;

        for (int i = this.done; i < this.arr.length - this.done; i++){
            if(min > this.arr[i]){
                min = this.arr[i];
                min_index = i;
            }
            if(max < this.arr[i]){
                max = this.arr[i];
                max_index = i;
            }
        }

        if (max_index == this.done && min_index == this.arr.length - (1 + this.done)){

            int temp = this.arr[max_index];
            this.arr[max_index] = this.arr[min_index];
            this.arr[min_index] = temp;

        } else if (max_index == this.done){

            int temp1 = this.arr[this.arr.length - (1 + this.done)];
            this.arr[this.arr.length - (1 + this.done)] = this.arr[max_index];
            this.arr[max_index] = temp1;

            int temp2 = this.arr[max_index];
            this.arr[max_index] = this.arr[min_index];
            this.arr[min_index] = temp2;

        } else{

            int temp2 = this.arr[this.done];
            this.arr[this.done] = this.arr[min_index];
            this.arr[min_index] = temp2;

            int temp1 = this.arr[this.arr.length - (1 + this.done)];
            this.arr[this.arr.length - (1 + this.done)] = this.arr[max_index];
            this.arr[max_index] = temp1;

        }

        this.done++;
    }

    public void setArray(int[] arr){
        this.arr = arr;
        this.done = 0;
    }

    public boolean isFinish(){
        return (this.arr.length / 2) <= this.done;
    }

    public int[] getArray(){
        return this.arr;
    }
}