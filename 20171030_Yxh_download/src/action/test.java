package action;

import java.io.UnsupportedEncodingException;

/**
 * Created by young on 2017/10/30.
 */
public class test {

    private String inputPath;

    public void setInputPath(String inputPath) throws UnsupportedEncodingException {
        this.inputPath = new String(inputPath.getBytes("ISO-8859-1"), "UTF-8");
    }

    public String getInputPath() {
        return inputPath;
    }
}
