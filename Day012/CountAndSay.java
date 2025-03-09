class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String in = countAndSay(n - 1) + ".";
        char[] arr = in.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
            else {
                sb.append("" + count + arr[i]);
                count = 1;
            }
        }
        return sb.toString();
    }
}