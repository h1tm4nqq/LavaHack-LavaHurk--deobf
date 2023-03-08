//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.event;

public enum Class1273
{
    Field13746("PRE", 0), 
    Field13747("POST", 1), 
    Field13748("PERI", 2);
    
    private static final Class1273[] Field13749;
    private String Field13750 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1273(final String name, final int ordinal) {
    }
    
    static {
        Field13749 = new Class1273[] { Class1273.Field13746, Class1273.Field13747, Class1273.Field13748 };
    }
    
    private static String Method5107(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4570 ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
