//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.potion.PotionEffect
 *  net.minecraftforge.client.event.RenderBlockOverlayEvent
 *  net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.DitR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class o9lanP0gHU278cwDFs7XEsyWoBrJVe44
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static o9lanP0gHU278cwDFs7XEsyWoBrJVe44 Field16374;
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16375 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fog", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1981229503L ^ 0x89E8D641) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16376 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HurtCam", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1662888015 ^ (long)-1662888015)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16377 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Armor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1736132421L ^ 0x9884B8BB) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16378 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Overlay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)579969962L ^ 0x2291A3AA) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16379 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Gui Overlay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-874415402 ^ (long)-874415402)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16380 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Book", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)876291001 ^ (long)876291001)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16381 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Chat Background", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1379613630 ^ (long)-1379613630)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16382 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Boss Bar", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)933796155 ^ (long)933796155)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16383 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scoreboard", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1318463634 ^ (long)1318463634));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16384 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Particle", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, o9lanP0gHU278cwDFs7XEsyWoBrJVe44$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12975));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16385 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Portal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-134325749L ^ 0xF7FE5A0B) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16386 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1490155086 ^ (long)-1490155086)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16387 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Default Block Highlight", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-928812182 ^ (long)-928812182)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16388 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hand Items Texture", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)821131063L ^ 0x30F17737) != 0);
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16389 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Enchant Glint", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1842012399L ^ 0x92351F11) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16390 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, o9lanP0gHU278cwDFs7XEsyWoBrJVe44$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9182));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16391 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sway", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1513582890 ^ (long)-1513582890)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16392 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Glow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-75069949 ^ (long)-75069949)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16393 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Potion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1763197724L ^ 0x6918431C) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16394 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Weather", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1481603846 ^ (long)1481603846)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16395 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-241749038 ^ (long)-241749038)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16396 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fire", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1972010875 ^ (long)1972010875)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16397 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lava", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-552147867L ^ 0xDF16E465) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16398 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Water", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-449804064L ^ 0xE53088E0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16399 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crosshair", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1513133771L ^ 0xA5CF6935) != 0));
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16400 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6863, new Predicate[(int)-453391489L ^ 0xE4F9CB7F]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16401 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6862, new Predicate[(int)((long)-1087649824 ^ (long)-1087649824)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16402 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6861, new Predicate[(int)-90799955L ^ 0xFA9680AD]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16403 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6860, new Predicate[(int)((long)249025796 ^ (long)249025796)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16404 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6859, new Predicate[(int)1871433509L ^ 0x6F8BCF25]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16405 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6858, new Predicate[(int)((long)-369509627 ^ (long)-369509627)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16406 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6857, new Predicate[(int)613257267L ^ 0x248D9033]);
    private String Field16407 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public o9lanP0gHU278cwDFs7XEsyWoBrJVe44() {
        super("NoRender", "no render", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Field16374 = this;
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16402);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16401);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16403);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16404);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16405);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16406);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16400);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16400);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16406);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16405);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16404);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16403);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16401);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16402);
    }

    @Override
    public void Method45() {
        Object object;
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16393.Method365()) {
            object = new HashMap();
            for (Map.Entry entry : o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.entrySet()) {
                object.put(entry.getKey(), new PotionEffect(((PotionEffect)entry.getValue()).getPotion(), ((PotionEffect)entry.getValue()).getDuration(), ((PotionEffect)entry.getValue()).getAmplifier(), ((PotionEffect)entry.getValue()).getIsAmbient(), (boolean)((long)-1483527579 ^ (long)-1483527579)));
            }
            o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.clear();
            o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.putAll(object);
        }
        if (this.Field16394.Method365()) {
            o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setRainStrength(0.0f);
        }
        if (this.Field16390.Method309("Client")) {
            o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress = (int)-2003412223L ^ 0x88965B01;
            o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt = (int)((long)-98007127 ^ (long)-98007127);
            o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgress = 0.0f;
            o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevSwingProgress = 0.0f;
        }
        if (!this.Field16392.Method365()) return;
        object = o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            entity.glowing = (int)((long)-439296709 ^ (long)-439296709);
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6856(RenderBlockOverlayEvent renderBlockOverlayEvent) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        RenderBlockOverlayEvent.OverlayType overlayType = renderBlockOverlayEvent.getOverlayType();
        if (this.Field16395.Method365() && overlayType == RenderBlockOverlayEvent.OverlayType.BLOCK) {
            renderBlockOverlayEvent.setCanceled((boolean)((long)-262213456 ^ (long)-262213455));
        }
        if (this.Field16396.Method365() && overlayType == RenderBlockOverlayEvent.OverlayType.FIRE) {
            renderBlockOverlayEvent.setCanceled((boolean)((long)-1386231209 ^ (long)-1386231210));
        }
        if (this.Field16397.Method365() && renderBlockOverlayEvent.getBlockForOverlay().getBlock().equals(Blocks.LAVA)) {
            renderBlockOverlayEvent.setCanceled((boolean)((long)216429905 ^ (long)216429904));
        }
        if (!this.Field16398.Method365()) return;
        if (overlayType != RenderBlockOverlayEvent.OverlayType.WATER) return;
        renderBlockOverlayEvent.setCanceled((boolean)((long)780178184 ^ (long)780178185));
    }

    private void Method6857(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!this.Field16390.Method309("Server")) return;
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketAnimation)) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private void Method6858(DitR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ditR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!this.Field16378.Method365()) return;
        ditR6vZ79qQrTZ031J7xzQQWKdUckNea$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    private void Method6859(DitR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ditR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!this.Field16385.Method365()) return;
        ditR6vZ79qQrTZ031J7xzQQWKdUckNea$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private void Method6860(DitR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS ditR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS) {
        if (!this.Field16378.Method365()) return;
        ditR6vZ79qQrTZ031J7xzQQWKdUckNea$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method158();
    }

    private void Method6861(fTSdQpXXUsy7b26dtudQpgyKwlcDU58e fTSdQpXXUsy7b26dtudQpgyKwlcDU58e2) {
        if (!this.Field16375.Method365()) return;
        fTSdQpXXUsy7b26dtudQpgyKwlcDU58e2.Method158();
    }

    private void Method6862(DitR6vZ79qQrTZ031J7xzQQWKdUckNea$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ditR6vZ79qQrTZ031J7xzQQWKdUckNea$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        if (!this.Field16382.Method365()) return;
        ditR6vZ79qQrTZ031J7xzQQWKdUckNea$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method158();
    }

    private void Method6863(p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5 p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52) {
        if (!this.Field16399.Method365()) return;
        p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1616468818 ^ (long)1616468818);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-59608030L ^ 0xFC7274DD);
            int n2 = (int)1754243981L ^ 0x688FA3E8;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1356128039L ^ 0xAF2B6A4E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

