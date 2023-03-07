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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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

public class J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs Field9733;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9734 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xD8BE2A17366844EFL ^ 0x989A2A17366844EFL), 1.0, Double.longBitsToDouble((long)1708277046 ^ 0x4034000065D23D36L), ((int)1315232707L ^ 0x4E64DBC2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9735 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceDelay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)174794695 ^ 0x408F40000A6B27C7L), 1.0, Double.longBitsToDouble((long)598301701 ^ 0x40C3880023A95C05L), ((int)-553553530L ^ 0xDF017187) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9736 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)118669702 ^ (long)118669703)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9737 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BlocksPerTick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1933492246 ^ 0x40200000733EC016L), 1.0, Double.longBitsToDouble((long)2086207722 ^ 0x403E00007C5900EAL), ((int)1744513386L ^ 0x67FB296B) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9738 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AntiScaffold", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1129208054 ^ (long)-1129208054)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9739 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AntiStep", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-940287650 ^ (long)-940287650)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9740 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SurroundPlacing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1352174833L ^ 0x50988CF0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9741 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)302678367 ^ 0x40100000120A815FL), 1.0, Double.longBitsToDouble(0xC9719E3A6F176088L ^ 0x89659E3A6F176088L), ((int)-857735435L ^ 0xCCDFFEF5) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9742 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RayTrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1600196765L ^ 0xA09EEF63) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9743 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwitchMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field11739));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9744 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwitchReturnFirework", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1508887925L ^ 0x59EFCD74) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9745 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MinHealthPause", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1176037888 ^ (long)1176037888)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9746 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RequiredHealth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x52D2E5E3B8ED03D1L ^ 0x12F4E5E3B8ED03D1L), 0.0, Double.longBitsToDouble((long)24003346 ^ 0x40420000016E4312L), ((int)-1990186984L ^ 0x89602819) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9747 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PauseWhileEating", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1900310377L ^ 0x8EBB9097) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9748 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PauseIfHittingBlock", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-433237256 ^ (long)-433237256)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9749;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field9750;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field9751;
    private final Map Field9752;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field9753;
    private boolean Field9754;
    private boolean Field9755;
    private int Field9756;
    private int Field9757;
    private boolean Field9758;
    private BlockPos Field9759;
    public EntityPlayer Field9760;
    private int Field9761;

    public J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs() {
        super("AutoFirework", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        String[] stringArray = new String[(int)((long)-1905142289 ^ (long)-1905142292)];
        stringArray[(int)((long)-1720602995 ^ (long)-1720602995)] = "Default";
        stringArray[(int)((long)694828228 ^ (long)694828229)] = "MainHand";
        stringArray[(int)((long)-272019536 ^ (long)-272019535) << 1] = "OffHand";
        this.Field9749 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FireworkHand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Default", new ArrayList<String>(Arrays.asList(stringArray))));
        this.Field9750 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field9751 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field9752 = new HashMap();
        this.Field9753 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field9754 = (int)2125305678L ^ 0x7EAD974E;
        this.Field9757 = (int)-207745420L ^ 0xF39E0E74;
        this.Field9758 = (int)-1682789638L ^ 0x9BB2AAFA;
        this.Field9759 = null;
        this.Field9760 = null;
        Field9733 = this;
    }

    @Override
    public void Method38() {
        this.Field9759 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field9756 = J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field9752.clear();
    }

    @Override
    public void Method39() {
        this.Field9755 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1922(this.Field9755);
    }

    @Override
    public void Method45() {
        if (J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
            this.Field9760 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field9734.Method368());
            return;
        }
        BlockPos blockPos = this.Field9760.getPosition();
        this.Field9758 = (int)-853791637L ^ 0xCD1C2C6B;
        this.Method2046();
        if (!(Math.sqrt(J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ())) <= this.Field9741.Method367())) return;
        int n = J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getBestHotbarSlot();
        EnumFacing enumFacing = null;
        if (this.Field9742.Method365()) {
            RayTraceResult rayTraceResult = J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d(this.Field9760.posX + Double.longBitsToDouble((long)527425792 ^ 0x3FE000001F6FE100L), this.Field9760.posY - Double.longBitsToDouble(0x8429147DF756EC5FL ^ 0xBBC9147DF756EC5FL), this.Field9760.posZ + Double.longBitsToDouble((long)1610527829 ^ 0x3FE000005FFEB455L)));
            enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        }
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getConnection().sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, this.Field9749.Method359().equalsIgnoreCase("Default") ? EnumHand.OFF_HAND : (this.Field9749.Method359().equalsIgnoreCase("MainHand") ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND), 0.0f, 0.0f, 0.0f));
        if (this.Field9744.Method365()) {
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method121(n, (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field9743.Method341());
        }
        this.Field9751.Method2801();
        this.Field9750.Method2801();
    }

    private boolean Method2045() {
        int n;
        if (this.Field9747.Method365() && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6653()) {
            return ((int)923696183L ^ 0x370E7C36) != 0;
        }
        if (this.Field9745.Method365() && (double)(J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) < this.Field9746.Method367()) {
            return (int)((long)1922049909 ^ (long)1922049908) != 0;
        }
        if (this.Field9748.Method365() && J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isHittingBlock && J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemTool) {
            n = (int)((long)-925133281 ^ (long)-925133282);
            return n != 0;
        }
        n = (int)((long)802983556 ^ (long)802983556);
        return n != 0;
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
        List list = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4194(this.Field9760.getPositionVector(), this.Field9738.Method365(), this.Field9739.Method365(), this.Field9740.Method365(), (boolean)((long)1351857789 ^ (long)1351857789), ((int)1789358941L ^ 0x6AA7735D) != 0, this.Field9742.Method365());
        this.Method2048(list);
    }

    private void Method2048(List list) {
        list.sort(J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs::Method2051);
        list.sort(Comparator.comparingDouble(J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs::Method2050));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Vec3d vec3d = (Vec3d)iterator.next();
            BlockPos blockPos = new BlockPos(vec3d);
            int n = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4190(blockPos, this.Field9742.Method365());
            if (n == ((int)-1108201916L ^ 0xBDF22E45) && (this.Field9752.get(blockPos) == null || (Integer)this.Field9752.get(blockPos) < (int)((long)-849271314 ^ (long)-849271313) << 2)) {
                this.Method2049(blockPos);
                this.Field9752.put(blockPos, this.Field9752.get(blockPos) == null ? (int)-1457858156L ^ 0xA91AD995 : (Integer)this.Field9752.get(blockPos) + ((int)1716645222L ^ 0x6651ED67));
                this.Field9753.Method2801();
                continue;
            }
            if (n != ((int)-250866483L ^ 0xF10C14CE)) continue;
            this.Method2049(blockPos);
        }
    }

    private boolean Method29() {
        int n;
        if (J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return ((int)1202110191L ^ 0x47A6BEEF) != 0;
        if (this.Field9759 == null) {
            return ((int)1202110191L ^ 0x47A6BEEF) != 0;
        }
        this.Field9754 = (int)918790758L ^ 0x36C3A266;
        this.Field9757 = (int)((long)1474353505 ^ (long)1474353505);
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)-1859265823L ^ 0x912DDAE1, (int)((long)1862760566 ^ (long)1862760575));
        if (n2 == (int)((long)-502764173 ^ (long)502764172)) {
            this.Method21(((int)1861778621L ^ 0x6EF87CBD) != 0);
            return (int)((long)1702368995 ^ (long)1702368994) != 0;
        }
        int n3 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)((long)911892431 ^ (long)911892431), (int)((long)-226770922 ^ (long)-226770913));
        if (!super.Method35()) {
            return ((int)-1693199445L ^ 0x9B13D3AA) != 0;
        }
        if (!this.Field9759.equals((Object)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player))) {
            this.Method21((boolean)((long)300500594 ^ (long)300500594));
            return ((int)-832715572L ^ 0xCE5DC4CD) != 0;
        }
        if (this.Field9753.Method2797(0x1017D0L & 0x6C8047F2L)) {
            this.Field9752.clear();
            this.Field9753.Method2801();
        }
        if (n3 == (int)((long)2130466927 ^ (long)-2130466928)) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886(ChatFormatting.RED + "No Obsidian in hotbar, AutoTrap disabling...");
            this.Method21((boolean)((long)-504638865 ^ (long)-504638865));
            return ((int)-348326963L ^ 0xEB3CF3CC) != 0;
        }
        if (J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != this.Field9756 && J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem != n3) {
            this.Field9756 = J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        }
        this.Field9755 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1922(this.Field9755);
        this.Field9760 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field9734.Method368());
        if (this.Field9760 != null && this.Field9750.Method2797(this.Field9735.Method335())) {
            n = (int)((long)2079244569 ^ (long)2079244569);
            return n != 0;
        }
        n = (int)((long)434041579 ^ (long)434041578);
        return n != 0;
    }

    private void Method2049(BlockPos blockPos) {
        if (this.Field9757 >= this.Field9737.Method335()) return;
        double d = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos);
        double d2 = Double.longBitsToDouble(0x62853D79909797C7L ^ 0x22913D79909797C7L);
        return (void)(d2 * d2);
    }

    private static double Method2050(Vec3d vec3d) {
        return vec3d.y;
    }

    private static int Method2051(Vec3d vec3d, Vec3d vec3d2) {
        return Double.compare(J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), J9hmlnCoX9bWuSAAauqvuh5G5MRzsWgs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1478447065L ^ 0xA7E0B027;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1466067159L ^ 0x57626828);
            int n2 = (int)((long)929580852 ^ (long)929580837);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1570569926L ^ 0xA26327FB) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

