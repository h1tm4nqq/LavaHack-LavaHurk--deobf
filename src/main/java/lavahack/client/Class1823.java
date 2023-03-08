//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.io.*;
import java.nio.*;
import java.util.zip.*;

public class Class1823 extends Class681
{
    private static final String Field16410;
    private static final String Field16411;
    private static final String Field16412;
    private static final String Field16413;
    private static final String Field16414;
    private static final int Field16415;
    private static final int Field16416;
    private static final byte[] Field16417;
    private static final int Field16418;
    private int Field16419;
    private boolean Field16420;
    private boolean Field16421;
    private Map Field16422;
    private Inflater Field16423;
    private Deflater Field16424;
    private int Field16425;
    
    public Class1823() {
        this.Field16419 = 1024;
        this.Field16420 = true;
        this.Field16421 = false;
        this.Field16422 = new LinkedHashMap();
        this.Field16423 = new Inflater(true);
        this.Field16424 = new Deflater(-1, true);
    }
    
    public Inflater Method6864() {
        return this.Field16423;
    }
    
    public void Method6865(final Inflater field16423) {
        this.Field16423 = field16423;
    }
    
    public Deflater Method6866() {
        return this.Field16424;
    }
    
    public void Method6867(final Deflater field16424) {
        this.Field16424 = field16424;
    }
    
    public int Method6868() {
        return this.Field16419;
    }
    
    public void Method6869(final int field16419) {
        this.Field16419 = field16419;
    }
    
    public boolean Method6870() {
        return this.Field16420;
    }
    
    public void Method6871(final boolean field16420) {
        this.Field16420 = field16420;
    }
    
    public boolean Method6872() {
        return this.Field16421;
    }
    
    public void Method6873(final boolean field16421) {
        this.Field16421 = field16421;
    }
    
    public void Method2866(final Class1260 class1260) throws Class23 {
        if (!(class1260 instanceof Class1446)) {
            return;
        }
        if (!class1260.Method1613() && class1260.Method1617() != Class927.Field11926) {
            return;
        }
        if (class1260.Method1617() == Class927.Field11926 && class1260.Method1613()) {
            throw new Class23(1008, "RSV1 bit can only be set for the first frame.");
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.Method6874(class1260.Method1618().array(), byteArrayOutputStream);
        if (this.Field16423.getRemaining() > 0) {
            this.Field16423 = new Inflater(true);
            this.Method6874(class1260.Method1618().array(), byteArrayOutputStream);
        }
        if (class1260.Method1612()) {
            this.Method6874(Class1823.Field16417, byteArrayOutputStream);
            if (this.Field16421) {
                this.Field16423 = new Inflater(true);
            }
        }
        ((Class494)class1260).Method1621(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
    }
    
    private void Method6874(final byte[] input, final ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        this.Field16423.setInput(input);
        final byte[] array = new byte[1024];
        int inflate;
        while ((inflate = this.Field16423.inflate(array)) > 0) {
            byteArrayOutputStream.write(array, 0, inflate);
        }
    }
    
    public void Method2867(final Class1260 class1260) {
        if (!(class1260 instanceof Class1446)) {
            return;
        }
        final byte[] array = class1260.Method1618().array();
        if (array.length < this.Field16419) {
            return;
        }
        if (!(class1260 instanceof Class1749)) {
            ((Class1446)class1260).Method1623(true);
        }
        this.Field16424.setInput(array);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array2 = new byte[1024];
        int deflate;
        while ((deflate = this.Field16424.deflate(array2, 0, array2.length, 2)) > 0) {
            byteArrayOutputStream.write(array2, 0, deflate);
        }
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        if (class1260.Method1612()) {
            if (Method6875(byteArray)) {
                length -= Class1823.Field16417.length;
            }
            if (this.Field16420) {
                this.Field16424.end();
                this.Field16424 = new Deflater(-1, true);
            }
        }
        ((Class494)class1260).Method1621(ByteBuffer.wrap(byteArray, 0, length));
    }
    
    private static boolean Method6875(final byte[] array) {
        if (array.length < 4) {
            return false;
        }
        final int length = array.length;
        for (int i = 0; i < Class1823.Field16417.length; ++i) {
            if (Class1823.Field16417[i] != array[length - Class1823.Field16417.length + i]) {
                return false;
            }
        }
        return true;
    }
    
    public boolean Method2868(final String s) {
        final String[] split = s.split(",");
        for (int length = split.length, i = 0; i < length; ++i) {
            final Class799 method3314 = Class799.Method3314(split[i]);
            if ("permessage-deflate".equalsIgnoreCase(method3314.Method3315())) {
                this.Field16422.putAll(method3314.Method3316());
                if (this.Field16422.containsKey("client_no_context_takeover")) {
                    this.Field16421 = true;
                }
                return true;
            }
        }
        return false;
    }
    
    public boolean Method2869(final String s) {
        final String[] split = s.split(",");
        for (int length = split.length, i = 0; i < length; ++i) {
            final Class799 method3314 = Class799.Method3314(split[i]);
            if ("permessage-deflate".equalsIgnoreCase(method3314.Method3315())) {
                method3314.Method3316();
                return true;
            }
        }
        return false;
    }
    
    public String Method2871() {
        this.Field16422.put("client_no_context_takeover", "");
        this.Field16422.put("server_no_context_takeover", "");
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }
    
    public String Method2872() {
        return "permessage-deflate; server_no_context_takeover" + (this.Field16421 ? "; client_no_context_takeover" : "");
    }
    
    public Class899 Method2873() {
        return (Class899)new Class1823();
    }
    
    @Override
    public void Method2870(final Class1260 class1260) throws Class23 {
        if (class1260 instanceof Class1749 && (class1260.Method1613() || class1260.Method1614() || class1260.Method1615())) {
            throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        }
        super.Method2870(class1260);
    }
    
    public String toString() {
        return "PerMessageDeflateExtension";
    }
    
    static {
        Field16418 = 1024;
        Field16416 = 32768;
        Field16415 = 32768;
        Field16414 = "client_max_window_bits";
        Field16413 = "server_max_window_bits";
        Field16412 = "client_no_context_takeover";
        Field16411 = "server_no_context_takeover";
        Field16410 = "permessage-deflate";
        Field16417 = new byte[] { 0, 0, -1, -1 };
    }
    
    private static String Method2875(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2C81 ^ 0x3B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
