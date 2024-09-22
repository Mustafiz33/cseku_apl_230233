#include <stdio.h>
#include <ctype.h>

void capitalizeWords(char *str) {
    int i = 0;
    int newWord = 1;

    while (str[i]) {
        if (isspace(str[i])) {
            newWord = 1;
        } else if (newWord && isalpha(str[i])) {
            str[i] = toupper(str[i]);
            newWord = 0;
        } else {
            str[i] = tolower(str[i]);
        }
        i++;
    }
}

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    capitalizeWords(str);

    printf("Capitalized String: %s", str);

    return 0;
}
