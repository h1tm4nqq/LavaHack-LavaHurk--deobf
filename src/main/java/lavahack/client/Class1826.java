//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class1826
{
    private final Class44 Field16431;
    private final Function Field16432;
    private final Class42 Field16433;
    private int Field16434;
    
    public Class1826(final Class44 field16431, final Function field16432) {
        this.Field16431 = field16431;
        this.Field16432 = field16432;
        this.Field16433 = field16431.Field8085;
    }
    
    public Class1826 Method6876(final Object o, final Class44... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.Field16433.Method23(array[i].Method313(this::Method6880));
        }
        return this;
    }
    
    public Class44 Method6877() {
        return this.Field16431;
    }
    
    public Function Method6878() {
        return this.Field16432;
    }
    
    public Class42 Method6879() {
        return this.Field16433;
    }
    
    private Boolean Method6880(final Object obj) {
        return this.Field16432.apply(this.Field16431).equals(obj);
    }
}
