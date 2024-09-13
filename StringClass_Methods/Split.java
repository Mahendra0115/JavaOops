class Split {
    public static void main(String[] args) {
        // split(String regex)-->String ko regex ke hisaab se split karta hai.
        String string1 = "hello,mahi,good,morning";
        String res = "";
        String[] string2 = string1.split(",");
        for (String part : string2) {
            res = res + " " + part;
        }
        System.out.print(" Split is:" + res);
    }
}
