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

import com.kisman.cc.util.Class650;
import java.util.Iterator;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.util.math.Vec2f;

public class Class610
extends Class42 {
    private EntityEnderEye Field10595;
    private boolean Field10596 = false;
    private EntityEnderEye Field10597;
    private boolean Field10598 = false;
    Vec2f Field10599;
    Vec2f Field10600;
    Vec2f Field10601;
    Vec2f Field10602;
    Vec2f Field10603;
    private Class650 Field10604 = new Class650();
    private Class44 Field10605 = new Class44("Mode", (Class42)this, false);
    private String Field10606 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class610() {
        super("StrongholdFinder", "this", Class97.Field8344);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10605);
    }

    @Override
    public void Method38() {
        if (this.Field10605.Method365()) {
            return;
        }
        Iterator iterator = Class610.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderEye)) continue;
            Class1393.Method5503().Method1886("Yaw: " + entity.rotationYaw);
        }
    }

    @Override
    public void Method45() {
        if (this.Field10605.Method365()) {
            return;
        }
        if (this.Field10604.Method2779(5000L, false) && this.Field10598) {
            this.Field10596 = false;
            this.Field10598 = false;
            this.Field10595 = null;
            this.Field10597 = null;
        }
        for (Entity entity : Class610.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (!(entity instanceof EntityEnderEye)) continue;
            EntityEnderEye entityEnderEye = (EntityEnderEye)entity;
            if (this.Field10595 == null && !entityEnderEye.isEntityEqual((Entity)this.Field10597)) {
                this.Field10595 = entityEnderEye;
                Class1393.Method5506().Method1886("First eye found, please throw the next one a lot further away!");
                continue;
            }
            if (this.Field10597 != null || entityEnderEye.isEntityEqual((Entity)this.Field10595)) continue;
            this.Field10597 = entityEnderEye;
            Class1393.Method5503().Method1886("Second eye found, calculating intersection...");
        }
        if (this.Field10595 != null && !this.Field10596) {
            if (this.Field10595.ticksExisted < 10) return;
            if (this.Field10595.ticksExisted > 20) {
                return;
            }
            this.Field10599 = new Vec2f((float)this.Field10595.lastTickPosX, (float)this.Field10595.lastTickPosZ);
            this.Field10600 = new Vec2f((float)this.Field10595.posX, (float)this.Field10595.posZ);
            this.Field10596 = true;
        }
        if (this.Field10597 != null && !this.Field10598) {
            if (this.Field10597.ticksExisted < 10) return;
            if (this.Field10597.ticksExisted > 20) {
                return;
            }
            this.Field10601 = new Vec2f((float)this.Field10597.lastTickPosX, (float)this.Field10597.lastTickPosZ);
            this.Field10602 = new Vec2f((float)this.Field10597.posX, (float)this.Field10597.posZ);
            this.Field10598 = true;
        }
        if (!this.Field10596) return;
        if (!this.Field10598) return;
        if (!this.Field10604.Method2779(6000L, false)) return;
        this.Field10604.Method2801();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 221;
            cArray2[n] = (char)(cArray[n] ^ (0x7311 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

