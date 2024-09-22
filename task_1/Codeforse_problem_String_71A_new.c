#include <stdio.h>
#include <string.h> // Include string.h for strlen function

int main() {
    int num; // Number of words to process

    // Read the number of words
    scanf("%d", &num);

    // Loop through each word
    for (int i = 0; i < num; i++) {
        char word[500]; // Array to hold each word
        scanf("%s", word); // Read the word

        int length = strlen(word); // Get the length of the word
        int d = length - 2; // Calculate the number of characters between first and last

        // Check the length of the word
        if (length < 11) {
            // Print the word if it has less than 11 characters
            printf("%s\n", word);
        } else {
            // Print the abbreviated format for longer words
            printf("%c%d%c\n", word[0], d, word[length - 1]);
        }
    }

    return 0; 
}
