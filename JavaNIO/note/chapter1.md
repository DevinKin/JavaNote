- [Java NIO 教程](#sec-1)
  - [Java NIO: Channels and Buffers](#sec-1-1)
  - [Java NIO: Non-blocking IO](#sec-1-2)
  - [Java NIO: Selectors](#sec-1-3)

# Java NIO 教程<a id="sec-1"></a>

Java NIO (New IO)是Java的新(替代)IO(Java 1.4开始提供)，这里的替代是指替代Java标准IO和Java网络IO。Java NIO提供了与标准IO不同的使用IO方式。

## Java NIO: Channels and Buffers<a id="sec-1-1"></a>

在标准的IO API中使用的是字节流和字符流，而在NIO中你将使用channels和buffers。数据总是从channel中读入到buffer，或者从buffer写数据到channel。

## Java NIO: Non-blocking IO<a id="sec-1-2"></a>

Java NIO支持非阻塞IO。例如，一个线程可以向channel读数据到buffer。当线程在读取数据到buffer时，线程可以做其他事情。一旦数据被读入到了buffer，线程就可以继续处理它自己的事。将数据写入channel也是如此。

## Java NIO: Selectors<a id="sec-1-3"></a>

Java NIO 包含了选择器的概念。选择器是一个可以监视多个通道时间(例如打开连接、数据到达等)。因此，单个线程可以监视多个管道的数据。
