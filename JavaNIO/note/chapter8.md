- [Java NIO ServerSocketChannel](#sec-1)
  - [监听传入的连接](#sec-1-1)
  - [非阻塞模式](#sec-1-2)

# Java NIO ServerSocketChannel<a id="sec-1"></a>

Java NIO 服务器网络管道是可以监听传入TCP连接的管道。

```java
ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
serverSocketChannel.socket().bind(new InetSocketAddress(9999));

while(true) {
    SocketChannel socketChannel = serverSocketChannel.accept();
    // do something with socketChannel...
}
```

## 监听传入的连接<a id="sec-1-1"></a>

`ServerSocketChannel.accept()` 方法监听传入的连接。

当 `accept()` 方法返回，他返回传入连接对应的网络管道。因此， `accept()` 方法在建立连接前会一直阻塞。

## 非阻塞模式<a id="sec-1-2"></a>

`ServerSocketChannel` 可以设置为非阻塞模式，在非阻塞模式中调用 `accept()` 方法会立即返回。

因此， `ServerSocketChannel` 非阻塞模式下在没有传入连接的情况下可能返回 `null` 。因此，你可能要检查 `accept()` 方法是否返回 `null` 。

```java
ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
serverSocketChannel.socket().bind(new InetSocketAddress(9999));
serverSocketChannel.configureBlocking(false);

while(true) {
    SocketChannel socketChannel = serverSocketChannel.accept();
    if (socketChannel != null) {
        // do something with socketChannel...
    }
}
```
