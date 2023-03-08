//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

class Class1182
{
    private final Class42 Field13364;
    private final ArrayList Field13365;
    private int Field13366;
    
    public Class1182(final Class42 field13364, final ArrayList field13365) {
        this.Field13364 = field13364;
        this.Field13365 = field13365;
    }
    
    public void Method4764(final String s, final String[] array) {
    }
    
    public void Method4765(final String s, final String[] array) {
        final Iterator<Class44> iterator = this.Field13365.iterator();
        while (iterator.hasNext()) {
            Class1393.Method5506().Method1882((String)Class1135.valueOf(iterator.next().Field8087.toUpperCase()).Method4629().Method1726(new Object[0]));
        }
    }
}
