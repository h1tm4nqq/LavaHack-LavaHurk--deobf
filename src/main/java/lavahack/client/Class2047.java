//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class2047
{
    private final ArrayList Field17393;
    private String Field17394 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2047() {
        this.Field17393 = new ArrayList();
    }
    
    public void Method7569(final Class44 e) {
        if (e == null) {
            return;
        }
        this.Field17393.add(e);
    }
    
    public ArrayList Method7570() {
        return this.Field17393;
    }
    
    public ArrayList Method7571(final Class42 class42) {
        final ArrayList<Class44> list = new ArrayList<Class44>();
        for (final Class44 e : this.Method7570()) {
            if (e.Method358() == class42) {
                list.add(e);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
    
    public Class44 Method7572(final Class42 class42, final String anotherString) {
        for (final Class44 class43 : this.Method7570()) {
            if (class43 != null && class43.Method356().equalsIgnoreCase(anotherString) && class43.Method358() == class42) {
                return class43;
            }
        }
        return null;
    }
    
    public Class44 Method7573(final Class42 class42, final String s, final boolean b) {
        for (final Class44 class43 : this.Method7570()) {
            if (class43 == null) {
                continue;
            }
            if (b) {
                if (class43.Method382()) {
                    continue;
                }
                if (class43 instanceof Class1996) {
                    continue;
                }
            }
            if (s.equalsIgnoreCase(class43.Method356()) && class43.Method358() == class42) {
                return class43;
            }
        }
        return null;
    }
}
