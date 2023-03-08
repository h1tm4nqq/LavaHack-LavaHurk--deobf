//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;

public class Class1891
{
    private final Entity Field16708;
    private final long Field16709;
    private final float Field16710;
    private final int Field16711;
    private int Field16712;
    
    public Class1891(final Entity field16708, final long field16709, final float field16710, final int field16711) {
        this.Field16708 = field16708;
        this.Field16709 = field16709;
        this.Field16710 = field16710;
        this.Field16711 = field16711;
    }
    
    public Entity Method7002() {
        return this.Field16708;
    }
    
    public float Method7003() {
        return this.Field16710;
    }
    
    public int Method7004() {
        return this.Field16711;
    }
    
    static Entity Method7005(final Class1891 class1891) {
        return class1891.Field16708;
    }
    
    static long Method7006(final Class1891 class1891) {
        return class1891.Field16709;
    }
    
    static float Method7007(final Class1891 class1891) {
        return class1891.Field16710;
    }
}
