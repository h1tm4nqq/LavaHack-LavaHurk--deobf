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
import lavahack.client.Class153;
import lavahack.client.Class2101;
import lavahack.client.Class257;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class Class513
implements IMessage,
IMessageHandler {
    public String Field10164;
    private String Field10165 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class513() {
    }

    public Class513(String string) {
        this.Field10164 = string;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.Field10164 = ByteBufUtils.readUTF8String((ByteBuf)byteBuf);
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String((ByteBuf)byteBuf, (String)this.Field10164);
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class513 class513, MessageContext messageContext) {
        File file = Class2101.Field17565.Method419(null, true);
        boolean bl = Class153.Method997(file, class513.Field10164, null, Class257.Field9154.Field9155);
        if (bl) {
            Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation("schematica.command.download.downloadSucceeded", new Object[]{class513.Field10164}));
        }
        Class257.Field9154.Field9155 = null;
        return null;
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class513)iMessage, messageContext);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 184;
            cArray2[n] = (char)(cArray[n] ^ (0x227 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

