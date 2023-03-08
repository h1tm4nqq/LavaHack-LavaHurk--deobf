//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;

public class Class2151 implements IMessage, IMessageHandler
{
    private int Field17846;
    
    public void fromBytes(final ByteBuf byteBuf) {
    }
    
    public void toBytes(final ByteBuf byteBuf) {
    }
    
    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Class2151 class2151, final MessageContext messageContext) {
        final Class857 class2152 = Class257.Field9154.Field9156.get(messageContext.getServerHandler().player);
        if (class2152 != null) {
            class2152.Method3606(Class1205.Field13468);
        }
        return null;
    }
    
    public IMessage onMessage(final IMessage message, final MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class2151)message, messageContext);
    }
}
