//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.Class1036;
import lavahack.client.Class1393;
import lavahack.client.Class2008;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.RenderWorldLastEvent;

public class Class604
extends Class42 {
    private final Class44 Field10569 = this.Method23(new Class44("EnemyRange", (Class42)this, Double.longBitsToDouble((long)1157185045 ^ 0x4020000044F93E15L), 1.0, Double.longBitsToDouble((long)337895140 ^ 0x402E00001423DEE4L), false));
    private final Class44 Field10570 = this.Method23(new Class44("CircleRange", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 1.0, Double.longBitsToDouble(0x4014000000000000L), false));
    private final Class44 Field10571 = this.Method23(new Class44("SinglePlace", (Class42)this, true));
    private final Class44 Field10572 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field10573 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field10574 = this.Method23(new Class44("Switch", (Class42)this, "Silent", Arrays.asList("Normal", "Silent", "Packet")));
    private final Class44 Field10575 = this.Method23(new Class44("UpdateController", (Class42)this, false));
    private static Class604 Field10576;
    private List Field10577 = new ArrayList();
    private BlockPos Field10578 = null;
    private int Field10579;

    public Class604() {
        super("AutoObsidian", Class97.Field8338);
        Field10576 = this;
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method45() {
        if (Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field10577.clear();
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        int n2 = Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        EntityPlayer entityPlayer = Class394.Method1924(this.Field10569.Method368());
        if (entityPlayer == null) {
            return;
        }
        List list = Class604.Method2610((Entity)entityPlayer);
        if (list.isEmpty()) {
            this.Field10578 = null;
            return;
        }
        if (this.Field10571.Method365() && this.Field10578 == list.get(0)) {
            return;
        }
        this.Method2608(n, false);
        if (this.Field10571.Method365()) {
            Class1036.Method4207((BlockPos)list.get(0), EnumHand.MAIN_HAND, this.Field10572.Method365(), this.Field10573.Method365(), false);
            this.Field10578 = (BlockPos)list.get(0);
            Class1393.Method5506().Method1886(this.Field10578.getX() + " " + this.Field10578.getY() + " " + this.Field10578.getZ());
        } else {
            for (BlockPos blockPos : list) {
                Class1036.Method4207(blockPos, EnumHand.MAIN_HAND, this.Field10572.Method365(), this.Field10573.Method365(), false);
            }
            this.Field10578 = null;
        }
        this.Method2608(n2, true);
        this.Field10577 = list;
    }

    public BlockPos Method2607(int n) {
        return (BlockPos)this.Field10577.get(n);
    }

    public void Method2608(int n, boolean bl) {
        String string = this.Field10574.Method359();
        int n2 = -1;
        switch (string.hashCode()) {
            case -1955878649: {
                if (string.equals("Normal")) {
                    n2 = 0;
                }
                break;
            }
            case -1818460043: {
                if (string.equals("Silent")) {
                    n2 = 1;
                }
                break;
            }
            case -1911998296: {
                if (string.equals("Packet")) {
                    n2 = 2;
                }
                break;
            }
        }
        if (!this.Field10575.Method365()) return;
        Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }

    public void Method2609(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (this.Field10577.isEmpty()) {
            return;
        }
        AxisAlignedBB axisAlignedBB = Class815.Method3447(new AxisAlignedBB((BlockPos)this.Field10577.get(0)));
        Class815.Method3446(axisAlignedBB, 2.0f, new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
    }

    public static List Method2610(Entity entity) {
        List list = Class394.Method1946(new BlockPos(entity.posX, entity.posY, entity.posZ), Class604.Field10576.Field10570.Method368(), 1, false, false, -1);
        return list.stream().filter(arg_0 -> Class604.Method2613(entity, arg_0)).sorted((arg_0, arg_1) -> Class604.Method2612(entity, arg_0, arg_1)).collect(Collectors.toList());
    }

    public static boolean Method2611(BlockPos blockPos, Entity entity) {
        if (Class604.Field10576.Field10571.Method365() && !Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(entity.getClass(), new AxisAlignedBB(blockPos.up())).isEmpty()) {
            return false;
        }
        IBlockState iBlockState = Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        if (!iBlockState.getBlock().isReplaceable((IBlockAccess)Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        if (Class1036.Method4213(blockPos).isEmpty()) {
            return false;
        }
        IBlockState iBlockState2 = Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up());
        Block block = iBlockState2.getBlock();
        boolean bl = block == Blocks.AIR;
        IBlockState iBlockState3 = Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up(2));
        if (iBlockState3.getBlock() != Blocks.AIR) return false;
        return false;
    }

    private static int Method2612(Entity entity, BlockPos blockPos, BlockPos blockPos2) {
        double d = entity.getDistanceSq((double)blockPos.getX() + Double.longBitsToDouble((long)1573238378 ^ 0x3FE000005DC5B66AL), (double)blockPos.getY() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
        double d2 = entity.getDistanceSq((double)blockPos2.getX() + Double.longBitsToDouble((long)1206896399 ^ 0x3FE0000047EFC70FL), (double)blockPos2.getY() + Double.longBitsToDouble((long)1389773518 ^ 0x3FE0000052D642CEL), (double)blockPos2.getZ() + Double.longBitsToDouble((long)1763335437 ^ 0x3FE00000691A5D0DL));
        return Double.compare(d, d2);
    }

    private static boolean Method2613(Entity entity, BlockPos blockPos) {
        return Class604.Method2611(blockPos, entity);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 105;
            cArray2[n] = (char)(cArray[n] ^ (0x696B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

