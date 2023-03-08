//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.*;
import java.util.*;

public abstract class Class26
{
    protected Class700 Field7916;
    protected Class1753 Field7917;
    private String Field7918 = "TheKisDevs & LavaHack Development owns you";
    
    public Class26() {
        this.Field7916 = null;
        this.Field7917 = null;
    }
    
    public static ByteBuffer Method195(final ByteBuffer byteBuffer) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte value = 48;
        while (byteBuffer.hasRemaining()) {
            value = byteBuffer.get();
            allocate.put(value);
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }
    
    public static String Method196(final ByteBuffer byteBuffer) {
        final ByteBuffer method195 = Method195(byteBuffer);
        return (method195 == null) ? null : Class1105.Method4528(method195.array(), 0, method195.limit());
    }
    
    public static Class1213 Method197(final ByteBuffer byteBuffer, final Class700 class700) throws Class241 {
        final String method196 = Method196(byteBuffer);
        if (method196 == null) {
            throw new Class678(byteBuffer.capacity() + 128);
        }
        final String[] split = method196.split(" ", 3);
        if (split.length != 3) {
            throw new Class241();
        }
        Class1213 class701;
        if (class700 == Class700.Field10968) {
            class701 = Method199(split, method196);
        }
        else {
            class701 = Method198(split, method196);
        }
        String s;
        for (s = Method196(byteBuffer); s != null && s.length() > 0; s = Method196(byteBuffer)) {
            final String[] split2 = s.split(":", 2);
            if (split2.length != 2) {
                throw new Class241("not an http header");
            }
            if (class701.Method181(split2[0])) {
                class701.Method184(split2[0], class701.Method180(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
            }
            else {
                class701.Method184(split2[0], split2[1].replaceFirst("^ +", ""));
            }
        }
        if (s == null) {
            throw new Class678();
        }
        return class701;
    }
    
    private static Class1213 Method198(final String[] array, final String s) throws Class241 {
        if (!"GET".equalsIgnoreCase(array[0])) {
            throw new Class241(String.format("Invalid request method received: %s Status line: %s", array[0], s));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(array[2])) {
            throw new Class241(String.format("Invalid status line received: %s Status line: %s", array[2], s));
        }
        final Class19 class19 = new Class19();
        ((Class45)class19).Method187(array[1]);
        return (Class1213)class19;
    }
    
    private static Class1213 Method199(final String[] array, final String s) throws Class241 {
        if (!"101".equals(array[1])) {
            throw new Class241(String.format("Invalid status code received: %s Status line: %s", array[1], s));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(array[0])) {
            throw new Class241(String.format("Invalid status line received: %s Status line: %s", array[0], s));
        }
        final Class1230 class1230 = new Class1230();
        final Class1333 class1231 = (Class1333)class1230;
        class1231.Method4951(Short.parseShort(array[1]));
        class1231.Method4952(array[2]);
        return (Class1213)class1230;
    }
    
    public abstract Class1550 Method200(final Class359 p0, final Class1236 p1) throws Class241;
    
    public abstract Class1550 Method201(final Class359 p0) throws Class241;
    
    protected boolean Method202(final Class1181 class1181) {
        return class1181.Method180("Upgrade").equalsIgnoreCase("websocket") && class1181.Method180("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }
    
    public abstract ByteBuffer Method203(final Class1926 p0);
    
    public abstract List Method204(final ByteBuffer p0, final boolean p1);
    
    public abstract List Method205(final String p0, final boolean p1);
    
    public abstract void Method206(final Class1282 p0, final Class1926 p1) throws Class902;
    
    public List Method207(final Class1753 class1753, final ByteBuffer byteBuffer, final boolean b) {
        if (class1753 != Class1753.Field16035 && class1753 != Class1753.Field16034) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        Object o = null;
        if (this.Field7917 != null) {
            o = new Class1462();
        }
        else if ((this.Field7917 = class1753) == Class1753.Field16035) {
            o = new Class1864();
        }
        else if (class1753 == Class1753.Field16034) {
            o = new Class213();
        }
        ((Class609)o).Method85(byteBuffer);
        ((Class609)o).Method86(b);
        ((Class609)o).Method84();
        if (b) {
            this.Field7917 = null;
        }
        else {
            this.Field7917 = class1753;
        }
        return Collections.singletonList(o);
    }
    
    public abstract void Method208();
    
    @Deprecated
    @Deprecated
    public List Method209(final Class1181 class1181, final Class700 class1182) {
        return this.Method210(class1181);
    }
    
    public List Method210(final Class1181 class1181) {
        return this.Method212(class1181, true);
    }
    
    @Deprecated
    @Deprecated
    public List Method211(final Class1181 class1181, final Class700 class1182, final boolean b) {
        return this.Method212(class1181, b);
    }
    
    public List Method212(final Class1181 class1181, final boolean b) {
        final StringBuilder sb = new StringBuilder(100);
        if (class1181 instanceof Class359) {
            sb.append("GET ").append(((Class359)class1181).Method186()).append(" HTTP/1.1");
        }
        else {
            if (!(class1181 instanceof Class1236)) {
                throw new IllegalArgumentException("unknown role");
            }
            sb.append("HTTP/1.1 101 ").append(((Class1236)class1181).Method4950());
        }
        sb.append("\r\n");
        final Iterator method179 = class1181.Method179();
        while (method179.hasNext()) {
            final String str = method179.next();
            final String method180 = class1181.Method180(str);
            sb.append(str);
            sb.append(": ");
            sb.append(method180);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        final byte[] method181 = Class1105.Method4526(sb.toString());
        final byte[] src = (byte[])(b ? class1181.Method182() : null);
        final ByteBuffer allocate = ByteBuffer.allocate(((src == null) ? 0 : src.length) + method181.length);
        allocate.put(method181);
        if (src != null) {
            allocate.put(src);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }
    
    public abstract Class45 Method213(final Class45 p0) throws Class241;
    
    public abstract Class1213 Method214(final Class359 p0, final Class1333 p1) throws Class241;
    
    public abstract List Method215(final ByteBuffer p0) throws Class902;
    
    public abstract Class1159 Method216();
    
    public abstract Class26 Method217();
    
    public Class1181 Method218(final ByteBuffer byteBuffer) throws Class241 {
        return (Class1181)Method197(byteBuffer, this.Field7916);
    }
    
    public int Method219(final int n) throws Class902 {
        if (n < 0) {
            throw new Class902(1002, "Negative count");
        }
        return n;
    }
    
    int Method220(final Class1181 class1181) {
        final String method180 = class1181.Method180("Sec-WebSocket-Version");
        if (method180.length() > 0) {
            return Integer.parseInt(method180.trim());
        }
        return -1;
    }
    
    public void Method221(final Class700 field7916) {
        this.Field7916 = field7916;
    }
    
    public Class700 Method222() {
        return this.Field7916;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    private static String Method223(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1ED2 ^ 0xE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
