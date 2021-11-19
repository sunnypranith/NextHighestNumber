The goal is to find the highest number with same digits.

Sample Input - 12345
Sample Output - 12354

**Assumptions -**

1. Return -1, if highest number cannot be determined for following cases where input is -
    * not a positive number
    * not an integer
    * null or empty
    * equal to output
2. Return -1, if highest number is more than Integer.MAX_VALUE

**Logic -**

1. Starting from the rightmost digit, find the first digit that is smaller than the digit next to it.  
   If no such digit is found, return -1 because the next highest number cannot be determined for 
   inputs similar to 4321 where input is the highest number possible with the given digits.
2. If a digit is less than its next digit, num[i-1] < num[i], then replace with its next greater digit(Y)
    * To find next highest digit(Y)
        * Push increasing sequence to stack
        * Pop digits greater than x
        * Last popped digit is the next highest digit
3. Replace num[i-1] with the next highest digit(Y) found in above step
4. To get the smallest value, sort the rest of the string from starting to index i

**Build instructions :**

1. Run following command from root directory
    mvn clean install

**Run instructions -**

1. Run following command from root directory
    java -jar ./target/NextHighestNumber-1.0.jar <input>
    
    Examples - 
    1. Valid case 
        java -jar ./target/NextHighestNumber-1.0.jar 1234
    2. Invalid case
        java -jar ./target/NextHighestNumber-1.0.jar -1234
    

