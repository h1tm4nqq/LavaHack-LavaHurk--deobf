//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import com.kisman.cc.util.*;

public class Class580 implements Class1367
{
    public static ArrayList Field10472;
    public static ArrayList Field10473;
    public static ArrayList Field10474;
    public static ArrayList Field10475;
    private int Field10476;
    
    private void Method2530() {
        for (final Class187 class187 : Class187.values()) {
            if (Class1952.Method7240((Enum)class187, (Class)Class2057.class)) {
                Class580.Field10472.add(class187);
            }
            if (Class1952.Method7240((Enum)class187, (Class)Class694.class)) {
                Class580.Field10473.add(class187);
            }
        }
        for (final Class1024 class188 : Class1024.values()) {
            if (Class1952.Method7240((Enum)class188, (Class)Class2057.class)) {
                Class580.Field10474.add(class188);
            }
            if (Class1952.Method7240((Enum)class188, (Class)Class694.class)) {
                Class580.Field10475.add(class188);
            }
        }
    }
    
    static {
        Class580.Field10472 = new ArrayList();
        Class580.Field10473 = new ArrayList();
        Class580.Field10474 = new ArrayList();
        Class580.Field10475 = new ArrayList();
        new Class580().Method2530();
    }
}
