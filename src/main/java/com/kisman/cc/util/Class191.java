//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import kotlin.*;
import lavahack.client.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0005" }, d2 = { "runnables", "", "Ljava/lang/Runnable;", "check", "", "kisman.cc" })
public final class Class191
{
    private static List Field8845;
    private String Field8846 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static final void Method1148() {
        if (AccountData.Field8161.Method2220() != null && AccountData.Field8161.Method2222() != null) {
            if (AccountData.Field8161.Method2226().length() == 0) {}
            if (AccountData.Field8161.Method2228().length == 0) {}
            Class886.Method3718().get(AccountData.Field8161.Method2226());
            final Class2118 class2118 = new Class2118(new Class76());
            Class191.Field8845.add(class2118);
            class2118.run();
            return;
        }
        Class1796.Field16243.error("Error Code: 0x0003");
        Class1796.Method6791();
    }
    
    static {
        Class191.Field8845 = new ArrayList();
    }
    
    public static final List Method1149() {
        return Class191.Field8845;
    }
    
    public static final void Method1150(final List field8845) {
        Class191.Field8845 = field8845;
    }
    
    private static String Method1151(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AA7 ^ 0xA2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
