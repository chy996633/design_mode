package design_mode.structure.adapter;


import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 适配器模式 同样见于IO流 体系内
 * 为了支持国际化，IO 需要支持16位的Unicode，那么Reader、Writer就应运而生。
 * 但面向字符的流依然有价值，那么既不能修改原有体系，又要使用它们， 适配器模式就是一个选择。
 * 设计原则：不修改原有类，扩展新类，符合封闭开放，单一职责；
 */
public class Main {

    public static void main(String[] args) {

        Reader reader = new InputStreamReader(new ByteArrayInputStream("asdfasdf".getBytes()));

    }
}
