//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.io.*;

public class Class1617
{
    public static Class1251 Field15563;
    public static boolean Field15564;
    public static boolean Field15565;
    public static boolean Field15566;
    public static boolean Field15567;
    public static String Field15568;
    private int Field15569;
    
    public static void Method6296() {
        if (Class1617.Field15563 != null) {
            Class1617.Field15563.Method5021();
            Class1617.Field15564 = true;
            Class1617.Field15565 = false;
        }
    }
    
    public static void Method6297(final String s) {
        Method6302();
        Class1617.Field15568 = s;
        (Class1617.Field15563 = new Class1251(new URL(s))).Method5034(false);
        new Thread(Class1617::Method6304).start();
    }
    
    public static void Method6298(final File file) {
        Method6302();
        (Class1617.Field15563 = new Class1251(file)).Method5034(false);
        new Class1091().start();
    }
    
    public static void Method6299() {
        if (Class1617.Field15563 != null) {
            Class1617.Field15563.Method5023();
            Class1617.Field15564 = false;
            Class1617.Field15565 = true;
        }
    }
    
    public static boolean Method6300() {
        return Class1617.Field15567;
    }
    
    public static boolean Method6301() {
        return Class1617.Field15566;
    }
    
    public static void Method6302() {
        if (Class1617.Field15563 != null) {
            Class1617.Field15563.Method5025();
            Class1617.Field15563 = null;
            Class1617.Field15568 = null;
            Class1617.Field15564 = false;
            Class1617.Field15565 = false;
        }
    }
    
    public static void Method6303(final float n) {
        if (Class1617.Field15563 != null) {
            Class1617.Field15563.Method5030((int)n);
        }
    }
    
    private static void Method6304() {
        Class1617.Field15563.Method5021();
        Class1617.Field15564 = true;
        Class1617.Field15565 = false;
    }
    
    static {
        Class1617.Field15564 = false;
        Class1617.Field15566 = true;
        Class1617.Field15568 = null;
    }
}
