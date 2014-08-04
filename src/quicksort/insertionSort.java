public class insertionSort{
public insertionSort(int[] arr){
/*int[] post=new int[arr.length+1];
post[0]=-1;
for(int x=0;x<arr.length;x++){
	while
	}
return Arrays.copyOfRange(post,1,post.length);*/
for(int x=1;x<arr.length;x++){
	int temp=arr[x];
	int y;
	for(y=x-1;y>=0&&temp<arr[y];y--)
		arr[y+1]=arr[y];
	arr[y+1]=temp;
	}
}}