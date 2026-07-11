public class Main{

    private int[] arr;

    private BubbleSort bubble = new BubbleSort();

    public Main(int[] arr){
        this.arr = arr;
        bubble.setArray(this.arr);
    }

    public Main(){}

    public void update(){
        bubble.update();
    }

    public void setArray(int[] arr){
        this.arr = arr;
        bubble.setArray(this.arr);
    }

    public boolean isFinish(){
        return bubble.isFinish();
    }

    public int[] getArray(){
        return bubble.getArray();
    }
}