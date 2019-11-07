import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/**
 * @program: NettyInAction
 * @author: devinkin
 * @create: 2019-11-06 15:04
 * @description: 客户端
 **/
public class SocketClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: " + SocketClient.class.getSimpleName()
                    + " <host> <port>");
        }
        String host = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            Socket socket = new Socket(host, port);
            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(bytes)) != -1) {
                sb.append(new String(bytes, 0, len,"UTF-8"));
            }
            System.out.println("received from server: " + sb.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
