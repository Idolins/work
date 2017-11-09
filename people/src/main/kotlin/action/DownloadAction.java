package action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by young on 2017/11/7.
 */
public class DownloadAction extends ActionSupport {
    private static final long serialVersionUID = -3036349171314867490L;

    //文件名
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) throws UnsupportedEncodingException {
        //用UTF-8重新编码文件名,解决中文乱码
        this.fileName = new String(fileName.getBytes("ISO-8859-1"), "UTF-8");
    }

    public InputStream getInputStream() throws UnsupportedEncodingException, FileNotFoundException {

        System.out.println("filename is " + fileName);
        InputStream inputStream = new FileInputStream(fileName);
        System.out.println("input stram is " + inputStream);
        return inputStream;
//        return new BufferedInputStream(new FileInputStream(fileName));
    }


}
