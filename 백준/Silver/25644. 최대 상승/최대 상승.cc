#include <iostream> 


using namespace std;
 

int main(void)
{
        ios::sync_with_stdio(0);
        cin.tie(0);

        int n;
        cin>>n;
        int arr[n];

        for(int i=0;i<n;i++){
                cin >> arr[i];
        }
        int min = arr[0];

        int result = 0;
       
        for(int i=0;i<n;i++){
                if(arr[i]-min>result){
                        result = arr[i] - min;
                }
                if(min>arr[i]){
                        min=arr[i];
                                
                }
                
        }
        cout<<result;
}
 