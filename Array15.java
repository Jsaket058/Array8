class Array15{
	int linearSearch(int arr[],int k){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==k)return i;
		}
		return -1;
	}
}
class Run{
	public static void main(String[] args){
		Array15 a=new Array15();
		int x[]={4,5,2,8,1,6,9,7,3};
		System.out.println(a.linearSearch(x,8));
		System.out.println(a.linearSearch(x,10));
	}
}