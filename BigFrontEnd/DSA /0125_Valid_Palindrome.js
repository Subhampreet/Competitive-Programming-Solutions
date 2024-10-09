var isPalindrome = function(s) {

    const isAlphanumeric = (char) => {
        return (char >= 'A' && char <= 'Z') || 
               (char >= 'a' && char <= 'z') || 
               (char >= '0' && char <= '9');
    }


    let left = 0
    let right = s.length - 1 

    while( left < right){
        while(left < right && !isAlphanumeric(s[left])){
            left++;
        }

        while(left < right && !isAlphanumeric(s[right])){
            right--;
        }

        if (s[left].toLowerCase() !== s[right].toLowerCase()) {
            return false;
        }

        right--
        left++        
    }

    return true
};