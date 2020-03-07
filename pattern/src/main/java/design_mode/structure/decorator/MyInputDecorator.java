package design_mode.structure.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyInputDecorator extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected MyInputDecorator(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b) throws IOException {
        int num = super.read(b);
        b[b.length-3] = 'c';
        b[b.length-2] = 'h';
        b[b.length-1] = 'y';
        return num;
    }
}
