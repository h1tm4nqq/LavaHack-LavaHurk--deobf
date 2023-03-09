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
import lavahack.client.Class1433;
import lavahack.client.Class153;
import lavahack.client.Class16;
import lavahack.client.Class1885;
import lavahack.client.Class292;
import lavahack.client.Class39;
import lavahack.client.Class686;
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

public class Class1341
extends Class153 {
    private int Field14121;

    @Override
    public Class686 Method990(NBTTagCompound nBTTagCompound) {
        Object object;
        Object object2;
        int n;
        ItemStack itemStack = Class292.Method1528(nBTTagCompound);
        byte[] byArray = nBTTagCompound.getByteArray("Blocks");
        byte[] byArray2 = nBTTagCompound.getByteArray("Data");
        boolean bl = false;
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        if (nBTTagCompound.hasKey("AddBlocks")) {
            bl = true;
            byArray4 = nBTTagCompound.getByteArray("AddBlocks");
            byArray3 = new byte[byArray4.length * 2];
            for (n = 0; n < byArray4.length; ++n) {
                byArray3[n * 2 + 0] = (byte)(byArray4[n] >> 4 & 0xF);
                byArray3[n * 2 + 1] = (byte)(byArray4[n] & 0xF);
            }
        } else if (nBTTagCompound.hasKey("Add")) {
            bl = true;
            byArray3 = nBTTagCompound.getByteArray("Add");
        }
        n = nBTTagCompound.getShort("Width");
        int n2 = nBTTagCompound.getShort("Length");
        int n3 = nBTTagCompound.getShort("Height");
        Short s = null;
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
        object2 = new Class16();
        object = new Class1885(itemStack, n, n3, n2);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < n2; ++k) {
                    int n4 = i + (j * n2 + k) * n;
                    int n5 = byArray[n4] & 0xFF | 0;
                    int n6 = byArray2[n4] & 0xFF;
                    s = (Short)hashMap.get((short)n5);
                    if (s != null) {
                        n5 = s.shortValue();
                    }
                    Block block = (Block)Block.REGISTRY.getObjectById(n5);
                    ((Class16)((Object)object2)).set(i, j, k);
                    IBlockState iBlockState = block.getStateFromMeta(n6);
                    object.Method2881((BlockPos)object2, iBlockState);
                }
            }
        }
        NBTTagList nBTTagList = nBTTagCompound.getTagList("TileEntities", 10);
        int n7 = 0;
        while (n7 < nBTTagList.tagCount()) {
            TileEntity tileEntity = Class1433.Method5735(nBTTagList.getCompoundTagAt(n7));
            if (tileEntity != null) {
                object.Method2884(tileEntity.getPos(), tileEntity);
            }
            ++n7;
        }
        return object;
    }

    @Override
    public boolean Method991(NBTTagCompound nBTTagCompound, Class686 class686) {
        Object object;
        Block block2;
        Object object2;
        NBTTagList nBTTagList;
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        ItemStack itemStack = class686.Method2889();
        itemStack.writeToNBT(nBTTagCompound2);
        nBTTagCompound.setTag("Icon", (NBTBase)nBTTagCompound2);
        nBTTagCompound.setShort("Width", (short)class686.Method2891());
        nBTTagCompound.setShort("Length", (short)class686.Method2892());
        nBTTagCompound.setShort("Height", (short)class686.Method2893());
        int n = class686.Method2891() * class686.Method2892() * class686.Method2893();
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n];
        byte[] byArray3 = new byte[n];
        byte[] byArray4 = new byte[(int)Math.ceil((double)n / Double.longBitsToDouble(0x4000000000000000L))];
        boolean bl = false;
        Class16 class16 = new Class16();
        HashMap<Object, Short> hashMap = new HashMap<Object, Short>();
        int n2 = 0;
        while (true) {
            if (n2 < class686.Method2891()) {
            } else {
                n2 = 20;
                nBTTagList = new NBTTagList();
                for (TileEntity tileEntity : class686.Method2883()) {
                    object2 = Class1433.Method5734(tileEntity);
                    nBTTagList.appendTag((NBTBase)object2);
                }
                break;
            }
            for (int i = 0; i < class686.Method2893(); ++i) {
                for (int j = 0; j < class686.Method2892(); ++j) {
                    int n3 = n2 + (i * class686.Method2892() + j) * class686.Method2891();
                    object2 = class686.Method2880(class16.set(n2, i, j));
                    block2 = object2.getBlock();
                    int n4 = Block.REGISTRY.getIDForObject((Object)block2);
                    byArray[n3] = (byte)n4;
                    byArray2[n3] = (byte)block2.getMetaFromState((IBlockState)object2);
                    byArray3[n3] = (byte)(n4 >> 8);
                    if (byArray3[n3] > 0) {
                        bl = true;
                    }
                    if (hashMap.containsKey(object = String.valueOf(Block.REGISTRY.getNameForObject((Object)block2)))) continue;
                    hashMap.put(object, (short)n4);
                }
            }
            ++n2;
        }
        for (int i = 0; i < byArray4.length; ++i) {
            byArray4[i] = i * 2 + 1 < byArray3.length ? (byte)(byArray3[i * 2 + 0] << 4 | byArray3[i * 2 + 1]) : (byte)(byArray3[i * 2 + 0] << 4);
        }
        NBTTagList nBTTagList2 = new NBTTagList();
        List list = class686.Method2886();
        for (Block block2 : list) {
            NBTTagCompound nBTTagCompound3 = Class1433.Method5736((Entity)block2);
            if (nBTTagCompound3 == null) continue;
            nBTTagList2.appendTag((NBTBase)nBTTagCompound3);
        }
        object2 = new Class39(class686, hashMap);
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
                if (nBTTagCompound4.isEmpty()) return true;
                nBTTagCompound.setTag("ExtendedMetadata", (NBTBase)nBTTagCompound4);
                return true;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 33;
            cArray2[n] = (char)(cArray[n] ^ (0x47E6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

