//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.loader;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import lavahack.loader.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
final class Class1451 extends Lambda implements Function0
{
    public static final Class1451 Field14799;
    private int Field14800;
    
    public Object invoke() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        return Unit.INSTANCE;
    }
    
    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        Class328.Method1647();
        Class1204.Method4865();
        Class1204.Method4859("2.0");
        while (!Class1204.Method4849()) {
            Thread.sleep(5000L);
        }
        Class1204.Method4860("2.0");
        while (!Class1204.Method4851()) {
            Thread.sleep(5000L);
        }
        Class1204.Method4856();
    }
    
    Class1451() {
        super(0);
    }
    
    static {
        Field14799 = new Class1451();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3986 ^ 0x44));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
