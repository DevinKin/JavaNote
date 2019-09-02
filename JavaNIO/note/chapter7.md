- [Java NIO SocketChannel](#sec-1)
  - [打开网络管道](#sec-1-1)
  - [从网络管道中读取](#sec-1-2)
  - [写数据到网络管道](#sec-1-3)
  - [非阻塞模式](#sec-1-4)
    - [connect()](#sec-1-4-1)
    - [write()](#sec-1-4-2)
    - [read()](#sec-1-4-3)

# Java NIO SocketChannel<a id="sec-1"></a>

Java NIO 网络管道是一个连接TCP网络的管道。有两种方式创建网络管道

-   打开某个网络管道连接到Internet的某个服务器。
-   当传入连接到达 `ServerSocketChannel` 时，可以创建 `SocketChannel` 。

## 打开网络管道<a id="sec-1-1"></a>

打开网络管道示例代码

```java
SocketChannel socketChannel = SocketChannel.open();
socketChannel.connect(new InternetSocketAddress("http://jenkov.com", 80));
```

## 从网络管道中读取<a id="sec-1-2"></a>

从网络管道中读取示例代码

```java

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
        socketChannel.close();
    }
}
```

## 写数据到网络管道<a id="sec-1-3"></a>

写数据到网络管道示例代码

```java
String newData = "New String to write to file..." + System.currentTimeMillis();

ByteBuffer buf = ByteBuffer.allocate(48);
buf.clear();
buf.put(newData.getBytes());

buf.flip();

while(buf.hasRemaining()) {
    channel.write(buf);
}
```

## 非阻塞模式<a id="sec-1-4"></a>

网络管道可以设置非阻塞模式，可以异步模式下调用 `connect()` ， `read()` ， `write()`

### connect()<a id="sec-1-4-1"></a>

如果网络管道在非阻塞模式，可以调用 `connect()` 方法，该方法会在建立连接前返回。

可以使用 `finishConnect()` 方法判断连接是否已经建立。

```java
socketChannel.configureBlocking(false);
socketChannel.connect(new InetSocketAddress("http://jenkov.com", 80));

while(! socketChannel.finishConnect() ){
    //wait, or do something else...    
}
```

### write()<a id="sec-1-4-2"></a>

在非阻塞模式下， `write()` 可能没有写入任何数据就已经返回。

### read()<a id="sec-1-4-3"></a>

在非阻塞模式下， `read()` 可能会没有读取任何数据就返回。可能要注意返回值，返回值为读取的字节数。
