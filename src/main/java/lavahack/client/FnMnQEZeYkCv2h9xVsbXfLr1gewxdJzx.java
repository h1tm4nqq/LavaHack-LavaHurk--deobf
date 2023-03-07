//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lavahack.client.BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import lavahack.client.ODLB1whnCpfwefGXsXGa3bDkhmARtqU0;
import lavahack.client.UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh;
import lavahack.client.kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public class FnMnQEZeYkCv2h9xVsbXfLr1gewxdJzx
extends MWKsjf2F7eDKYSgsSUOF8imukA0mof8z {
    private int Field14121;

    @Override
    public meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Method990(NBTTagCompound nBTTagCompound) {
        Object object;
        Object object2;
        int n;
        ItemStack itemStack = kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r.Method1528(nBTTagCompound);
        byte[] byArray = nBTTagCompound.getByteArray("Blocks");
        byte[] byArray2 = nBTTagCompound.getByteArray("Data");
        int n2 = (int)685108243L ^ 0x28D5EC13;
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        if (nBTTagCompound.hasKey("AddBlocks")) {
            n2 = (int)-1356831992L ^ 0xAF206309;
            byArray4 = nBTTagCompound.getByteArray("AddBlocks");
            byArray3 = new byte[byArray4.length * (((int)1140242205L ^ 0x43F6B71C) << 1)];
            for (n = (int)((long)-1546353896 ^ (long)-1546353896); n < byArray4.length; ++n) {
                byArray3[n * ((int)((long)451491868 ^ (long)451491869) << 1) + (int)((long)-1194614663 ^ (long)-1194614663)] = (byte)(byArray4[n] >> (((int)95483687L ^ 0x5B0F726) << 2) & (int)((long)-627450556 ^ (long)-627450549));
                byArray3[n * (((int)-1011101557L ^ 0xC3BBD08A) << 1) + (int)((long)-275510102 ^ (long)-275510101)] = (byte)(byArray4[n] & ((int)-680069020L ^ 0xD776F86B));
            }
        } else if (nBTTagCompound.hasKey("Add")) {
            n2 = (int)-1214583943L ^ 0xB79AEB78;
            byArray3 = nBTTagCompound.getByteArray("Add");
        }
        n = nBTTagCompound.getShort("Width");
        short s = nBTTagCompound.getShort("Length");
        short s2 = nBTTagCompound.getShort("Height");
        Short s3 = null;
        HashMap<Short, Short> hashMap = new HashMap<Short, Short>();
        if (nBTTagCompound.hasKey("SchematicaMapping")) {
            object2 = nBTTagCompound.getCompoundTag("SchematicaMapping");
            object = object2.getKeySet();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                hashMap.put(object2.getShort(string), (short)Block.REGISTRY.getIDForObject(Block.REGISTRY.getObject((Object)new ResourceLocation(string))));
            }
        }
        object2 = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        object = new BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ(itemStack, n, s2, s);
        for (int i = (int)-1425997134L ^ 0xAB0102B2; i < n; ++i) {
            for (int j = (int)((long)-1064303556 ^ (long)-1064303556); j < s2; ++j) {
                for (int k = (int)((long)413089265 ^ (long)413089265); k < s; ++k) {
                    int n3 = i + (j * s + k) * n;
                    int n4 = byArray[n3] & ((int)-507545539L ^ 0xE1BF78C2) | (int)((long)406371684 ^ (long)406371684);
                    int n5 = byArray2[n3] & ((int)-201204188L ^ 0xF401DEDB);
                    s3 = (Short)hashMap.get((short)n4);
                    if (s3 != null) {
                        n4 = s3.shortValue();
                    }
                    Block block = (Block)Block.REGISTRY.getObjectById(n4);
                    ((EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)((Object)object2)).set(i, j, k);
                    IBlockState iBlockState = block.getStateFromMeta(n5);
                    object.Method2881((BlockPos)object2, iBlockState);
                }
            }
        }
        NBTTagList nBTTagList = nBTTagCompound.getTagList("TileEntities", (int)((long)646136441 ^ (long)646136444) << 1);
        int n6 = (int)((long)2022886214 ^ (long)2022886214);
        while (n6 < nBTTagList.tagCount()) {
            TileEntity tileEntity = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5735(nBTTagList.getCompoundTagAt(n6));
            if (tileEntity != null) {
                object.Method2884(tileEntity.getPos(), tileEntity);
            }
            ++n6;
        }
        return object;
    }

    @Override
    public boolean Method991(NBTTagCompound nBTTagCompound, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        Object object;
        Block block2;
        Object object2;
        NBTTagList nBTTagList;
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        ItemStack itemStack = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2889();
        itemStack.writeToNBT(nBTTagCompound2);
        nBTTagCompound.setTag("Icon", (NBTBase)nBTTagCompound2);
        nBTTagCompound.setShort("Width", (short)meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891());
        nBTTagCompound.setShort("Length", (short)meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892());
        nBTTagCompound.setShort("Height", (short)meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893());
        int n = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891() * meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892() * meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893();
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n];
        byte[] byArray3 = new byte[n];
        byte[] byArray4 = new byte[(int)Math.ceil((double)n / Double.longBitsToDouble(0x3C3CAD6AB15ADA64L ^ 0x7C3CAD6AB15ADA64L))];
        int n2 = (int)((long)1237098319 ^ (long)1237098319);
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        HashMap<Object, Short> hashMap = new HashMap<Object, Short>();
        int n3 = (int)((long)-359343196 ^ (long)-359343196);
        while (true) {
            if (n3 < meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891()) {
            } else {
                n3 = (int)((long)-2053344325 ^ (long)-2053344322) << 2;
                nBTTagList = new NBTTagList();
                for (TileEntity tileEntity : meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2883()) {
                    object2 = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5734(tileEntity);
                    nBTTagList.appendTag((NBTBase)object2);
                }
                break;
            }
            for (int i = (int)-23990928L ^ 0xFE91ED70; i < meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893(); ++i) {
                for (int j = (int)((long)314793485 ^ (long)314793485); j < meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892(); ++j) {
                    int n4 = n3 + (i * meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892() + j) * meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891();
                    object2 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2880(eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(n3, i, j));
                    block2 = object2.getBlock();
                    int n5 = Block.REGISTRY.getIDForObject((Object)block2);
                    byArray[n4] = (byte)n5;
                    byArray2[n4] = (byte)block2.getMetaFromState((IBlockState)object2);
                    byArray3[n4] = (byte)(n5 >> ((int)((long)-494691817 ^ (long)-494691818) << 3));
                    if (byArray3[n4] > 0) {
                        n2 = (int)((long)668844695 ^ (long)668844694);
                    }
                    if (hashMap.containsKey(object = String.valueOf(Block.REGISTRY.getNameForObject((Object)block2)))) continue;
                    hashMap.put(object, (short)n5);
                }
            }
            ++n3;
        }
        for (int i = (int)371154683L ^ 0x161F5EFB; i < byArray4.length; ++i) {
            byArray4[i] = i * (((int)1089043611L ^ 0x40E97C9A) << 1) + ((int)1045249462L ^ 0x3E4D3DB7) < byArray3.length ? (byte)(byArray3[i * (((int)-1363599263L ^ 0xAEB92060) << 1) + ((int)-6801928L ^ 0xFF9835F8)] << (((int)-723750736L ^ 0xD4DC70B1) << 2) | byArray3[i * (((int)-592756615L ^ 0xDCAB4078) << 1) + (int)((long)-1510532662 ^ (long)-1510532661)]) : (byte)(byArray3[i * ((int)((long)2036767872 ^ (long)2036767873) << 1) + (int)((long)-244200861 ^ (long)-244200861)] << (((int)-1188200745L ^ 0xB92D7ED6) << 2));
        }
        NBTTagList nBTTagList2 = new NBTTagList();
        List list = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2886();
        for (Block block2 : list) {
            NBTTagCompound nBTTagCompound3 = UJPJNlIy2bJB5LMRhdrfBJMZq2HwBQSh.Method5736((Entity)block2);
            if (nBTTagCompound3 == null) continue;
            nBTTagList2.appendTag((NBTBase)nBTTagCompound3);
        }
        object2 = new ODLB1whnCpfwefGXsXGa3bDkhmARtqU0(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, hashMap);
        MinecraftForge.EVENT_BUS.post((Event)object2);
        block2 = new NBTTagCompound();
        NBTTagCompound nBTTagCompound4 = hashMap.entrySet().iterator();
        while (true) {
            if (!nBTTagCompound4.hasNext()) {
                nBTTagCompound.setString("Materials", "Alpha");
                nBTTagCompound.setByteArray("Blocks", byArray);
                nBTTagCompound.setByteArray("Data", byArray2);
                nBTTagCompound.setTag("Entities", (NBTBase)nBTTagList2);
                nBTTagCompound.setTag("TileEntities", (NBTBase)nBTTagList);
                nBTTagCompound.setTag("SchematicaMapping", (NBTBase)block2);
                nBTTagCompound4 = object2.Field8044;
                if (nBTTagCompound4.isEmpty()) return (int)((long)-234645164 ^ (long)-234645163) != 0;
                nBTTagCompound.setTag("ExtendedMetadata", (NBTBase)nBTTagCompound4);
                return (int)((long)-234645164 ^ (long)-234645163) != 0;
            }
            object = nBTTagCompound4.next();
            block2.setShort((String)object.getKey(), ((Short)object.getValue()).shortValue());
        }
    }

    @Override
    public String Method992() {
        return "schematica.format.alpha";
    }

    @Override
    public String Method993() {
        return ".schematic";
    }

    private static String Method1001(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1032842845 ^ (long)1032842845);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1491884286 ^ (long)-1491884035);
            int n2 = (int)((long)1858641087 ^ (long)1858641054);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1887093697L ^ 0x8F851FCC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

