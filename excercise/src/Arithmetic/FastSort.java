package Arithmetic;

import java.util.Arrays;

/**
 * @author Wu xianbo 快速排序
 */
public class FastSort {
    
	
	//找基准的位置
	public static int findMidDex(int[] array, int left, int right) {
		int key = array[right]; // 默认以最右边的值为基准
		while (left < right) {

			while (left < right && array[left] < key) {
				left++;
			}
			array[right] = array[left]; // 将比key大的值赋值给右边的坑

			while (left < right && array[right] > key) {
				right--;
			}
			array[left] = array[right]; // 将比key小的值赋值给左边的坑
		}
		array[left] = key;
		return left;
	}
	
	//快速排序
	public static void quickSort(int[] array,int left,int right) {
		if(left<right) {
			int postion = findMidDex(array, left, right);
			quickSort(array, left, postion-1);      //对左边继续分解排序
			quickSort(array, postion+1, right);     //对右边继续分解排序
		}
	}
	
	public static void main(String[] args) {
		int[] array= {1,5,2,7,4,8,11,9};
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
