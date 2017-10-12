#include <iostream>
using namespace std;

int main(){
	int size=5;
	int count=0;
	for(int a=0;a<size;a++){
		for(int b=a;b<size;b++)
			cout<<" ";
		for(int b=0;b<a;b++)
			cout<<++count<<" ";
		cout<<endl;
	}
	
}
