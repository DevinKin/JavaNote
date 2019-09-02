package filechannel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @program: JavaNIO
 * @author: devinkin
 * @create: 2019-08-30 10:23
 * @description:
 **/
public class WriteTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("C:\\Users\\devinkin\\Learning\\JavaLearning\\JavaNIO\\src\\main\\resources\\data\\nio-data.txt", "rw");
        FileChannel channel = aFile.getChannel();
        String newData = "New String to write to file..." + System.currentTimeMillis();
        ByteBuffer buf = ByteBuffer.allocate(48);
        buf.clear();
        buf.put(newData.getBytes());

        buf.flip();
        while (buf.hasRemaining()) {
            channel.write(buf);
        }
        channel.close();
    }
}
