//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;

public class Class231 implements IMessage, IMessageHandler
{
    private int Field9011;
    private int Field9012;
    private int Field9013;
    private String Field9014 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class231() {
    }
    
    public Class231(final int field9011, final int field9012, final int field9013) {
        this.Field9011 = field9011;
        this.Field9012 = field9012;
        this.Field9013 = field9013;
    }
    
    public void fromBytes(final ByteBuf byteBuf) {
        this.Field9011 = byteBuf.readShort();
        this.Field9012 = byteBuf.readShort();
        this.Field9013 = byteBuf.readShort();
    }
    
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeShort(this.Field9011);
        byteBuf.writeShort(this.Field9012);
        byteBuf.writeShort(this.Field9013);
    }
    
    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Class231 class231, final MessageContext messageContext) {
        final Class857 class232 = Class257.Field9154.Field9156.get(messageContext.getServerHandler().player);
        if (class232 != null) {
            class232.Method3605(class231.Field9011, class231.Field9012, class231.Field9013);
        }
        return null;
    }
    
    public IMessage onMessage(final IMessage message, final MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class231)message, messageContext);
    }
}
