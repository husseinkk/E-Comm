 // Question  5;
#include <iostream>
#include <bits/stdc++.h>

using namespace std;
int BinSearch(int * arr,int s,int e,int k)
{
    while(s<e)
    {
        int m=(s+e)/2;
        if(arr[m]==k) return m;
        else if (k<arr[m]) e=m-1;
        else s=m+1;
    }
    if(k>arr[s]) return s+1;
    else return s;
}
void insertionSort(int* arr,int size)
{
    for(int i=0;i<size;i++)
    {
        int j=i-1;
        int val=arr[i];
        while(j>=0 && arr[j]>val)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=val;
    }
}
void modifiedInsertionSort(int* arr,int size)
{
    for(int i=0;i<size;i++)
    {
        int index=BinSearch(arr,0,i-1,arr[i]);
        int val=arr[i];
        for(int j=i-1;j>=index;j--)
        {
            arr[j+1]=arr[j];
        }
        arr[index]=val;
    }
}
int main()
{
    vector <int> arr;
    arr.push_back(6);
    arr.push_back(5);
    arr.push_back(4);
    arr.push_back(3);
    arr.push_back(2);
    for(int i=0;i<arr.size();i++)cout<<arr[i];
    cout<<endl;
    reverse(arr.begin(),arr.end());
    for(int i=0;i<arr.size();i++)cout<<arr[i];
    cout<<endl;
int  *arr[] = {3,6,9,4,5,12,0,84,22};
BinSearch(arr,0,9,4);
//insertionSort (& 9,10);
    int lis[]={3,8,6,0,9,1,2,4,6,7};
    modifiedInsertionSort(lis,10);
    for(int i=0;i<10;i++) cout<<lis[i]<<" ";
    return 0;
}

