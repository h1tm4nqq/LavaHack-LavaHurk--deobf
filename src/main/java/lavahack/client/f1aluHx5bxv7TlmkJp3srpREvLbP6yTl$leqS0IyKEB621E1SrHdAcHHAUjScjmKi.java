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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.util.UUID;
import lavahack.client.f1aluHx5bxv7TlmkJp3srpREvLbP6yTl;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    public Vec3d Field11668;
    public BlockPos Field11669;
    public String Field11670;
    public int Field11671;
    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11672;
    public EntityOtherPlayerMP Field11673;
    public UUID Field11674;
    final f1aluHx5bxv7TlmkJp3srpREvLbP6yTl Field11675;
    private String Field11676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(f1aluHx5bxv7TlmkJp3srpREvLbP6yTl f1aluHx5bxv7TlmkJp3srpREvLbP6yTl2, EntityPlayer entityPlayer, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        this.Field11675 = f1aluHx5bxv7TlmkJp3srpREvLbP6yTl2;
        this.Field11668 = entityPlayer.getPositionVector();
        this.Field11669 = entityPlayer.getPosition();
        this.Field11670 = entityPlayer.getName();
        this.Field11671 = (int)((long)-988938768 ^ (long)988938767);
        this.Field11672 = n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(this.Field11670) ? new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.CYAN) : vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        this.Field11673 = new EntityOtherPlayerMP((World)f1aluHx5bxv7TlmkJp3srpREvLbP6yTl.Method6613().world, new GameProfile(entityPlayer.getUniqueID(), ""));
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
        String string = f1aluHx5bxv7TlmkJp3srpREvLbP6yTl.Method6614(this.Field11675).Method359();
        int n = (int)1957244160L ^ 0x8B56D2FF;
        switch (string.hashCode()) {
            case 2076646: {
                if (!string.equals("Box1")) return;
                n = (int)1653398852L ^ 0x628CDD44;
                return;
            }
            case 2076647: {
                if (!string.equals("Box2")) return;
                n = (int)1647178098L ^ 0x622DF173;
                return;
            }
            case 74517257: {
                if (!string.equals("Model")) return;
                n = ((int)1900398181L ^ 0x7145C664) << 1;
                return;
            }
        }
    }

    private static String Method3667(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1008397388L ^ 0xC3E513B4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1497076934 ^ (long)-1497076795);
            int n2 = ((int)205733774L ^ 0xC433FD9) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)432524805L ^ 0x19C7C438) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

