#include<iostream>
using namespace std;

int main()
{
	int arr[8]={3,5,10,18,7,11,22,1};
	int start=0;
	for(int i=2;i<8;i++)
	{
		int value=arr[i+1];
		int mid=(start+i)/2;
		while(start<=i)
		{
			if(value>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				for(int j=i+1;j>mid-1;j--)
				{
					arr[j]=arr[j-1];
				}
				arr[mid]=value;
			}
		}
	}
	for(int i=0;i<8;i++)
	{
		cout<<arr[i]<<"	";
	}
	return 0;
}
