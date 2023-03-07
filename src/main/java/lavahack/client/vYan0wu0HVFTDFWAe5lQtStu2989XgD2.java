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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.resources.I18n;
import net.minecraft.network.play.server.SPacketEntityEffect;
import net.minecraft.network.play.server.SPacketRemoveEntityEffect;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class vYan0wu0HVFTDFWAe5lQtStu2989XgD2
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10515 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x7F89404950E71C44L ^ 0x3F89404950E71C44L), 0.0, Double.longBitsToDouble(0x417E60226BAD7F03L ^ 0x15A60226BAD7F03L), (boolean)((long)930469444 ^ (long)930469445)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field10516 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sort", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10517 = this.Method23(this.Field10516.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sort", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1670521284 ^ (long)-1670521283))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10518;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10519;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10520;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10521;
    private final HashMap Field10522;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10523;
    private String Field10524 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public vYan0wu0HVFTDFWAe5lQtStu2989XgD2() {
        super("PotionHud", "oh god", (boolean)((long)2071556048 ^ (long)2071556049));
        String[] stringArray = new String[(int)((long)-425444304 ^ (long)-425444301)];
        stringArray[(int)2009389363L ^ 0x77C4D933] = "Alphabet";
        stringArray[(int)1946562093L ^ 0x74062E2C] = "Length";
        stringArray[(int)((long)-1857921837 ^ (long)-1857921838) << 1] = "Duration";
        this.Field10518 = this.Method23(this.Field10516.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sort Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Alphabet", Arrays.asList(stringArray)).Method312(this.Field10517).Method355("Mode")));
        this.Field10519 = this.Method23(this.Field10516.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sort Reverse", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)207532947L ^ 0xC5EB393) != 0).Method312(this.Field10517).Method355("Reverse")));
        this.Field10520 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sliders", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2103879966L ^ 0x829956E2) != 0));
        this.Field10521 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1177567271 ^ 0x406FE00046304027L), 0.0, Double.longBitsToDouble((long)981429414 ^ 0x406FE0003A7F6CA6L), (boolean)((long)493727198 ^ (long)493727199)));
        this.Field10522 = new HashMap();
        this.Field10523 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2569, new Predicate[(int)153298566L ^ 0x9232686]);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10523);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10523);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2565(RenderGameOverlayEvent.Text text) {
        int n = this.Field10515.Method335() + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + (this.Field10520.Method365() ? this.Field10515.Method335() : (int)((long)-981208989 ^ (long)-981208989));
        int n2 = (int)25614257L ^ 0x186D7B1;
        int n3 = (int)((long)-812885526 ^ (long)-812885526);
        List<Object> list = this.Field10517.Method365() ? vYan0wu0HVFTDFWAe5lQtStu2989XgD2.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getActivePotionEffects().stream().sorted(this.Field10519.Method365() ? this.Method2567().reversed() : this.Method2567()).collect(Collectors.toList()) : new ArrayList(vYan0wu0HVFTDFWAe5lQtStu2989XgD2.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getActivePotionEffects());
        for (PotionEffect potionEffect : list) {
            String string = I18n.format((String)potionEffect.getEffectName(), (Object[])new Object[(int)((long)-930758369 ^ (long)-930758369)]) + (potionEffect.getAmplifier() > 0 ? " " + potionEffect.getAmplifier() : "") + Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f);
            n2 = Math.max(n2, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string));
        }
        this.Method273(n2 + (this.Field10520.Method365() ? (int)((long)2084731004 ^ (long)2084731001) << 1 : (int)((long)-988242632 ^ (long)-988242632)));
        Iterator<Object> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method274(n3 * n);
                return;
            }
            PotionEffect potionEffect = (PotionEffect)iterator.next();
            int n4 = (int)(this.Method268() + (double)(n3 * n));
            int n5 = (int)1231607529L ^ 0x4968D6E9;
            if (this.Field10520.Method365() && this.Field10522.containsKey(potionEffect.getEffectName())) {
                double d = (this.Method269() + Double.longBitsToDouble(0x27F3DD2C49908F27L ^ 0x67D7DD2C49908F27L)) * ((double)((PotionEffect)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)this.Field10522.get(potionEffect.getEffectName())).Method6307()).getDuration() / (double)((Integer)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)this.Field10522.get(potionEffect.getEffectName())).Method6308()).intValue());
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(this.Method267(), n4 - this.Field10515.Method335(), d, this.Field10515.Method335() * (((int)1948859966L ^ 0x74293E3F) << 1) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748(), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(potionEffect.getPotion().getLiquidColor(), this.Field10521.Method335()).getRGB());
                n5 = (int)((long)763950543 ^ (long)763950542);
            }
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(this.Method2566(potionEffect), this.Method267() + (double)((int)((long)127329779 ^ (long)127329779)), n4, potionEffect.getPotion().getLiquidColor());
            ++n3;
        }
    }

    private String Method2566(PotionEffect potionEffect) {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append(I18n.format((String)potionEffect.getEffectName(), (Object[])new Object[(int)((long)-256442880 ^ (long)-256442880)]));
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
        return Comparator.comparingInt(vYan0wu0HVFTDFWAe5lQtStu2989XgD2::Method2568);
    }

    private static int Method2568(PotionEffect potionEffect) {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append(I18n.format((String)potionEffect.getEffectName(), (Object[])new Object[(int)-1958022805L ^ 0x8B4AF16B]));
        if (potionEffect.getAmplifier() > 0) {
            string = " " + potionEffect.getAmplifier();
            return stringBuilder.append(string).append(Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f)).toString().length();
        }
        string = "";
        return stringBuilder.append(string).append(Potion.getPotionDurationString((PotionEffect)potionEffect, (float)1.0f)).toString().length();
    }

    private void Method2569(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEntityEffect)) {
            if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketRemoveEntityEffect)) return;
            SPacketRemoveEntityEffect sPacketRemoveEntityEffect = (SPacketRemoveEntityEffect)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
            if (vYan0wu0HVFTDFWAe5lQtStu2989XgD2.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player != sPacketRemoveEntityEffect.getEntity((World)vYan0wu0HVFTDFWAe5lQtStu2989XgD2.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world)) return;
            this.Field10522.remove(sPacketRemoveEntityEffect.getPotion().getName());
            return;
        }
        SPacketEntityEffect sPacketEntityEffect = (SPacketEntityEffect)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (vYan0wu0HVFTDFWAe5lQtStu2989XgD2.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.entityId != sPacketEntityEffect.getEntityId()) return;
        PotionEffect potionEffect = new PotionEffect(Potion.getPotionById((int)sPacketEntityEffect.getEffectId()), sPacketEntityEffect.getDuration(), (int)sPacketEntityEffect.getAmplifier());
        if (this.Field10522.containsKey(potionEffect.getEffectName())) {
            SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = (SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)this.Field10522.get(potionEffect.getEffectName());
            ((PotionEffect)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).combine(potionEffect);
            this.Field10522.put(potionEffect.getEffectName(), smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr);
            return;
        }
        this.Field10522.put(potionEffect.getEffectName(), new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(potionEffect, potionEffect.getDuration()));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)524056544L ^ 0x1F3C77E0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1065723156 ^ (long)-1065723373);
            int n2 = (int)((long)1767304994 ^ (long)1767305057);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2144319205 ^ (long)2144307524) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

