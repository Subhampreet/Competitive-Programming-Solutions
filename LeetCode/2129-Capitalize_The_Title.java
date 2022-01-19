class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String words[] = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            if(words[i].length() < 3){
                sb.append(words[i] + " ");
            }
            else{
                char ch = words[i].charAt(0);
                ch = Character.toUpperCase(ch);
                String new_word = ch + words[i].substring(1);
                sb.append(new_word + " ");
            }
        }
        String result = sb.toString();
        return result.trim();
    }
}