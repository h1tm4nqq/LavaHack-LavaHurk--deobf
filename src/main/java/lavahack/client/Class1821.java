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
import lavahack.client.Class107;
import lavahack.client.Class1103;
import lavahack.client.Class1782;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1814;
import lavahack.client.Class265;
import lavahack.client.Class280;
import lavahack.client.Class371;
import lavahack.client.Class400;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1821
extends Class42 {
    public static Class1821 Field16374;
    public Class44 Field16375 = this.Method23(new Class44("Fog", (Class42)this, false));
    public Class44 Field16376 = this.Method23(new Class44("HurtCam", (Class42)this, false));
    public Class44 Field16377 = this.Method23(new Class44("Armor", (Class42)this, false));
    public Class44 Field16378 = this.Method23(new Class44("Overlay", (Class42)this, false));
    public Class44 Field16379 = this.Method23(new Class44("Gui Overlay", (Class42)this, false));
    public Class44 Field16380 = this.Method23(new Class44("Book", (Class42)this, false));
    public Class44 Field16381 = this.Method23(new Class44("Chat Background", (Class42)this, false));
    public Class44 Field16382 = this.Method23(new Class44("Boss Bar", (Class42)this, false));
    public Class44 Field16383 = new Class44("Scoreboard", (Class42)this, false);
    public Class44 Field16384 = this.Method23(new Class44("Particle", (Class42)this, Class1103.Field12975));
    public Class44 Field16385 = this.Method23(new Class44("Portal", (Class42)this, false));
    public Class44 Field16386 = this.Method23(new Class44("Items", (Class42)this, false));
    public Class44 Field16387 = this.Method23(new Class44("Default Block Highlight", (Class42)this, false));
    public Class44 Field16388 = new Class44("Hand Items Texture", (Class42)this, false);
    public Class44 Field16389 = this.Method23(new Class44("Enchant Glint", (Class42)this, false));
    private final Class44 Field16390 = this.Method23(new Class44("Swing", (Class42)this, Class265.Field9182));
    public Class44 Field16391 = this.Method23(new Class44("Sway", (Class42)this, false));
    private final Class44 Field16392 = this.Method23(new Class44("Glow", (Class42)this, false));
    public final Class44 Field16393 = this.Method23(new Class44("Potion", (Class42)this, false));
    private final Class44 Field16394 = this.Method23(new Class44("Weather", (Class42)this, false));
    private final Class44 Field16395 = this.Method23(new Class44("Block", (Class42)this, false));
    private final Class44 Field16396 = this.Method23(new Class44("Fire", (Class42)this, false));
    private final Class44 Field16397 = this.Method23(new Class44("Lava", (Class42)this, false));
    private final Class44 Field16398 = this.Method23(new Class44("Water", (Class42)this, false));
    private final Class44 Field16399 = this.Method23(new Class44("Crosshair", (Class42)this, false));
    @Class1801
    private final Class618 Field16400 = new Class618(this::Method6863, new Predicate[0]);
    @Class1801
    private final Class618 Field16401 = new Class618(this::Method6862, new Predicate[0]);
    @Class1801
    private final Class618 Field16402 = new Class618(this::Method6861, new Predicate[0]);
    @Class1801
    private final Class618 Field16403 = new Class618(this::Method6860, new Predicate[0]);
    @Class1801
    private final Class618 Field16404 = new Class618(this::Method6859, new Predicate[0]);
    @Class1801
    private final Class618 Field16405 = new Class618(this::Method6858, new Predicate[0]);
    @Class1801
    private final Class618 Field16406 = new Class618(this::Method6857, new Predicate[0]);
    private String Field16407 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1821() {
        super("NoRender", "no render", Class97.Field8342);
        Field16374 = this;
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field16402);
        Class1796.Field16242.Method706(this.Field16401);
        Class1796.Field16242.Method706(this.Field16403);
        Class1796.Field16242.Method706(this.Field16404);
        Class1796.Field16242.Method706(this.Field16405);
        Class1796.Field16242.Method706(this.Field16406);
        Class1796.Field16242.Method706(this.Field16400);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field16400);
        Class1796.Field16242.Method711(this.Field16406);
        Class1796.Field16242.Method711(this.Field16405);
        Class1796.Field16242.Method711(this.Field16404);
        Class1796.Field16242.Method711(this.Field16403);
        Class1796.Field16242.Method711(this.Field16401);
        Class1796.Field16242.Method711(this.Field16402);
    }

    @Override
    public void Method45() {
        Object object;
        if (Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16393.Method365()) {
            object = new HashMap();
            for (Map.Entry entry : Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.entrySet()) {
                object.put(entry.getKey(), new PotionEffect(((PotionEffect)entry.getValue()).getPotion(), ((PotionEffect)entry.getValue()).getDuration(), ((PotionEffect)entry.getValue()).getAmplifier(), ((PotionEffect)entry.getValue()).getIsAmbient(), false));
            }
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.clear();
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.putAll(object);
        }
        if (this.Field16394.Method365()) {
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setRainStrength(0.0f);
        }
        if (this.Field16390.Method309("Client")) {
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress = false;
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt = 0;
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgress = 0.0f;
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevSwingProgress = 0.0f;
        }
        if (!this.Field16392.Method365()) return;
        object = Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            entity.glowing = false;
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6856(RenderBlockOverlayEvent renderBlockOverlayEvent) {
        if (Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        RenderBlockOverlayEvent.OverlayType overlayType = renderBlockOverlayEvent.getOverlayType();
        if (this.Field16395.Method365() && overlayType == RenderBlockOverlayEvent.OverlayType.BLOCK) {
            renderBlockOverlayEvent.setCanceled(true);
        }
        if (this.Field16396.Method365() && overlayType == RenderBlockOverlayEvent.OverlayType.FIRE) {
            renderBlockOverlayEvent.setCanceled(true);
        }
        if (this.Field16397.Method365() && renderBlockOverlayEvent.getBlockForOverlay().getBlock().equals(Blocks.LAVA)) {
            renderBlockOverlayEvent.setCanceled(true);
        }
        if (!this.Field16398.Method365()) return;
        if (overlayType != RenderBlockOverlayEvent.OverlayType.WATER) return;
        renderBlockOverlayEvent.setCanceled(true);
    }

    private void Method6857(Class805 class805) {
        if (!this.Field16390.Method309("Server")) return;
        if (!(class805.Method982() instanceof CPacketAnimation)) return;
        class805.Method158();
    }

    private void Method6858(Class371 class371) {
        if (!this.Field16378.Method365()) return;
        class371.Method158();
    }

    private void Method6859(Class1782 class1782) {
        if (!this.Field16385.Method365()) return;
        class1782.Method158();
    }

    private void Method6860(Class1814 class1814) {
        if (!this.Field16378.Method365()) return;
        class1814.Method158();
    }

    private void Method6861(Class400 class400) {
        if (!this.Field16375.Method365()) return;
        class400.Method158();
    }

    private void Method6862(Class107 class107) {
        if (!this.Field16382.Method365()) return;
        class107.Method158();
    }

    private void Method6863(Class280 class280) {
        if (!this.Field16399.Method365()) return;
        class280.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 101;
            cArray2[n] = (char)(cArray[n] ^ (0x4A97 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

