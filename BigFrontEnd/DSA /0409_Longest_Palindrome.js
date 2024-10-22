var longestPalindrome = function(s) {
    let longest = 0;
    let keys = {};

    for (const char of s) {
        // Keep track of character count in the `keys` object
        keys[char] = (keys[char] || 0) + 1;

        // If the count is even, add 2 to the longest variable
        if (keys[char] % 2 === 0) {
            longest += 2;
        }
    }

    // If the length of `s` is greater than `longest`,
    // we can add a unique character in the middle of the palindrome
    return s.length > longest ? longest + 1 : longest;
};