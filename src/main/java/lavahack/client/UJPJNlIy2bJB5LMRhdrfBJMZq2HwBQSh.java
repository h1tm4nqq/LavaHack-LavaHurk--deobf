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
import lavahack.client.szzspmKGmWUqivTUJ1fagL8CY5nqYVEj;
import lavahack.client.tyAz6lXxFypKBrp8FIZb6QZg4A9H6VFx;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh {
    private String Field14699 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static List Method5720(NBTTagCompound nBTTagCompound) {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5721(nBTTagCompound, new ArrayList());
    }

    public static List Method5721(NBTTagCompound nBTTagCompound, List list) {
        NBTTagList nBTTagList = nBTTagCompound.getTagList("TileEntities", (int)((long)-1186294745 ^ (long)-1186294750) << 1);
        int n = (int)((long)174925589 ^ (long)174925589);
        while (n < nBTTagList.tagCount()) {
            NBTTagCompound nBTTagCompound2 = nBTTagList.getCompoundTagAt(n);
            TileEntity tileEntity = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5735(nBTTagCompound2);
            list.add(tileEntity);
            ++n;
        }
        return list;
    }

    public static NBTTagCompound Method5722(List list) {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5723(list, new NBTTagCompound());
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
            NBTTagCompound nBTTagCompound2 = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5734(tileEntity);
            nBTTagList.appendTag((NBTBase)nBTTagCompound2);
        }
    }

    public static List Method5724(NBTTagCompound nBTTagCompound) {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5727(nBTTagCompound, null, new ArrayList());
    }

    public static List Method5725(NBTTagCompound nBTTagCompound, World world) {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5727(nBTTagCompound, world, new ArrayList());
    }

    public static List Method5726(NBTTagCompound nBTTagCompound, List list) {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5727(nBTTagCompound, null, list);
    }

    public static List Method5727(NBTTagCompound nBTTagCompound, World world, List list) {
        NBTTagList nBTTagList = nBTTagCompound.getTagList("Entities", ((int)-1555349047L ^ 0xA34B41CC) << 1);
        int n = (int)((long)361798168 ^ (long)361798168);
        while (n < nBTTagList.tagCount()) {
            NBTTagCompound nBTTagCompound2 = nBTTagList.getCompoundTagAt(n);
            Entity entity = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5737(nBTTagCompound2, world);
            if (entity != null) {
                list.add(entity);
            }
            ++n;
        }
        return list;
    }

    public static NBTTagCompound Method5728(List list) {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5729(list, new NBTTagCompound());
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

    public static TileEntity Method5730(TileEntity tileEntity) throws tyAz6lXxFypKBrp8FIZb6QZg4A9H6VFx {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5731(tileEntity, (int)-343093058L ^ 0xEB8CD0BE, (int)-600671717L ^ 0xDC327A1B, (int)((long)-1388339130 ^ (long)-1388339130));
    }

    public static TileEntity Method5731(TileEntity tileEntity, int n, int n2, int n3) throws tyAz6lXxFypKBrp8FIZb6QZg4A9H6VFx {
        if (tileEntity == null) {
            return null;
        }
        NBTTagCompound nBTTagCompound = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5734(tileEntity);
        tileEntity = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5735(nBTTagCompound);
        BlockPos blockPos = tileEntity.getPos();
        tileEntity.setPos(blockPos.add(-n, -n2, -n3));
        return tileEntity;
    }

    public static Entity Method5732(Entity entity) throws tyAz6lXxFypKBrp8FIZb6QZg4A9H6VFx {
        return UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5733(entity, (int)((long)854666930 ^ (long)854666930), (int)((long)1787241384 ^ (long)1787241384), (int)((long)-854578447 ^ (long)-854578447));
    }

    public static Entity Method5733(Entity entity, int n, int n2, int n3) throws tyAz6lXxFypKBrp8FIZb6QZg4A9H6VFx {
        if (entity == null) {
            return null;
        }
        NBTTagCompound nBTTagCompound = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5736(entity);
        if (nBTTagCompound == null) return entity;
        entity = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5737(nBTTagCompound, szzspmKGmWUqivTUJ1fagL8CY5nqYVEj.instance());
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
        int n = (int)-1675283576L ^ 0x9C253388;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2049462648L ^ 0x85D7AE77);
            int n2 = (int)-1235059004L ^ 0xB6627EDD;
            cArray2[n] = (char)(cArray[n] ^ (((int)467956064L ^ 0x1BE4419D) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

