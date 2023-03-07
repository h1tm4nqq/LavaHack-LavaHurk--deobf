//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import java.io.File;
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import lavahack.client.Mw1rH0enxHoGt2yOomU73geB3GiYFx8A;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class uousdX8ncJWKUP3BS9cexvVPwWHrFdDD
implements IMessage,
IMessageHandler {
    public String Field10164;
    private String Field10165 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public uousdX8ncJWKUP3BS9cexvVPwWHrFdDD() {
    }

    public uousdX8ncJWKUP3BS9cexvVPwWHrFdDD(String string) {
        this.Field10164 = string;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.Field10164 = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.Field10164);
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(uousdX8ncJWKUP3BS9cexvVPwWHrFdDD uousdX8ncJWKUP3BS9cexvVPwWHrFdDD2, MessageContext messageContext) {
        File file = Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method419(null, ((int)-203571891L ^ 0xF3DDBD4C) != 0);
        boolean bl = MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method997(file, uousdX8ncJWKUP3BS9cexvVPwWHrFdDD2.Field10164, null, Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154.Field9155);
        if (bl) {
            Object[] objectArray = new Object[(int)-1347206191L ^ 0xAFB343D0];
            objectArray[(int)((long)1956630669 ^ (long)1956630669)] = uousdX8ncJWKUP3BS9cexvVPwWHrFdDD2.Field10164;
            Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation("schematica.command.download.downloadSucceeded", objectArray));
        }
        Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154.Field9155 = null;
        return null;
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((uousdX8ncJWKUP3BS9cexvVPwWHrFdDD)iMessage, messageContext);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)76360069L ^ 0x48D2985;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1868223228L ^ 0x90A52DFB);
            int n2 = ((int)-1743277620L ^ 0x9817B1DB) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1206059087 ^ (long)-1206059626) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

