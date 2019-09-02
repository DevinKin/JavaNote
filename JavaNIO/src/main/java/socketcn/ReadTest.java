package socketcn;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @program: JavaNIO
 * @author: devinkin
 * @create: 2019-08-30 12:02
 * @description:
 **/
public class ReadTest {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("www.jenkov.com", 80));
        ByteBuffer buf = ByteBuffer.allocate(48);
        int byteRead = socketChannel.read(buf);
        while (byteRead != -1) {
            System.out.println("Read " + byteRead);
            buf.flip();

            while (buf.hasRemaining()) {
                System.out.print((char)buf.get());
            }
            System.out.println();

            buf.clear();
            byteRead = socketChannel.read(buf);
        }
        socketChannel.close();
    }
}
