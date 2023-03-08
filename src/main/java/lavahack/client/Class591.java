//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import java.util.stream.*;
import net.minecraft.client.resources.*;
import net.minecraft.potion.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.text.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.world.*;

public class Class591 extends Class1249
{
    private final Class44 Field10515;
    private final Class1996 Field10516;
    private final Class44 Field10517;
    private final Class44 Field10518;
    private final Class44 Field10519;
    private final Class44 Field10520;
    private final Class44 Field10521;
    private final HashMap Field10522;
    @Class1801
    private final Class618 Field10523;
    private String Field10524 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class591() {
        super("PotionHud", "oh god", true);
        this.Field10515 = this.Method23(new Class44("Offsets", (Class42)this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble(4621819117588971520L), true));
        this.Field10516 = this.Method24(new Class1996(new Class44("Sort", (Class42)this)));
        this.Field10517 = this.Method23(this.Field10516.Method7405(new Class44("Sort", (Class42)this, true)));
        this.Field10518 = this.Method23(this.Field10516.Method7405(new Class44("Sort Mode", (Class42)this, "Alphabet", (List)Arrays.asList("Alphabet", "Length", "Duration")).Method312(this.Field10517).Method355("Mode")));
        this.Field10519 = this.Method23(this.Field10516.Method7405(new Class44("Sort Reverse", (Class42)this, false).Method312(this.Field10517).Method355("Reverse")));
        this.Field10520 = this.Method23(new Class44("Sliders", (Class42)this, false));
        this.Field10521 = this.Method23(new Class44("Alpha", (Class42)this, Double.longBitsToDouble((long)1177567271 ^ 0x406FE00046304027L), 0.0, Double.longBitsToDouble((long)981429414 ^ 0x406FE0003A7F6CA6L), true));
        this.Field10522 = new HashMap();
        this.Field10523 = new Class618(this::Method2569, new Predicate[0]);
    }
    
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10523);
    }
    
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10523);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2565(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final int n = this.Field10515.Method335() + Class1178.Method4748() + (this.Field10520.Method365() ? this.Field10515.Method335() : 0);
        int max = 0;
        int n2 = 0;
        Object o;
        if (this.Field10517.Method365()) {
            o = Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getActivePotionEffects().stream().sorted(this.Field10519.Method365() ? this.Method2567().reversed() : this.Method2567()).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
        }
        else {
            o = new ArrayList<PotionEffect>(Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getActivePotionEffects());
        }
        for (final PotionEffect potionEffect : o) {
            max = Math.max(max, Class1178.Method4741(I18n.format(potionEffect.getEffectName(), new Object[0]) + ((potionEffect.getAmplifier() > 0) ? (" " + potionEffect.getAmplifier()) : "") + Potion.getPotionDurationString(potionEffect, 1.0f)));
        }
        this.Method273((double)(max + (this.Field10520.Method365() ? 10 : 0)));
        for (final PotionEffect potionEffect2 : o) {
            final int n3 = (int)(this.Method268() + n2 * n);
            if (this.Field10520.Method365() && this.Field10522.containsKey(potionEffect2.getEffectName())) {
                Class753.drawRectWH(this.Method267(), n3 - this.Field10515.Method335(), (this.Method269() + Double.longBitsToDouble(4621819117588971520L)) * (((PotionEffect)this.Field10522.get(potionEffect2.getEffectName()).Method6307()).getDuration() / (double)(int)this.Field10522.get(potionEffect2.getEffectName()).Method6308()), this.Field10515.Method335() * 2 + Class1178.Method4748(), Class1172.Method4729(potionEffect2.getPotion().getLiquidColor(), this.Field10521.Method335()).getRGB());
            }
            Class1178.Method4745(this.Method2566(potionEffect2), this.Method267() + 0, (double)n3, potionEffect2.getPotion().getLiquidColor());
            ++n2;
        }
        this.Method274((double)(n2 * n));
    }
    
    private String Method2566(final PotionEffect potionEffect) {
        return I18n.format(potionEffect.getEffectName(), new Object[0]) + ((potionEffect.getAmplifier() > 0) ? (" " + potionEffect.getAmplifier()) : "") + TextFormatting.GRAY + ": " + Potion.getPotionDurationString(potionEffect, 1.0f);
    }
    
    private Comparator Method2567() {
        if (this.Field10518.Method359().equals("Alphabetical")) {
            return Comparator.comparing((Function<? super Object, ? extends Comparable>)PotionEffect::getEffectName);
        }
        if (this.Field10518.Method359().equals("Length")) {
            return Comparator.comparingInt((ToIntFunction<? super Object>)Class591::Method2568);
        }
        return Comparator.comparingInt(PotionEffect::getDuration);
    }
    
    private static int Method2568(final PotionEffect potionEffect) {
        return (I18n.format(potionEffect.getEffectName(), new Object[0]) + ((potionEffect.getAmplifier() > 0) ? (" " + potionEffect.getAmplifier()) : "") + Potion.getPotionDurationString(potionEffect, 1.0f)).length();
    }
    
    private void Method2569(final Class544 class544) {
        if (class544.Method982() instanceof SPacketEntityEffect) {
            final SPacketEntityEffect sPacketEntityEffect = (SPacketEntityEffect)class544.Method982();
            if (Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.entityId == sPacketEntityEffect.getEntityId()) {
                final PotionEffect potionEffect = new PotionEffect(Potion.getPotionById((int)sPacketEntityEffect.getEffectId()), sPacketEntityEffect.getDuration(), (int)sPacketEntityEffect.getAmplifier());
                if (this.Field10522.containsKey(potionEffect.getEffectName())) {
                    final Class1621 value = this.Field10522.get(potionEffect.getEffectName());
                    ((PotionEffect)value.Method6307()).combine(potionEffect);
                    this.Field10522.put(potionEffect.getEffectName(), value);
                }
                else {
                    this.Field10522.put(potionEffect.getEffectName(), new Class1621((Object)potionEffect, (Object)potionEffect.getDuration()));
                }
            }
        }
        else if (class544.Method982() instanceof SPacketRemoveEntityEffect) {
            final SPacketRemoveEntityEffect sPacketRemoveEntityEffect = (SPacketRemoveEntityEffect)class544.Method982();
            if (Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player == sPacketRemoveEntityEffect.getEntity((World)Class591.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world)) {
                this.Field10522.remove(sPacketRemoveEntityEffect.getPotion().getName());
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7F42 ^ 0x43));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
