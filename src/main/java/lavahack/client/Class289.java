//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;
import net.minecraft.tileentity.*;
import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;

public class Class289 implements IMessage, IMessageHandler
{
    public int Field9237;
    public int Field9238;
    public int Field9239;
    public short[][][] Field9240;
    public byte[][][] Field9241;
    public List Field9242;
    public List Field9243;
    private int Field9244;
    
    public Class289() {
    }
    
    public Class289(final Class686 class686, final int field9237, final int field9238, final int field9239) {
        this.Field9237 = field9237;
        this.Field9238 = field9238;
        this.Field9239 = field9239;
        this.Field9240 = new short[16][16][16];
        this.Field9241 = new byte[16][16][16];
        this.Field9242 = new ArrayList();
        this.Field9243 = new ArrayList();
        final Class16 class687 = new Class16();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        while (true) {
            class687.set(field9237 + n, field9238 + n2, field9239 + n3);
            final IBlockState method2880 = class686.Method2880((BlockPos)class687);
            final Block getBlock = method2880.getBlock();
            this.Field9240[n][n2][n3] = (short)Block.REGISTRY.getIDForObject((Object)getBlock);
            this.Field9241[n][n2][n3] = (byte)getBlock.getMetaFromState(method2880);
            final TileEntity method2881 = class686.Method2882((BlockPos)class687);
            if (method2881 != null) {
                this.Field9242.add(method2881);
            }
            ++n3;
        }
    }
    
    private void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Class686 class686) {
        final Class16 class687 = new Class16();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        while (true) {
            final short n4 = this.Field9240[n][n2][n3];
            final byte b = this.Field9241[n][n2][n3];
            final Block block = (Block)Block.REGISTRY.getObjectById((int)n4);
            class687.set(this.Field9237 + n, this.Field9238 + n2, this.Field9239 + n3);
            class686.Method2881((BlockPos)class687, block.getStateFromMeta((int)b));
            ++n3;
        }
    }
    
    public void fromBytes(final ByteBuf byteBuf) {
        this.Field9237 = byteBuf.readShort();
        this.Field9238 = byteBuf.readShort();
        this.Field9239 = byteBuf.readShort();
        this.Field9240 = new short[16][16][16];
        this.Field9241 = new byte[16][16][16];
        this.Field9242 = new ArrayList();
        this.Field9243 = new ArrayList();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        while (true) {
            this.Field9240[n][n2][n3] = byteBuf.readShort();
            this.Field9241[n][n2][n3] = byteBuf.readByte();
            ++n3;
        }
    }
    
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeShort(this.Field9237);
        byteBuf.writeShort(this.Field9238);
        byteBuf.writeShort(this.Field9239);
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        while (true) {
            byteBuf.writeShort((int)this.Field9240[n][n2][n3]);
            byteBuf.writeByte((int)this.Field9241[n][n2][n3]);
            ++n3;
        }
    }
    
    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Class289 class289, final MessageContext messageContext) {
        class289.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class257.Field9154.Field9155);
        return (IMessage)new Class231(class289.Field9237, class289.Field9238, class289.Field9239);
    }
    
    public IMessage onMessage(final IMessage message, final MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class289)message, messageContext);
    }
}
