package buffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @program: JavaNIO
 * @author: devinkin
 * @create: 2019-08-28 15:56
 * @description:
 **/
public class BufferUsage {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("C:\\Users\\devinkin\\Learning\\JavaLearning\\JavaNIO\\src\\main\\resources\\data\\nio-data.txt", "rw");;;;
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {
            buf.flip();

            while (buf.hasRemaining()) {
                System.out.print((char)buf.get());
            }
            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
