//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import kotlin.*;
import lavahack.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class2118 implements Runnable
{
    final Class76 Field17637;
    private String Field17638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        Class273.Method1453((Class649)this.Field17637).Method541("auth " + AccountData.Field8161.Method2220() + ' ' + AccountData.Field8161.Method2222() + ' ' + AccountData.Field8161.Method2224());
    }
    
    Class2118(final Class76 field17637) {
        this.Field17637 = field17637;
    }
    
    private static String Method7655(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x735A ^ 0x4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
