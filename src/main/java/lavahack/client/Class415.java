//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.entity.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraftforge.fluids.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;

public class Class415
{
    public static final Class415 Field9718;
    private final Minecraft Field9719;
    private boolean Field9720;
    private boolean Field9721;
    private boolean Field9722;
    private Class1479 Field9723;
    private byte[][][] Field9724;
    private HashMap Field9725;
    private String Field9726 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class415() {
        this.Field9719 = Minecraft.getMinecraft();
        this.Field9720 = true;
        this.Field9721 = false;
        this.Field9722 = false;
        this.Field9723 = null;
        this.Field9724 = null;
        this.Field9725 = new HashMap();
    }
    
    public boolean Method2009() {
        return this.Field9720;
    }
    
    public void Method2010(final boolean field9720) {
        this.Field9720 = field9720;
    }
    
    public boolean Method2011() {
        return this.Field9721 = (!this.Field9721 && this.Field9723 != null);
    }
    
    public boolean Method2012() {
        return this.Field9721;
    }
    
    public void Method2013(final boolean field9721) {
        this.Field9721 = field9721;
    }
    
    public Class1479 Method2014() {
        return this.Field9723;
    }
    
    public boolean Method2015() {
        return this.Field9723 == null || this.Field9722;
    }
    
    public void Method2016(final Class1479 field9723) {
        this.Field9723 = field9723;
        this.Method2017();
    }
    
    public void Method2017() {
        if (this.Field9723 != null) {
            this.Field9724 = new byte[this.Field9723.getWidth()][this.Field9723.getHeight()][this.Field9723.getLength()];
        }
        else {
            this.Field9724 = null;
        }
        this.Field9725.clear();
    }
    
    public boolean Method2018(final WorldClient worldClient, final EntityPlayerSP entityPlayerSP) {
        final double a = Class46.Field8119.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - this.Field9723.Field14896.Field7895;
        final double a2 = Class46.Field8119.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - this.Field9723.Field14896.Field7896;
        final double a3 = Class46.Field8119.Field15157 - this.Field9723.Field14896.Field7897;
        final int n = (int)Math.floor(a);
        final int n2 = (int)Math.floor(a2);
        final int n3 = (int)Math.floor(a3);
        final int field7983 = Class32.Field7983;
        final int max = Math.max(0, n - field7983);
        final int min = Math.min(this.Field9723.getWidth() - 1, n + field7983);
        final int max2 = Math.max(0, n2 - field7983);
        int n4 = Math.min(this.Field9723.getHeight() - 1, n2 + field7983);
        final int max3 = Math.max(0, n3 - field7983);
        final int min2 = Math.min(this.Field9723.getLength() - 1, n3 + field7983);
        if (max > min || max2 > n4 || max3 > min2) {
            return false;
        }
        final int currentItem = entityPlayerSP.inventory.currentItem;
        final boolean isSneaking = entityPlayerSP.isSneaking();
        switch (Class1863.Field16566[this.Field9723.Field14898.ordinal()]) {
            case 2: {
                if (this.Field9723.Field14899 > n4) {
                    return false;
                }
                final int field7984 = this.Field9723.Field14899;
            }
            case 3: {
                if (this.Field9723.Field14899 < max2) {
                    return false;
                }
                n4 = this.Field9723.Field14899;
                break;
            }
        }
        this.Method2026(entityPlayerSP, true);
        final double n5 = this.Field9719.playerController.getBlockReachDistance() - Double.longBitsToDouble((long)408322074 ^ 0x3FB9999981CF1980L);
        final double n6 = n5 * n5;
        for (final Class16 class16 : Class777.Method3241(max, max2, max3, min, n4, min2)) {
            if (class16.distanceSqToCenter(a, a2, a3) > n6) {
                continue;
            }
            if (this.Method2020(worldClient, entityPlayerSP, (BlockPos)class16)) {
                this.Field9722 = false;
                return this.Method2019(entityPlayerSP, currentItem, isSneaking, true);
            }
        }
        this.Field9722 = true;
        return this.Method2019(entityPlayerSP, currentItem, isSneaking, true);
    }
    
    private boolean Method2019(final EntityPlayerSP entityPlayerSP, final int n, final boolean b, final boolean b2) {
        this.Method2026(entityPlayerSP, b);
        return b2;
    }
    
    private boolean Method2020(final WorldClient worldClient, final EntityPlayerSP entityPlayerSP, final BlockPos blockPos) {
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        final BlockPos blockPos2 = new BlockPos(this.Field9723.Field14896.Field7895 + getX, this.Field9723.Field14896.Field7896 + getY, this.Field9723.Field14896.Field7897 + getZ);
        final IBlockState getBlockState = this.Field9723.getBlockState(blockPos);
        final IBlockState getBlockState2 = worldClient.getBlockState(blockPos2);
        final Block getBlock = getBlockState2.getBlock();
        if (Class1290.Method5242(getBlockState, getBlockState2)) {
            final Class1123 method3735 = Class897.Field11762.Method3735(getBlock);
            if (method3735 != null) {
                this.Field9724[getX][getY][getZ] = (byte)Class32.Field7982;
                Integer value = this.Field9725.get(blockPos2);
                if (value == null) {
                    value = 0;
                }
                else if (value >= 10) {
                    return false;
                }
                Class542.Field10314.trace("Trying to sync block at {} {}", (Object)blockPos2, (Object)value);
                final boolean method3736 = method3735.Method1265((EntityPlayer)entityPlayerSP, (World)this.Field9723, blockPos, (World)worldClient, blockPos2);
                if (method3736) {
                    this.Field9725.put(blockPos2, value + 1);
                }
                return method3736;
            }
            return false;
        }
        else {
            if (Class32.Field7985 && !worldClient.isAirBlock(blockPos2) && this.Field9719.playerController.isInCreativeMode()) {
                this.Field9719.playerController.clickBlock(blockPos2, EnumFacing.DOWN);
                this.Field9724[getX][getY][getZ] = (byte)Class32.Field7982;
                return !Class32.Field7986;
            }
            if (this.Field9723.isAirBlock(blockPos)) {
                return false;
            }
            if (!getBlock.isReplaceable((IBlockAccess)worldClient, blockPos2)) {
                return false;
            }
            final ItemStack method3737 = Class208.Method1238(getBlockState, new RayTraceResult((Entity)entityPlayerSP), this.Field9723, blockPos, (EntityPlayer)entityPlayerSP);
            if (method3737.isEmpty()) {
                Class542.Field10314.debug("{} is missing a mapping!", (Object)getBlockState);
                return false;
            }
            if (this.Method2023(worldClient, entityPlayerSP, blockPos2, getBlockState, method3737)) {
                this.Field9724[getX][getY][getZ] = (byte)Class32.Field7982;
                if (!Class32.Field7984) {
                    return true;
                }
            }
            return false;
        }
    }
    
    private boolean Method2021(final World world, final BlockPos blockPos, final EnumFacing enumFacing) {
        final BlockPos offset = blockPos.offset(enumFacing);
        final IBlockState getBlockState = world.getBlockState(offset);
        final Block getBlock = getBlockState.getBlock();
        return getBlock != null && !getBlock.isAir(getBlockState, (IBlockAccess)world, offset) && !(getBlock instanceof BlockFluidBase) && !getBlock.isReplaceable((IBlockAccess)world, offset);
    }
    
    private List Method2022(final World world, final BlockPos blockPos) {
        if (!Class32.Field7987) {
            return Arrays.asList(EnumFacing.VALUES);
        }
        final ArrayList<EnumFacing> list = new ArrayList<EnumFacing>();
        for (final EnumFacing enumFacing : EnumFacing.VALUES) {
            if (this.Method2021(world, blockPos, enumFacing)) {
                list.add(enumFacing);
            }
        }
        return list;
    }
    
    private boolean Method2023(final WorldClient p0, final EntityPlayerSP p1, final BlockPos p2, final IBlockState p3, final ItemStack p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //     5: instanceof      Lnet/minecraft/item/ItemBucket;
        //     8: ifeq            13
        //    11: iconst_0       
        //    12: ireturn        
        //    13: getstatic       lavahack/client/Class1954.Field17014:Llavahack/client/Class1954;
        //    16: aload           4
        //    18: aload           5
        //    20: invokevirtual   lavahack/client/Class1954.Method7246:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/item/ItemStack;)Llavahack/client/Class353;
        //    23: astore          6
        //    25: aload           6
        //    27: ifnull          45
        //    30: aload           6
        //    32: aload           4
        //    34: aload_2        
        //    35: aload_3        
        //    36: aload_1        
        //    37: invokevirtual   lavahack/client/Class353.Method1787:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z
        //    40: ifne            45
        //    43: iconst_0       
        //    44: ireturn        
        //    45: aload_0        
        //    46: aload_1        
        //    47: aload_3        
        //    48: invokespecial   lavahack/client/Class415.Method2022:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;
        //    51: astore          7
        //    53: aload           7
        //    55: invokeinterface java/util/List.size:()I
        //    60: ifne            65
        //    63: iconst_0       
        //    64: ireturn        
        //    65: getstatic       lavahack/client/Class1796.Field16242:Llavahack/client/Class80;
        //    68: new             Llavahack/client/Class1405;
        //    71: dup            
        //    72: aload_3        
        //    73: invokespecial   lavahack/client/Class1405.<init>:(Lnet/minecraft/util/math/BlockPos;)V
        //    76: invokevirtual   lavahack/client/Class80.Method715:(Ljava/lang/Object;)V
        //    79: aload           6
        //    81: ifnull          159
        //    84: aload           6
        //    86: aload           7
        //    88: aload           4
        //    90: invokevirtual   lavahack/client/Class353.Method1788:(Ljava/util/List;Lnet/minecraft/block/state/IBlockState;)Ljava/util/List;
        //    93: astore          13
        //    95: aload           13
        //    97: invokeinterface java/util/List.size:()I
        //   102: ifne            107
        //   105: iconst_0       
        //   106: ireturn        
        //   107: aload           13
        //   109: iconst_0       
        //   110: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   115: checkcast       Lnet/minecraft/util/EnumFacing;
        //   118: astore          8
        //   120: aload           6
        //   122: aload           4
        //   124: invokevirtual   lavahack/client/Class353.Method1783:(Lnet/minecraft/block/state/IBlockState;)F
        //   127: fstore          9
        //   129: aload           6
        //   131: aload           4
        //   133: invokevirtual   lavahack/client/Class353.Method1784:(Lnet/minecraft/block/state/IBlockState;)F
        //   136: fstore          10
        //   138: aload           6
        //   140: aload           4
        //   142: invokevirtual   lavahack/client/Class353.Method1785:(Lnet/minecraft/block/state/IBlockState;)F
        //   145: fstore          11
        //   147: aload           6
        //   149: aload           4
        //   151: invokevirtual   lavahack/client/Class353.Method1786:(Lnet/minecraft/block/state/IBlockState;)I
        //   154: istore          12
        //   156: goto            199
        //   159: aload           7
        //   161: iconst_0       
        //   162: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   167: checkcast       Lnet/minecraft/util/EnumFacing;
        //   170: astore          8
        //   172: ldc_w           1056964608
        //   175: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   178: fstore          9
        //   180: ldc_w           1056964608
        //   183: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   186: fstore          10
        //   188: ldc_w           1056964608
        //   191: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   194: fstore          11
        //   196: iconst_0       
        //   197: istore          12
        //   199: aload           5
        //   201: ifnull          269
        //   204: aload_2        
        //   205: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   208: aload           5
        //   210: invokevirtual   net/minecraft/entity/player/InventoryPlayer.getSlotFor:(Lnet/minecraft/item/ItemStack;)I
        //   213: istore          13
        //   215: iload           13
        //   217: iconst_m1      
        //   218: if_icmpeq       228
        //   221: iload           13
        //   223: bipush          9
        //   225: if_icmplt       230
        //   228: iconst_0       
        //   229: ireturn        
        //   230: aload_2        
        //   231: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   234: iload           13
        //   236: invokevirtual   net/minecraft/entity/player/InventoryPlayer.getStackInSlot:(I)Lnet/minecraft/item/ItemStack;
        //   239: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //   242: aload           5
        //   244: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //   247: if_acmpne       269
        //   250: aload_2        
        //   251: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   254: iload           13
        //   256: putfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //   259: aload_0        
        //   260: getfield        lavahack/client/Class415.Field9719:Lnet/minecraft/client/Minecraft;
        //   263: getfield        net/minecraft/client/Minecraft.playerController:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   266: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.updateController:()V
        //   269: aload_0        
        //   270: iconst_0       
        //   271: putfield        lavahack/client/Class415.Field9722:Z
        //   274: new             Llavahack/client/Class1795;
        //   277: dup            
        //   278: aload_3        
        //   279: aload           5
        //   281: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //   284: invokespecial   lavahack/client/Class1795.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/Item;)V
        //   287: astore          13
        //   289: getstatic       lavahack/client/Class1796.Field16242:Llavahack/client/Class80;
        //   292: aload           13
        //   294: invokevirtual   lavahack/client/Class80.Method715:(Ljava/lang/Object;)V
        //   297: aload           13
        //   299: invokevirtual   lavahack/client/Class1795.Method159:()Z
        //   302: ifeq            311
        //   305: aload           13
        //   307: iconst_0       
        //   308: goto            328
        //   311: aload_0        
        //   312: aload_1        
        //   313: aload_2        
        //   314: aload_3        
        //   315: aload           8
        //   317: fload           9
        //   319: fload           10
        //   321: fload           11
        //   323: iload           12
        //   325: invokespecial   lavahack/client/Class415.Method2024:(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFI)Z
        //   328: ireturn        
        //   329: aload           5
        //   331: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //   334: instanceof      Lnet/minecraft/item/ItemBucket;
        //   337: ifeq            342
        //   340: iconst_0       
        //   341: ireturn        
        //   342: getstatic       lavahack/client/Class1954.Field17014:Llavahack/client/Class1954;
        //   345: aload           4
        //   347: aload           5
        //   349: invokevirtual   lavahack/client/Class1954.Method7246:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/item/ItemStack;)Llavahack/client/Class353;
        //   352: astore          6
        //   354: aload           6
        //   356: ifnull          374
        //   359: aload           6
        //   361: aload           4
        //   363: aload_2        
        //   364: aload_3        
        //   365: aload_1        
        //   366: invokevirtual   lavahack/client/Class353.Method1787:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z
        //   369: ifne            374
        //   372: iconst_0       
        //   373: ireturn        
        //   374: aload_0        
        //   375: aload_1        
        //   376: aload_3        
        //   377: invokespecial   lavahack/client/Class415.Method2022:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;
        //   380: astore          7
        //   382: aload           7
        //   384: invokeinterface java/util/List.size:()I
        //   389: ifne            394
        //   392: iconst_0       
        //   393: ireturn        
        //   394: getstatic       lavahack/client/Class1796.Field16242:Llavahack/client/Class80;
        //   397: new             Llavahack/client/Class1405;
        //   400: dup            
        //   401: aload_3        
        //   402: invokespecial   lavahack/client/Class1405.<init>:(Lnet/minecraft/util/math/BlockPos;)V
        //   405: invokevirtual   lavahack/client/Class80.Method715:(Ljava/lang/Object;)V
        //   408: aload           6
        //   410: ifnull          488
        //   413: aload           6
        //   415: aload           7
        //   417: aload           4
        //   419: invokevirtual   lavahack/client/Class353.Method1788:(Ljava/util/List;Lnet/minecraft/block/state/IBlockState;)Ljava/util/List;
        //   422: astore          13
        //   424: aload           13
        //   426: invokeinterface java/util/List.size:()I
        //   431: ifne            436
        //   434: iconst_0       
        //   435: ireturn        
        //   436: aload           13
        //   438: iconst_0       
        //   439: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   444: checkcast       Lnet/minecraft/util/EnumFacing;
        //   447: astore          8
        //   449: aload           6
        //   451: aload           4
        //   453: invokevirtual   lavahack/client/Class353.Method1783:(Lnet/minecraft/block/state/IBlockState;)F
        //   456: fstore          9
        //   458: aload           6
        //   460: aload           4
        //   462: invokevirtual   lavahack/client/Class353.Method1784:(Lnet/minecraft/block/state/IBlockState;)F
        //   465: fstore          10
        //   467: aload           6
        //   469: aload           4
        //   471: invokevirtual   lavahack/client/Class353.Method1785:(Lnet/minecraft/block/state/IBlockState;)F
        //   474: fstore          11
        //   476: aload           6
        //   478: aload           4
        //   480: invokevirtual   lavahack/client/Class353.Method1786:(Lnet/minecraft/block/state/IBlockState;)I
        //   483: istore          12
        //   485: goto            528
        //   488: aload           7
        //   490: iconst_0       
        //   491: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   496: checkcast       Lnet/minecraft/util/EnumFacing;
        //   499: astore          8
        //   501: ldc_w           1056964608
        //   504: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   507: fstore          9
        //   509: ldc_w           1056964608
        //   512: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   515: fstore          10
        //   517: ldc_w           1056964608
        //   520: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   523: fstore          11
        //   525: iconst_0       
        //   526: istore          12
        //   528: aload           5
        //   530: ifnull          598
        //   533: aload_2        
        //   534: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   537: aload           5
        //   539: invokevirtual   net/minecraft/entity/player/InventoryPlayer.getSlotFor:(Lnet/minecraft/item/ItemStack;)I
        //   542: istore          13
        //   544: iload           13
        //   546: iconst_m1      
        //   547: if_icmpeq       557
        //   550: iload           13
        //   552: bipush          9
        //   554: if_icmplt       559
        //   557: iconst_0       
        //   558: ireturn        
        //   559: aload_2        
        //   560: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   563: iload           13
        //   565: invokevirtual   net/minecraft/entity/player/InventoryPlayer.getStackInSlot:(I)Lnet/minecraft/item/ItemStack;
        //   568: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //   571: aload           5
        //   573: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //   576: if_acmpne       598
        //   579: aload_2        
        //   580: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   583: iload           13
        //   585: putfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //   588: aload_0        
        //   589: getfield        lavahack/client/Class415.Field9719:Lnet/minecraft/client/Minecraft;
        //   592: getfield        net/minecraft/client/Minecraft.playerController:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   595: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.updateController:()V
        //   598: aload_0        
        //   599: iconst_0       
        //   600: putfield        lavahack/client/Class415.Field9722:Z
        //   603: new             Llavahack/client/Class1795;
        //   606: dup            
        //   607: aload_3        
        //   608: aload           5
        //   610: invokevirtual   net/minecraft/item/ItemStack.getItem:()Lnet/minecraft/item/Item;
        //   613: invokespecial   lavahack/client/Class1795.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/Item;)V
        //   616: astore          13
        //   618: getstatic       lavahack/client/Class1796.Field16242:Llavahack/client/Class80;
        //   621: aload           13
        //   623: invokevirtual   lavahack/client/Class80.Method715:(Ljava/lang/Object;)V
        //   626: aload           13
        //   628: invokevirtual   lavahack/client/Class1795.Method159:()Z
        //   631: ifeq            640
        //   634: aload           13
        //   636: iconst_0       
        //   637: goto            657
        //   640: aload_0        
        //   641: aload_1        
        //   642: aload_2        
        //   643: aload_3        
        //   644: aload           8
        //   646: fload           9
        //   648: fload           10
        //   650: fload           11
        //   652: iload           12
        //   654: invokespecial   lavahack/client/Class415.Method2024:(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFI)Z
        //   657: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0328 (coming from #0308).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.base/java.lang.Thread.run(Thread.java:833)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private boolean Method2024(final WorldClient worldClient, final EntityPlayerSP entityPlayerSP, final BlockPos blockPos, final EnumFacing enumFacing, final float n, final float n2, final float n3, final int n4) {
        final EnumHand main_HAND = EnumHand.MAIN_HAND;
        final ItemStack getHeldItem = entityPlayerSP.getHeldItem(main_HAND);
        if (!this.Field9719.playerController.isInCreativeMode() && !getHeldItem.isEmpty() && getHeldItem.getCount() <= n4) {
            return false;
        }
        final BlockPos offset = blockPos.offset(enumFacing);
        final EnumFacing getOpposite = enumFacing.getOpposite();
        final Vec3d vec3d = new Vec3d((double)(offset.getX() + n), (double)(offset.getY() + n2), (double)(offset.getZ() + n3));
        boolean b = this.Method2025(worldClient, entityPlayerSP, getHeldItem, offset, getOpposite, vec3d, main_HAND);
        for (int n5 = 0; b && n5 < n4; b = this.Method2025(worldClient, entityPlayerSP, getHeldItem, offset, getOpposite, vec3d, main_HAND), ++n5) {}
        if (getHeldItem.getCount() == 0 && b) {
            entityPlayerSP.inventory.mainInventory.set(entityPlayerSP.inventory.currentItem, (Object)ItemStack.EMPTY);
        }
        return b;
    }
    
    private boolean Method2025(final WorldClient worldClient, final EntityPlayerSP entityPlayerSP, final ItemStack itemStack, final BlockPos blockPos, final EnumFacing enumFacing, final Vec3d vec3d, final EnumHand enumHand) {
        if (this.Field9719.playerController.processRightClickBlock(entityPlayerSP, worldClient, Class32.Field7987 ? blockPos : blockPos.offset(enumFacing), enumFacing, vec3d, enumHand) != EnumActionResult.SUCCESS) {
            return false;
        }
        entityPlayerSP.swingArm(enumHand);
        return true;
    }
    
    private void Method2026(final EntityPlayerSP entityPlayerSP, final boolean b) {
        entityPlayerSP.setSneaking(b);
        entityPlayerSP.connection.sendPacket((Packet)new CPacketEntityAction((Entity)entityPlayerSP, b ? CPacketEntityAction$Action.START_SNEAKING : CPacketEntityAction$Action.STOP_SNEAKING));
    }
    
    private boolean Method2027(final InventoryPlayer inventoryPlayer, final ItemStack itemStack) {
        return this.Method2028(inventoryPlayer, itemStack, true);
    }
    
    private boolean Method2028(final InventoryPlayer inventoryPlayer, final ItemStack itemStack, final boolean b) {
        final int method2029 = this.Method2029(inventoryPlayer, itemStack);
        if (this.Field9719.playerController.isInCreativeMode() && (method2029 < 0 || method2029 >= 9) && Class32.Field7989.size() > 0) {
            inventoryPlayer.setInventorySlotContents(inventoryPlayer.currentItem = this.Method2031(), itemStack.copy());
            this.Field9719.playerController.sendSlotPacket(inventoryPlayer.getStackInSlot(inventoryPlayer.currentItem), 36 + inventoryPlayer.currentItem);
            return true;
        }
        if (method2029 >= 0 && method2029 < 9) {
            inventoryPlayer.currentItem = method2029;
            return true;
        }
        return b && method2029 >= 9 && method2029 < 36 && this.Method2030(inventoryPlayer, method2029) && this.Method2028(inventoryPlayer, itemStack, false);
    }
    
    private int Method2029(final InventoryPlayer inventoryPlayer, final ItemStack itemStack) {
        for (int i = 0; i < inventoryPlayer.mainInventory.size(); ++i) {
            if (((ItemStack)inventoryPlayer.mainInventory.get(i)).isItemEqual(itemStack)) {
                return i;
            }
        }
        return -1;
    }
    
    private boolean Method2030(final InventoryPlayer inventoryPlayer, final int n) {
        if (Class32.Field7989.size() > 0) {
            this.Method2032(n, this.Method2031());
            return true;
        }
        return false;
    }
    
    private int Method2031() {
        final int i = Class32.Field7989.poll() % 9;
        Class32.Field7989.offer(i);
        return i;
    }
    
    private boolean Method2032(final int n, final int n2) {
        return this.Field9719.playerController.windowClick(this.Field9719.player.inventoryContainer.windowId, n, n2, ClickType.SWAP, (EntityPlayer)this.Field9719.player) == ItemStack.EMPTY;
    }
    
    static {
        Field9718 = new Class415();
    }
    
    private static String Method2033(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x27A ^ 0x59));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
