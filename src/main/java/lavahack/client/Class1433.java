//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.tileentity.*;
import net.minecraft.nbt.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;

public class Class1433
{
    private String Field14699 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static List Method5720(final NBTTagCompound nbtTagCompound) {
        return Method5721(nbtTagCompound, new ArrayList());
    }
    
    public static List Method5721(final NBTTagCompound nbtTagCompound, final List list) {
        final NBTTagList getTagList = nbtTagCompound.getTagList("TileEntities", 10);
        for (int i = 0; i < getTagList.tagCount(); ++i) {
            list.add(Method5735(getTagList.getCompoundTagAt(i)));
        }
        return list;
    }
    
    public static NBTTagCompound Method5722(final List list) {
        return Method5723(list, new NBTTagCompound());
    }
    
    public static NBTTagCompound Method5723(final List list, final NBTTagCompound nbtTagCompound) {
        final NBTTagList list2 = new NBTTagList();
        final Iterator<TileEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.appendTag((NBTBase)Method5734(iterator.next()));
        }
        nbtTagCompound.setTag("TileEntities", (NBTBase)list2);
        return nbtTagCompound;
    }
    
    public static List Method5724(final NBTTagCompound nbtTagCompound) {
        return Method5727(nbtTagCompound, null, new ArrayList());
    }
    
    public static List Method5725(final NBTTagCompound nbtTagCompound, final World world) {
        return Method5727(nbtTagCompound, world, new ArrayList());
    }
    
    public static List Method5726(final NBTTagCompound nbtTagCompound, final List list) {
        return Method5727(nbtTagCompound, null, list);
    }
    
    public static List Method5727(final NBTTagCompound nbtTagCompound, final World world, final List list) {
        final NBTTagList getTagList = nbtTagCompound.getTagList("Entities", 10);
        for (int i = 0; i < getTagList.tagCount(); ++i) {
            final Entity method5737 = Method5737(getTagList.getCompoundTagAt(i), world);
            if (method5737 != null) {
                list.add(method5737);
            }
        }
        return list;
    }
    
    public static NBTTagCompound Method5728(final List list) {
        return Method5729(list, new NBTTagCompound());
    }
    
    public static NBTTagCompound Method5729(final List list, final NBTTagCompound nbtTagCompound) {
        final NBTTagList list2 = new NBTTagList();
        for (final Entity entity : list) {
            final NBTTagCompound nbtTagCompound2 = new NBTTagCompound();
            entity.writeToNBT(nbtTagCompound2);
            list2.appendTag((NBTBase)nbtTagCompound2);
        }
        nbtTagCompound.setTag("Entities", (NBTBase)list2);
        return nbtTagCompound;
    }
    
    public static TileEntity Method5730(final TileEntity tileEntity) throws Class50 {
        return Method5731(tileEntity, 0, 0, 0);
    }
    
    public static TileEntity Method5731(TileEntity method5735, final int n, final int n2, final int n3) throws Class50 {
        if (method5735 == null) {
            return null;
        }
        method5735 = Method5735(Method5734(method5735));
        method5735.setPos(method5735.getPos().add(-n, -n2, -n3));
        return method5735;
    }
    
    public static Entity Method5732(final Entity entity) throws Class50 {
        return Method5733(entity, 0, 0, 0);
    }
    
    public static Entity Method5733(Entity method5737, final int n, final int n2, final int n3) throws Class50 {
        if (method5737 == null) {
            return null;
        }
        final NBTTagCompound method5738 = Method5736(method5737);
        if (method5738 != null) {
            method5737 = Method5737(method5738, Class1939.instance());
            if (method5737 != null) {
                final Entity entity = method5737;
                entity.posX -= n;
                final Entity entity2 = method5737;
                entity2.posY -= n2;
                final Entity entity3 = method5737;
                entity3.posZ -= n3;
            }
        }
        return method5737;
    }
    
    public static NBTTagCompound Method5734(final TileEntity tileEntity) {
        final NBTTagCompound nbtTagCompound = new NBTTagCompound();
        tileEntity.writeToNBT(nbtTagCompound);
        return nbtTagCompound;
    }
    
    public static TileEntity Method5735(final NBTTagCompound nbtTagCompound) {
        return TileEntity.create((World)null, nbtTagCompound);
    }
    
    public static NBTTagCompound Method5736(final Entity entity) {
        final NBTTagCompound nbtTagCompound = new NBTTagCompound();
        if (entity.writeToNBTOptional(nbtTagCompound)) {
            return nbtTagCompound;
        }
        return null;
    }
    
    public static Entity Method5737(final NBTTagCompound nbtTagCompound, final World world) {
        return EntityList.createEntityFromNBT(nbtTagCompound, world);
    }
    
    private static String Method5738(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x61FA ^ 0x19));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
