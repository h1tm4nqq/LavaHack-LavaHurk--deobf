//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fluids.BlockFluidBase
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1123;
import lavahack.client.Class1290;
import lavahack.client.Class1479;
import lavahack.client.Class16;
import lavahack.client.Class1863;
import lavahack.client.Class208;
import lavahack.client.Class32;
import lavahack.client.Class46;
import lavahack.client.Class542;
import lavahack.client.Class777;
import lavahack.client.Class897;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;

public class Class415 {
    public static final Class415 Field9718 = new Class415();
    private final Minecraft Field9719 = Minecraft.getMinecraft();
    private boolean Field9720 = true;
    private boolean Field9721 = false;
    private boolean Field9722 = false;
    private Class1479 Field9723 = null;
    private byte[][][] Field9724 = null;
    private HashMap Field9725 = new HashMap();
    private String Field9726 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method2009() {
        return this.Field9720;
    }

    public void Method2010(boolean bl) {
        this.Field9720 = bl;
    }

    public boolean Method2011() {
        this.Field9721 = !this.Field9721 && this.Field9723 != null;
        return this.Field9721;
    }

    public boolean Method2012() {
        return this.Field9721;
    }

    public void Method2013(boolean bl) {
        this.Field9721 = bl;
    }

    public Class1479 Method2014() {
        return this.Field9723;
    }

    public boolean Method2015() {
        if (this.Field9723 == null) return true;
        if (this.Field9722) return true;
        return false;
    }

    public void Method2016(Class1479 class1479) {
        this.Field9723 = class1479;
        this.Method2017();
    }

    public void Method2017() {
        this.Field9724 = this.Field9723 != null ? new byte[this.Field9723.getWidth()][this.Field9723.getHeight()][this.Field9723.getLength()] : (byte[][][])null;
        this.Field9725.clear();
    }

    public boolean Method2018(WorldClient worldClient, EntityPlayerSP entityPlayerSP) {
        Class16 class16;
        double d = Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - (double)this.Field9723.Field14896.Field7895;
        double d2 = Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - (double)this.Field9723.Field14896.Field7896;
        double d3 = Class46.Field8119.Field15157 - (double)this.Field9723.Field14896.Field7897;
        int n = (int)Math.floor(d);
        int n2 = (int)Math.floor(d2);
        int n3 = (int)Math.floor(d3);
        int n4 = Class32.Field7983;
        int n5 = Math.max(0, n - n4);
        int n6 = Math.min(this.Field9723.getWidth() - 1, n + n4);
        int n7 = Math.max(0, n2 - n4);
        int n8 = Math.min(this.Field9723.getHeight() - 1, n2 + n4);
        int n9 = Math.max(0, n3 - n4);
        int n10 = Math.min(this.Field9723.getLength() - 1, n3 + n4);
        if (n5 > n6) return false;
        if (n7 > n8) return false;
        if (n9 > n10) {
            return false;
        }
        int n11 = entityPlayerSP.inventory.currentItem;
        boolean bl = entityPlayerSP.isSneaking();
        switch (Class1863.Field16566[this.Field9723.Field14898.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                if (this.Field9723.Field14899 > n8) {
                    return false;
                }
                n8 = this.Field9723.Field14899;
            }
            case 3: {
                if (this.Field9723.Field14899 < n7) {
                    return false;
                }
                n8 = this.Field9723.Field14899;
                break;
            }
        }
        this.Method2026(entityPlayerSP, true);
        double d4 = (double)this.Field9719.playerController.getBlockReachDistance() - Double.longBitsToDouble((long)408322074 ^ 0x3FB9999981CF1980L);
        double d5 = d4 * d4;
        Iterator iterator = Class777.Method3241(n5, n7, n9, n6, n8, n10).iterator();
        do {
            if (iterator.hasNext()) continue;
            this.Field9722 = true;
            return this.Method2019(entityPlayerSP, n11, bl, true);
        } while ((class16 = (Class16)((Object)iterator.next())).distanceSqToCenter(d, d2, d3) > d5 || !this.Method2020(worldClient, entityPlayerSP, class16));
        this.Field9722 = false;
        return this.Method2019(entityPlayerSP, n11, bl, true);
    }

    private boolean Method2019(EntityPlayerSP entityPlayerSP, int n, boolean bl, boolean bl2) {
        this.Method2026(entityPlayerSP, bl);
        return bl2;
    }

    private boolean Method2020(WorldClient worldClient, EntityPlayerSP entityPlayerSP, BlockPos blockPos) {
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        int n4 = this.Field9723.Field14896.Field7895 + n;
        int n5 = this.Field9723.Field14896.Field7896 + n2;
        int n6 = this.Field9723.Field14896.Field7897 + n3;
        BlockPos blockPos2 = new BlockPos(n4, n5, n6);
        IBlockState iBlockState = this.Field9723.getBlockState(blockPos);
        IBlockState iBlockState2 = worldClient.getBlockState(blockPos2);
        Block block = iBlockState2.getBlock();
        if (Class1290.Method5242(iBlockState, iBlockState2)) {
            Class1123 class1123 = Class897.Field11762.Method3735(block);
            if (class1123 == null) return false;
            this.Field9724[n][n2][n3] = (byte)Class32.Field7982;
            Integer n7 = (Integer)this.Field9725.get(blockPos2);
            if (n7 == null) {
                n7 = 0;
            } else if (n7 >= 10) {
                return false;
            }
            Class542.Field10314.trace("Trying to sync block at {} {}", (Object)blockPos2, (Object)n7);
            boolean bl = class1123.Method1265((EntityPlayer)entityPlayerSP, (World)this.Field9723, blockPos, (World)worldClient, blockPos2);
            if (!bl) return bl;
            this.Field9725.put(blockPos2, n7 + 1);
            return bl;
        }
        if (Class32.Field7985 && !worldClient.isAirBlock(blockPos2) && this.Field9719.playerController.isInCreativeMode()) {
            this.Field9719.playerController.clickBlock(blockPos2, EnumFacing.DOWN);
            this.Field9724[n][n2][n3] = (byte)Class32.Field7982;
            if (Class32.Field7986) return false;
            return true;
        }
        if (this.Field9723.isAirBlock(blockPos)) {
            return false;
        }
        if (!block.isReplaceable((IBlockAccess)worldClient, blockPos2)) {
            return false;
        }
        ItemStack itemStack = Class208.Method1238(iBlockState, new RayTraceResult((Entity)entityPlayerSP), this.Field9723, blockPos, (EntityPlayer)entityPlayerSP);
        if (itemStack.isEmpty()) {
            Class542.Field10314.debug("{} is missing a mapping!", (Object)iBlockState);
            return false;
        }
        if (!this.Method2023(worldClient, entityPlayerSP, blockPos2, iBlockState, itemStack)) return false;
        this.Field9724[n][n2][n3] = (byte)Class32.Field7982;
        if (Class32.Field7984) return false;
        return true;
    }

    private boolean Method2021(World world, BlockPos blockPos, EnumFacing enumFacing) {
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        IBlockState iBlockState = world.getBlockState(blockPos2);
        Block block = iBlockState.getBlock();
        if (block == null) {
            return false;
        }
        if (block.isAir(iBlockState, (IBlockAccess)world, blockPos2)) {
            return false;
        }
        if (block instanceof BlockFluidBase) {
            return false;
        }
        if (!block.isReplaceable((IBlockAccess)world, blockPos2)) return true;
        return false;
    }

    private List Method2022(World world, BlockPos blockPos) {
        if (!Class32.Field7987) {
            return Arrays.asList(EnumFacing.VALUES);
        }
        boolean bl = false;
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        EnumFacing[] enumFacingArray = EnumFacing.VALUES;
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            if (this.Method2021(world, blockPos, enumFacing)) {
                arrayList.add(enumFacing);
            }
            ++n2;
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    private boolean Method2023(WorldClient var1, EntityPlayerSP var2, BlockPos var3, IBlockState var4, ItemStack var5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl149 : IRETURN - null : trying to set 1 previously set to 2
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:207)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1559)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:434)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private boolean Method2024(WorldClient worldClient, EntityPlayerSP entityPlayerSP, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n) {
        EnumHand enumHand = EnumHand.MAIN_HAND;
        ItemStack itemStack = entityPlayerSP.getHeldItem(enumHand);
        boolean bl = false;
        if (!this.Field9719.playerController.isInCreativeMode() && !itemStack.isEmpty() && itemStack.getCount() <= n) {
            return false;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((double)((float)blockPos2.getX() + f), (double)((float)blockPos2.getY() + f2), (double)((float)blockPos2.getZ() + f3));
        bl = this.Method2025(worldClient, entityPlayerSP, itemStack, blockPos2, enumFacing2, vec3d, enumHand);
        for (int i = 0; bl && i < n; ++i) {
            bl = this.Method2025(worldClient, entityPlayerSP, itemStack, blockPos2, enumFacing2, vec3d, enumHand);
        }
        if (itemStack.getCount() != 0) return bl;
        if (!bl) return bl;
        entityPlayerSP.inventory.mainInventory.set(entityPlayerSP.inventory.currentItem, (Object)ItemStack.EMPTY);
        return bl;
    }

    private boolean Method2025(WorldClient worldClient, EntityPlayerSP entityPlayerSP, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, Vec3d vec3d, EnumHand enumHand) {
        BlockPos blockPos2 = Class32.Field7987 ? blockPos : blockPos.offset(enumFacing);
        EnumActionResult enumActionResult = this.Field9719.playerController.processRightClickBlock(entityPlayerSP, worldClient, blockPos2, enumFacing, vec3d, enumHand);
        if (enumActionResult != EnumActionResult.SUCCESS) {
            return false;
        }
        entityPlayerSP.swingArm(enumHand);
        return true;
    }

    private void Method2026(EntityPlayerSP entityPlayerSP, boolean bl) {
        entityPlayerSP.setSneaking(bl);
        entityPlayerSP.connection.sendPacket((Packet)new CPacketEntityAction((Entity)entityPlayerSP, bl ? CPacketEntityAction.Action.START_SNEAKING : CPacketEntityAction.Action.STOP_SNEAKING));
    }

    private boolean Method2027(InventoryPlayer inventoryPlayer, ItemStack itemStack) {
        return this.Method2028(inventoryPlayer, itemStack, true);
    }

    private boolean Method2028(InventoryPlayer inventoryPlayer, ItemStack itemStack, boolean bl) {
        int n = this.Method2029(inventoryPlayer, itemStack);
        if (this.Field9719.playerController.isInCreativeMode() && (n < 0 || n >= 9) && Class32.Field7989.size() > 0) {
            inventoryPlayer.currentItem = this.Method2031();
            inventoryPlayer.setInventorySlotContents(inventoryPlayer.currentItem, itemStack.copy());
            this.Field9719.playerController.sendSlotPacket(inventoryPlayer.getStackInSlot(inventoryPlayer.currentItem), 36 + inventoryPlayer.currentItem);
            return true;
        }
        if (n >= 0 && n < 9) {
            inventoryPlayer.currentItem = n;
            return true;
        }
        if (!bl) return false;
        if (n < 9) return false;
        if (n >= 36) return false;
        if (!this.Method2030(inventoryPlayer, n)) return false;
        return this.Method2028(inventoryPlayer, itemStack, false);
    }

    private int Method2029(InventoryPlayer inventoryPlayer, ItemStack itemStack) {
        int n = 0;
        while (n < inventoryPlayer.mainInventory.size()) {
            if (((ItemStack)inventoryPlayer.mainInventory.get(n)).isItemEqual(itemStack)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    private boolean Method2030(InventoryPlayer inventoryPlayer, int n) {
        if (Class32.Field7989.size() <= 0) return false;
        int n2 = this.Method2031();
        this.Method2032(n, n2);
        return true;
    }

    private int Method2031() {
        int n = (Integer)Class32.Field7989.poll() % 9;
        Class32.Field7989.offer(n);
        return n;
    }

    private boolean Method2032(int n, int n2) {
        if (this.Field9719.playerController.windowClick(this.Field9719.player.inventoryContainer.windowId, n, n2, ClickType.SWAP, (EntityPlayer)this.Field9719.player) != ItemStack.EMPTY) return false;
        return true;
    }

    private static String Method2033(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 89;
            cArray2[n] = (char)(cArray[n] ^ (0x27A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

