#include <iostream>
using namespace std;

void triangle(int size){
	char n='A';
	int n1=1;
	for(int a=0;a<size;a++){
		n1=1;	
		for(int b=a;b<size;b++){
			cout<<" ";
		}
		for(int b=0;b<a;b++){
			cout<<n1; n1++;
		}n1--;
		for(int b=1;b<a;b++){
			n1--; cout<<n1;	
		}	cout<<"\n";
	}
}

int main(){
	int size;
	cout<<"Enter Size : ";
	cin>>size;
	triangle(size+1);	
}
