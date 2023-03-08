//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;

public class Class13 implements Class1997
{
    private static final int Field7878;
    private static final int Field7879;
    private int Field7880;
    private int Field7881;
    private String Field7882 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class13(final int field7880, final int field7881) {
        this.Field7880 = field7880;
        this.Field7881 = field7881;
    }
    
    public Class13() {
        this(7, 7);
    }
    
    public int Method151() {
        return this.Field7880;
    }
    
    public void Method152(final int field7880) {
        this.Field7880 = field7880;
    }
    
    public int Method153() {
        return this.Field7881;
    }
    
    public void Method154(final int field7881) {
        this.Field7881 = field7881;
    }
    
    @Override
    public int[] Method149(final List list, final int n) {
        int max = -1;
        int max2 = -1;
        int field7880 = this.Field7880;
        int field7881 = this.Field7881;
        int n2 = -1;
        for (final Class1514 class1514 : list) {
            int b = field7880 + class1514.Method675() + this.Field7880;
            if (b > n) {
                field7881 += n2;
                n2 = -1;
                b = this.Field7880 + class1514.Method675() + this.Field7880;
            }
            if (class1514.Method677() + this.Field7881 > n2) {
                n2 = class1514.Method677() + this.Field7881;
            }
            max = Math.max(max, b);
            max2 = Math.max(max2, field7881 + class1514.Method677() + this.Field7881);
            field7880 = b;
        }
        return new int[] { max, max2 };
    }
    
    @Override
    public Class1834 Method150(final List list, final int n, final int n2) {
        final HashMap<Class1514, int[]> hashMap = new HashMap<Class1514, int[]>();
        int n3 = this.Field7880;
        int field7881 = this.Field7881;
        int n4 = -1;
        for (final Class1514 key : list) {
            int n5 = n3 + key.Method675() + this.Field7880;
            if (n5 > n) {
                field7881 += n4;
                n4 = -1;
                n3 = this.Field7880;
                n5 = n3 + key.Method675() + this.Field7880;
            }
            if (key.Method677() + this.Field7881 > n4) {
                n4 = key.Method677() + this.Field7881;
            }
            hashMap.put(key, new int[] { n3, field7881 });
            n3 = n5;
        }
        return new Class1834(hashMap, hashMap.entrySet().stream().map((Function<? super Object, ?>)Class13::Method156).max(Integer::compareTo).orElse(0), hashMap.entrySet().stream().map((Function<? super Object, ?>)Class13::Method155).max(Integer::compareTo).orElse(0));
    }
    
    private static Integer Method155(final Map.Entry entry) {
        return ((int[])(Object)entry.getValue())[0] + entry.getKey().Method675();
    }
    
    private static Integer Method156(final Map.Entry entry) {
        return ((int[])(Object)entry.getValue())[1] + entry.getKey().Method677();
    }
    
    static {
        Field7879 = 7;
        Field7878 = 7;
    }
}
