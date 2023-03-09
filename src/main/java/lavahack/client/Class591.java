//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.network.play.server.SPacketEntityEffect
 *  net.minecraft.network.play.server.SPacketRemoveEntityEffect
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1621;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class753;
import net.minecraft.client.resources.I18n;
import net.minecraft.network.play.server.SPacketEntityEffect;
import net.minecraft.network.play.server.SPacketRemoveEntityEffect;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class591
extends Class1249 {
    private final Class44 Field10515 = this.Method23(new Class44("Offsets", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble(0x4024000000000000L), true));
    private final Class1996 Field10516 = this.Method24(new Class1996(new Class44("Sort", this)));
    private final Class44 Field10517 = this.Method23(this.Field10516.Method7405(new Class44("Sort", (Class42)this, true)));
    private final Class44 Field10518 = this.Method23(this.Field10516.Method7405(new Class44("Sort Mode", (Class42)this, "Alphabet", Arrays.asList("Alphabet", "Length", "Duration")).Method312(this.Field10517).Method355("Mode")));
    private final Class44 Field10519 = this.Method23(this.Field10516.Method7405(new Class44("Sort Reverse", (Class42)this, false).Method312(this.Field10517).Method355("Reverse")));
    private final Class44 Field10520 = this.Method23(new Class44("Sliders", (Class42)this, false));
    private final Class44 Field10521 = this.Method23(new Class44("Alpha", (Class42)this, Double.longBitsToDouble((long)1177567271 ^ 0x406FE00046304027L), 0.0, Double.longBitsToDouble((long)981429414 ^ 0x406FE0003A7F6CA6L), true));
    private final HashMap Field10522 = new HashMap();
    @Class1801
    private final Class618 Field10523 = new Class618(this::Method2569, new Predicate[0]);
    private String Field10524 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class591() {
        super("PotionHud", "oh god", true);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10523);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10523);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2565(RenderGameOverlayEvent.Text text) {
        int n = this.Field10515.Method335() + Class1178.Method4748() + (this.Field10520.Method365() ? this.Field10515.Method335() : 0);
        int n2 = 0;
        int n3 = 0;
        List<Object> list = this.Field10517.Method365() ? Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getActivePotionEffects().stream().sorted(this.Field10519.Method365() ? this.Method2567().reversed() : this.Method2567()).collect(Collectors.toList()) : new ArrayList(Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getActivePotionEffects());
        for (PotionEffect potionEffect : list) {
            String string = I18n.format((String)potionEffect.getEffectName(), (Object[])new Object[0]) + (potionEffect.getAmplifier() > 0 ? " " + potionEffect.getAmplifier() : "") + Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f);
            n2 = Math.max(n2, Class1178.Method4741(string));
        }
        this.Method273(n2 + (this.Field10520.Method365() ? 10 : 0));
        Iterator<Object> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method274(n3 * n);
                return;
            }
            PotionEffect potionEffect = (PotionEffect)iterator.next();
            int n4 = (int)(this.Method268() + (double)(n3 * n));
            boolean bl = false;
            if (this.Field10520.Method365() && this.Field10522.containsKey(potionEffect.getEffectName())) {
                double d = (this.Method269() + Double.longBitsToDouble(0x4024000000000000L)) * ((double)((PotionEffect)((Class1621)this.Field10522.get(potionEffect.getEffectName())).Method6307()).getDuration() / (double)((Integer)((Class1621)this.Field10522.get(potionEffect.getEffectName())).Method6308()).intValue());
                Class753.drawRectWH(this.Method267(), n4 - this.Field10515.Method335(), d, this.Field10515.Method335() * 2 + Class1178.Method4748(), Class1172.Method4729(potionEffect.getPotion().getLiquidColor(), this.Field10521.Method335()).getRGB());
                bl = true;
            }
            Class1178.Method4745(this.Method2566(potionEffect), this.Method267() + 0.0, n4, potionEffect.getPotion().getLiquidColor());
            ++n3;
        }
    }

    private String Method2566(PotionEffect potionEffect) {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append(I18n.format((String)potionEffect.getEffectName(), (Object[])new Object[0]));
        if (potionEffect.getAmplifier() > 0) {
            string = " " + potionEffect.getAmplifier();
            return stringBuilder.append(string).append(TextFormatting.GRAY).append(": ").append(Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f)).toString();
        }
        string = "";
        return stringBuilder.append(string).append(TextFormatting.GRAY).append(": ").append(Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f)).toString();
    }

    private Comparator Method2567() {
        if (this.Field10518.Method359().equals("Alphabetical")) {
            return Comparator.comparing(PotionEffect::getEffectName);
        }
        if (!this.Field10518.Method359().equals("Length")) return Comparator.comparingInt(PotionEffect::getDuration);
        return Comparator.comparingInt(Class591::Method2568);
    }

    private static int Method2568(PotionEffect potionEffect) {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append(I18n.format((String)potionEffect.getEffectName(), (Object[])new Object[0]));
        if (potionEffect.getAmplifier() > 0) {
            string = " " + potionEffect.getAmplifier();
            return stringBuilder.append(string).append(Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f)).toString().length();
        }
        string = "";
        return stringBuilder.append(string).append(Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f)).toString().length();
    }

    private void Method2569(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketEntityEffect)) {
            if (!(class544.Method982() instanceof SPacketRemoveEntityEffect)) return;
            SPacketRemoveEntityEffect sPacketRemoveEntityEffect = (SPacketRemoveEntityEffect)class544.Method982();
            if (Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player != sPacketRemoveEntityEffect.getEntity((World)Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world)) return;
            this.Field10522.remove(sPacketRemoveEntityEffect.getPotion().getName());
            return;
        }
        SPacketEntityEffect sPacketEntityEffect = (SPacketEntityEffect)class544.Method982();
        if (Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.entityId != sPacketEntityEffect.getEntityId()) return;
        PotionEffect potionEffect = new PotionEffect(Potion.getPotionById((int)sPacketEntityEffect.getEffectId()), sPacketEntityEffect.getDuration(), (int)sPacketEntityEffect.getAmplifier());
        if (this.Field10522.containsKey(potionEffect.getEffectName())) {
            Class1621 class1621 = (Class1621)this.Field10522.get(potionEffect.getEffectName());
            ((PotionEffect)class1621.Method6307()).combine(potionEffect);
            this.Field10522.put(potionEffect.getEffectName(), class1621);
            return;
        }
        this.Field10522.put(potionEffect.getEffectName(), new Class1621(potionEffect, potionEffect.getDuration()));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 67;
            cArray2[n] = (char)(cArray[n] ^ (0x7F42 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

