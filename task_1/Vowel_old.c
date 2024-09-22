#include <stdio.h>
#include <ctype.h>

int main() {
    char c;
    int isLowercaseVowel, isUppercaseVowel;

    printf("Enter an alphabet: ");
    scanf("%c", &c);

    isLowercaseVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    isUppercaseVowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

    if (!isalpha(c))
        printf("Error! Non-alphabetic character.\n");
    else if (isLowercaseVowel || isUppercaseVowel)
        printf("%c is a vowel.\n", c);
    else
        printf("%c is a consonant.\n", c);

    return 0;
}
