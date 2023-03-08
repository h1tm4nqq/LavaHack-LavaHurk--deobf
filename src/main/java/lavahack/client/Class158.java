//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import java.util.*;
import org.jetbrains.annotations.*;

public abstract class Class158 extends Class1563 implements Class2080
{
    protected static Minecraft Field8619;
    private final String Field8620;
    private String Field8621;
    private int Field8622;
    private final HashMap Field8623;
    private int Field8624;
    
    protected Class1368 Method444(final String key) {
        return this.Field8623.get(key);
    }
    
    public Class158(final String field8620) {
        this.Field8623 = new HashMap();
        this.Field8620 = field8620;
        this.Field8622 = -1;
    }
    
    protected void Method445(final Class1368... array) {
        for (final Class1368 value : array) {
            if (this.Field8623.get(value.Method442()) != null) {
                throw new Class222((Class2080)value, (Class2080)this.Field8623.get(value.Method442()));
            }
            this.Field8623.put(value.Method442(), value);
        }
    }
    
    protected void Method446(final String s, final String[] array) {
        this.Field8623.get(array[0]).Method443(s, array);
    }
    
    public abstract String Method447();
    
    public abstract String Method448();
    
    @NotNull
    @NotNull
    public String Method442() {
        return this.Field8620;
    }
    
    public int Method449() {
        return this.Field8622;
    }
    
    public void Method450(final int field8622) {
        this.Field8622 = field8622;
    }
    
    public String Method451() {
        return this.Field8621;
    }
    
    public void Method452(final String field8621) {
        this.Field8621 = field8621;
    }
    
    static {
        Class158.Field8619 = Minecraft.getMinecraft();
    }
}
