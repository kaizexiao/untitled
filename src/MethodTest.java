import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;

/**
 * @author:xiaokaize
 * @date：2021.12.09 09:57
 */
public class MethodTest {
    public static void main(String[] args) {
        Date date = new Date();
        Format format = new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                return null;
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        };
        String str = new String("TEST");

        System.out.println(str);
    }
}
