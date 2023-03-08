//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;
import net.minecraft.world.*;

public class Class604 extends Class42
{
    private final Class44 Field10569;
    private final Class44 Field10570;
    private final Class44 Field10571;
    private final Class44 Field10572;
    private final Class44 Field10573;
    private final Class44 Field10574;
    private final Class44 Field10575;
    private static Class604 Field10576;
    private List Field10577;
    private BlockPos Field10578;
    private int Field10579;
    
    public Class604() {
        super("AutoObsidian", Class97.Field8338);
        this.Field10569 = this.Method23(new Class44("EnemyRange", (Class42)this, Double.longBitsToDouble((long)1157185045 ^ 0x4020000044F93E15L), 1.0, Double.longBitsToDouble((long)337895140 ^ 0x402E00001423DEE4L), false));
        this.Field10570 = this.Method23(new Class44("CircleRange", (Class42)this, Double.longBitsToDouble(4611686018427387904L), 1.0, Double.longBitsToDouble(4617315517961601024L), false));
        this.Field10571 = this.Method23(new Class44("SinglePlace", (Class42)this, true));
        this.Field10572 = this.Method23(new Class44("Rotate", (Class42)this, false));
        this.Field10573 = this.Method23(new Class44("Packet", (Class42)this, false));
        this.Field10574 = this.Method23(new Class44("Switch", (Class42)this, "Silent", (List)Arrays.asList("Normal", "Silent", "Packet")));
        this.Field10575 = this.Method23(new Class44("UpdateController", (Class42)this, false));
        this.Field10577 = new ArrayList();
        this.Field10578 = null;
        Class604.Field10576 = this;
    }
    
    public boolean Method52() {
        return true;
    }
    
    public void Method45() {
        if (Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field10577.clear();
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        if (method127 == -1) {
            return;
        }
        final int currentItem = Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        final EntityPlayer method128 = Class394.Method1924(this.Field10569.Method368());
        if (method128 == null) {
            return;
        }
        final List method129 = Method2610((Entity)method128);
        if (method129.isEmpty()) {
            this.Field10578 = null;
            return;
        }
        if (this.Field10571.Method365() && this.Field10578 == method129.get(0)) {
            return;
        }
        this.Method2608(method127, false);
        if (this.Field10571.Method365()) {
            Class1036.Method4207((BlockPos)method129.get(0), EnumHand.MAIN_HAND, this.Field10572.Method365(), this.Field10573.Method365(), false);
            this.Field10578 = method129.get(0);
            Class1393.Method5506().Method1886(this.Field10578.getX() + " " + this.Field10578.getY() + " " + this.Field10578.getZ());
        }
        else {
            final Iterator<BlockPos> iterator = method129.iterator();
            while (iterator.hasNext()) {
                Class1036.Method4207((BlockPos)iterator.next(), EnumHand.MAIN_HAND, this.Field10572.Method365(), this.Field10573.Method365(), false);
            }
            this.Field10578 = null;
        }
        this.Method2608(currentItem, true);
        this.Field10577 = method129;
    }
    
    public BlockPos Method2607(final int n) {
        return this.Field10577.get(n);
    }
    
    public void Method2608(final int n, final boolean b) {
        final String method359 = this.Field10574.Method359();
        switch (method359.hashCode()) {
            case -1955878649: {
                if (method359.equals("Normal")) {
                    break;
                }
                break;
            }
            case -1818460043: {
                if (method359.equals("Silent")) {
                    break;
                }
                break;
            }
            case -1911998296: {
                if (method359.equals("Packet")) {
                    break;
                }
                break;
            }
        }
        if (this.Field10575.Method365()) {
            Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        }
    }
    
    public void Method2609(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (this.Field10577.isEmpty()) {
            return;
        }
        Class815.Method3446(Class815.Method3447(new AxisAlignedBB((BlockPos)this.Field10577.get(0))), 2.0f, new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
    }
    
    public static List Method2610(final Entity entity) {
        return (List<Object>)Class394.Method1946(new BlockPos(entity.posX, entity.posY, entity.posZ), Class604.Field10576.Field10570.Method368(), 1, false, false, -1).stream().filter(Class604::Method2613).sorted(Class604::Method2612).collect(Collectors.toList());
    }
    
    public static boolean Method2611(final BlockPos blockPos, final Entity entity) {
        if (Class604.Field10576.Field10571.Method365() && !Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)entity.getClass(), new AxisAlignedBB(blockPos.up())).isEmpty()) {
            return false;
        }
        if (!Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        if (Class1036.Method4213(blockPos).isEmpty()) {
            return false;
        }
        final boolean b = Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up()).getBlock() == Blocks.AIR;
        if (Class604.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up(2)).getBlock() == Blocks.AIR) {}
        return false;
    }
    
    private static int Method2612(final Entity entity, final BlockPos blockPos, final BlockPos blockPos2) {
        return Double.compare(entity.getDistanceSq(blockPos.getX() + Double.longBitsToDouble((long)1573238378 ^ 0x3FE000005DC5B66AL), blockPos.getY() + Double.longBitsToDouble(4602678819172646912L), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)), entity.getDistanceSq(blockPos2.getX() + Double.longBitsToDouble((long)1206896399 ^ 0x3FE0000047EFC70FL), blockPos2.getY() + Double.longBitsToDouble((long)1389773518 ^ 0x3FE0000052D642CEL), blockPos2.getZ() + Double.longBitsToDouble((long)1763335437 ^ 0x3FE00000691A5D0DL)));
    }
    
    private static boolean Method2613(final Entity entity, final BlockPos blockPos) {
        return Method2611(blockPos, entity);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x696B ^ 0x69));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
