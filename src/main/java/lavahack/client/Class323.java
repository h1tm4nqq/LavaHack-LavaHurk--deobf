//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public interface Class323
{
    void Method1633(final Class p0);
    
    void Method1634(final Object p0);
    
    void Method1635(final Class p0);
    
    void Method1636(final Object p0);
    
    void Method1637(final Object p0);
    
    default void Method1638(final Object o, final Predicate... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (!array[i].test(o)) {
                return;
            }
        }
        this.Method1637(o);
    }
    
    default Class323 Method1639() {
        return (Class323)new Class1522();
    }
}
