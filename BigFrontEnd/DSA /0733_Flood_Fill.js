var floodFill = function(image, sr, sc, color) {
    let prevColor = image[sr][sc]
    if(prevColor == color) return image;
    image[sr][sc] = color

    let dir =  [[0,-1], [0, 1], [1, 0], [-1, 0]]

    for(let d of dir){
        let r = sr + d[0]
        let c = sc + d[1]

        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) continue;
        if (image[r][c] == prevColor) floodFill(image, r, c, color);

    }

    return image;
};