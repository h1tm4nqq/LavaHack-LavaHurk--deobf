//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.lang.reflect.*;

class Class1528
{
    private final Method Field15143;
    private final Object Field15144;
    private int Field15145;
    
    public Class1528(final Method field15143, final Object field15144) {
        this.Field15143 = field15143;
        this.Field15144 = field15144;
    }
    
    public Method Method6067() {
        return this.Field15143;
    }
    
    public Object Method6068() {
        return this.Field15144;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class1528)) {
            return false;
        }
        final Class1528 class1528 = (Class1528)o;
        return this.Field15143.equals(class1528.Field15143) && this.Field15144.equals(class1528.Field15144);
    }
}
