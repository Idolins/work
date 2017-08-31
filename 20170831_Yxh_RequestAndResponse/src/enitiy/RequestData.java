package enitiy;

/**
 * Created by young on 2017/8/31.
 */
public class RequestData {
    private String authType;
    private String contextPath;
    private String localAddr;
    private String method;
    private String remoteAddr;
    private int remotePort;

    public RequestData(String authType, String contextPath, String localAddr, String method, String remoteAddr,
                       int rrmotePort) {
        this.authType = authType;
        this.contextPath = contextPath;
        this.localAddr = localAddr;
        this.method = method;
        this.remoteAddr = remoteAddr;
        this.remotePort = rrmotePort;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getLocalAddr() {
        return localAddr;
    }

    public void setLocalAddr(String localAddr) {
        this.localAddr = localAddr;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public int getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(int remotePort) {
        this.remotePort = remotePort;
    }
}
