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

import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class650;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1804;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class659;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/features/module/misc/Funny;", "Lcom/kisman/cc/features/module/Module;", "()V", "kismansDupe", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "lastKD", "", "lastSS", "pigPov", "sneakSpam", "ssDelay", "ssTimer", "Lcom/kisman/cc/util/TimerUtils;", "doKismansDupe", "", "doPigPOV", "doSneakSpam", "onDisable", "update", "kisman.cc"})
public final class Class943
extends Class42 {
    private final Class44 Field12020 = this.Method23(new Class44("Pig POV", (Class42)this, false));
    private final Class44 Field12021 = this.Method23(new Class44("Sneak Spam", (Class42)this, false));
    private final Class44 Field12022 = this.Method23(new Class44("SS Delay", (Class42)this, Double.longBitsToDouble((long)161699069 ^ 0x4059000009A354FDL), 0.0, Double.longBitsToDouble((long)1935694934 ^ 0x408F400073605C56L), Class467.Field9943).Method313(new Class659(this)));
    private final Class44 Field12023 = this.Method23(new Class44("Kismans Dupe", (Class42)this, false));
    private final Class650 Field12024 = new Class650();
    private boolean Field12025;
    private boolean Field12026;
    private String Field12027 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method39() {
        if (Class943.Method3895().player == null) return;
        if (Class943.Method3895().world == null) {
            return;
        }
        Class44 class44 = this.Field12020;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"pigPov");
        if (!class44.Method365()) return;
        EntityPlayerSP entityPlayerSP = Class943.Method3895().player;
        EntityPlayerSP entityPlayerSP2 = Class943.Method3895().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        entityPlayerSP.eyeHeight = entityPlayerSP2.getDefaultEyeHeight();
        Map map = Class943.Method3895().renderManager.entityRenderMap;
        Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderManager.entityRenderMap");
        Map map2 = map;
        Class<EntityPig> clazz = EntityPig.class;
        RenderPig renderPig = new RenderPig(Class943.Method3895().renderManager);
        boolean bl = false;
        map2.put(clazz, renderPig);
    }

    @Override
    public void Method45() {
        if (Class943.Method3895().player == null) return;
        if (Class943.Method3895().world == null) {
            return;
        }
        this.Method3894();
        this.Method3893();
    }

    private final void Method3892() {
        Class44 class44 = this.Field12023;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"kismansDupe");
        if (class44.Method365()) {
            if (!this.Field12026) {
                Class44 class442 = this.Field12023;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"kismansDupe");
                class442.Method366(false);
            }
            EntityPlayerSP entityPlayerSP = Class943.Method3895().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (entityPlayerSP.getHeldItemMainhand().isEmpty) {
                Class1393.Method5504().Method1886("You need to hold an item in hand to dupe!!!!!");
            } else {
                int n = 0;
                int n2 = Class2142.Field17804.nextInt(31) + 1;
                int n3 = n2;
                if (n <= n3) {
                    while (true) {
                        EntityPlayerSP entityPlayerSP2 = Class943.Method3895().player;
                        EntityPlayerSP entityPlayerSP3 = Class943.Method3895().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
                        EntityItem entityItem = entityPlayerSP2.dropItem(entityPlayerSP3.getHeldItemMainhand().copy(), false, true);
                        if (entityItem != null) {
                            Class943.Method3895().world.addEntityToWorld(entityItem.entityId, (Entity)entityItem);
                        }
                        if (n == n3) break;
                        ++n;
                    }
                }
                EntityPlayerSP entityPlayerSP4 = Class943.Method3895().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
                ItemStack itemStack = entityPlayerSP4.getHeldItemMainhand();
                Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemMainhand");
                n = n2 * itemStack.getCount();
                EntityPlayerSP entityPlayerSP5 = Class943.Method3895().player;
                StringBuilder stringBuilder = new StringBuilder().append("I just uses TheLavaDupe and got ").append(n).append(' ');
                EntityPlayerSP entityPlayerSP6 = Class943.Method3895().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
                ItemStack itemStack2 = entityPlayerSP6.getHeldItemMainhand();
                Intrinsics.checkExpressionValueIsNotNull((Object)itemStack2, (String)"mc.player.heldItemMainhand");
                entityPlayerSP5.sendChatMessage(stringBuilder.append(itemStack2.getDisplayName()).append(", thanks to ").append(Class1796.Method6783()).toString());
            }
            Class44 class443 = this.Field12023;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"kismansDupe");
            class443.Method366(false);
        }
        Class44 class444 = this.Field12023;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"kismansDupe");
        this.Field12026 = class444.Method365();
    }

    private final void Method3893() {
        if (!this.Field12025) {
            Class44 class44 = this.Field12021;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"sneakSpam");
            if (class44.Method365()) {
                this.Field12024.Method2801();
            }
        }
        Class44 class44 = this.Field12021;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"sneakSpam");
        if (class44.Method365()) {
            Class44 class442 = this.Field12022;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"ssDelay");
            if (this.Field12024.Method2797(class442.Method369())) {
                this.Field12024.Method2801();
                Class943.Method3895().gameSettings.keyBindSneak.pressed = !Class943.Method3895().gameSettings.keyBindSneak.pressed;
            }
        }
        Class44 class443 = this.Field12021;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"sneakSpam");
        this.Field12025 = class443.Method365();
    }

    private final void Method3894() {
        Class44 class44 = this.Field12020;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"pigPov");
        if (class44.Method365()) {
            Class943.Method3895().player.eyeHeight = Float.intBitsToFloat(1058642330);
            Map map = Class943.Method3895().renderManager.entityRenderMap;
            Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderManager.entityRenderMap");
            Map map2 = map;
            Class<EntityPig> clazz = EntityPig.class;
            Class1804 class1804 = new Class1804(Class943.Method3895().renderManager, Class943.Method3895());
            boolean bl = false;
            map2.put(clazz, class1804);
            return;
        }
        EntityPlayerSP entityPlayerSP = Class943.Method3895().player;
        EntityPlayerSP entityPlayerSP2 = Class943.Method3895().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        entityPlayerSP.eyeHeight = entityPlayerSP2.getDefaultEyeHeight();
        Map map = Class943.Method3895().renderManager.entityRenderMap;
        Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderManager.entityRenderMap");
        Map map3 = map;
        Class<EntityPig> clazz = EntityPig.class;
        RenderPig renderPig = new RenderPig(Class943.Method3895().renderManager);
        boolean bl = false;
        map3.put(clazz, renderPig);
    }

    public Class943() {
        super("Funny", "Just get fun.", Class97.Field8343);
    }

    public static final Minecraft Method3895() {
        return Class42.Field8052;
    }

    public static final void Method3896(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method3897(Class943 class943) {
        return class943.Field12021;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 105;
            cArray2[n] = (char)(cArray[n] ^ (0x1A19 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

