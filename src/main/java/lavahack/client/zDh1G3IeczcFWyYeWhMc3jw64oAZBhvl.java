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
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.Mw1rH0enxHoGt2yOomU73geB3GiYFx8A;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.o6WjagicEjcekwDevQdMA2QlvL5uoWpx;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl
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

    public zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl() {
    }

    public zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, int n, int n2, int n3) {
        this.Field9237 = n;
        this.Field9238 = n2;
        this.Field9239 = n3;
        this.Field9240 = new short[((int)-2075781731L ^ 0x8446159C) << 4][(int)((long)-1231507905 ^ (long)-1231507906) << 4][((int)-1068771285L ^ 0xC04BD82A) << 4];
        this.Field9241 = new byte[(int)((long)-601490684 ^ (long)-601490683) << 4][((int)-1612587525L ^ 0x9FE1DDFA) << 4][((int)-1450883571L ^ 0xA985460C) << 4];
        this.Field9242 = new ArrayList();
        this.Field9243 = new ArrayList();
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        int n4 = (int)((long)-1892240707 ^ (long)-1892240707);
        int cfr_ignored_0 = (int)((long)-934959569 ^ (long)-934959570) << 4;
        int n5 = (int)-456770418L ^ 0xE4C63C8E;
        int cfr_ignored_1 = ((int)809643590L ^ 0x30422E47) << 4;
        int n6 = (int)1013319404L ^ 0x3C6606EC;
        while (true) {
            int cfr_ignored_2 = (int)((long)524844613 ^ (long)524844612) << 4;
            eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(n + n4, n2 + n5, n3 + n6);
            IBlockState iBlockState = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2880(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN);
            Block block = iBlockState.getBlock();
            int n7 = Block.REGISTRY.getIDForObject((Object)block);
            this.Field9240[n4][n5][n6] = (short)n7;
            this.Field9241[n4][n5][n6] = (byte)block.getMetaFromState(iBlockState);
            TileEntity tileEntity = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2882(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN);
            if (tileEntity != null) {
                this.Field9242.add(tileEntity);
            }
            ++n6;
        }
    }

    private void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        int n = (int)((long)924299764 ^ (long)924299764);
        int cfr_ignored_0 = ((int)2019278357L ^ 0x785BBE14) << 4;
        int n2 = (int)((long)448369139 ^ (long)448369139);
        int cfr_ignored_1 = ((int)-458222757L ^ 0xE4B0135A) << 4;
        int n3 = (int)((long)721196110 ^ (long)721196110);
        while (true) {
            int cfr_ignored_2 = (int)((long)-1958430601 ^ (long)-1958430602) << 4;
            short s = this.Field9240[n][n2][n3];
            byte by = this.Field9241[n][n2][n3];
            Block block = (Block)Block.REGISTRY.getObjectById((int)s);
            eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(this.Field9237 + n, this.Field9238 + n2, this.Field9239 + n3);
            meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2881(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN, block.getStateFromMeta((int)by));
            ++n3;
        }
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.Field9237 = byteBuf.readShort();
        this.Field9238 = byteBuf.readShort();
        this.Field9239 = byteBuf.readShort();
        this.Field9240 = new short[((int)-2003541037L ^ 0x889463D2) << 4][((int)-1261540556L ^ 0xB4CE6B35) << 4][((int)-1785757019L ^ 0x958F82A4) << 4];
        this.Field9241 = new byte[(int)((long)1388554064 ^ (long)1388554065) << 4][((int)638474195L ^ 0x260E57D2) << 4][(int)((long)-325647889 ^ (long)-325647890) << 4];
        this.Field9242 = new ArrayList();
        this.Field9243 = new ArrayList();
        int n = (int)((long)-296260171 ^ (long)-296260171);
        int cfr_ignored_0 = ((int)900512352L ^ 0x35ACBA61) << 4;
        int n2 = (int)((long)973184967 ^ (long)973184967);
        int cfr_ignored_1 = (int)((long)704424572 ^ (long)704424573) << 4;
        int n3 = (int)711081087L ^ 0x2A623C7F;
        while (true) {
            int cfr_ignored_2 = ((int)274176004L ^ 0x10579805) << 4;
            this.Field9240[n][n2][n3] = byteBuf.readShort();
            this.Field9241[n][n2][n3] = byteBuf.readByte();
            ++n3;
        }
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeShort(this.Field9237);
        byteBuf.writeShort(this.Field9238);
        byteBuf.writeShort(this.Field9239);
        int n = (int)-1736198800L ^ 0x9883B570;
        int cfr_ignored_0 = ((int)1222635776L ^ 0x48DFF101) << 4;
        int n2 = (int)((long)1793856777 ^ (long)1793856777);
        int cfr_ignored_1 = (int)((long)-1138067939 ^ (long)-1138067940) << 4;
        int n3 = (int)((long)-1573284319 ^ (long)-1573284319);
        while (true) {
            int cfr_ignored_2 = ((int)1666622703L ^ 0x6356A4EE) << 4;
            byteBuf.writeShort((int)this.Field9240[n][n2][n3]);
            byteBuf.writeByte((int)this.Field9241[n][n2][n3]);
            ++n3;
        }
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl2, MessageContext messageContext) {
        zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl2.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154.Field9155);
        return new o6WjagicEjcekwDevQdMA2QlvL5uoWpx(zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl2.Field9237, zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl2.Field9238, zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl2.Field9239);
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((zDh1G3IeczcFWyYeWhMc3jw64oAZBhvl)iMessage, messageContext);
    }
}

