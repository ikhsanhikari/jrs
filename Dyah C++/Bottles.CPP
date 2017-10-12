#include <stdio.h>
#include <conio.h>



int main(){
int x;
printf ("Please input the bottles that you need : ");
scanf ("%d",&x);

int i=x;
while (i>=1){
	if (i>1){
		printf ("\n%d bottles beer on the wall\n",i);
   	printf ("%d bottles beer\n",i);
   	printf ("Take one down, pass it around\n");
   	i--;
   	printf ("%d bottles beer\n",i);
   }else if (i==1){
   	printf ("\n%d bottle beer on the wall\n",i);
   	printf ("%d bottle beer\n",i);
   	printf ("Take one down, pass it around\n");
   	i--;
   	printf ("The bottle is empty",i);
   }

}

getch();


}
