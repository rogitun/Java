package String_token_buffer;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("가나다/마바/사아/자차/카타", "/");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
