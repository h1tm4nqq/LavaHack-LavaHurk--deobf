//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Stream;
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.Zhgf3QiCpopc7WZLbt543132rYDzfYwu;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
public class ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8454 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8455 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10504).Method355("Mode")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8456 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x92EE5B97F3785B32L ^ 0xD2FA5B97F3785B32L), 1.0, Double.longBitsToDouble(0x4A34C75C7A59C12AL ^ 0xA10C75C7A59C12AL), (boolean)((long)-421890938 ^ (long)-421890938)).Method355("Range")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8457 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceDelay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10536).Method355("Delay Mode")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8458 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceDelayMS", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1498291176 ^ 0x40490000594E1BE8L), 0.0, Double.longBitsToDouble((long)1097488200 ^ 0x407F4000416A5748L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method313(this::Method896).Method355("Delay")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8459 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRetry", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)26056487 ^ (long)26056487)).Method355("Retry")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8460 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceHeightLimit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xD1799613D06D06CCL ^ 0x91099613D06D06CCL), 0.0, Double.longBitsToDouble(0x5DA9BC186F2DCCCL ^ 0x45AA9BC186F2DCCCL), (boolean)((long)30663121 ^ (long)30663120)).Method355("Height Limit")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8461 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swap", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8462 = this.Method23(this.Field8461.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwapMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12686).Method355("Mode")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8463 = this.Method23(this.Field8461.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwapWhen", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15570).Method355("When")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8464 = this.Method24(this.Field8461.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sync Item", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8465 = this.Method23(this.Field8464.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SyncItem", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)308804639 ^ (long)308804639)).Method355("Sync")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8466 = this.Method23(this.Field8464.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SyncItemWhen", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8250).Method313(this.Field8465::Method365).Method355("When")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8467 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Web", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2063629964 ^ (long)2063629964))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8468 = this.Method23(this.Field8454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("WebOffset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1355825941 ^ (long)1355825941)).Method313(this.Field8467::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8469 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10609));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8470 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("KeepY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2073953559L ^ 0x8461FAE8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8471 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CheckDown", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x21011C383D253A14L ^ 0x61011C383D253A14L), 1.0, Double.longBitsToDouble((long)2045362639 ^ 0x4020000079E9C1CFL), ((int)-239689789L ^ 0xF1B69FC2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8472 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AlwaysCheckDown", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1303562295 ^ (long)1303562295)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8473 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EnemyRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)853324494 ^ 0x4020000032DCB2CEL), 1.0, Double.longBitsToDouble(0x957D2863C0514FF8L ^ 0xD5532863C0514FF8L), (boolean)((long)-1540381585 ^ (long)-1540381585)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8474 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwapEnemy", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)506033844L ^ 0x1E2976B4) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8475 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PredictCycles", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xC64CE2F76DCD510FL ^ 0x8668E2F76DCD510FL), (boolean)((long)-560393294 ^ (long)-560393293)).Method313(this::Method895));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8476 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PredictTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xD6E82337608B1E5EL ^ 0x96E82337608B1E5EL), 0.0, Double.longBitsToDouble(0xBB450AB939EFF32BL ^ 0xFB710AB939EFF32BL), (boolean)((long)-739256012 ^ (long)-739256011)).Method313(this::Method894));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8477 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2013385015L ^ 0x87FE2EC9) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8478 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1902048840L ^ 0x715EF648) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8479 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ProcessPackets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1120500491L ^ 0xBD3684F5) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8480 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this)));
    private final cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Field8481 = new cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs(this).Method6046(this.Field8480).Method6042().Method6043();
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field8482 = this.Method54();
    private final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Field8483 = new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(this.Field8473::Method367, this.Field8482.Method2000()::Method369, this.Field8482.Method2001()::Method365);
    private final RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2 Field8484 = new RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2();
    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw Field8485;
    private Queue Field8486 = new ConcurrentLinkedQueue();
    private final Thread Field8487;
    @Zhgf3QiCpopc7WZLbt543132rYDzfYwu
    public Entity Field8488 = null;
    private double Field8489;
    private BlockPos Field8490 = null;
    private String Field8491 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Block Method870() {
        Block block;
        if (this.Field8467.Method365()) {
            block = Blocks.WEB;
            return block;
        }
        block = (Block)((fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field8469.Method341()).Method2630().Method1726(new Object[(int)((long)-630263832 ^ (long)-630263832)]);
        return block;
    }

    public ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw() {
        super("FlattenRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        Field8485 = this;
        this.Field8487 = new Thread(this::Method893);
        this.Field8487.start();
    }

    @Override
    public void Method45() {
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = (int)((long)1986839812 ^ (long)1986839812);
        if (this.Field8488 == null || this.Field8474.Method365()) {
            this.Field8488 = this.Field8483.Method500(this.Field8473.Method368());
            if (this.Field8488 == null) {
                return;
            }
            this.Field8489 = this.Field8488.posY;
            if (!this.Method872(new Vec3d(this.Field8488.posX, this.Field8470.Method365() ? this.Field8489 : this.Field8488.posY, this.Field8488.posZ))) {
                return;
            }
            n = (int)((long)1031341228 ^ (long)1031341229);
        }
        Vec3d vec3d = new Vec3d(this.Field8488.posX, this.Field8470.Method365() ? this.Field8489 - 1.0 : this.Field8488.posY - 1.0, this.Field8488.posZ);
        if (this.Field8467.Method365() && this.Field8468.Method365()) {
            vec3d = new Vec3d(vec3d.x, vec3d.y + 1.0, vec3d.z);
        }
        if (this.Field8472.Method365()) {
        }
        Object[] objectArray = new Object[((int)-509440471L ^ 0xE1A28E28) << 1];
        objectArray[(int)879733023L ^ 0x346FA91F] = vec3d;
        objectArray[(int)((long)276795387 ^ (long)276795386)] = this.Field8488;
        ((ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field8455.Method341()).Method2556().Method1726(objectArray);
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(this.Method870());
        int n3 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method875(n2, (boolean)((long)-1510054343 ^ (long)-1510054343), ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15571);
        if (this.Field8457.Method341() != ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10536) {
            BlockPos blockPos;
            if (this.Field8486.size() > 0 && (blockPos = (BlockPos)this.Field8486.peek()).getY() <= this.Field8460.Method335()) {
                if (!this.Method873(blockPos) || this.Field8459.Method365()) {
                    this.Method874(blockPos, n3, n2);
                }
                this.Field8486.poll();
            }
        } else {
            ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(this.Field8486.size());
            for (BlockPos blockPos : this.Field8486) {
                if (blockPos.getY() > this.Field8460.Method335()) continue;
                if (this.Method873(blockPos)) {
                    if (this.Field8459.Method365()) continue;
                    arrayList.add(blockPos);
                    continue;
                }
                this.Method874(blockPos, n3, n2);
                arrayList.add(blockPos);
            }
            this.Field8486.removeAll(arrayList);
        }
        this.Method875(n3, ((int)137747289L ^ 0x835DB58) != 0, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15571);
        if (!this.Field8479.Method365()) return;
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().isChannelOpen()) {
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().processReceivedPackets();
            return;
        }
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().handleDisconnection();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method871(RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Field8481.Method3790()) return;
        this.Field8484.Method2990(this.Field8481, this.Field8490, null);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field8486 = new ConcurrentLinkedQueue();
        this.Field8490 = null;
        this.Field8488 = null;
        this.Field8489 = 0.0;
        this.Field8483.Method498();
        this.Field8482.Method2004();
        this.Field8484.Method2988();
    }

    private boolean Method872(Vec3d vec3d) {
        int n = (int)((long)1868891933 ^ (long)-1868891934);
        int n2 = (int)1488506778L ^ 0x58B8CF9A;
        while (true) {
            if (n2 >= this.Field8471.Method335()) {
                int cfr_ignored_0 = (int)-938287287L ^ 0x37ED20B6;
                return ((int)706728020L ^ 0x2A1FD054) != 0;
            }
            BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y - (double)n2 - 1.0, vec3d.z);
            if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
                n = n2 + ((int)-1756858100L ^ 0x9748790D);
            }
            ++n2;
        }
    }

    private boolean Method873(BlockPos blockPos) {
        int n;
        if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos)).isEmpty()) {
            n = (int)((long)513352134 ^ (long)513352135);
            return n != 0;
        }
        n = (int)((long)1336729783 ^ (long)1336729783);
        return n != 0;
    }

    private void Method874(BlockPos blockPos, int n, int n2) {
        this.Field8490 = blockPos;
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(0x6230FF88E9D6A9FFL ^ 0x5DD0FF88E9D6A9FFL), (double)blockPos.getY() + Double.longBitsToDouble(0x4EE6279CBBA34B04L ^ 0x7106279CBBA34B04L), (double)blockPos.getZ() + Double.longBitsToDouble(0xEDD5920FDFFEF538L ^ 0xD235920FDFFEF538L)) > this.Field8456.Method367()) {
            return;
        }
        this.Method875(n2, ((int)759604285L ^ 0x2D46A43D) != 0, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15570);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field8477.Method365(), this.Field8478.Method365());
        this.Method875(n, (boolean)((long)89388141 ^ (long)89388140), ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15570);
    }

    private void Method875(int n, boolean bl, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV != this.Field8463.Method341()) {
            return;
        }
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)this.Field8466.Method341();
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS == ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8251 || ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS == ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8249) {
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        }
        Object[] objectArray = new Object[(int)((long)-1862551322 ^ (long)-1862551321) << 1];
        objectArray[(int)1291145210L ^ 0x4CF54FFA] = n;
        objectArray[(int)1094764854L ^ 0x4140C937] = bl;
        ((ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field8462.Method341()).Method4316().Method1726(objectArray);
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS != ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8251) {
            if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS != ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8250) return;
        }
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
    }

    private static boolean Method876(BlockPos blockPos) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    private static List Method877(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos2 = blockPos.north();
        BlockPos blockPos3 = blockPos.east();
        BlockPos blockPos4 = blockPos.south();
        BlockPos blockPos5 = blockPos.west();
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos2)) {
            arrayList.add(blockPos2);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos3)) {
            arrayList.add(blockPos3);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos4)) {
            arrayList.add(blockPos4);
        }
        if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos5)) return arrayList;
        arrayList.add(blockPos5);
        return arrayList;
    }

    private static List Method878(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos2 = blockPos.north();
        BlockPos blockPos3 = blockPos.east();
        BlockPos blockPos4 = blockPos.south();
        BlockPos blockPos5 = blockPos.west();
        BlockPos blockPos6 = blockPos2.west();
        BlockPos blockPos7 = blockPos2.east();
        BlockPos blockPos8 = blockPos4.west();
        BlockPos blockPos9 = blockPos4.east();
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos2)) {
            arrayList.add(blockPos2);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos3)) {
            arrayList.add(blockPos3);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos4)) {
            arrayList.add(blockPos4);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos5)) {
            arrayList.add(blockPos5);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos6)) {
            arrayList.add(blockPos6);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos7)) {
            arrayList.add(blockPos7);
        }
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos8)) {
            arrayList.add(blockPos8);
        }
        if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos9)) return arrayList;
        arrayList.add(blockPos9);
        return arrayList;
    }

    private static void Method879(BlockPos blockPos) {
        if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method876(blockPos)) return;
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485.Field8486.contains(blockPos)) {
            return;
        }
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485.Field8486.add(blockPos);
    }

    private static void Method880(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485.Field8486.contains(blockPos)) continue;
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485.Field8486.add(blockPos);
        }
    }

    private static boolean Method881(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return ((int)-1577571073L ^ 0xA1F82CFE) != 0;
        }
        return ((int)1259249655L ^ 0x4B0E9FF7) != 0;
    }

    private static BlockPos Method882(Entity entity, BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw::Method892).filter(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw::Method891).min(Comparator.comparingDouble(arg_0 -> ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method890(entity, arg_0))).orElse(null);
    }

    private static BlockPos Method883(Entity entity, BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw::Method889).filter(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw::Method888).filter(arg_0 -> ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method887(entity, arg_0)).filter(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw::Method886).filter(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw::Method885).min(Comparator.comparingDouble(arg_0 -> ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method884(entity, arg_0))).orElse(null);
    }

    private static double Method884(Entity entity, BlockPos blockPos) {
        return entity.getDistance((double)blockPos.getX() + Double.longBitsToDouble(0x4EA543B1F3B166C8L ^ 0x714543B1F3B166C8L), (double)(blockPos.getY() + (int)((long)-582380288 ^ (long)-582380287)), (double)blockPos.getZ() + Double.longBitsToDouble((long)1656751848 ^ 0x3FE0000062C006E8L));
    }

    private static boolean Method885(BlockPos blockPos) {
        int n;
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up(((int)1592629950L ^ 0x5EED9ABF) << 1)).getBlock() == Blocks.AIR) {
            n = (int)((long)-847435483 ^ (long)-847435484);
            return n != 0;
        }
        n = (int)((long)615775814 ^ (long)615775814);
        return n != 0;
    }

    private static boolean Method886(BlockPos blockPos) {
        int n;
        if (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up()).getBlock() == Blocks.AIR) {
            n = (int)((long)-6418861 ^ (long)-6418862);
            return n != 0;
        }
        n = (int)((long)-106094673 ^ (long)-106094673);
        return n != 0;
    }

    private static boolean Method887(Entity entity, BlockPos blockPos) {
        boolean bl;
        if (!new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox())) {
            bl = (int)-1586596985L ^ 0xA16E7386;
            return bl;
        }
        bl = (int)1908229700L ^ 0x71BD4644;
        return bl;
    }

    private static boolean Method888(BlockPos blockPos) {
        int n;
        if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method881(blockPos)) {
            n = (int)-1741936070L ^ 0x982C2A3B;
            return n != 0;
        }
        n = (int)((long)-353222814 ^ (long)-353222814);
        return n != 0;
    }

    private static boolean Method889(BlockPos blockPos) {
        int n;
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            n = (int)934215511L ^ 0x37AEFF56;
            return n != 0;
        }
        n = (int)((long)853561337 ^ (long)853561337);
        return n != 0;
    }

    private static double Method890(Entity entity, BlockPos blockPos) {
        return entity.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)1115619271 ^ 0x3FE00000427EFFC7L), (double)(blockPos.getY() + ((int)-1995406038L ^ 0x8910852B)), (double)blockPos.getZ() + Double.longBitsToDouble(0xC9AF3A22658326A6L ^ 0xF64F3A22658326A6L));
    }

    private static boolean Method891(BlockPos blockPos) {
        int n;
        if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method881(blockPos)) {
            n = (int)((long)-55964947 ^ (long)-55964948);
            return n != 0;
        }
        n = (int)((long)-1531332874 ^ (long)-1531332874);
        return n != 0;
    }

    private static boolean Method892(BlockPos blockPos) {
        int n;
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            n = (int)((long)1673969653 ^ (long)1673969652);
            return n != 0;
        }
        n = (int)-113624821L ^ 0xF93A390B;
        return n != 0;
    }

    private void Method893() {
        IBONRcQCNUBg2NBpVpVQf61ykmVfU03E iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        boolean bl = this.Method35();
        while (bl) {
            if (this.Field8457.Method341() != ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10538) continue;
            if (!iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method2797(this.Field8458.Method335())) {
                bl = this.Method35();
                continue;
            }
            int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(this.Method870());
            if (n == (int)((long)-485868134 ^ (long)485868133)) continue;
            int n2 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if (this.Field8486.size() <= 0) {
                bl = this.Method35();
                continue;
            }
            BlockPos blockPos = (BlockPos)this.Field8486.peek();
            if (blockPos.getY() <= this.Field8460.Method335()) {
                if (!this.Method873(blockPos) && this.Field8459.Method365()) {
                    this.Method874(blockPos, n2, n);
                }
                this.Field8486.poll();
            }
            bl = this.Method35();
        }
    }

    private Boolean Method894() {
        return ((ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field8455.Method341()).Method2555();
    }

    private Boolean Method895() {
        return ((ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field8455.Method341()).Method2555();
    }

    private Boolean Method896() {
        int n;
        if (this.Field8457.Method341() == ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10538) {
            n = (int)((long)1194340931 ^ (long)1194340930);
            return n != 0;
        }
        n = (int)((long)-882866710 ^ (long)-882866710);
        return n != 0;
    }

    static BlockPos Method897(Entity entity, BlockPos blockPos) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method882(entity, blockPos);
    }

    static void Method898(BlockPos blockPos) {
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method879(blockPos);
    }

    static BlockPos Method899(Entity entity, BlockPos blockPos) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method883(entity, blockPos);
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method900(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw2) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw2.Field8475;
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method901(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw2) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw2.Field8476;
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method902(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw2) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw2.Field8470;
    }

    static void Method903(List list) {
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method880(list);
    }

    static List Method904(BlockPos blockPos) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method878(blockPos);
    }

    static List Method905(BlockPos blockPos) {
        return ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method877(blockPos);
    }

    static Minecraft Method906() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method907() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method908() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method909() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method910() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-892848083L ^ 0xCAC8382D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-235089558L ^ 0xF1FCD195);
            int n2 = (int)-1920020434L ^ 0x8D8ED031;
            cArray2[n] = (char)(cArray[n] ^ (((int)-582355051L ^ 0xDD49F69E) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

