public class Array {
    private int[] numbers;

    
    public Array(int[] nums) {
        this.numbers = nums != null ? nums : new int[0];
    }

    
    public void printArray() {
        if (numbers.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5};
        Array arr = new Array(nums);
        arr.printArray();
    }
}