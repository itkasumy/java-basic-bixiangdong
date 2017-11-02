class StaticArrayToolTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 6, 3, 5};

        /*ArrayTool tool = new ArrayTool();
        System.out.println(tool.getMax(arr));
        System.out.println(tool.getMin(arr));

        tool.printArray(arr);
        // tool.selectSort(arr);
        tool.bubbleSort(arr);
        tool.printArray(arr);*/

        int max = ArrayTool.getMax(arr);
        System.out.println(max);
        int min = ArrayTool.getMin(arr);
        System.out.println(min);

        ArrayTool.printArray(arr);
        ArrayTool.selectSort(arr);
        // ArrayTool.bubbleSort(arr);
        ArrayTool.printArray(arr);
    }
}