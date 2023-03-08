//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import net.minecraft.client.entity.*;
import java.util.*;
import net.minecraft.entity.player.*;
import java.awt.*;
import com.mojang.authlib.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;

public class Class872
{
    public Vec3d Field11668;
    public BlockPos Field11669;
    public String Field11670;
    public int Field11671;
    public Class2027 Field11672;
    public EntityOtherPlayerMP Field11673;
    public UUID Field11674;
    final Class1737 Field11675;
    private String Field11676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class872(final Class1737 field11675, final EntityPlayer entityPlayer, final Class2027 class2027) {
        this.Field11675 = field11675;
        this.Field11668 = entityPlayer.getPositionVector();
        this.Field11669 = entityPlayer.getPosition();
        this.Field11670 = entityPlayer.getName();
        this.Field11671 = -1;
        this.Field11672 = (Class726.Field11086.Method3043(this.Field11670) ? new Class2027(Color.CYAN) : class2027);
        (this.Field11673 = new EntityOtherPlayerMP((World)Class1737.Method6613().world, new GameProfile(entityPlayer.getUniqueID(), ""))).copyLocationAndAnglesFrom((Entity)entityPlayer);
        this.Field11673.rotationYaw = entityPlayer.rotationYaw;
        this.Field11673.rotationYawHead = entityPlayer.rotationYawHead;
        this.Field11673.rotationPitch = entityPlayer.rotationPitch;
        this.Field11673.prevRotationPitch = entityPlayer.prevRotationPitch;
        this.Field11673.prevRotationYaw = entityPlayer.prevRotationYaw;
        this.Field11673.renderYawOffset = entityPlayer.renderYawOffset;
        this.Field11674 = entityPlayer.getUniqueID();
    }
    
    public void Method3666(final float n) {
        final String method359 = Class1737.Method6614(this.Field11675).Method359();
        switch (method359.hashCode()) {
            case 2076646: {
                if (method359.equals("Box1")) {
                    break;
                }
                break;
            }
            case 2076647: {
                if (method359.equals("Box2")) {
                    break;
                }
                break;
            }
            case 74517257: {
                if (method359.equals("Model")) {
                    break;
                }
                break;
            }
        }
    }
    
    private static String Method3667(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x147A ^ 0xAE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
