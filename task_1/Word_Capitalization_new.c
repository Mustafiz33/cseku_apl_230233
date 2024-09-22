#include <stdio.h>
#include <ctype.h>

// Function to capitalize the first letter of each word in a string
void capitalizeWords(char *str) {
    int i = 0;            
    int newWord = 1;      

    // Traverse the string until the null terminator is reached
    while (str[i]) {
        if (isspace(str[i])) {
            // If the character is a space, set newWord to true
            newWord = 1;
        } else if (newWord && isalpha(str[i])) {
            // Capitalize the first letter of the new word
            str[i] = toupper(str[i]);
            newWord = 0; // Reset newWord as we're no longer at a new word
        } else {
            // Convert other letters to lowercase
            str[i] = tolower(str[i]);
        }
        i++; // Move to the next character
    }
}

int main() {
    char str[100]; // Array to hold the input string

    // Prompt the user for input
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin); // Read a line of text

    // Capitalize the words in the string
    capitalizeWords(str);

    // Output the modified string
    printf("Capitalized String: %s", str);

    return 0; 
}
