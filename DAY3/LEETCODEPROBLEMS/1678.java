//1678. Goal Parser Interpretation
class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<command.length();i++){
            char ch = command.charAt(i);
            if(ch=='G') sb.append("G");
            if(ch=='a' && command.charAt(i+1)=='l')  sb.append("al");
            if(ch=='(' && command.charAt(i+1)==')')  sb.append("o");
        }
        return sb.toString();
    }
}
