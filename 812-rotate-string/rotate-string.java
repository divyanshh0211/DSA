class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }

    String result = s.concat(s);

    if(result.contains(goal)){
        return true;
    }
    return false;

        
    }
}