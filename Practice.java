/*import java.util.Scanner;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+ " ");
        }
        sc.close();
    }
}*/

/*import java.util.Scanner;
public class Practice{
    int Sum(num){
        for(int i=1;i<=num;i++){
           int sum+=i;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int num=sc.nextInt();
        System.out.println("Sum of n numbers:");
        Sum(num);
    }
}*/

/*import java.util.Scanner;
public class Practice{
    int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        Practice p=new Practice();
        System.out.println("Factorial:"+ p.Factorial(n));
    }
}*/

/*import java.util.Scanner;
public class Practice{
    void Fibonacci(int n){
        int num1=0,num2=1;
        for(int i=1;i<=n;i++){
            System.out.println(num1 + " ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        Practice p=new Practice();
        System.out.println("Fibonacci series: "+ p.Fibonacci(n));
    }
}*/

/*import java.util.Scanner;
public class Practice{
     boolean isPrime(int n){
        for(int i=1;i<n;i++){
            if(n%i==0)
                return False;
            else
                return True;
        }
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         Practice p=new Practice();
         System.out.println(p.isPrime(num));
    }
}*/

/*import java.util.Scanner;
public class Practice{
    int Reverse(int n){
        int temp=n,rev=0;
        while(temp!=0){
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        Practice p=new Practice();
        System.out.println("Reverse number:"+ p.Reverse(num));
    }
}*/


/*import java.util.Scanner;
public class Practice{
    int SumOfDigits(int n){
        int temp=n,rev=0;
        while(temp!=0){
            int r=temp%10;
            rev+=r;
            temp/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        Practice p=new Practice();
        System.out.println("Sum of digits:"+ p.SumOfDigits(num));
    }
}*/

/*import java.util.Scanner;
public class Practice{
    int swapNumbers(int a,int b){
        a=b;
        b=a;
        return a,b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Practice p=new Practice();
        System.out.println("Answer:" + p.swapNumbers(a,b));
    }
}*/

/*import java.util.Scanner;
public class Practice{
    void isEven(int n){
        if(n%2==0)
           System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Practice p=new Practice();
        p.isEven(n);
    }
}*/

/*import java.util.Scanner;
public class Practice{
    void largest(int a,int b,int c){
        if(a>b && a>c)
            System.out.println(a);
        else if(b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Practice p=new Practice();
        p.largest(a,b,c);
    }
}*/

/*import java.util.Scanner;
public class Practice{
    void isPalindrome(int n){
        int temp=n;
        int res=0;
        while(temp!=0){
            int rem=temp%10;
            res=res*10+rem;
            temp/=10;
        }
        if(res==n)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        Practice p=new Practice();
        p.isPalindrome(num);
    }
}*/

/*import java.util.Scanner;
public class Practice{
    void isArmstrong(int n){
        int temp=n;
        int res=0;
        while(temp!=0){
            int rem=temp%10;
            res+=rem*rem*rem;
            temp/=10;
        }
        if(res==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not a Armstrong");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        Practice p=new Practice();
        p.isArmstrong(num);
    }
}*/

/*import java.util.Scanner;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

/*import java.util.Scanner;
public class Practice{
    int LargestNum(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Practice p=new Practice();
        System.out.println("Largest element:" + p.LargestNum(arr));
    }
}*/

/*import java.util.Scanner;
public class Practice{
    void ArraySort(int n,int[] arr){
        int sort=0;
        for(int i=0;i<n-2;i++){
            if(arr[i]>arr[i+1])
                sort++;
        }
        if(sort!=0)
            System.out.println("Array is not sorted");
        else
            System.out.println("Array is sorted");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Practice p=new Practice();
        p.ArraySort(n,arr);
    }
}*/

/*import java.util.Scanner;
public class Practice{
    void LinearSearch(int k,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
                System.out.println("Element found at index"+ i);
            else
                System.out.println("Element not found");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of elements:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key to be searched:");
        int k=sc.nextInt();
        Practice p=new Practice();
        p.LinearSearch(k,arr);
    }
}*/

/*import java.util.*;
public class Practice{
     int[] reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Practice p=new Practice();
        System.out.println("Enter the no.of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] array=p.reverse(arr);
        System.out.println("Reverse array:" + Arrays.toString(array));
    }
}*/

/*import java.util.*;
public class Practice{
    int[] PrefixSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Practice p=new Practice();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] array=p.PrefixSumArray(arr);
        System.out.println("PrefixSum:" + Arrays.toString(array));
    }
}*/

/*import java.util.*;
public class Practice{
    int MaxSubArraySum(int[] arr){
        int maxSum=arr[0];
        int currSum=0;

        for(int i=0;i<arr.length;i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Practice p=new Practice();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("MaxSubArraySum:" + p.MaxSubArraySum(arr));
    }
}*/

/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        int winSum=0;
        for(int i=0;i<k;i++){
            winSum+=arr[i];
        }
        int maxSum=winSum;

        for(int i=k;i<n;i++){
            winSum=winSum-arr[i-k]+arr[i];
            if(winSum>maxSum){
                maxSum=winSum;
            }
        }
        System.out.println("Max Sum:"+maxSum);
    }
}*/

/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int t=sc.nextInt();
        int tSum=0;
        int left=0;
        int right=n-1;
        while(left<right){
            tSum=arr[left]+arr[right];
            if(tSum==t){
                System.out.print(arr[left]+" "+arr[right]);
                break;
            }
            else if(tSum>t){
                right--;
            }
            else{
                left++;
            }
        }
    }
}*/

/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
                left++;
                right--;
            }
            else{
                System.out.println("Not a Palindrome");
                return ;
            }
        }
        System.out.println("Palindrome");
    }
}*/

/*import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Practice{
    int maximumArea(int[] arr){
        int left=0;
        int right=arr.length-1;
        int maxArea=0;
        while(left<right){
            int area=min(arr[left],arr[right])*(right-left);
            maxArea=max(maxArea,area);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Practice p=new Practice();
        System.out.println("Enter the no.of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(p.maximumArea(arr));
    }
}*/

/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left = i+1, right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                    if (sum == 0) {
                        res.add(Arrays.asList(arr[i],arr[left],arr[right]));
                        while(left<right && arr[left]==arr[left+1]){
                            left++;
                        }
                        while(left < right && arr[right]==arr[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<0){
                        left++;
                    }
                    else{
                        right--;
                    }
            }
        }
        System.out.println(res);

    }
}*/

/*import java.util.*;
public class Practice{
    public List<List<Integer>> fourSum(int[] arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                int left=j+1,right=arr.length-1;
                while(left<right){
                    long sum=(long)arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target){
                        res.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        while(left<right && arr[left]==arr[left+1]) left++;
                        while(left<right && arr[right]==arr[right-1]) right--;
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return res;
    }
}*/
