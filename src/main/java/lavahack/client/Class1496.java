//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

class Class1496
{
    int Field14998;
    int Field14999;
    int Field15000;
    int Field15001;
    int Field15002;
    int Field15003;
    int Field15004;
    int Field15005;
    int Field15006;
    int Field15007;
    int Field15008;
    int Field15009;
    int Field15010;
    Vec3i[] Field15011;
    int Field15012;
    private String Field15013 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1496(final Vec3i vec3i, final Vec3i vec3i2) {
        final Vec3i vec3i3 = (vec3i.compareTo(vec3i2) <= 0) ? vec3i : vec3i2;
        final Vec3i vec3i4 = (vec3i.compareTo(vec3i2) <= 0) ? vec3i2 : vec3i;
        this.Field14998 = vec3i3.getX();
        this.Field14999 = vec3i3.getY();
        this.Field15000 = vec3i3.getZ();
        this.Field15001 = vec3i4.getX();
        this.Field15002 = vec3i4.getY();
        this.Field15003 = vec3i4.getZ();
        this.Field15004 = this.Field15001 - this.Field14998;
        this.Field15005 = this.Field15002 - this.Field14999;
        this.Field15006 = this.Field15003 - this.Field15000;
        this.Field15007 = this.Field14998;
        this.Field15008 = this.Field14999;
        this.Field15009 = this.Field15000;
        this.Field15010 = this.Field15004 * this.Field15005 * this.Field15006;
        this.Field15011 = new Vec3i[this.Field15010];
        this.Field15012 = 0;
        int n = 0;
        for (int i = this.Field14999; i <= this.Field15002; ++i) {
            for (int j = this.Field15000; j <= this.Field15003; ++j) {
                for (int k = this.Field14998; k <= this.Field15001; ++k) {
                    this.Field15011[n] = new Vec3i(k, i, j);
                    ++n;
                }
            }
        }
    }
    
    private boolean Method5992() {
        if (this.Field15012 >= this.Field15010 - 1) {
            return false;
        }
        ++this.Field15012;
        return false;
    }
    
    private Vec3i Method5993() {
        return this.Field15011[this.Field15012];
    }
    
    private BlockPos Method5994() {
        return new BlockPos(this.Field15011[this.Field15012]);
    }
    
    Class1496(final Vec3i vec3i, final Vec3i vec3i2, final Class286 class286) {
        this(vec3i, vec3i2);
    }
    
    static boolean Method5995(final Class1496 class1496) {
        return class1496.Method5992();
    }
    
    static BlockPos Method5996(final Class1496 class1496) {
        return class1496.Method5994();
    }
}
