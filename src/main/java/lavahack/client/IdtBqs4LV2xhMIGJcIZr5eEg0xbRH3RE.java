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
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.HYJBaHuHohzh6cKuoYprXexIDWip4amG;
import lavahack.client.IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE$1;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.VHIZhlnrB3zAeyoJuUVherdYJSCQT213;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.ZBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq;
import lavahack.client.cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
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

public class IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE {
    public static final IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE Field9718 = new IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE();
    private final Minecraft Field9719 = Minecraft.getMinecraft();
    private boolean Field9720 = (int)-728547388L ^ 0xD4933FC5;
    private boolean Field9721 = (int)((long)1084652715 ^ (long)1084652715);
    private boolean Field9722 = (int)((long)1931466624 ^ (long)1931466624);
    private OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 Field9723 = null;
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
        this.Field9721 = !this.Field9721 && this.Field9723 != null ? (int)((long)1517849578 ^ (long)1517849579) : (int)-417804468L ^ 0xE718CF4C;
        return this.Field9721;
    }

    public boolean Method2012() {
        return this.Field9721;
    }

    public void Method2013(boolean bl) {
        this.Field9721 = bl;
    }

    public OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 Method2014() {
        return this.Field9723;
    }

    public boolean Method2015() {
        int n;
        if (this.Field9723 != null && !this.Field9722) {
            n = (int)((long)-1366078654 ^ (long)-1366078654);
            return n != 0;
        }
        n = (int)-1832449268L ^ 0x92C70B0D;
        return n != 0;
    }

    public void Method2016(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3) {
        this.Field9723 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
        this.Method2017();
    }

    public void Method2017() {
        this.Field9724 = this.Field9723 != null ? new byte[this.Field9723.getWidth()][this.Field9723.getHeight()][this.Field9723.getLength()] : (byte[][][])null;
        this.Field9725.clear();
    }

    public boolean Method2018(WorldClient worldClient, EntityPlayerSP entityPlayerSP) {
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
        double d = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - (double)this.Field9723.Field14896.Field7895;
        double d2 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - (double)this.Field9723.Field14896.Field7896;
        double d3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8119.Field15157 - (double)this.Field9723.Field14896.Field7897;
        int n = (int)Math.floor(d);
        int n2 = (int)Math.floor(d2);
        int n3 = (int)Math.floor(d3);
        int n4 = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7983;
        int n5 = Math.max((int)-1209633573L ^ 0xB7E674DB, n - n4);
        int n6 = Math.min(this.Field9723.getWidth() - (int)((long)17464279 ^ (long)17464278), n + n4);
        int n7 = Math.max((int)((long)-1179941614 ^ (long)-1179941614), n2 - n4);
        int n8 = Math.min(this.Field9723.getHeight() - (int)((long)593743725 ^ (long)593743724), n2 + n4);
        int n9 = Math.max((int)((long)-1604440741 ^ (long)-1604440741), n3 - n4);
        int n10 = Math.min(this.Field9723.getLength() - (int)((long)607172725 ^ (long)607172724), n3 + n4);
        if (n5 > n6) return (int)((long)691975903 ^ (long)691975903) != 0;
        if (n7 > n8) return (int)((long)691975903 ^ (long)691975903) != 0;
        if (n9 > n10) {
            return (int)((long)691975903 ^ (long)691975903) != 0;
        }
        int n11 = entityPlayerSP.inventory.currentItem;
        boolean bl = entityPlayerSP.isSneaking();
        switch (IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE$1.Field16566[this.Field9723.Field14898.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                if (this.Field9723.Field14899 > n8) {
                    return ((int)2103368433L ^ 0x7D5EDAF1) != 0;
                }
                n8 = this.Field9723.Field14899;
            }
            case 3: {
                if (this.Field9723.Field14899 < n7) {
                    return ((int)-621107532L ^ 0xDAFAA6B4) != 0;
                }
                n8 = this.Field9723.Field14899;
                break;
            }
        }
        this.Method2026(entityPlayerSP, ((int)1400584302L ^ 0x537B386F) != 0);
        double d4 = (double)this.Field9719.playerController.getBlockReachDistance() - Double.longBitsToDouble((long)408322074 ^ 0x3FB9999981CF1980L);
        double d5 = d4 * d4;
        Iterator iterator = l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3241(n5, n7, n9, n6, n8, n10).iterator();
        do {
            if (iterator.hasNext()) continue;
            this.Field9722 = (int)((long)-1130381916 ^ (long)-1130381915);
            return this.Method2019(entityPlayerSP, n11, bl, ((int)689828728L ^ 0x291DF379) != 0);
        } while ((eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = (EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)((Object)iterator.next())).distanceSqToCenter(d, d2, d3) > d5 || !this.Method2020(worldClient, entityPlayerSP, eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN));
        this.Field9722 = (int)((long)-207221594 ^ (long)-207221594);
        return this.Method2019(entityPlayerSP, n11, bl, (boolean)((long)-716878561 ^ (long)-716878562));
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
        if (cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn.Method5242(iBlockState, iBlockState2)) {
            ZBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq zBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq = VHIZhlnrB3zAeyoJuUVherdYJSCQT213.Field11762.Method3735(block);
            if (zBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq == null) return ((int)-879053042L ^ 0xCB9AB70E) != 0;
            this.Field9724[n][n2][n3] = (byte)Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7982;
            Integer n7 = (Integer)this.Field9725.get(blockPos2);
            if (n7 == null) {
                n7 = (int)((long)-1310980582 ^ (long)-1310980582);
            } else if (n7 >= (int)((long)588014681 ^ (long)588014684) << 1) {
                return ((int)-1954200245L ^ 0x8B85454B) != 0;
            }
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.trace("Trying to sync block at {} {}", (Object)blockPos2, (Object)n7);
            boolean bl = zBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq.Method1265((EntityPlayer)entityPlayerSP, (World)this.Field9723, blockPos, (World)worldClient, blockPos2);
            if (!bl) return bl;
            this.Field9725.put(blockPos2, n7 + (int)((long)291281108 ^ (long)291281109));
            return bl;
        }
        if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7985 && !worldClient.isAirBlock(blockPos2) && this.Field9719.playerController.isInCreativeMode()) {
            boolean bl;
            this.Field9719.playerController.clickBlock(blockPos2, EnumFacing.DOWN);
            this.Field9724[n][n2][n3] = (byte)Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7982;
            if (!Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7986) {
                bl = (int)-1155901773L ^ 0xBB1A56B2;
                return bl;
            }
            bl = (int)90832578L ^ 0x569FEC2;
            return bl;
        }
        if (this.Field9723.isAirBlock(blockPos)) {
            return ((int)239464987L ^ 0xE45F21B) != 0;
        }
        if (!block.isReplaceable((IBlockAccess)worldClient, blockPos2)) {
            return (int)((long)-49877612 ^ (long)-49877612) != 0;
        }
        ItemStack itemStack = HYJBaHuHohzh6cKuoYprXexIDWip4amG.Method1238(iBlockState, new RayTraceResult((Entity)entityPlayerSP), this.Field9723, blockPos, (EntityPlayer)entityPlayerSP);
        if (itemStack.isEmpty()) {
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("{} is missing a mapping!", (Object)iBlockState);
            return ((int)-2099981579L ^ 0x82D4D2F5) != 0;
        }
        if (!this.Method2023(worldClient, entityPlayerSP, blockPos2, iBlockState, itemStack)) return ((int)-917795934L ^ 0xC94B8BA2) != 0;
        this.Field9724[n][n2][n3] = (byte)Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7982;
        if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7984) return ((int)-917795934L ^ 0xC94B8BA2) != 0;
        return ((int)-1261533933L ^ 0xB4CE8512) != 0;
    }

    private boolean Method2021(World world, BlockPos blockPos, EnumFacing enumFacing) {
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        IBlockState iBlockState = world.getBlockState(blockPos2);
        Block block = iBlockState.getBlock();
        if (block == null) {
            return ((int)-915866416L ^ 0xC968FCD0) != 0;
        }
        if (block.isAir(iBlockState, (IBlockAccess)world, blockPos2)) {
            return (int)((long)-1743075230 ^ (long)-1743075230) != 0;
        }
        if (block instanceof BlockFluidBase) {
            return ((int)1857649504L ^ 0x6EB97B60) != 0;
        }
        if (!block.isReplaceable((IBlockAccess)world, blockPos2)) return (int)((long)2065849042 ^ (long)2065849043) != 0;
        return ((int)-1582647054L ^ 0xA1AAB8F2) != 0;
    }

    private List Method2022(World world, BlockPos blockPos) {
        if (!Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7987) {
            return Arrays.asList(EnumFacing.VALUES);
        }
        int n = (int)1818973518L ^ 0x6C6B554E;
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        EnumFacing[] enumFacingArray = EnumFacing.VALUES;
        int n2 = enumFacingArray.length;
        int n3 = (int)-1793159761L ^ 0x951E8DAF;
        while (n3 < n2) {
            EnumFacing enumFacing = enumFacingArray[n3];
            if (this.Method2021(world, blockPos, enumFacing)) {
                arrayList.add(enumFacing);
            }
            ++n3;
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl205 : IRETURN - null : trying to set 1 previously set to 2
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
        boolean bl;
        EnumHand enumHand = EnumHand.MAIN_HAND;
        ItemStack itemStack = entityPlayerSP.getHeldItem(enumHand);
        int bl2 = (int)-1254151251L ^ 0xB53F2BAD;
        if (!this.Field9719.playerController.isInCreativeMode() && !itemStack.isEmpty() && itemStack.getCount() <= n) {
            return (int)((long)1017776117 ^ (long)1017776117) != 0;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((double)((float)blockPos2.getX() + f), (double)((float)blockPos2.getY() + f2), (double)((float)blockPos2.getZ() + f3));
        boolean bl3 = this.Method2025(worldClient, entityPlayerSP, itemStack, blockPos2, enumFacing2, vec3d, enumHand);
        for (int i = (int)((long)1789515410 ^ (long)1789515410); bl && i < n; ++i) {
            bl = this.Method2025(worldClient, entityPlayerSP, itemStack, blockPos2, enumFacing2, vec3d, enumHand);
        }
        if (itemStack.getCount() != 0) return bl;
        if (!bl) return bl;
        entityPlayerSP.inventory.mainInventory.set(entityPlayerSP.inventory.currentItem, (Object)ItemStack.EMPTY);
        return bl;
    }

    private boolean Method2025(WorldClient worldClient, EntityPlayerSP entityPlayerSP, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, Vec3d vec3d, EnumHand enumHand) {
        BlockPos blockPos2 = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7987 ? blockPos : blockPos.offset(enumFacing);
        EnumActionResult enumActionResult = this.Field9719.playerController.processRightClickBlock(entityPlayerSP, worldClient, blockPos2, enumFacing, vec3d, enumHand);
        if (enumActionResult != EnumActionResult.SUCCESS) {
            return ((int)-423467866L ^ 0xE6C264A6) != 0;
        }
        entityPlayerSP.swingArm(enumHand);
        return (int)((long)-355926560 ^ (long)-355926559) != 0;
    }

    private void Method2026(EntityPlayerSP entityPlayerSP, boolean bl) {
        entityPlayerSP.setSneaking(bl);
        entityPlayerSP.connection.sendPacket((Packet)new CPacketEntityAction((Entity)entityPlayerSP, bl ? CPacketEntityAction.Action.START_SNEAKING : CPacketEntityAction.Action.STOP_SNEAKING));
    }

    private boolean Method2027(InventoryPlayer inventoryPlayer, ItemStack itemStack) {
        return this.Method2028(inventoryPlayer, itemStack, (boolean)((long)-629491541 ^ (long)-629491542));
    }

    private boolean Method2028(InventoryPlayer inventoryPlayer, ItemStack itemStack, boolean bl) {
        int n = this.Method2029(inventoryPlayer, itemStack);
        if (this.Field9719.playerController.isInCreativeMode() && (n < 0 || n >= ((int)1385833738L ^ 0x529A2503)) && Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7989.size() > 0) {
            inventoryPlayer.currentItem = this.Method2031();
            inventoryPlayer.setInventorySlotContents(inventoryPlayer.currentItem, itemStack.copy());
            this.Field9719.playerController.sendSlotPacket(inventoryPlayer.getStackInSlot(inventoryPlayer.currentItem), ((int)((long)-581257948 ^ (long)-581257939) << 2) + inventoryPlayer.currentItem);
            return (int)((long)-1363428133 ^ (long)-1363428134) != 0;
        }
        if (n >= 0 && n < ((int)-570999207L ^ 0xDDF73E50)) {
            inventoryPlayer.currentItem = n;
            return (int)((long)1373333238 ^ (long)1373333239) != 0;
        }
        if (!bl) return ((int)1123873974L ^ 0x42FCF4B6) != 0;
        if (n < (int)((long)-1546422776 ^ (long)-1546422783)) return ((int)1123873974L ^ 0x42FCF4B6) != 0;
        if (n >= ((int)1688235350L ^ 0x64A06D5F) << 2) return ((int)1123873974L ^ 0x42FCF4B6) != 0;
        if (!this.Method2030(inventoryPlayer, n)) return ((int)1123873974L ^ 0x42FCF4B6) != 0;
        return this.Method2028(inventoryPlayer, itemStack, ((int)1614880897L ^ 0x60412081) != 0);
    }

    private int Method2029(InventoryPlayer inventoryPlayer, ItemStack itemStack) {
        int n = (int)1452709797L ^ 0x569697A5;
        while (n < inventoryPlayer.mainInventory.size()) {
            if (((ItemStack)inventoryPlayer.mainInventory.get(n)).isItemEqual(itemStack)) {
                return n;
            }
            ++n;
        }
        return (int)1863334597L ^ 0x90EFC53A;
    }

    private boolean Method2030(InventoryPlayer inventoryPlayer, int n) {
        if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7989.size() <= 0) return ((int)-1295792551L ^ 0xB2C3C659) != 0;
        int n2 = this.Method2031();
        this.Method2032(n, n2);
        return ((int)-1240858882L ^ 0xB609FEFF) != 0;
    }

    private int Method2031() {
        int n = (Integer)Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7989.poll() % (int)((long)225398200 ^ (long)225398193);
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7989.offer(n);
        return n;
    }

    private boolean Method2032(int n, int n2) {
        int n3;
        if (this.Field9719.playerController.windowClick(this.Field9719.player.inventoryContainer.windowId, n, n2, ClickType.SWAP, (EntityPlayer)this.Field9719.player) == ItemStack.EMPTY) {
            n3 = (int)-1350805778L ^ 0xAF7C56EF;
            return n3 != 0;
        }
        n3 = (int)((long)628482319 ^ (long)628482319);
        return n3 != 0;
    }

    private static String Method2033(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1158630111 ^ (long)1158630111);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1283757469 ^ (long)-1283757412);
            int n2 = (int)1563527955L ^ 0x5D318B4A;
            cArray2[n] = (char)(cArray[n] ^ (((int)-877351777L ^ 0xCBB4ADA2) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

