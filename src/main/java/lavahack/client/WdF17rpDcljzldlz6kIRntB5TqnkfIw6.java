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
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class WdF17rpDcljzldlz6kIRntB5TqnkfIw6
implements IMessage,
IMessageHandler {
    public boolean Field9855;
    public boolean Field9856;
    public boolean Field9857;
    private int Field9858;

    public WdF17rpDcljzldlz6kIRntB5TqnkfIw6() {
        this((boolean)((long)117667221 ^ (long)117667221), (boolean)((long)-1517106010 ^ (long)-1517106010), (boolean)((long)2116900054 ^ (long)2116900054));
    }

    public WdF17rpDcljzldlz6kIRntB5TqnkfIw6(boolean bl, boolean bl2, boolean bl3) {
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

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(WdF17rpDcljzldlz6kIRntB5TqnkfIw6 wdF17rpDcljzldlz6kIRntB5TqnkfIw6, MessageContext messageContext) {
        IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718.Method2010(wdF17rpDcljzldlz6kIRntB5TqnkfIw6.Field9855);
        Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro = wdF17rpDcljzldlz6kIRntB5TqnkfIw6.Field9856;
        Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E = wdF17rpDcljzldlz6kIRntB5TqnkfIw6.Field9857;
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.info("Server capabilities{printer={}, save={}, load={}}", (Object)wdF17rpDcljzldlz6kIRntB5TqnkfIw6.Field9855, (Object)wdF17rpDcljzldlz6kIRntB5TqnkfIw6.Field9856, (Object)wdF17rpDcljzldlz6kIRntB5TqnkfIw6.Field9857);
        return null;
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((WdF17rpDcljzldlz6kIRntB5TqnkfIw6)iMessage, messageContext);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1658542044 ^ (long)1658542044);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-271985928 ^ (long)-271986169);
            int n2 = (int)1052812730L ^ 0x3EC0A597;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-555149494 ^ (long)-555148913) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

