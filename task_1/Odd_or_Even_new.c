#include <stdio.h>

int main() {
    // Declare a variable to hold the integer input
    int num;

    // Prompt the user for input
    printf("Enter an integer: ");
    scanf("%d", &num); // Read the integer input from the user

    // Check if the number is even or odd
    if (num % 2 == 0) {
        // The number is even
        printf("%d is even.\n", num);
    } else {
        // The number is odd
        printf("%d is odd.\n", num);
    }

    return 0;
}
