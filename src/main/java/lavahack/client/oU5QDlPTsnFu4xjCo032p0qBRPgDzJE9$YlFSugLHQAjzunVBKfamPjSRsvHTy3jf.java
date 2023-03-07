//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import lavahack.client.oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$1;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

class oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
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

    private oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Vec3i vec3i, Vec3i vec3i2) {
        Vec3i vec3i3 = vec3i.compareTo(vec3i2) <= 0 ? vec3i : vec3i2;
        Vec3i vec3i4 = vec3i.compareTo(vec3i2) <= 0 ? vec3i2 : vec3i;
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
        this.Field15012 = (int)((long)-1251599421 ^ (long)-1251599421);
        int n = (int)((long)-1951293328 ^ (long)-1951293328);
        int n2 = this.Field14999;
        while (n2 <= this.Field15002) {
            for (int i = this.Field15000; i <= this.Field15003; ++i) {
                for (int j = this.Field14998; j <= this.Field15001; ++n, ++j) {
                    this.Field15011[n] = new Vec3i(j, n2, i);
                }
            }
            ++n2;
        }
    }

    private boolean Method5992() {
        if (this.Field15012 >= this.Field15010 - ((int)1678038014L ^ 0x6404D3FF)) {
            return (int)((long)-1552524232 ^ (long)-1552524232) != 0;
        }
        this.Field15012 += (int)1321074465L ^ 0x4EBDFF20;
        return (int)((long)-1615868367 ^ (long)-1615868367) != 0;
    }

    private Vec3i Method5993() {
        return this.Field15011[this.Field15012];
    }

    private BlockPos Method5994() {
        return new BlockPos(this.Field15011[this.Field15012]);
    }

    oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Vec3i vec3i, Vec3i vec3i2, oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$1 oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$1) {
        this(vec3i, vec3i2);
    }

    static boolean Method5995(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        return oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5992();
    }

    static BlockPos Method5996(oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        return oU5QDlPTsnFu4xjCo032p0qBRPgDzJE9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5994();
    }
}

