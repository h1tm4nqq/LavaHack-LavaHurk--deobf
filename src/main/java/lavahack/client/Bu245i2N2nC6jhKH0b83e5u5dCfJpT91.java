//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderEye
 *  net.minecraft.util.math.Vec2f
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.Iterator;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.util.math.Vec2f;

public class Bu245i2N2nC6jhKH0b83e5u5dCfJpT91
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private EntityEnderEye Field10595;
    private boolean Field10596 = (int)-695520022L ^ 0xD68B34EA;
    private EntityEnderEye Field10597;
    private boolean Field10598 = (int)1110225696L ^ 0x422CB320;
    Vec2f Field10599;
    Vec2f Field10600;
    Vec2f Field10601;
    Vec2f Field10602;
    Vec2f Field10603;
    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10604 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10605 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-987233768 ^ (long)-987233768));
    private String Field10606 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Bu245i2N2nC6jhKH0b83e5u5dCfJpT91() {
        super("StrongholdFinder", "this", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10605);
    }

    @Override
    public void Method38() {
        if (this.Field10605.Method365()) {
            return;
        }
        Iterator iterator = Bu245i2N2nC6jhKH0b83e5u5dCfJpT91.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderEye)) continue;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Yaw: " + entity.rotationYaw);
        }
    }

    @Override
    public void Method45() {
        if (this.Field10605.Method365()) {
            return;
        }
        if (this.Field10604.Method2779(0x28113C8L & 0x441B9FL, ((int)1841648515L ^ 0x6DC55383) != 0) && this.Field10598) {
            this.Field10596 = (int)-33240016L ^ 0xFE04CC30;
            this.Field10598 = (int)499243844L ^ 0x1DC1DB44;
            this.Field10595 = null;
            this.Field10597 = null;
        }
        for (Entity entity : Bu245i2N2nC6jhKH0b83e5u5dCfJpT91.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (!(entity instanceof EntityEnderEye)) continue;
            EntityEnderEye entityEnderEye = (EntityEnderEye)entity;
            if (this.Field10595 == null && !entityEnderEye.isEntityEqual((Entity)this.Field10597)) {
                this.Field10595 = entityEnderEye;
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("First eye found, please throw the next one a lot further away!");
                continue;
            }
            if (this.Field10597 != null || entityEnderEye.isEntityEqual((Entity)this.Field10595)) continue;
            this.Field10597 = entityEnderEye;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Second eye found, calculating intersection...");
        }
        if (this.Field10595 != null && !this.Field10596) {
            if (this.Field10595.ticksExisted < (int)((long)492838070 ^ (long)492838067) << 1) return;
            if (this.Field10595.ticksExisted > ((int)-359375983L ^ 0xEA945B94) << 2) {
                return;
            }
            this.Field10599 = new Vec2f((float)this.Field10595.lastTickPosX, (float)this.Field10595.lastTickPosZ);
            this.Field10600 = new Vec2f((float)this.Field10595.posX, (float)this.Field10595.posZ);
            this.Field10596 = (int)1132030193L ^ 0x437968F0;
        }
        if (this.Field10597 != null && !this.Field10598) {
            if (this.Field10597.ticksExisted < (int)((long)-1245821105 ^ (long)-1245821110) << 1) return;
            if (this.Field10597.ticksExisted > ((int)1172210228L ^ 0x45DE8231) << 2) {
                return;
            }
            this.Field10601 = new Vec2f((float)this.Field10597.lastTickPosX, (float)this.Field10597.lastTickPosZ);
            this.Field10602 = new Vec2f((float)this.Field10597.posX, (float)this.Field10597.posZ);
            this.Field10598 = (int)-1285006780L ^ 0xB3685A45;
        }
        if (!this.Field10596) return;
        if (!this.Field10598) return;
        if (!this.Field10604.Method2779(0x40223774L & 0x13199770L, (boolean)((long)-763821437 ^ (long)-763821437))) return;
        this.Field10604.Method2801();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1764164489L ^ 0x96D8FC77;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)176768380 ^ (long)176768387);
            int n2 = (int)((long)-2085996197 ^ (long)-2085996154);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)882732690 ^ (long)882711939) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

