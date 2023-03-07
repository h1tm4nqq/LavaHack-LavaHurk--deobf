//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YiaJMewdHT7xVddlXBXvHk3xrZhbIcM2;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.Zhgf3QiCpopc7WZLbt543132rYDzfYwu;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
public class ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf Field12594;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12595 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logic", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12596 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12597 = this.Method24(this.Field12595.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Holes", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12598 = this.Method23(this.Field12597.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ObsidianHoles", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-758802278L ^ 0xD2C5989B) != 0).Method355("Obby")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12599 = this.Method23(this.Field12597.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BedrockHoles", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-205876218L ^ 0xF3BA9407) != 0).Method355("Bebrock")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12600 = this.Method23(this.Field12597.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SingleHoles", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)462186921 ^ (long)462186920)).Method355("1x1")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12601 = this.Method23(this.Field12597.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DoubleHoles", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)180421620 ^ (long)180421621)).Method355("2x1")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12602 = this.Method23(this.Field12597.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CustomHoles", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)808810301L ^ 0x3035773C) != 0).Method355("Custom")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12603;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12604;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field12605;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12606;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12607;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12608;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12609;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12610;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12611;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12612;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12613;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12614;
    private final cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Field12615;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field12616;
    private final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Field12617;
    private final RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2 Field12618;
    @Zhgf3QiCpopc7WZLbt543132rYDzfYwu
    public Entity Field12619;
    private List Field12620;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12621;
    private final Set Field12622;
    private int Field12623;
    private BlockPos Field12624;
    private String Field12625 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf() {
        super("HoleFillerRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        String[] stringArray = new String[((int)737967308L ^ 0x2BFC7CCD) << 1];
        stringArray[(int)((long)1028916577 ^ (long)1028916577)] = "Obsidian";
        stringArray[(int)-44946526L ^ 0xFD522BA3] = "EnderChest";
        this.Field12603 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Obsidian", Arrays.asList(stringArray))));
        String[] stringArray2 = new String[(int)-1345096359L ^ 0xAFD3755C];
        stringArray2[(int)2005443727L ^ 0x7788A48F] = "None";
        stringArray2[(int)1983564367L ^ 0x763ACA4E] = "Vanilla";
        stringArray2[(int)((long)805788770 ^ (long)805788771) << 1] = "Normal";
        stringArray2[(int)((long)1119392980 ^ (long)1119392983)] = "Packet";
        stringArray2[(int)((long)1906730392 ^ (long)1906730393) << 2] = "Silent";
        this.Field12604 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Silent", Arrays.asList(stringArray2))));
        this.Field12605 = this.Method25(this.Field12595.Method7407(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8498)));
        this.Field12606 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1419499104L ^ 0x549BD660) != 0)));
        String[] stringArray3 = new String[(int)((long)-2025858857 ^ (long)-2025858860)];
        stringArray3[(int)((long)-36891208 ^ (long)-36891208)] = "Instant";
        stringArray3[(int)99529053L ^ 0x5EEB15C] = "Tick";
        stringArray3[((int)-1289965050L ^ 0xB31CB207) << 1] = "Delay";
        this.Field12607 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Instant", Arrays.asList(stringArray3))));
        this.Field12608 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entity Check", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1349769965L ^ 0xAF8C2513) != 0)));
        this.Field12609 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x808020D46E1621E4L ^ 0xC0C920D46E1621E4L), 0.0, Double.longBitsToDouble((long)2127216719 ^ 0x407F40007ECAC04FL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method313(this::Method4270)));
        String[] stringArray4 = new String[(int)((long)1943124386 ^ (long)1943124387) << 1];
        stringArray4[(int)511792087L ^ 0x1E8153D7] = "All";
        stringArray4[(int)-849506488L ^ 0xCD5D8F49] = "Target";
        this.Field12610 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "All", Arrays.asList(stringArray4))));
        this.Field12611 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TargetRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x4F00A74E73F86446L ^ 0xF24A74E73F86446L), 1.0, Double.longBitsToDouble((long)2025165580 ^ 0x402E000078B5930CL), (boolean)((long)-584571068 ^ (long)-584571068)).Method313(this::Method4269)));
        this.Field12612 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TargetHoleRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)289960835 ^ 0x4010000011487383L), 1.0, Double.longBitsToDouble((long)860736168 ^ 0x40240000334DCAA8L), (boolean)((long)-1261845216 ^ (long)-1261845216)).Method313(this::Method4268)));
        this.Field12613 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HoleRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xE6D31F6916E39635L ^ 0xA6C71F6916E39635L), 1.0, Double.longBitsToDouble(0x5EBD4570062C2F8FL ^ 0x1E994570062C2F8FL), (boolean)((long)-521594619 ^ (long)-521594619))));
        this.Field12614 = this.Method23(this.Field12595.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1426651140 ^ 0x404900005508F804L), (boolean)((long)1495475305 ^ (long)1495475304))));
        this.Field12615 = new cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs(this).Method6046(this.Field12596).Method6042().Method6043();
        this.Field12616 = this.Method54();
        this.Field12617 = new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(this.Field12611::Method367, this::Method4267, this.Field12616.Method2001()::Method365);
        this.Field12618 = new RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2();
        this.Field12619 = null;
        this.Field12620 = new ArrayList();
        this.Field12621 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field12622 = new HashSet((int)((long)1592585392 ^ (long)1592585393) << 9);
        this.Field12623 = (int)((long)-173592561 ^ (long)-173592561);
        super.Method44(this::Method4266);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field12617.Method498();
        this.Field12616.Method2004();
        this.Field12618.Method2988();
        this.Field12624 = null;
    }

    @Override
    public void Method45() {
        if (ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field12617.Method499();
        Object object = this.Field12619 = this.Field12610.Method359().equals("All") ? ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player : this.Field12617.Method496();
        if (this.Field12619 == null) {
            return;
        }
        this.Field12616.Method2005(this::Method4264);
        this.Method4253(this.Field12619);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4252(RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Field12615.Method3790()) return;
        this.Field12618.Method2990(this.Field12615, this.Field12624, null);
    }

    private void Method4253(Entity entity) {
        int n = this.Method4260();
        if (n == ((int)-263255900L ^ 0xFB0F75B)) {
            return;
        }
        if (this.Field12607.Method359().equals("Instant")) {
            this.Field12620.forEach(arg_0 -> this.Method4263(n, arg_0));
        } else if (this.Field12607.Method359().equals("Tick")) {
            this.Method4254(entity, n);
        } else if (this.Field12607.Method359().equals("Delay") && this.Field12621.Method2797(this.Field12609.Method335())) {
            this.Method4254(entity, n);
        }
        this.Field12621.Method2801();
    }

    private void Method4254(Entity entity, int n) {
        int n2 = (int)2233220L ^ 0x221385;
        for (BlockPos blockPos : this.Field12620) {
            if (this.Field12622.contains(blockPos) || !ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getSelectedBoundingBox((World)ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)).isEmpty()) continue;
            this.Field12624 = blockPos;
            this.Method4261(blockPos, n);
            this.Field12622.add(blockPos);
            n2 = (int)974551587L ^ 0x3A167A23;
            break;
        }
        this.Field12622.clear();
    }

    private List Method4255(Entity entity) {
        YiaJMewdHT7xVddlXBXvHk3xrZhbIcM2 yiaJMewdHT7xVddlXBXvHk3xrZhbIcM2 = new YiaJMewdHT7xVddlXBXvHk3xrZhbIcM2();
        float f = entity.equals((Object)ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) ? this.Field12613.Method368() : this.Field12612.Method368();
        Set set = this.Method4257(entity, f);
        this.Field12623 = (int)((long)942881542 ^ (long)942881542);
        if (this.Field12600.Method365()) {
            yiaJMewdHT7xVddlXBXvHk3xrZhbIcM2.Method3856(this.Method4256(set, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9768), this.Field12608.Method365());
        }
        if (this.Field12601.Method365()) {
            yiaJMewdHT7xVddlXBXvHk3xrZhbIcM2.Method3856(this.Method4256(set, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9769), this.Field12608.Method365());
        }
        if (!this.Field12602.Method365()) return yiaJMewdHT7xVddlXBXvHk3xrZhbIcM2;
        yiaJMewdHT7xVddlXBXvHk3xrZhbIcM2.Method3856(this.Method4256(set, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9770), this.Field12608.Method365());
        return yiaJMewdHT7xVddlXBXvHk3xrZhbIcM2;
    }

    private List Method4256(Set set, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        ArrayList arrayList = new ArrayList((int)((long)1862391320 ^ (long)1862391321) << 5);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            List list;
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Field12614.Method335() != 0 && this.Field12623 > this.Field12614.Method335()) {
                return arrayList;
            }
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131(blockPos, (boolean)((long)1421761420 ^ (long)1421761420), ((int)562357823L ^ 0x2184E63F) != 0);
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6959();
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6960();
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 != ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) continue;
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697 && this.Field12599.Method365()) {
                list = this.Method4259(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961());
                arrayList.addAll(list);
                this.Field12623 += (int)((long)919566076 ^ (long)919566077);
                continue;
            }
            if (!this.Field12598.Method365()) continue;
            list = this.Method4259(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961());
            arrayList.addAll(list);
            this.Field12623 += (int)((long)-775064614 ^ (long)-775064613);
        }
        return arrayList;
    }

    private Set Method4257(Entity entity, float f) {
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        List list = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1946(this.Method4258(entity), f, (int)f, (boolean)((long)882285064 ^ (long)882285064), ((int)2034202003L ^ 0x793F7592) != 0, (int)-816014802L ^ 0xCF5C9A2E);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
            if (!ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).isEmpty() || !ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)445998609 ^ (long)445998609), (int)((long)335531028 ^ (long)-335531029), (int)-41638239L ^ 0xFD84A6A1)).getBlock().equals(Blocks.AIR) || !ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)360738153 ^ (long)360738153), (int)((long)-718179439 ^ (long)-718179440), (int)-34434263L ^ 0xFDF29329)).getBlock().equals(Blocks.AIR) || !ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-1391553380L ^ 0xAD0E949C, (int)((long)565236342 ^ (long)565236343) << 1, (int)-338416006L ^ 0xEBD42E7A)).getBlock().equals(Blocks.AIR)) continue;
            hashSet.add(blockPos);
        }
        return hashSet;
    }

    private BlockPos Method4258(Entity entity) {
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }

    private List Method4259(AxisAlignedBB axisAlignedBB) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        double d = axisAlignedBB.maxX - axisAlignedBB.minX;
        double d2 = axisAlignedBB.maxZ - axisAlignedBB.minZ;
        if (d > Double.longBitsToDouble(0x77ECC13DB635055DL ^ 0x37ECC13DB635055DL) && d2 > Double.longBitsToDouble((long)1419744139 ^ 0x40000000549F938BL)) {
            return arrayList;
        }
        if (d > d2) {
            int n = (int)axisAlignedBB.minX;
            int n2 = (int)axisAlignedBB.maxX;
            while (n < n2) {
                arrayList.add(new BlockPos(n, (int)axisAlignedBB.minY, (int)axisAlignedBB.minZ));
                ++n;
            }
            return arrayList;
        }
        int n = (int)axisAlignedBB.minZ;
        int n3 = (int)axisAlignedBB.maxZ;
        while (n < n3) {
            arrayList.add(new BlockPos((int)axisAlignedBB.minX, (int)axisAlignedBB.minY, n));
            ++n;
        }
        return arrayList;
    }

    private int Method4260() {
        if (!this.Field12603.Method359().equals("Obsidian")) return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.ENDER_CHEST);
        return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
    }

    private void Method4261(BlockPos blockPos, int n) {
        if (ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory == null) {
            return;
        }
        int n2 = ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method4262(n, (boolean)((long)-942145214 ^ (long)-942145214));
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4209(blockPos, EnumHand.MAIN_HAND, (a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field12605.Method341(), this.Field12606.Method365());
        this.Method4262(n2, ((int)-202670881L ^ 0xF3EB7CDE) != 0);
        ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }

    private void Method4262(int n, boolean bl) {
        String string = this.Field12604.Method359();
        int n2 = (int)((long)5040883 ^ (long)-5040884);
        switch (string.hashCode()) {
            case 2433880: {
                if (!string.equals("None")) return;
                n2 = (int)-386695706L ^ 0xE8F37DE6;
                return;
            }
            case 1897755483: {
                if (!string.equals("Vanilla")) return;
                n2 = (int)-882818032L ^ 0xCB614411;
                return;
            }
            case -1955878649: {
                if (!string.equals("Normal")) return;
                n2 = ((int)550780755L ^ 0x20D43F52) << 1;
                return;
            }
            case -1911998296: {
                if (!string.equals("Packet")) return;
                n2 = (int)-1896504718L ^ 0x8EF5A271;
                return;
            }
            case -1818460043: {
                if (!string.equals("Silent")) return;
                n2 = (int)((long)108423581 ^ (long)108423580) << 2;
                return;
            }
        }
    }

    @Override
    public boolean Method52() {
        return (int)((long)155753998 ^ (long)155753999) != 0;
    }

    private void Method4263(int n, BlockPos blockPos) {
        this.Method4261(blockPos, n);
    }

    private void Method4264() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method4265);
    }

    private List Method4265() throws Exception {
        this.Field12620 = this.Method4255(this.Field12619);
        return this.Field12620;
    }

    private String Method4266() {
        if (this.Field12619 == null) {
            return " no target no fun";
        }
        String string = "[" + (this.Field12619 != ZViknNLQGdl1zURmGxE7gF1Vf3YALOcf.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player ? this.Field12619.getName() : "Self") + "]";
        return string;
    }

    private Long Method4267() {
        return this.Field12616.Method2000().Method369();
    }

    private Boolean Method4268() {
        return this.Field12610.Method359().equals("Target");
    }

    private Boolean Method4269() {
        return this.Field12610.Method359().equals("Target");
    }

    private Boolean Method4270() {
        return this.Field12607.Method359().equals("Delay");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1273932921L ^ 0xB4115387;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1712750690 ^ (long)-1712750751);
            int n2 = (int)-1612865745L ^ 0x9FDD9F6E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1075367529 ^ (long)1075379830) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

