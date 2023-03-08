//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.*;
import net.minecraft.util.text.*;

public class Class513 implements IMessage, IMessageHandler
{
    public String Field10164;
    private String Field10165 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class513() {
    }
    
    public Class513(final String field10164) {
        this.Field10164 = field10164;
    }
    
    public void fromBytes(final ByteBuf byteBuf) {
        this.Field10164 = ByteBufUtils.readUTF8String(byteBuf);
    }
    
    public void toBytes(final ByteBuf byteBuf) {
        ByteBufUtils.writeUTF8String(byteBuf, this.Field10164);
    }
    
    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Class513 class513, final MessageContext messageContext) {
        if (Class153.Method997(Class2101.Field17565.Method419((EntityPlayer)null, true), class513.Field10164, (String)null, Class257.Field9154.Field9155)) {
            Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation("schematica.command.download.downloadSucceeded", new Object[] { class513.Field10164 }));
        }
        Class257.Field9154.Field9155 = null;
        return null;
    }
    
    public IMessage onMessage(final IMessage message, final MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class513)message, messageContext);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x227 ^ 0xB8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
