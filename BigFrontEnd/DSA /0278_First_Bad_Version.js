var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        let start = 1;
        let end = n;

        while (start <= end){ 
            let mid = Math.floor((start + end) / 2)

            if (isBadVersion(mid)) {
                end  = mid -1 ;
            } else {
                start = mid + 1;
            }
        }
        return start;
    };
};