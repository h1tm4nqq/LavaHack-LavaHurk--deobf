//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.gen.structure.template.Template
 *  net.minecraft.world.gen.structure.template.Template$BlockInfo
 *  net.minecraft.world.gen.structure.template.Template$EntityInfo
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.ITemplate;
import java.util.Iterator;
import lavahack.client.BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import lavahack.client.UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh;
import lavahack.client.kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.gen.structure.template.Template;

public class aqV9H7eKQHMBYcZ6cWIeUDB2bTxp64KF
extends MWKsjf2F7eDKYSgsSUOF8imukA0mof8z {
    private String Field11390 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Method990(NBTTagCompound nBTTagCompound) {
        ItemStack itemStack = kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r.Method1528(nBTTagCompound);
        Template template = new Template();
        template.read(nBTTagCompound);
        BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ = new BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ(itemStack, template.getSize().getX(), template.getSize().getY(), template.getSize().getZ(), template.getAuthor());
        Iterator iterator = ((ITemplate)template).Method58().iterator();
        while (iterator.hasNext()) {
            Template.BlockInfo blockInfo = (Template.BlockInfo)iterator.next();
            bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ.Method2881(blockInfo.pos, blockInfo.blockState);
            if (blockInfo.tileentityData == null) continue;
            blockInfo.tileentityData.setInteger("x", blockInfo.pos.getX());
            blockInfo.tileentityData.setInteger("y", blockInfo.pos.getY());
            blockInfo.tileentityData.setInteger("z", blockInfo.pos.getZ());
            TileEntity tileEntity = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5735(blockInfo.tileentityData);
            if (tileEntity == null) continue;
            bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ.Method2884(blockInfo.pos, tileEntity);
        }
        return bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
    }

    @Override
    public boolean Method991(NBTTagCompound nBTTagCompound, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        NBTTagCompound nBTTagCompound2;
        TileEntity tileEntity;
        Template template = new Template();
        ((ITemplate)template).Method59(new BlockPos(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892()));
        template.setAuthor(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2894());
        for (BlockPos blockPos : BlockPos.getAllInBox((BlockPos)BlockPos.ORIGIN, (BlockPos)template.getSize().add((int)((long)1508231728 ^ (long)-1508231729), (int)1954866681L ^ 0x8B7B1A06, (int)1595068681L ^ 0xA0ED2EF6))) {
            tileEntity = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2882(blockPos);
            if (tileEntity != null) {
                nBTTagCompound2 = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5734(tileEntity);
                nBTTagCompound2.removeTag("x");
                nBTTagCompound2.removeTag("y");
                nBTTagCompound2.removeTag("z");
            } else {
                nBTTagCompound2 = null;
            }
            ((ITemplate)template).Method58().add(new Template.BlockInfo(blockPos, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2880(blockPos), nBTTagCompound2));
        }
        Iterator<Object> iterator = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2886().iterator();
        while (true) {
            BlockPos blockPos;
            if (!iterator.hasNext()) {
                template.writeToNBT(nBTTagCompound);
                return ((int)-1371255789L ^ 0xAE444C12) != 0;
            }
            blockPos = (Entity)iterator.next();
            tileEntity = new Vec3d(blockPos.posX, blockPos.posY, blockPos.posZ);
            nBTTagCompound2 = new NBTTagCompound();
            blockPos.writeToNBTOptional(nBTTagCompound2);
            BlockPos blockPos2 = new BlockPos((Vec3d)tileEntity);
            ((ITemplate)template).Method60().add(new Template.EntityInfo((Vec3d)tileEntity, blockPos2, nBTTagCompound2));
        }
    }

    @Override
    public String Method992() {
        return "schematica.format.structure";
    }

    @Override
    public String Method993() {
        return ".nbt";
    }

    private static String Method1001(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1716786031 ^ (long)-1716786031);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1075760019 ^ (long)-1075759982);
            int n2 = (int)-407665371L ^ 0xE7B3853A;
            cArray2[n] = (char)(cArray[n] ^ (((int)-969515193L ^ 0xC6365BBC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

