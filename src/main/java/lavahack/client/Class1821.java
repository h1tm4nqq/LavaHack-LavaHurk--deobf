//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.potion.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import net.minecraft.init.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.client.*;

public class Class1821 extends Class42
{
    public static Class1821 Field16374;
    public Class44 Field16375;
    public Class44 Field16376;
    public Class44 Field16377;
    public Class44 Field16378;
    public Class44 Field16379;
    public Class44 Field16380;
    public Class44 Field16381;
    public Class44 Field16382;
    public Class44 Field16383;
    public Class44 Field16384;
    public Class44 Field16385;
    public Class44 Field16386;
    public Class44 Field16387;
    public Class44 Field16388;
    public Class44 Field16389;
    private final Class44 Field16390;
    public Class44 Field16391;
    private final Class44 Field16392;
    public final Class44 Field16393;
    private final Class44 Field16394;
    private final Class44 Field16395;
    private final Class44 Field16396;
    private final Class44 Field16397;
    private final Class44 Field16398;
    private final Class44 Field16399;
    @Class1801
    private final Class618 Field16400;
    @Class1801
    private final Class618 Field16401;
    @Class1801
    private final Class618 Field16402;
    @Class1801
    private final Class618 Field16403;
    @Class1801
    private final Class618 Field16404;
    @Class1801
    private final Class618 Field16405;
    @Class1801
    private final Class618 Field16406;
    private String Field16407 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1821() {
        super("NoRender", "no render", Class97.Field8342);
        this.Field16375 = this.Method23(new Class44("Fog", this, false));
        this.Field16376 = this.Method23(new Class44("HurtCam", this, false));
        this.Field16377 = this.Method23(new Class44("Armor", this, false));
        this.Field16378 = this.Method23(new Class44("Overlay", this, false));
        this.Field16379 = this.Method23(new Class44("Gui Overlay", this, false));
        this.Field16380 = this.Method23(new Class44("Book", this, false));
        this.Field16381 = this.Method23(new Class44("Chat Background", this, false));
        this.Field16382 = this.Method23(new Class44("Boss Bar", this, false));
        this.Field16383 = new Class44("Scoreboard", this, false);
        this.Field16384 = this.Method23(new Class44("Particle", this, (Enum)Class1103.Field12975));
        this.Field16385 = this.Method23(new Class44("Portal", this, false));
        this.Field16386 = this.Method23(new Class44("Items", this, false));
        this.Field16387 = this.Method23(new Class44("Default Block Highlight", this, false));
        this.Field16388 = new Class44("Hand Items Texture", this, false);
        this.Field16389 = this.Method23(new Class44("Enchant Glint", this, false));
        this.Field16390 = this.Method23(new Class44("Swing", this, Class265.Field9182));
        this.Field16391 = this.Method23(new Class44("Sway", this, false));
        this.Field16392 = this.Method23(new Class44("Glow", this, false));
        this.Field16393 = this.Method23(new Class44("Potion", this, false));
        this.Field16394 = this.Method23(new Class44("Weather", this, false));
        this.Field16395 = this.Method23(new Class44("Block", this, false));
        this.Field16396 = this.Method23(new Class44("Fire", this, false));
        this.Field16397 = this.Method23(new Class44("Lava", this, false));
        this.Field16398 = this.Method23(new Class44("Water", this, false));
        this.Field16399 = this.Method23(new Class44("Crosshair", this, false));
        this.Field16400 = new Class618(this::Method6863, new Predicate[0]);
        this.Field16401 = new Class618(this::Method6862, new Predicate[0]);
        this.Field16402 = new Class618(this::Method6861, new Predicate[0]);
        this.Field16403 = new Class618(this::Method6860, new Predicate[0]);
        this.Field16404 = new Class618(this::Method6859, new Predicate[0]);
        this.Field16405 = new Class618(this::Method6858, new Predicate[0]);
        this.Field16406 = new Class618(this::Method6857, new Predicate[0]);
        Class1821.Field16374 = this;
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
        if (Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16393.Method365()) {
            final HashMap<Object, PotionEffect> hashMap = new HashMap<Object, PotionEffect>();
            for (final Map.Entry<Object, V> entry : Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.entrySet()) {
                hashMap.put(entry.getKey(), new PotionEffect(((PotionEffect)entry.getValue()).getPotion(), ((PotionEffect)entry.getValue()).getDuration(), ((PotionEffect)entry.getValue()).getAmplifier(), ((PotionEffect)entry.getValue()).getIsAmbient(), false));
            }
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.clear();
            Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.activePotionsMap.putAll(hashMap);
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
        if (this.Field16392.Method365()) {
            final Iterator<Entity> iterator2 = Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().glowing = false;
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6856(final RenderBlockOverlayEvent renderBlockOverlayEvent) {
        if (Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1821.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final RenderBlockOverlayEvent$OverlayType overlayType = renderBlockOverlayEvent.getOverlayType();
        if (this.Field16395.Method365() && overlayType == RenderBlockOverlayEvent$OverlayType.BLOCK) {
            renderBlockOverlayEvent.setCanceled(true);
        }
        if (this.Field16396.Method365() && overlayType == RenderBlockOverlayEvent$OverlayType.FIRE) {
            renderBlockOverlayEvent.setCanceled(true);
        }
        if (this.Field16397.Method365() && renderBlockOverlayEvent.getBlockForOverlay().getBlock().equals(Blocks.LAVA)) {
            renderBlockOverlayEvent.setCanceled(true);
        }
        if (this.Field16398.Method365() && overlayType == RenderBlockOverlayEvent$OverlayType.WATER) {
            renderBlockOverlayEvent.setCanceled(true);
        }
    }
    
    private void Method6857(final Class805 class805) {
        if (this.Field16390.Method309("Server") && class805.Method982() instanceof CPacketAnimation) {
            class805.Method158();
        }
    }
    
    private void Method6858(final Class371 class371) {
        if (this.Field16378.Method365()) {
            class371.Method158();
        }
    }
    
    private void Method6859(final Class1782 class1782) {
        if (this.Field16385.Method365()) {
            class1782.Method158();
        }
    }
    
    private void Method6860(final Class1814 class1814) {
        if (this.Field16378.Method365()) {
            class1814.Method158();
        }
    }
    
    private void Method6861(final Class400 class400) {
        if (this.Field16375.Method365()) {
            class400.Method158();
        }
    }
    
    private void Method6862(final Class107 class107) {
        if (this.Field16382.Method365()) {
            class107.Method158();
        }
    }
    
    private void Method6863(final Class280 class280) {
        if (this.Field16399.Method365()) {
            class280.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4A97 ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
