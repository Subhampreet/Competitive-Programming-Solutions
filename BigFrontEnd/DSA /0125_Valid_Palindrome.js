// Solution explanation - https://www.youtube.com/watch?v=P1gmutIKPRU


var isPalindrome = function(s) {
    let regex = /[^a-zA-Z0-9]/g
    let clean = s.replace(regex, "")

    console.log(clean.toLowerCase())
    console.log(clean.toLowerCase().split("").reverse().join())

    return clean.toLowerCase() === clean.toLowerCase().split("").reverse().join("")
};


// var isPalindrome = function(s) {

//     const isAlphanumeric = (char) => {
//         return (char >= 'A' && char <= 'Z') || 
//                (char >= 'a' && char <= 'z') || 
//                (char >= '0' && char <= '9');
//     }


//     let left = 0
//     let right = s.length - 1 

//     while( left < right){
//         while(left < right && !isAlphanumeric(s[left])){
//             left++;
//         }

//         while(left < right && !isAlphanumeric(s[right])){
//             right--;
//         }

//         if (s[left].toLowerCase() !== s[right].toLowerCase()) {
//             return false;
//         }

//         right--
//         left++        
//     }

//     return true
// };