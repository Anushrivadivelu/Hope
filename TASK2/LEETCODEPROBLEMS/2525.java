class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean b= false;
        boolean h = false;
        if(length>=10000 || width >= 10000 || height >= 10000){
            b=true;
        }
        if(((long)length*width*height)>=1000000000) b = true;
        if(mass >= 100) h = true;
        if(b && h) return "Both";
        else if(b) return "Bulky";
        else if(h) return "Heavy";
        return "Neither";
    }
}
