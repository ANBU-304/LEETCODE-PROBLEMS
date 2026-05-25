#include<limits.h>
int divide(int dividend, int divisor) 
{ long int a;
    if(dividend == INT_MIN && divisor == -1)
    {
        return INT_MAX;
    }
    else
     {
        a=dividend/ divisor;
    }
    return a;
}