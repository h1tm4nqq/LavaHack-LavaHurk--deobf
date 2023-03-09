//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemTool
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.Class1036;
import lavahack.client.Class1092;
import lavahack.client.Class1393;
import lavahack.client.Class1744;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class893;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;

public class Class418
extends Class42 {
    public static Class418 Field9733;
    private final Class44 Field9734 = this.Method23(new Class44("Target Range", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble((long)1708277046 ^ 0x4034000065D23D36L), true));
    private final Class44 Field9735 = this.Method23(new Class44("PlaceDelay", (Class42)this, Double.longBitsToDouble((long)174794695 ^ 0x408F40000A6B27C7L), 1.0, Double.longBitsToDouble((long)598301701 ^ 0x40C3880023A95C05L), true));
    private final Class44 Field9736 = this.Method23(new Class44("Rotate", (Class42)this, true));
    private final Class44 Field9737 = this.Method23(new Class44("BlocksPerTick", (Class42)this, Double.longBitsToDouble((long)1933492246 ^ 0x40200000733EC016L), 1.0, Double.longBitsToDouble((long)2086207722 ^ 0x403E00007C5900EAL), true));
    private final Class44 Field9738 = this.Method23(new Class44("AntiScaffold", (Class42)this, false));
    private final Class44 Field9739 = this.Method23(new Class44("AntiStep", (Class42)this, false));
    private final Class44 Field9740 = this.Method23(new Class44("SurroundPlacing", (Class42)this, true));
    private final Class44 Field9741 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)302678367 ^ 0x40100000120A815FL), 1.0, Double.longBitsToDouble(0x4014000000000000L), false));
    private final Class44 Field9742 = this.Method23(new Class44("RayTrace", (Class42)this, false));
    private final Class44 Field9743 = this.Method23(new Class44("SwitchMode", (Class42)this, Class893.Field11739));
    private final Class44 Field9744 = this.Method23(new Class44("SwitchReturnFirework", (Class42)this, true));
    private final Class44 Field9745 = this.Method23(new Class44("MinHealthPause", (Class42)this, false));
    private final Class44 Field9746 = this.Method23(new Class44("RequiredHealth", (Class42)this, Double.longBitsToDouble(4622382067542392832L), 0.0, Double.longBitsToDouble((long)24003346 ^ 0x40420000016E4312L), true));
    private final Class44 Field9747 = this.Method23(new Class44("PauseWhileEating", (Class42)this, false));
    private final Class44 Field9748 = this.Method23(new Class44("PauseIfHittingBlock", (Class42)this, false));
    private final Class44 Field9749 = this.Method23(new Class44("FireworkHand", (Class42)this, "Default", new ArrayList<String>(Arrays.asList("Default", "MainHand", "OffHand"))));
    private final Class650 Field9750 = new Class650();
    private final Class650 Field9751 = new Class650();
    private final Map Field9752 = new HashMap();
    private final Class650 Field9753 = new Class650();
    private boolean Field9754 = false;
    private boolean Field9755;
    private int Field9756;
    private int Field9757 = 0;
    private boolean Field9758 = false;
    private BlockPos Field9759 = null;
    public EntityPlayer Field9760 = null;
    private int Field9761;

    public Class418() {
        super("AutoFirework", "", Class97.Field8338);
        Field9733 = this;
    }

    @Override
    public void Method38() {
        this.Field9759 = Class394.Method1921((Entity)Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field9756 = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field9752.clear();
    }

    @Override
    public void Method39() {
        this.Field9755 = Class394.Method1922(this.Field9755);
    }

    @Override
    public void Method45() {
        if (Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field9760 != null) {
            super.Method43("[" + this.Field9760.getDisplayName().getFormattedText() + TextFormatting.GRAY + "]");
        } else {
            super.Method43("");
        }
        if (this.Method2045()) {
            return;
        }
        if (this.Field9760 == null) {
            this.Field9760 = Class394.Method1924(this.Field9734.Method368());
            return;
        }
        BlockPos blockPos = this.Field9760.getPosition();
        this.Field9758 = false;
        this.Method2046();
        if (!(Math.sqrt(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ())) <= this.Field9741.Method367())) return;
        int n = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getBestHotbarSlot();
        EnumFacing enumFacing = null;
        if (this.Field9742.Method365()) {
            RayTraceResult rayTraceResult = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d(this.Field9760.posX + Double.longBitsToDouble((long)527425792 ^ 0x3FE000001F6FE100L), this.Field9760.posY - Double.longBitsToDouble(4602678819172646912L), this.Field9760.posZ + Double.longBitsToDouble((long)1610527829 ^ 0x3FE000005FFEB455L)));
            enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        }
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getConnection().sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, this.Field9749.Method359().equalsIgnoreCase("Default") ? EnumHand.OFF_HAND : (this.Field9749.Method359().equalsIgnoreCase("MainHand") ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND), 0.0f, 0.0f, 0.0f));
        if (this.Field9744.Method365()) {
            Class9.Method121(n, (Class893)this.Field9743.Method341());
        }
        this.Field9751.Method2801();
        this.Field9750.Method2801();
    }

    private boolean Method2045() {
        if (this.Field9747.Method365() && Class1744.Method6653()) {
            return true;
        }
        if (this.Field9745.Method365() && (double)(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) < this.Field9746.Method367()) {
            return true;
        }
        if (!this.Field9748.Method365()) return false;
        if (!Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isHittingBlock) return false;
        if (!(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemTool)) return false;
        return true;
    }

    private void Method2046() {
        if (this.Method29()) {
            return;
        }
        this.Method2047();
        if (!this.Field9754) return;
        this.Field9750.Method2801();
    }

    private void Method2047() {
        List list = Class1036.Method4194(this.Field9760.getPositionVector(), this.Field9738.Method365(), this.Field9739.Method365(), this.Field9740.Method365(), false, false, this.Field9742.Method365());
        this.Method2048(list);
    }

    private void Method2048(List list) {
        list.sort(Class418::Method2051);
        list.sort(Comparator.comparingDouble(Class418::Method2050));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Vec3d vec3d = (Vec3d)iterator.next();
            BlockPos blockPos = new BlockPos(vec3d);
            int n = Class1036.Method4190(blockPos, this.Field9742.Method365());
            if (n == 1 && (this.Field9752.get(blockPos) == null || (Integer)this.Field9752.get(blockPos) < 4)) {
                this.Method2049(blockPos);
                this.Field9752.put(blockPos, this.Field9752.get(blockPos) == null ? 1 : (Integer)this.Field9752.get(blockPos) + 1);
                this.Field9753.Method2801();
                continue;
            }
            if (n != 3) continue;
            this.Method2049(blockPos);
        }
    }

    private boolean Method29() {
        if (Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return false;
        if (this.Field9759 == null) {
            return false;
        }
        this.Field9754 = false;
        this.Field9757 = 0;
        int n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        if (n == -1) {
            this.Method21(false);
            return true;
        }
        int n2 = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
        if (!super.Method35()) {
            return true;
        }
        if (!this.Field9759.equals((Object)Class394.Method1921((Entity)Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player))) {
            this.Method21(false);
            return true;
        }
        if (this.Field9753.Method2797(2000L)) {
            this.Field9752.clear();
            this.Field9753.Method2801();
        }
        if (n2 == -1) {
            Class1393.Method5504().Method1886(ChatFormatting.RED + "No Obsidian in hotbar, AutoTrap disabling...");
            this.Method21(false);
            return true;
        }
        if (Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != this.Field9756 && Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != n2) {
            this.Field9756 = Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        }
        this.Field9755 = Class394.Method1922(this.Field9755);
        this.Field9760 = Class394.Method1924(this.Field9734.Method368());
        if (this.Field9760 == null) return true;
        if (!this.Field9750.Method2797(this.Field9735.Method335())) return true;
        return false;
    }

    private void Method2049(BlockPos blockPos) {
        if (this.Field9757 >= this.Field9737.Method335()) return;
        double d = Class1092.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos);
        double d2 = Double.longBitsToDouble(0x4014000000000000L);
        return (void)(d2 * d2);
    }

    private static double Method2050(Vec3d vec3d) {
        return vec3d.y;
    }

    private static int Method2051(Vec3d vec3d, Vec3d vec3d2) {
        return Double.compare(Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), Class418.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 17;
            cArray2[n] = (char)(cArray[n] ^ (0x4D82 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

