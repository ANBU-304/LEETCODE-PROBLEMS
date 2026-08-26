class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        char[] arr = s.toCharArray();

        // for(int k=0;k<n;k++)
        // {
        //     System.out.print(arr[k]);
        // }
        while (i < j) {

            if (!(arr[i] >= 'a' && arr[i] <= 'z')) {
                i++;
            } else if (!(arr[j] >= 'a' && arr[j] <= 'z')) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        i = 0;
        j = n - 1;

        while(i<j)
        {
            if ((arr[i] >= 'a' && arr[i] <= 'z')) {
                i++;
            } else if ((arr[j] >= 'a' && arr[j] <= 'z')) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }

        for (int k = 0; k < n; k++) {
            sb.append(arr[k]);
        }

        return sb.toString();
    }
}