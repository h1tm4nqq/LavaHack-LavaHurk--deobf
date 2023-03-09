/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import lavahack.client.Class2101;
import lavahack.client.Class415;
import lavahack.client.Class542;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class Class446
implements IMessage,
IMessageHandler {
    public boolean Field9855;
    public boolean Field9856;
    public boolean Field9857;
    private int Field9858;

    public Class446() {
        this(false, false, false);
    }

    public Class446(boolean bl, boolean bl2, boolean bl3) {
        this.Field9855 = bl;
        this.Field9856 = bl2;
        this.Field9857 = bl3;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.Field9855 = byteBuf.readBoolean();
        this.Field9856 = byteBuf.readBoolean();
        this.Field9857 = byteBuf.readBoolean();
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeBoolean(this.Field9855);
        byteBuf.writeBoolean(this.Field9856);
        byteBuf.writeBoolean(this.Field9857);
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class446 class446, MessageContext messageContext) {
        Class415.Field9718.Method2010(class446.Field9855);
        Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro = class446.Field9856;
        Class2101.Field17565.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E = class446.Field9857;
        Class542.Field10314.info("Server capabilities{printer={}, save={}, load={}}", (Object)class446.Field9855, (Object)class446.Field9856, (Object)class446.Field9857);
        return null;
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class446)iMessage, messageContext);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 45;
            cArray2[n] = (char)(cArray[n] ^ (0x7628 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

