public class Bit_Manipulation{
public static int[] bitManipulation(int num, int i){
        //get bit
        int arr[] = new int[3];
        int bitmask = 1<<(i-1);
        if((bitmask&num)==0){
            arr[0] = 0;
        }
        else{
            arr[0]=1;
        }
        //setbit
        arr[1]=bitmask|num;
        //clearbit
        arr[2] = (~bitmask)&num;
        return arr;
    }

/*
Example of I/O -:
N=25  i=3
Output : 0 29 25

Bit at the 3rd position from LSB is 0. (1 1 0 0 1)

The value of the given number after setting the 3rd bit is 29. (1 1 1 0 1)

The value of the given number after clearing the 3rd bit is 25. (1 1 0 0 1)*/
}
