//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import lavahack.client.Class16;
import lavahack.client.Class231;
import lavahack.client.Class257;
import lavahack.client.Class686;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class Class289
implements IMessage,
IMessageHandler {
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

    public Class289(Class686 class686, int n, int n2, int n3) {
        this.Field9237 = n;
        this.Field9238 = n2;
        this.Field9239 = n3;
        this.Field9240 = new short[16][16][16];
        this.Field9241 = new byte[16][16][16];
        this.Field9242 = new ArrayList();
        this.Field9243 = new ArrayList();
        Class16 class16 = new Class16();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (true) {
            class16.set(n + n4, n2 + n5, n3 + n6);
            IBlockState iBlockState = class686.Method2880(class16);
            Block block = iBlockState.getBlock();
            int n7 = Block.REGISTRY.getIDForObject((Object)block);
            this.Field9240[n4][n5][n6] = (short)n7;
            this.Field9241[n4][n5][n6] = (byte)block.getMetaFromState(iBlockState);
            TileEntity tileEntity = class686.Method2882(class16);
            if (tileEntity != null) {
                this.Field9242.add(tileEntity);
            }
            ++n6;
        }
    }

    private void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class686 class686) {
        Class16 class16 = new Class16();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            short s = this.Field9240[n][n2][n3];
            byte by = this.Field9241[n][n2][n3];
            Block block = (Block)Block.REGISTRY.getObjectById((int)s);
            class16.set(this.Field9237 + n, this.Field9238 + n2, this.Field9239 + n3);
            class686.Method2881(class16, block.getStateFromMeta((int)by));
            ++n3;
        }
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.Field9237 = byteBuf.readShort();
        this.Field9238 = byteBuf.readShort();
        this.Field9239 = byteBuf.readShort();
        this.Field9240 = new short[16][16][16];
        this.Field9241 = new byte[16][16][16];
        this.Field9242 = new ArrayList();
        this.Field9243 = new ArrayList();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            this.Field9240[n][n2][n3] = byteBuf.readShort();
            this.Field9241[n][n2][n3] = byteBuf.readByte();
            ++n3;
        }
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeShort(this.Field9237);
        byteBuf.writeShort(this.Field9238);
        byteBuf.writeShort(this.Field9239);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            byteBuf.writeShort((int)this.Field9240[n][n2][n3]);
            byteBuf.writeByte((int)this.Field9241[n][n2][n3]);
            ++n3;
        }
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class289 class289, MessageContext messageContext) {
        class289.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class257.Field9154.Field9155);
        return new Class231(class289.Field9237, class289.Field9238, class289.Field9239);
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class289)iMessage, messageContext);
    }
}

