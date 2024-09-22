#include <stdio.h>

// Function to calculate the factorial of a number
// using recursion.
int factorial(int n) {
    // Base case: Factorial of 0 or 1 is 1
    if (n == 0 || n == 1) {
        return 1;
    }
    
    // Recursive case: n * factorial of (n-1)
    return n * factorial(n - 1);
}

int main() {
    int num;  // Variable to store user input
    
    // Prompt the user to enter a number
    printf("Enter a non-negative integer: ");
    scanf("%d", &num);
    
    // Validate the input to ensure it's non-negative
    if (num < 0) {
        printf("Error: Factorial is not defined for negative numbers.\n");
    } else {
        // Call the factorial function and display the result
        printf("Factorial of %d is %d\n", num, factorial(num));
    }

    return 0;  
}