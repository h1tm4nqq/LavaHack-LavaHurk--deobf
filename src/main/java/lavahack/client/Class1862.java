//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.*;

public class Class1862
{
    private Class422 Field16561;
    private Class410 Field16562;
    private AxisAlignedBB Field16563;
    public ArrayList Field16564;
    private int Field16565;
    
    public Class1862() {
        this(Class410.Field9697, Class422.Field9771);
    }
    
    public Class1862(final Class410 field16562, final Class422 field16563) {
        this.Field16564 = new ArrayList();
        this.Field16561 = field16563;
        this.Field16562 = field16562;
    }
    
    public void Method6956(final Class422 field16561) {
        this.Field16561 = field16561;
    }
    
    public void Method6957(final Class410 field16562) {
        this.Field16562 = field16562;
    }
    
    public void Method6958(final AxisAlignedBB field16563) {
        this.Field16563 = field16563;
    }
    
    public Class422 Method6959() {
        return this.Field16561;
    }
    
    public Class410 Method6960() {
        return this.Field16562;
    }
    
    public AxisAlignedBB Method6961() {
        return this.Field16563;
    }
}
