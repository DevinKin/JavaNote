- [Java NIO FileChannel](#sec-1)
  - [打开文件管道](#sec-1-1)
  - [从文件管道中读数据](#sec-1-2)
  - [写数据到文件管道](#sec-1-3)
  - [文件管道位置](#sec-1-4)
  - [文件管道大小](#sec-1-5)
  - [文件管道截断](#sec-1-6)
  - [文件管道Force](#sec-1-7)

# Java NIO FileChannel<a id="sec-1"></a>

文件管道可以从文件读取数据，也可以写入数据到文件。

文件管道不能被设置为非阻塞模式， 它总是运行在阻塞模式。

## 打开文件管道<a id="sec-1-1"></a>

需要通过 `InputStream` 、 `OutputStream` 或 `RandomAccessFile` 获取文件管道，

## 从文件管道中读数据<a id="sec-1-2"></a>

从文件管道中读数据到缓冲区

```java
package filechannel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @program: JavaNIO
 * @author: devinkin
 * @create: 2019-08-30 10:17
 * @description:
 **/
public class ReadTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("C:\\Users\\devinkin\\Learning\\JavaLearning\\JavaNIO\\src\\main\\resources\\data\\nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            buf.flip();

            while (buf.hasRemaining()) {
                System.out.print((char)buf.get());
            }
            System.out.println();

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        inChannel.close();
    }
}
```

## 写数据到文件管道<a id="sec-1-3"></a>

从缓冲区中写数据到文件管道

```java
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
```

`write()` 方法不能保证有多少字节被写入到文件管道。

## 文件管道位置<a id="sec-1-4"></a>

`position(long pos)` 方法可以在获取和设置对应写入和读取的位置。

```java
long pos = channel.position();
channel.position(post + 123);
```

如果你在文件结束后设置位置，并尝试从通道读取，你将得到的文件结束标记为-1。

如果你在文件结束后设置位置，并写入通道，则文件将以适合位置展开和写入数据。这可能造成文件不连续，其中磁盘的物理文件在写入数据中间存在空隙。

## 文件管道大小<a id="sec-1-5"></a>

`size()` 方法返回文件管道所连接文件的大小。

```java
long fileSize = channel.size();
```

## 文件管道截断<a id="sec-1-6"></a>

`FileChannel.truncate(long length)` 方法可以根据给定长度截断文件。

```java
channel.truncate(1024);
```

## 文件管道Force<a id="sec-1-7"></a>

`FileChannel.force()` 方法会从管道刷新所有未写入数据到硬盘。

`force()` 方法接受 `boolean` 参数，告诉文件的元数据是否被刷新。

```java
channel.force(true);
```
