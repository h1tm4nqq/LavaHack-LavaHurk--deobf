//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.item.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.*;
import java.util.*;

public class Class610 extends Class42
{
    private EntityEnderEye Field10595;
    private boolean Field10596;
    private EntityEnderEye Field10597;
    private boolean Field10598;
    Vec2f Field10599;
    Vec2f Field10600;
    Vec2f Field10601;
    Vec2f Field10602;
    Vec2f Field10603;
    private Class650 Field10604;
    private Class44 Field10605;
    private String Field10606 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class610() {
        super("StrongholdFinder", "this", Class97.Field8344);
        this.Field10596 = false;
        this.Field10598 = false;
        this.Field10604 = new Class650();
        this.Field10605 = new Class44("Mode", (Class42)this, false);
        Class610.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field10605);
    }
    
    public void Method38() {
        if (!this.Field10605.Method365()) {
            for (final Entity entity : Class610.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
                if (entity instanceof EntityEnderEye) {
                    Class1393.Method5503().Method1886("Yaw: " + entity.rotationYaw);
                }
            }
        }
    }
    
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
        for (final Entity entity : Class610.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (entity instanceof EntityEnderEye) {
                final EntityEnderEye entityEnderEye = (EntityEnderEye)entity;
                if (this.Field10595 == null && !entityEnderEye.isEntityEqual((Entity)this.Field10597)) {
                    this.Field10595 = entityEnderEye;
                    Class1393.Method5506().Method1886("First eye found, please throw the next one a lot further away!");
                }
                else {
                    if (this.Field10597 != null || entityEnderEye.isEntityEqual((Entity)this.Field10595)) {
                        continue;
                    }
                    this.Field10597 = entityEnderEye;
                    Class1393.Method5503().Method1886("Second eye found, calculating intersection...");
                }
            }
        }
        if (this.Field10595 != null && !this.Field10596) {
            if (this.Field10595.ticksExisted < 10 || this.Field10595.ticksExisted > 20) {
                return;
            }
            this.Field10599 = new Vec2f((float)this.Field10595.lastTickPosX, (float)this.Field10595.lastTickPosZ);
            this.Field10600 = new Vec2f((float)this.Field10595.posX, (float)this.Field10595.posZ);
            this.Field10596 = true;
        }
        if (this.Field10597 != null && !this.Field10598) {
            if (this.Field10597.ticksExisted < 10 || this.Field10597.ticksExisted > 20) {
                return;
            }
            this.Field10601 = new Vec2f((float)this.Field10597.lastTickPosX, (float)this.Field10597.lastTickPosZ);
            this.Field10602 = new Vec2f((float)this.Field10597.posX, (float)this.Field10597.posZ);
            this.Field10598 = true;
        }
        if (this.Field10596 && this.Field10598 && this.Field10604.Method2779(6000L, false)) {
            this.Field10604.Method2801();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7311 ^ 0xDD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
