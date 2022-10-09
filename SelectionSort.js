class Solution{
    select(arr,i)
    {
         // code here such that selectionSort() sorts arr[]
        let min = Math.min(...arr.slice(i,arr.length));
        let minIndex  = arr.indexOf(min,i);
        return minIndex;
     }
    //Function to sort the array using selection sort algorithm.
    selectionSort(arr,n){
        for (let i = 0; i < arr.length; i++)
        {
          let minIndex = this.select(arr, i);
          let min = arr[minIndex];
          arr.splice(minIndex, 1);
          arr.splice(i, 0, min);
        }
      return arr;
      }
}
