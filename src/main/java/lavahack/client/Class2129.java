//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import java.util.*;

public abstract class Class2129
{
    protected Class803 Field17682;
    protected Class927 Field17683;
    private String Field17684 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2129() {
        this.Field17682 = null;
        this.Field17683 = null;
    }
    
    public static ByteBuffer Method4392(final ByteBuffer byteBuffer) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte value = 48;
        while (byteBuffer.hasRemaining()) {
            value = byteBuffer.get();
            allocate.put(value);
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }
    
    public static String Method4393(final ByteBuffer byteBuffer) {
        final ByteBuffer method4392 = Method4392(byteBuffer);
        return (method4392 == null) ? null : Class176.Method1097(method4392.array(), 0, method4392.limit());
    }
    
    public static Class172 Method4394(final ByteBuffer byteBuffer, final Class803 class803) throws Class71 {
        final String method4393 = Method4393(byteBuffer);
        if (method4393 == null) {
            throw new Class1598(byteBuffer.capacity() + 128);
        }
        final String[] split = method4393.split(" ", 3);
        if (split.length != 3) {
            throw new Class71();
        }
        Class172 class804;
        if (class803 == Class803.Field11414) {
            class804 = Method4396(split, method4393);
        }
        else {
            class804 = Method4395(split, method4393);
        }
        String s;
        for (s = Method4393(byteBuffer); s != null && s.length() > 0; s = Method4393(byteBuffer)) {
            final String[] split2 = s.split(":", 2);
            if (split2.length != 2) {
                throw new Class71("not an http header");
            }
            if (class804.Method3(split2[0])) {
                class804.Method6(split2[0], class804.Method2(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
            }
            else {
                class804.Method6(split2[0], split2[1].replaceFirst("^ +", ""));
            }
        }
        if (s == null) {
            throw new Class1598();
        }
        return class804;
    }
    
    private static Class172 Method4395(final String[] array, final String s) throws Class71 {
        if (!"GET".equalsIgnoreCase(array[0])) {
            throw new Class71(String.format("Invalid request method received: %s Status line: %s", array[0], s));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(array[2])) {
            throw new Class71(String.format("Invalid status line received: %s Status line: %s", array[2], s));
        }
        final Class2049 class2049 = new Class2049();
        ((Class1892)class2049).Method7008(array[1]);
        return (Class172)class2049;
    }
    
    private static Class172 Method4396(final String[] array, final String s) throws Class71 {
        if (!"101".equals(array[1])) {
            throw new Class71(String.format("Invalid status code received: %s Status line: %s", array[1], s));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(array[0])) {
            throw new Class71(String.format("Invalid status line received: %s Status line: %s", array[0], s));
        }
        final Class1417 class1417 = new Class1417();
        final Class1692 class1418 = (Class1692)class1417;
        class1418.Method5671(Short.parseShort(array[1]));
        class1418.Method5672(array[2]);
        return (Class172)class1417;
    }
    
    public abstract Class1597 Method4397(final Class481 p0, final Class482 p1) throws Class71;
    
    public abstract Class1597 Method4398(final Class481 p0) throws Class71;
    
    protected boolean Method4399(final Class739 class739) {
        return class739.Method2("Upgrade").equalsIgnoreCase("websocket") && class739.Method2("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }
    
    public abstract ByteBuffer Method4400(final Class1260 p0);
    
    public abstract List Method4401(final ByteBuffer p0, final boolean p1);
    
    public abstract List Method4402(final String p0, final boolean p1);
    
    public abstract void Method4403(final Class1302 p0, final Class1260 p1) throws Class23;
    
    public List Method4404(final Class927 class927, final ByteBuffer byteBuffer, final boolean b) {
        if (class927 != Class927.Field11928 && class927 != Class927.Field11927) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        Object o = null;
        if (this.Field17683 != null) {
            o = new Class1749();
        }
        else if ((this.Field17683 = class927) == Class927.Field11928) {
            o = new Class1275();
        }
        else if (class927 == Class927.Field11927) {
            o = new Class370();
        }
        ((Class1446)o).Method1621(byteBuffer);
        ((Class1446)o).Method1622(b);
        ((Class1446)o).Method1620();
        if (b) {
            this.Field17683 = null;
        }
        else {
            this.Field17683 = class927;
        }
        return Collections.singletonList(o);
    }
    
    public abstract void Method4405();
    
    @Deprecated
    @Deprecated
    public List Method4406(final Class739 class739, final Class803 class740) {
        return this.Method4407(class739);
    }
    
    public List Method4407(final Class739 class739) {
        return this.Method4409(class739, true);
    }
    
    @Deprecated
    @Deprecated
    public List Method4408(final Class739 class739, final Class803 class740, final boolean b) {
        return this.Method4409(class739, b);
    }
    
    public List Method4409(final Class739 class739, final boolean b) {
        final StringBuilder sb = new StringBuilder(100);
        if (class739 instanceof Class481) {
            sb.append("GET ").append(((Class481)class739).Method2233()).append(" HTTP/1.1");
        }
        else {
            if (!(class739 instanceof Class482)) {
                throw new IllegalArgumentException("unknown role");
            }
            sb.append("HTTP/1.1 101 ").append(((Class482)class739).Method2235());
        }
        sb.append("\r\n");
        final Iterator method1 = class739.Method1();
        while (method1.hasNext()) {
            final String str = method1.next();
            final String method2 = class739.Method2(str);
            sb.append(str);
            sb.append(": ");
            sb.append(method2);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        final byte[] method3 = Class176.Method1095(sb.toString());
        final byte[] src = (byte[])(b ? class739.Method4() : null);
        final ByteBuffer allocate = ByteBuffer.allocate(((src == null) ? 0 : src.length) + method3.length);
        allocate.put(method3);
        if (src != null) {
            allocate.put(src);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }
    
    public abstract Class1892 Method4410(final Class1892 p0) throws Class71;
    
    public abstract Class172 Method4411(final Class481 p0, final Class1692 p1) throws Class71;
    
    public abstract List Method4412(final ByteBuffer p0) throws Class23;
    
    public abstract Class673 Method4413();
    
    public abstract Class2129 Method4414();
    
    public Class739 Method4415(final ByteBuffer byteBuffer) throws Class71 {
        return (Class739)Method4394(byteBuffer, this.Field17682);
    }
    
    public int Method4416(final int n) throws Class23 {
        if (n < 0) {
            throw new Class23(1002, "Negative count");
        }
        return n;
    }
    
    int Method4417(final Class739 class739) {
        final String method2 = class739.Method2("Sec-WebSocket-Version");
        if (method2.length() > 0) {
            return Integer.parseInt(method2.trim());
        }
        return -1;
    }
    
    public void Method4418(final Class803 field17682) {
        this.Field17682 = field17682;
    }
    
    public Class803 Method4419() {
        return this.Field17682;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    private static String Method4420(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x593D ^ 0x30));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
