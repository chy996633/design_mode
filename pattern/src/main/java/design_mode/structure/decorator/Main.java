package design_mode.structure.decorator;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 使用JDK的例子作为示范
 * InputStream， OutputStream 表示抽象的流入\流出对象
 * 要在这种流上做处理，想要一次性处理多个字节，就会涉及到缓存；还会涉及到过滤、管道等概念。
 * 这时候使用装饰器 就是一个好时机，可以在 流对象 之上增加职责，而不是在流内部增加许多额外功能。
 * 设计原则：因为额外职责是可变的，不应该放入流对象内，符合单一职责。 当需要扩展，新增类就可以做到，满足封闭开放原则。
 */
public class Main {

    public static void main(String[] args) throws IOException {

        InputStream bIns = new BufferedInputStream(new ByteArrayInputStream(new byte[] {'c','1'}));
//        InputStream fbIns = new BufferedInputStream(new FileInputStream(""));
        InputStream myIns = new MyInputDecorator(new ByteArrayInputStream("abcdefg".getBytes()));
        byte[] bArr = new byte[5];
        myIns.read(bArr);
        System.out.println(new String(bArr));
    }

}
