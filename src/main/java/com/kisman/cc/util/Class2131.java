//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

public class Class2131
{
    private String Field17692 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static CharSequence Method7669(final CharSequence[] array, final int n, final int b) {
        final StringBuilder sb = new StringBuilder(array.length * 8);
        for (int min = Math.min(array.length, b), i = n; i < min; ++i) {
            sb.append(array[i]);
            if (i < min - 1) {
                sb.append(' ');
            }
        }
        return sb;
    }
}
