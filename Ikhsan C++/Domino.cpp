#include <stdio.h>
int main(){
	int arr[100][2];
	int index=0;
	int test;
	scanf("%d",&test);
	for(int a=0;a<test;a++){
		for(int b=0;b<2;b++){
			scanf("%d",&arr[a][b]);
		}
	}
	printf("\n");
	for(int a=0;a<test;a++){
		for(int b=0;b<2;b++){
			if(arr[a][b+1]==arr[a+1][b]){
				index++;
			}
			printf("%d ",arr[a][b]);
		}
		printf("\n");
	}
	printf("%d",index);
}
