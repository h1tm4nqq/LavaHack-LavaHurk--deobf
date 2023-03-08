//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class1361
{
    private Object Field14195;
    private Object Field14196;
    private int Field14197;
    
    public Class1361(final Object field14195, final Object field14196) {
        this.Field14195 = field14195;
        this.Field14196 = field14196;
    }
    
    public Object Method5431() {
        return this.Field14195;
    }
    
    public void Method5432(final Object field14195) {
        this.Field14195 = field14195;
    }
    
    public Object Method5433() {
        return this.Field14196;
    }
    
    public void Method5434(final Object field14196) {
        this.Field14196 = field14196;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class1361)) {
            return false;
        }
        final Class1361 class1361 = (Class1361)o;
        return Objects.equals(this.Field14195, class1361.Field14195) && Objects.equals(this.Field14196, class1361.Field14196);
    }
}
