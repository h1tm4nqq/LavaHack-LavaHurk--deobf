//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;
import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;

public class Class1755 implements IMessage, IMessageHandler
{
    public ItemStack Field16043;
    public int Field16044;
    public int Field16045;
    public int Field16046;
    private String Field16047 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1755() {
    }
    
    public Class1755(final Class686 class686) {
        this.Field16043 = class686.Method2889();
        this.Field16044 = class686.Method2891();
        this.Field16045 = class686.Method2893();
        this.Field16046 = class686.Method2892();
    }
    
    public void fromBytes(final ByteBuf byteBuf) {
        this.Field16043 = ByteBufUtils.readItemStack(byteBuf);
        this.Field16044 = byteBuf.readShort();
        this.Field16045 = byteBuf.readShort();
        this.Field16046 = byteBuf.readShort();
    }
    
    public void toBytes(final ByteBuf byteBuf) {
        ByteBufUtils.writeItemStack(byteBuf, this.Field16043);
        byteBuf.writeShort(this.Field16044);
        byteBuf.writeShort(this.Field16045);
        byteBuf.writeShort(this.Field16046);
    }
    
    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Class1755 class1755, final MessageContext messageContext) {
        Class257.Field9154.Field9155 = new Class1885(class1755.Field16043, class1755.Field16044, class1755.Field16045, class1755.Field16046);
        return (IMessage)new Class2151();
    }
    
    public IMessage onMessage(final IMessage message, final MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class1755)message, messageContext);
    }
}
