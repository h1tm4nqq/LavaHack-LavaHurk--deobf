//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;

public class Class446 implements IMessage, IMessageHandler
{
    public boolean Field9855;
    public boolean Field9856;
    public boolean Field9857;
    private int Field9858;
    
    public Class446() {
        this(false, false, false);
    }
    
    public Class446(final boolean field9855, final boolean field9856, final boolean field9857) {
        this.Field9855 = field9855;
        this.Field9856 = field9856;
        this.Field9857 = field9857;
    }
    
    public void fromBytes(final ByteBuf byteBuf) {
        this.Field9855 = byteBuf.readBoolean();
        this.Field9856 = byteBuf.readBoolean();
        this.Field9857 = byteBuf.readBoolean();
    }
    
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeBoolean(this.Field9855);
        byteBuf.writeBoolean(this.Field9856);
        byteBuf.writeBoolean(this.Field9857);
    }
    
    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Class446 class446, final MessageContext messageContext) {
        Class415.Field9718.Method2010(class446.Field9855);
        Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro = class446.Field9856;
        Class2101.Field17565.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E = class446.Field9857;
        Class542.Field10314.info("Server capabilities{printer={}, save={}, load={}}", (Object)class446.Field9855, (Object)class446.Field9856, (Object)class446.Field9857);
        return null;
    }
    
    public IMessage onMessage(final IMessage message, final MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class446)message, messageContext);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7628 ^ 0x2D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
