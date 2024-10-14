var isValid = function(s) {
    let stack = []
    let i = 0;
    const paren = '{} () []'

    while( i < s.length){
        stack.push(s[i])
        i++;

        let open = stack[stack.length-2]
        let closed = stack[stack.length-1]
        let validparen = open + closed

        if(paren.includes(validparen)){
            stack.pop()
            stack.pop()
        }
    }
    return stack.length === 0;
};