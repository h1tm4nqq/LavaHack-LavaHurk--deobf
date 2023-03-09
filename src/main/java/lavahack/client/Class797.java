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
import lavahack.client.Class1433;
import lavahack.client.Class153;
import lavahack.client.Class1885;
import lavahack.client.Class292;
import lavahack.client.Class686;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.gen.structure.template.Template;

public class Class797
extends Class153 {
    private String Field11390 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Class686 Method990(NBTTagCompound nBTTagCompound) {
        ItemStack itemStack = Class292.Method1528(nBTTagCompound);
        Template template = new Template();
        template.read(nBTTagCompound);
        Class1885 class1885 = new Class1885(itemStack, template.getSize().getX(), template.getSize().getY(), template.getSize().getZ(), template.getAuthor());
        Iterator iterator = ((ITemplate)template).Method58().iterator();
        while (iterator.hasNext()) {
            Template.BlockInfo blockInfo = (Template.BlockInfo)iterator.next();
            class1885.Method2881(blockInfo.pos, blockInfo.blockState);
            if (blockInfo.tileentityData == null) continue;
            blockInfo.tileentityData.setInteger("x", blockInfo.pos.getX());
            blockInfo.tileentityData.setInteger("y", blockInfo.pos.getY());
            blockInfo.tileentityData.setInteger("z", blockInfo.pos.getZ());
            TileEntity tileEntity = Class1433.Method5735(blockInfo.tileentityData);
            if (tileEntity == null) continue;
            class1885.Method2884(blockInfo.pos, tileEntity);
        }
        return class1885;
    }

    @Override
    public boolean Method991(NBTTagCompound nBTTagCompound, Class686 class686) {
        NBTTagCompound nBTTagCompound2;
        TileEntity tileEntity;
        Template template = new Template();
        ((ITemplate)template).Method59(new BlockPos(class686.Method2891(), class686.Method2893(), class686.Method2892()));
        template.setAuthor(class686.Method2894());
        for (BlockPos blockPos : BlockPos.getAllInBox((BlockPos)BlockPos.ORIGIN, (BlockPos)template.getSize().add(-1, -1, -1))) {
            tileEntity = class686.Method2882(blockPos);
            if (tileEntity != null) {
                nBTTagCompound2 = Class1433.Method5734(tileEntity);
                nBTTagCompound2.removeTag("x");
                nBTTagCompound2.removeTag("y");
                nBTTagCompound2.removeTag("z");
            } else {
                nBTTagCompound2 = null;
            }
            ((ITemplate)template).Method58().add(new Template.BlockInfo(blockPos, class686.Method2880(blockPos), nBTTagCompound2));
        }
        Iterator<Object> iterator = class686.Method2886().iterator();
        while (true) {
            BlockPos blockPos;
            if (!iterator.hasNext()) {
                template.writeToNBT(nBTTagCompound);
                return true;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 31;
            cArray2[n] = (char)(cArray[n] ^ (0x9F6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

