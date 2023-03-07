//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.entity.RenderPig
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.passive.EntityPig
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.bytZXCiYJ5pK4UOFMxsh71qJv1j843RT;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/features/module/misc/Funny;", "Lcom/kisman/cc/features/module/Module;", "()V", "kismansDupe", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "lastKD", "", "lastSS", "pigPov", "sneakSpam", "ssDelay", "ssTimer", "Lcom/kisman/cc/util/TimerUtils;", "doKismansDupe", "", "doPigPOV", "doSneakSpam", "onDisable", "update", "kisman.cc"})
public final class lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12020 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Pig POV", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)967649547L ^ 0x39AD290B) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12021 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sneak Spam", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-912074526L ^ 0xC9A2D8E2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12022 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SS Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)161699069 ^ 0x4059000009A354FDL), 0.0, Double.longBitsToDouble((long)1935694934 ^ 0x408F400073605C56L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method313(new lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12023 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Kismans Dupe", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1609379793L ^ 0x5FED2FD1) != 0));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12024 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private boolean Field12025;
    private boolean Field12026;
    private String Field12027 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method39() {
        if (lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player == null) return;
        if (lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().world == null) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12020;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"pigPov");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        EntityPlayerSP entityPlayerSP = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
        EntityPlayerSP entityPlayerSP2 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        entityPlayerSP.eyeHeight = entityPlayerSP2.getDefaultEyeHeight();
        Map map = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().renderManager.entityRenderMap;
        Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderManager.entityRenderMap");
        Map map2 = map;
        Class<EntityPig> clazz = EntityPig.class;
        RenderPig renderPig = new RenderPig(lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().renderManager);
        int n = (int)-1360209470L ^ 0xAEECD9C2;
        map2.put(clazz, renderPig);
    }

    @Override
    public void Method45() {
        if (lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player == null) return;
        if (lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().world == null) {
            return;
        }
        this.Method3894();
        this.Method3893();
    }

    private final void Method3892() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12023;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"kismansDupe");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            if (!this.Field12026) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12023;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"kismansDupe");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method366(((int)-368935350L ^ 0xEA027E4A) != 0);
            }
            EntityPlayerSP entityPlayerSP = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (entityPlayerSP.getHeldItemMainhand().isEmpty) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("You need to hold an item in hand to dupe!!!!!");
            } else {
                int n = (int)((long)1887701202 ^ (long)1887701202);
                int n2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17804.nextInt((int)-1942743686L ^ 0x8C341565) + (int)((long)-2020262210 ^ (long)-2020262209);
                int n3 = n2;
                if (n <= n3) {
                    while (true) {
                        EntityPlayerSP entityPlayerSP2 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
                        EntityPlayerSP entityPlayerSP3 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
                        EntityItem entityItem = entityPlayerSP2.dropItem(entityPlayerSP3.getHeldItemMainhand().copy(), (boolean)((long)-567435130 ^ (long)-567435130), ((int)1227968391L ^ 0x49314F86) != 0);
                        if (entityItem != null) {
                            lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().world.addEntityToWorld(entityItem.entityId, (Entity)entityItem);
                        }
                        if (n == n3) break;
                        ++n;
                    }
                }
                EntityPlayerSP entityPlayerSP4 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
                ItemStack itemStack = entityPlayerSP4.getHeldItemMainhand();
                Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemMainhand");
                n = n2 * itemStack.getCount();
                EntityPlayerSP entityPlayerSP5 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
                StringBuilder stringBuilder = new StringBuilder().append("I just uses TheLavaDupe and got ").append(n).append((int)((long)-1888184872 ^ (long)-1888184871) << 5);
                EntityPlayerSP entityPlayerSP6 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
                ItemStack itemStack2 = entityPlayerSP6.getHeldItemMainhand();
                Intrinsics.checkExpressionValueIsNotNull((Object)itemStack2, (String)"mc.player.heldItemMainhand");
                entityPlayerSP5.sendChatMessage(stringBuilder.append(itemStack2.getDisplayName()).append(", thanks to ").append(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783()).toString());
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field12023;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"kismansDupe");
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method366(((int)-831523278L ^ 0xCE6FF632) != 0);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field12023;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"kismansDupe");
        this.Field12026 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365();
    }

    private final void Method3893() {
        if (!this.Field12025) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12021;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"sneakSpam");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                this.Field12024.Method2801();
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12021;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"sneakSpam");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field12022;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"ssDelay");
            if (this.Field12024.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method369())) {
                this.Field12024.Method2801();
                lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().gameSettings.keyBindSneak.pressed = !lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().gameSettings.keyBindSneak.pressed ? (int)((long)779323860 ^ (long)779323861) : (int)((long)243841579 ^ (long)243841579);
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field12021;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"sneakSpam");
        this.Field12025 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365();
    }

    private final void Method3894() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12020;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"pigPov");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player.eyeHeight = Float.intBitsToFloat(0x6698D2D0 ^ 0x59814B4A);
            Map map = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().renderManager.entityRenderMap;
            Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderManager.entityRenderMap");
            Map map2 = map;
            Class<EntityPig> clazz = EntityPig.class;
            bytZXCiYJ5pK4UOFMxsh71qJv1j843RT bytZXCiYJ5pK4UOFMxsh71qJv1j843RT2 = new bytZXCiYJ5pK4UOFMxsh71qJv1j843RT(lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().renderManager, lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895());
            int n = (int)-991006724L ^ 0xC4EE6FFC;
            map2.put(clazz, bytZXCiYJ5pK4UOFMxsh71qJv1j843RT2);
            return;
        }
        EntityPlayerSP entityPlayerSP = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
        EntityPlayerSP entityPlayerSP2 = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        entityPlayerSP.eyeHeight = entityPlayerSP2.getDefaultEyeHeight();
        Map map = lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().renderManager.entityRenderMap;
        Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderManager.entityRenderMap");
        Map map3 = map;
        Class<EntityPig> clazz = EntityPig.class;
        RenderPig renderPig = new RenderPig(lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA.Method3895().renderManager);
        int n = (int)((long)-1567119117 ^ (long)-1567119117);
        map3.put(clazz, renderPig);
    }

    public lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA() {
        super("Funny", "Just get fun.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    public static final Minecraft Method3895() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method3896(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3897(lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA2) {
        return lt1n9hCqKPOwPDQGs0qalEb9Hc2hlXsA2.Field12021;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)210164758L ^ 0xC86DC16;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-363207169L ^ 0xEA59E500);
            int n2 = (int)-887642014L ^ 0xCB17A80B;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)273196789 ^ (long)273202412) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

