var canConstruct = function(ransomNote, magazine) {
    if(ransomNote.length > magazine.length){
        return false
    }

    const magazineTable = {}
    for(let c of magazine){
        magazineTable[c] = (magazineTable[c] || 0 ) + 1
    }

    for (let c of ransomNote) {
        const tableChar = magazineTable[c] || 0
        if(tableChar === 0) 
            return false
        magazineTable[c] = magazineTable[c] - 1
    }

    return true;
};