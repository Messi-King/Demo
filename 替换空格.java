//替换空格
public class Solution {
    //借助StringBuffer
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}  