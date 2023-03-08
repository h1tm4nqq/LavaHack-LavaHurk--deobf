//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.google.common.base.*;
import java.util.*;

final class Class1625 implements Predicate
{
    final Map.Entry Field15603;
    private int Field15604;
    
    Class1625(final Map.Entry field15603) {
        this.Field15603 = field15603;
    }
    
    public boolean Method6356(final Comparable comparable) {
        return comparable != null && comparable.equals(this.Field15603.getValue());
    }
    
    public boolean Method6357(final Object o) {
        return this.Method6356((Comparable)o);
    }
}
