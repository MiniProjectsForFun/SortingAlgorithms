public class Main{

    int[] arr;

    SelectionSort selection = new SelectionSort();

    public Main(int[] arr){
        this.arr = arr;
        selection.setArray(this.arr);
    }

    public Main(){}

    public void update(){
        selection.update();
    }

    public void setArray(int[] arr){
        this.arr = arr;
        selection.setArray(this.arr);
    }

    public boolean isFinish(){
        return selection.isFinish();
    }

    public int[] getArray(){
        return selection.getArray();
    }
}