/**
这是一个可以对数组进行操作的工具类，该类中提供了，获取最值，排序等功能。
@author 张三
@version V1.1
*/
public class ArrayTool {
    /**
    空参数构造函数。
    一个类中默认会有一个空参数的构造函数，
    这个空参数的构造函数的权限和所属的类一致，
    如果没有被 public 所修饰，那么默认的构造函数也带public修饰符
    如果类没有被 public 修饰，那么默认的构造函数，也没有public修饰符。
    */
    private ArrayTool() {}
    /**
	获取一个整形数组中的最大值。
	@param arr 接收一个int类型的数组。
	@return 会返回一个该数组中最大值。
	*/
    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    /**
	获取一个整形数组中的最小值。
	@param arr 接收一个int类型的数组。
	@return 会返回一个该数组中最小值。
	*/
    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }
    /**
	给int数组进行选择排序。
	@param arr 接收一个int类型的数组。
	*/
    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }
    /**
	给int数组进行冒泡排序。
	@param arr 接收一个int类型的数组。
	*/
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }
    /**
	给数组中元素进行位置的置换。
	@param arr  接收一个int类型的数组。
	@param a 要置换的位置 
	@param b 要置换的位置 
	*/
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    /**
	用于打印数组中的元素。打印形式是：[elemet1, element2, ...]
	*/
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i] + "]");
        }
    }
}