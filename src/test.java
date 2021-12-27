import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    /**
     *
     * @param args
     */
    public static void main(String args []) {
        String str = "t123hhj2131Z";
        String pattern = "^([a-zA-z]|[0-9]){7,17}$";
        //正则测试
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }

}