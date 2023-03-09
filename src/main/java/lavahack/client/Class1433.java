//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1939;
import lavahack.client.Class50;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class1433 {
    private String Field14699 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static List Method5720(NBTTagCompound nBTTagCompound) {
        return Class1433.Method5721(nBTTagCompound, new ArrayList());
    }

    public static List Method5721(NBTTagCompound nBTTagCompound, List list) {
        NBTTagList nBTTagList = nBTTagCompound.getTagList("TileEntities", 10);
        int n = 0;
        while (n < nBTTagList.tagCount()) {
            NBTTagCompound nBTTagCompound2 = nBTTagList.getCompoundTagAt(n);
            TileEntity tileEntity = Class1433.Method5735(nBTTagCompound2);
            list.add(tileEntity);
            ++n;
        }
        return list;
    }

    public static NBTTagCompound Method5722(List list) {
        return Class1433.Method5723(list, new NBTTagCompound());
    }

    public static NBTTagCompound Method5723(List list, NBTTagCompound nBTTagCompound) {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                nBTTagCompound.setTag("TileEntities", (NBTBase)nBTTagList);
                return nBTTagCompound;
            }
            TileEntity tileEntity = (TileEntity)iterator.next();
            NBTTagCompound nBTTagCompound2 = Class1433.Method5734(tileEntity);
            nBTTagList.appendTag((NBTBase)nBTTagCompound2);
        }
    }

    public static List Method5724(NBTTagCompound nBTTagCompound) {
        return Class1433.Method5727(nBTTagCompound, null, new ArrayList());
    }

    public static List Method5725(NBTTagCompound nBTTagCompound, World world) {
        return Class1433.Method5727(nBTTagCompound, world, new ArrayList());
    }

    public static List Method5726(NBTTagCompound nBTTagCompound, List list) {
        return Class1433.Method5727(nBTTagCompound, null, list);
    }

    public static List Method5727(NBTTagCompound nBTTagCompound, World world, List list) {
        NBTTagList nBTTagList = nBTTagCompound.getTagList("Entities", 10);
        int n = 0;
        while (n < nBTTagList.tagCount()) {
            NBTTagCompound nBTTagCompound2 = nBTTagList.getCompoundTagAt(n);
            Entity entity = Class1433.Method5737(nBTTagCompound2, world);
            if (entity != null) {
                list.add(entity);
            }
            ++n;
        }
        return list;
    }

    public static NBTTagCompound Method5728(List list) {
        return Class1433.Method5729(list, new NBTTagCompound());
    }

    public static NBTTagCompound Method5729(List list, NBTTagCompound nBTTagCompound) {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                nBTTagCompound.setTag("Entities", (NBTBase)nBTTagList);
                return nBTTagCompound;
            }
            Entity entity = (Entity)iterator.next();
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            entity.writeToNBT(nBTTagCompound2);
            nBTTagList.appendTag((NBTBase)nBTTagCompound2);
        }
    }

    public static TileEntity Method5730(TileEntity tileEntity) throws Class50 {
        return Class1433.Method5731(tileEntity, 0, 0, 0);
    }

    public static TileEntity Method5731(TileEntity tileEntity, int n, int n2, int n3) throws Class50 {
        if (tileEntity == null) {
            return null;
        }
        NBTTagCompound nBTTagCompound = Class1433.Method5734(tileEntity);
        tileEntity = Class1433.Method5735(nBTTagCompound);
        BlockPos blockPos = tileEntity.getPos();
        tileEntity.setPos(blockPos.add(-n, -n2, -n3));
        return tileEntity;
    }

    public static Entity Method5732(Entity entity) throws Class50 {
        return Class1433.Method5733(entity, 0, 0, 0);
    }

    public static Entity Method5733(Entity entity, int n, int n2, int n3) throws Class50 {
        if (entity == null) {
            return null;
        }
        NBTTagCompound nBTTagCompound = Class1433.Method5736(entity);
        if (nBTTagCompound == null) return entity;
        entity = Class1433.Method5737(nBTTagCompound, Class1939.instance());
        if (entity == null) return entity;
        entity.posX -= (double)n;
        entity.posY -= (double)n2;
        entity.posZ -= (double)n3;
        return entity;
    }

    public static NBTTagCompound Method5734(TileEntity tileEntity) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tileEntity.writeToNBT(nBTTagCompound);
        return nBTTagCompound;
    }

    public static TileEntity Method5735(NBTTagCompound nBTTagCompound) {
        return TileEntity.create(null, (NBTTagCompound)nBTTagCompound);
    }

    public static NBTTagCompound Method5736(Entity entity) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        if (!entity.writeToNBTOptional(nBTTagCompound)) return null;
        return nBTTagCompound;
    }

    public static Entity Method5737(NBTTagCompound nBTTagCompound, World world) {
        return EntityList.createEntityFromNBT((NBTTagCompound)nBTTagCompound, (World)world);
    }

    private static String Method5738(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 25;
            cArray2[n] = (char)(cArray[n] ^ (0x61FA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

