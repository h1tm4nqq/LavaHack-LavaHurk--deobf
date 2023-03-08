//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.*;

public class Class1589
{
    private int Field15425;
    private int Field15426;
    private int Field15427;
    private int Field15428;
    private int Field15429;
    private int Field15430;
    private int Field15431;
    private int Field15432;
    private int Field15433;
    private int Field15434;
    private BlockPos[] Field15435;
    private int Field15436;
    
    public Class1589(final Vec3i vec3i, final Vec3i vec3i2, final boolean b) {
        this.Field15435 = null;
        final Vec3i vec3i3 = (vec3i.compareTo(vec3i2) <= 0) ? vec3i : vec3i2;
        final Vec3i vec3i4 = (vec3i.compareTo(vec3i2) <= 0) ? vec3i2 : vec3i;
        this.Field15425 = vec3i3.getX();
        this.Field15426 = vec3i3.getY();
        this.Field15427 = vec3i3.getZ();
        this.Field15428 = vec3i4.getX();
        this.Field15429 = vec3i4.getY();
        this.Field15430 = vec3i4.getZ();
        this.Field15431 = this.Field15428 - this.Field15425;
        this.Field15432 = this.Field15429 - this.Field15426;
        this.Field15433 = this.Field15430 - this.Field15427;
        this.Field15434 = this.Field15431 * this.Field15432 * this.Field15433;
        if (b) {
            this.Method6243();
        }
    }
    
    public int Method6231() {
        return this.Field15425;
    }
    
    public int Method6232() {
        return this.Field15426;
    }
    
    public int Method6233() {
        return this.Field15427;
    }
    
    public int Method6234() {
        return this.Field15428;
    }
    
    public int Method6235() {
        return this.Field15429;
    }
    
    public int Method6236() {
        return this.Field15430;
    }
    
    public int Method6237() {
        return this.Field15431;
    }
    
    public int Method6238() {
        return this.Field15432;
    }
    
    public int Method6239() {
        return this.Field15433;
    }
    
    public int Method6240() {
        return this.Field15434;
    }
    
    public BlockPos[] Method6241() {
        return this.Field15435;
    }
    
    public Queue Method6242() {
        return new Class390(this.Field15435, null);
    }
    
    public void Method6243() {
        if (this.Field15435 != null) {
            return;
        }
        this.Field15435 = new BlockPos[this.Field15434];
        int n = 0;
        for (int i = this.Field15425; i <= this.Field15428; ++i) {
            for (int j = this.Field15426; j <= this.Field15429; ++j) {
                for (int k = this.Field15427; k <= this.Field15430; ++k) {
                    this.Field15435[n] = new BlockPos(i, j, k);
                    ++n;
                }
            }
        }
    }
    
    public void Method6244() {
        this.Field15435 = new BlockPos[this.Field15434];
        int n = 0;
        for (int i = this.Field15425; i <= this.Field15428; ++i) {
            for (int j = this.Field15426; j <= this.Field15429; ++j) {
                for (int k = this.Field15427; k <= this.Field15430; ++k) {
                    this.Field15435[n] = new BlockPos(i, j, k);
                    ++n;
                }
            }
        }
    }
}
