package fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by admin on 2016/11/9.
 * 文件描述类
 */
public class FileDescribe {

    /* 上传文件的数据 */
    private byte[] data;

    private InputStream inStream;

    private File file;

    /* 文件名称 */
    private String filname;

    /* 请求参数名称*/
    private String parameterName;

    /* 内容类型 */
    private String contentType = "application/octet-stream";

    public FileDescribe(String filname, byte[] data, String parameterName, String contentType) {

        this.data = data;

        this.filname = filname;

        this.parameterName = parameterName;

        if(contentType!=null) this.contentType = contentType;

    }

    public FileDescribe(File file, String parameterName, String contentType) {

        this.filname = file.getName();

        this.parameterName = parameterName;

        this.file = file;

        try {

            this.inStream = new FileInputStream(file);

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        if(contentType!=null) this.contentType = contentType;

    }

    public File getFile() {

        return file;

    }

    //get及set

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public InputStream getInStream() {
        return inStream;
    }

    public void setInStream(InputStream inStream) {
        this.inStream = inStream;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFilname() {
        return filname;
    }

    public void setFilname(String filname) {
        this.filname = filname;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
