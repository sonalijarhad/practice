package com.method;

public class Method1 {
	/**
	 * add two number
	 * @param a is of integer type
	 * @param b is of integer type
	 * @return addition of two integer number
	 */
	public int add(int a,int b){
		return a+b;
	}
	/**
	 * reverse the given array
	 * @param src integer type of array
	 * @return reverse the integer array
	 */
	public int [] reverse(int src[]){
		int [] dest=new int[src.length];
		int j=0;
		for (int i = dest.length-1; i >= 0; i--) {
			dest[j]=src[i];
			j++;
		}
		return dest;
	}
	/**
	 * addition of multiple number
	 * @param x is var_arg parameter of integer type
	 * @return addition of integer number 
	 */
	public int varArg(int... x){
		int sum=0;
		for (int i : x) {
			sum=sum+i;
		}
		return sum;
	}
	/**
	 * return minimum number from multiple number 
	 * @param x is var_arg parameter which take multiple number
	 * @return minimum integer number 
	 */
	public int minNumber(int ... x){
	for (int i = 0; i < x.length; i++) {
		if(x[i]<x[0]){
			x[0]=x[i];
		}
	}return x[0];
		
	}
	/**
	 * 
	 * @param src
	 * @return
	 */
	public int[] evenNumber(int [] src){
		int [] dest=new int [src.length];
		for (int i = 0; i < dest.length; i++) {
			if(src[i]%2==0){
				dest[i]=src[i];
			}
		}
			
		return dest;
	}
	/**
	 * 
	 * @param src
	 * @return
	 */
	public int addElement(int [] src){
		int sum=0;
		for (int i = 0; i < src.length; i++) {
			sum=sum+src[i];
		}return sum;
	}
	/**
	 * 
	 * @param src
	 * @return
	 */
	public int min(int []src){
		int min=0;
		for (int i =0; i <src.length; i++) {
			for (int j = i+1; j < src.length; j++) {
				if(src[i]>src[j]){
				min=src[j];
				}else{
					min=src[i];
				}
			break;}
		
		}return min;
	}
}
	/*public int[] asen(int src[]){
		for (int i = 0; i < src.length; i++) {
			for (int j = 0; j < src.length; j++) {
				if(src[i]>src[j]){}
			}
		}
	}

}*/

