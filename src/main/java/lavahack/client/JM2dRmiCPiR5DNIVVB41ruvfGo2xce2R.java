//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9338 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1403559807 ^ 0x4034000053A89F7FL), 1.0, Double.longBitsToDouble((long)1794915693 ^ 0x403E00006AFC3D6DL), (boolean)((long)1808753838 ^ (long)1808753839)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9339 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x88E3128D11362CFCL ^ 0xC8EB128D11362CFCL), (boolean)((long)1208358082 ^ (long)1208358083)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9340 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sides", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)1798807054 ^ 0x401000006B379E0EL), ((int)-1062741449L ^ 0xC0A7DA36) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9341 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Depth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xBA3A48FE2ABC1B89L ^ 0xFA3248FE2ABC1B89L), 0.0, Double.longBitsToDouble(0x714CF38A879B9AC0L ^ 0x3168F38A879B9AC0L), ((int)-865405750L ^ 0xCC6AF4CB) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9342 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Min DMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1393906400 ^ 0x40240000531552E0L), 0.0, Double.longBitsToDouble((long)1208139460 ^ 0x403400004802BEC4L), (boolean)((long)560765366 ^ (long)560765367)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9343 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Max Self DMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1732929097 ^ 0x401C0000674A6649L), 0.0, Double.longBitsToDouble((long)1746864098 ^ 0x40340000681F07E2L), ((int)1618868599L ^ 0x607DF976) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9344 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ignore Crystals", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1246671671L ^ 0x4A4EB336) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9345 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mine", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1130288723L ^ 0xBCA129AD) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9346 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mine Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)((long)-1083525322 ^ (long)-1083525341) << 1));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9347 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch Pick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1780977375 ^ (long)-1780977376)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9348 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mine Dist", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x432D880380709B3L ^ 0x4426D880380709B3L), 0.0, Double.longBitsToDouble((long)77183793 ^ 0x402400000499BB31L), (boolean)((long)-1788214411 ^ (long)-1788214412)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9349 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mine Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11018));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9350 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15887));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9351 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Select Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9664));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field9352 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Renderer", this)));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field9353 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this).Method772(this.Field9352)).Method3788().Method3789();
    private final HashMap Field9354 = new HashMap();
    private boolean Field9355 = (int)((long)-168056165 ^ (long)-168056165);
    private BlockPos Field9356 = new BlockPos((int)-1349720050L ^ 0x507317F1, (int)287397880L ^ 0xEEDEA807, (int)((long)1656592970 ^ (long)-1656592971));
    private int Field9357;

    public JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R() {
        super("CityESP", "CityESP", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method45() {
        if (JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field9354.clear();
        List list = JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().filter(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R::Method1611).filter(this::Method1610).filter(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R::Method1609).collect(Collectors.toList());
        for (Object object : list) {
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            Object object22;
            List list2 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1951((Entity)object);
            if (list2.size() == 0) continue;
            int n = Integer.MAX_VALUE;
            for (Object object22 : list2) {
                int n2 = object22.getY();
                if (n2 >= n) continue;
                n = n2;
            }
            if (((EntityPlayer)object).posY % 1.0 > Double.longBitsToDouble(0x3EC5EAC68918E895L ^ 0x10C735F1081710FL)) {
                // empty if block
            }
            int n3 = ++n;
            object22 = (list2 = list2.stream().filter(arg_0 -> JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.Method1608(n3, arg_0)).collect(Collectors.toList())).stream().findAny();
            if (!((Optional)object22).isPresent() || (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131((BlockPos)((Optional)object22).get(), (boolean)((long)937827618 ^ (long)937827618), (boolean)((long)575892544 ^ (long)575892545))).Method6959() == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9771 || ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6960() == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697) continue;
            ArrayList arrayList = new ArrayList();
            for (BlockPos blockPos : list2) {
                arrayList.addAll(this.Method1602(blockPos, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7133(blockPos).keySet(), (EntityPlayer)object));
            }
            if (arrayList.size() <= 0) continue;
            this.Field9354.put(object, arrayList);
        }
        if (!this.Field9345.Method365()) return;
        if (this.Field9346.Method337() == 0) return;
        if (!Keyboard.isKeyDown((int)this.Field9346.Method337())) return;
        Iterator<Object> iterator = this.Field9354.values().iterator();
        block3: while (iterator.hasNext()) {
            int n;
            BlockPos blockPos;
            Object object;
            object = (List)iterator.next();
            int n4 = (int)((long)648925067 ^ (long)648925067);
            Iterator iterator2 = object.iterator();
            do {
                if (!iterator2.hasNext()) continue block3;
            } while (!(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)(blockPos = (BlockPos)iterator2.next()).getX(), (double)blockPos.getY(), (double)blockPos.getZ()) <= (double)this.Field9348.Method335()));
            n4 = (int)((long)1152228762 ^ (long)1152228763);
            if (this.Field9355 && this.Field9356 == blockPos) continue;
            if (JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.DIAMOND_PICKAXE && this.Field9347.Method365() && (n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method132(ItemPickaxe.class, (int)-56808718L ^ 0xFC9D2AF2, (int)1406364794L ^ 0x53D36C73)) != ((int)-234509178L ^ 0xF205AC87)) {
                JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            }
            if (this.Field9349.Method359().equals(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11018.name())) {
                JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
                JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                this.Field9355 = (int)1080989449L ^ 0x406E9708;
                this.Field9356 = blockPos;
                continue;
            }
            JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
            JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(blockPos, EnumFacing.UP);
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1601(RenderWorldLastEvent renderWorldLastEvent) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(((int)1148239670L ^ 0x4470BF36) != 0);
        this.Field9354.entrySet().stream().sorted(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R::Method1607).forEach(arg_0 -> this.Method1606(atomicBoolean, arg_0));
    }

    private List Method1602(BlockPos blockPos, Set set, EntityPlayer entityPlayer) {
        ArrayList arrayList = new ArrayList();
        HashMap<BlockPos, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi> hashMap = new HashMap<BlockPos, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi>();
        Iterator iterator = set.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                hashMap.forEach((arg_0, arg_1) -> this.Method1605(entityPlayer, arrayList, arg_0, arg_1));
                return arrayList;
            }
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)iterator.next());
            BlockPos blockPos2 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2846(blockPos);
            if (JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock() == Blocks.AIR) continue;
            hashMap.put(blockPos2, ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        }
    }

    private void Method1603(List list) {
        String string = this.Field9351.Method359();
        int n = (int)-1413755431L ^ 0x54443226;
        switch (string.hashCode()) {
            case -1763776967: {
                if (!string.equals("Closest")) return;
                n = (int)-1013444069L ^ 0xC398121B;
                return;
            }
            case 65921: {
                if (!string.equals("All")) return;
                n = (int)((long)-1076551787 ^ (long)-1076551788);
                return;
            }
        }
    }

    private static Double Method1604(BlockPos blockPos) {
        return blockPos.distanceSq((double)((int)JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX), (double)((int)JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), (double)((int)JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
    }

    private void Method1605(EntityPlayer entityPlayer, List list, BlockPos blockPos, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10833) {
            return;
        }
        BlockPos blockPos2 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2849(blockPos.down(this.Field9339.Method335()), this.Field9340.Method335());
        BlockPos blockPos3 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2847(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2850(blockPos, this.Field9340.Method335()), this.Field9341.Method335());
        List list2 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1947(blockPos2, blockPos3);
        IBlockState iBlockState = JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setBlockToAir(blockPos);
        for (BlockPos blockPos4 : list2) {
            if (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7771(blockPos4.down(), (boolean)((long)1068292411 ^ (long)1068292410), this.Field9344.Method365()) || !(vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos4.getX() + Double.longBitsToDouble(0xEAA3C158A3389CF1L ^ 0xD543C158A3389CF1L), blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble((long)1800769606 ^ 0x3FE000006B559046L), (Entity)entityPlayer, (boolean)((long)-1421960412 ^ (long)-1421960412)) >= (float)this.Field9342.Method335())) continue;
            if (!(vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos4.getX() + Double.longBitsToDouble(0x326FABFEE2E338FBL ^ 0xD8FABFEE2E338FBL), blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble((long)2067715076 ^ 0x3FE000007B3ED404L), (Entity)JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (boolean)((long)2012562059 ^ (long)2012562059)) <= (float)this.Field9343.Method335())) break;
            list.add(blockPos);
            break;
        }
        JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setBlockState(blockPos, iBlockState);
    }

    private void Method1606(AtomicBoolean atomicBoolean, Map.Entry entry) {
        if (atomicBoolean.get()) {
            return;
        }
        this.Method1603((List)entry.getValue());
        if (!this.Field9350.Method359().equalsIgnoreCase(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15888.name())) return;
        atomicBoolean.set(((int)-1927408946L ^ 0x8D1E12CF) != 0);
    }

    private static int Method1607(Map.Entry entry, Map.Entry entry2) {
        return (int)((EntityPlayer)entry.getKey()).getDistanceSq((Entity)entry2.getKey());
    }

    private static boolean Method1608(int n, BlockPos blockPos) {
        int n2;
        if (blockPos.getY() == n) {
            n2 = (int)((long)772183732 ^ (long)772183733);
            return n2 != 0;
        }
        n2 = (int)((long)863302392 ^ (long)863302392);
        return n2 != 0;
    }

    private static boolean Method1609(EntityPlayer entityPlayer) {
        boolean bl;
        if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1949((Entity)entityPlayer)) {
            bl = (int)-588336594L ^ 0xDCEEB22F;
            return bl;
        }
        bl = (int)1679282276L ^ 0x6417D064;
        return bl;
    }

    private boolean Method1610(EntityPlayer entityPlayer) {
        int n;
        if (entityPlayer.getDistanceSq((Entity)JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= this.Field9338.Method367() * this.Field9338.Method367()) {
            n = (int)((long)1314189364 ^ (long)1314189365);
            return n != 0;
        }
        n = (int)((long)-840799901 ^ (long)-840799901);
        return n != 0;
    }

    private static boolean Method1611(EntityPlayer entityPlayer) {
        boolean bl;
        if (entityPlayer != JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
            bl = (int)-709866874L ^ 0xD5B04A87;
            return bl;
        }
        bl = (int)2042655904L ^ 0x79C074A0;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2101472501L ^ 0x82BE130B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1837809455 ^ (long)-1837809618);
            int n2 = (int)-550209633L ^ 0xDF347772;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-121961825 ^ (long)-121929980) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

