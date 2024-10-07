var lengthOfLongestSubstring = function(s) {
    let n = s.length;
    let res = 0;

    for(let i = 0 ; i < n ; i++){
        let visited = new Array(256).fill(false)

        for(let j = i; j < n; j++){
            if(visited[s.charCodeAt(j)] === true){
                break
            } else {
                res = Math.max(res, j - i + 1);
                visited[s.charCodeAt(j)] = true
            }
        }
    }
    return res
};