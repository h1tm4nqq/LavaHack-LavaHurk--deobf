//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.nbt.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.tileentity.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.world.gen.structure.template.*;

public class Class797 extends Class153
{
    private String Field11390 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class686 Method990(final NBTTagCompound nbtTagCompound) {
        final ItemStack method1528 = Class292.Method1528(nbtTagCompound);
        final Template template = new Template();
        template.read(nbtTagCompound);
        final Class1885 class1885 = new Class1885(method1528, template.getSize().getX(), template.getSize().getY(), template.getSize().getZ(), template.getAuthor());
        for (final Template$BlockInfo template$BlockInfo : ((ITemplate)template).Method58()) {
            class1885.Method2881(template$BlockInfo.pos, template$BlockInfo.blockState);
            if (template$BlockInfo.tileentityData != null) {
                template$BlockInfo.tileentityData.setInteger("x", template$BlockInfo.pos.getX());
                template$BlockInfo.tileentityData.setInteger("y", template$BlockInfo.pos.getY());
                template$BlockInfo.tileentityData.setInteger("z", template$BlockInfo.pos.getZ());
                final TileEntity method1529 = Class1433.Method5735(template$BlockInfo.tileentityData);
                if (method1529 == null) {
                    continue;
                }
                class1885.Method2884(template$BlockInfo.pos, method1529);
            }
        }
        return (Class686)class1885;
    }
    
    public boolean Method991(final NBTTagCompound nbtTagCompound, final Class686 class686) {
        final Template template = new Template();
        ((ITemplate)template).Method59(new BlockPos(class686.Method2891(), class686.Method2893(), class686.Method2892()));
        template.setAuthor(class686.Method2894());
        for (final BlockPos blockPos : BlockPos.getAllInBox(BlockPos.ORIGIN, template.getSize().add(-1, -1, -1))) {
            final TileEntity method2882 = class686.Method2882(blockPos);
            NBTTagCompound method2883;
            if (method2882 != null) {
                method2883 = Class1433.Method5734(method2882);
                method2883.removeTag("x");
                method2883.removeTag("y");
                method2883.removeTag("z");
            }
            else {
                method2883 = null;
            }
            ((ITemplate)template).Method58().add(new Template$BlockInfo(blockPos, class686.Method2880(blockPos), method2883));
        }
        for (final Entity entity : class686.Method2886()) {
            final Vec3d vec3d = new Vec3d(entity.posX, entity.posY, entity.posZ);
            final NBTTagCompound nbtTagCompound2 = new NBTTagCompound();
            entity.writeToNBTOptional(nbtTagCompound2);
            ((ITemplate)template).Method60().add(new Template$EntityInfo(vec3d, new BlockPos(vec3d), nbtTagCompound2));
        }
        template.writeToNBT(nbtTagCompound);
        return true;
    }
    
    public String Method992() {
        return "schematica.format.structure";
    }
    
    public String Method993() {
        return ".nbt";
    }
    
    private static String Method1001(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x9F6 ^ 0x1F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
