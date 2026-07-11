public class BubbleSort{

    private int[] arr;
    private int done;
    private int i;

    public BubbleSort(int[] arr){
        this.arr = arr;
        this.done = 1;
        this.i = 0;
    }

    public BubbleSort(){
        this.done = 1;
        this.i = 0;
    }

    public void update(){
        int temp;
        if (this.arr[this.i] > this.arr[this.i + 1]){
            temp = this.arr[this.i];
            this.arr[this.i] = this.arr[this.i + 1];
            this.arr[this.i + 1] = temp;
        }
        this.i++;
        if(i >= this.arr.length - this.done){
            done++;
            this.i = 0;
        }
    }

    public void setArray(int[] arr){
        this.arr = arr;
        this.done = 1;
        this.i = 0;
    }

    public boolean isFinish(){
        return this.done >= this.arr.length - 1;
    }

    public int[] getArray(){
        return this.arr;
    }
}