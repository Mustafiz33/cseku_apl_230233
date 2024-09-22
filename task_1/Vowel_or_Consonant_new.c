#include <stdio.h>
#include <ctype.h>

int main() {
    // Declare a variable to hold the character input
    char c;
    int isLowercaseVowel, isUppercaseVowel;

    // Prompt the user for input
    printf("Enter an alphabet: ");
    scanf(" %c", &c); // Note the space before %c to handle any leading whitespace

    // Check if the character is a lowercase or uppercase vowel
    isLowercaseVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    isUppercaseVowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

    // Check if the input character is a valid alphabetic character
    if (!isalpha(c)) {
        printf("Error! Non-alphabetic character.\n");
    } else if (isLowercaseVowel || isUppercaseVowel) {
        // The character is a vowel
        printf("%c is a vowel.\n", c);
    } else {
        // The character is a consonant
        printf("%c is a consonant.\n", c);
    }

    return 0; 
}
