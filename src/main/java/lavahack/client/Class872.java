//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.util.UUID;
import lavahack.client.Class1737;
import lavahack.client.Class726;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class872 {
    public Vec3d Field11668;
    public BlockPos Field11669;
    public String Field11670;
    public int Field11671;
    public Class2027 Field11672;
    public EntityOtherPlayerMP Field11673;
    public UUID Field11674;
    final Class1737 Field11675;
    private String Field11676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class872(Class1737 class1737, EntityPlayer entityPlayer, Class2027 class2027) {
        this.Field11675 = class1737;
        this.Field11668 = entityPlayer.getPositionVector();
        this.Field11669 = entityPlayer.getPosition();
        this.Field11670 = entityPlayer.getName();
        this.Field11671 = -1;
        this.Field11672 = Class726.Field11086.Method3043(this.Field11670) ? new Class2027(Color.CYAN) : class2027;
        this.Field11673 = new EntityOtherPlayerMP((World)Class1737.Method6613().world, new GameProfile(entityPlayer.getUniqueID(), ""));
        this.Field11673.copyLocationAndAnglesFrom((Entity)entityPlayer);
        this.Field11673.rotationYaw = entityPlayer.rotationYaw;
        this.Field11673.rotationYawHead = entityPlayer.rotationYawHead;
        this.Field11673.rotationPitch = entityPlayer.rotationPitch;
        this.Field11673.prevRotationPitch = entityPlayer.prevRotationPitch;
        this.Field11673.prevRotationYaw = entityPlayer.prevRotationYaw;
        this.Field11673.renderYawOffset = entityPlayer.renderYawOffset;
        this.Field11674 = entityPlayer.getUniqueID();
    }

    public void Method3666(float f) {
        String string = Class1737.Method6614(this.Field11675).Method359();
        int n = -1;
        switch (string.hashCode()) {
            case 2076646: {
                if (!string.equals("Box1")) return;
                return;
            }
            case 2076647: {
                if (!string.equals("Box2")) return;
                return;
            }
            case 74517257: {
                if (!string.equals("Model")) return;
                return;
            }
        }
    }

    private static String Method3667(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 174;
            cArray2[n] = (char)(cArray[n] ^ (0x147A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

