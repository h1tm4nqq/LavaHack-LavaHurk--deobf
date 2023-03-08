//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.passive.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.entity.*;
import java.util.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.item.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/features/module/misc/Funny;", "Lcom/kisman/cc/features/module/Module;", "()V", "kismansDupe", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "lastKD", "", "lastSS", "pigPov", "sneakSpam", "ssDelay", "ssTimer", "Lcom/kisman/cc/util/TimerUtils;", "doKismansDupe", "", "doPigPOV", "doSneakSpam", "onDisable", "update", "kisman.cc" })
public final class Class943 extends Class42
{
    private final Class44 Field12020;
    private final Class44 Field12021;
    private final Class44 Field12022;
    private final Class44 Field12023;
    private final Class650 Field12024;
    private boolean Field12025;
    private boolean Field12026;
    private String Field12027 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method39() {
        if (Method3895().player == null || Method3895().world == null) {
            return;
        }
        final Class44 field12020 = this.Field12020;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12020, "pigPov");
        if (field12020.Method365()) {
            final EntityPlayerSP player = Method3895().player;
            final EntityPlayerSP player2 = Method3895().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            player.eyeHeight = player2.getDefaultEyeHeight();
            final Map entityRenderMap = Method3895().renderManager.entityRenderMap;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityRenderMap, "mc.renderManager.entityRenderMap");
            entityRenderMap.put(EntityPig.class, new RenderPig(Method3895().renderManager));
        }
    }
    
    public void Method45() {
        if (Method3895().player == null || Method3895().world == null) {
            return;
        }
        this.Method3894();
        this.Method3893();
    }
    
    private final void Method3892() {
        final Class44 field12023 = this.Field12023;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12023, "kismansDupe");
        if (field12023.Method365()) {
            if (!this.Field12026) {
                final Class44 field12024 = this.Field12023;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12024, "kismansDupe");
                field12024.Method366(false);
            }
            final EntityPlayerSP player = Method3895().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (player.getHeldItemMainhand().isEmpty) {
                Class1393.Method5504().Method1886("You need to hold an item in hand to dupe!!!!!");
            }
            else {
                final int n = Class2142.Field17804.nextInt(31) + 1;
                int n2 = 0;
                final int n3 = n;
                if (n2 <= n3) {
                    while (true) {
                        final EntityPlayerSP player2 = Method3895().player;
                        final EntityPlayerSP player3 = Method3895().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                        final EntityItem dropItem = player2.dropItem(player3.getHeldItemMainhand().copy(), false, true);
                        if (dropItem != null) {
                            Method3895().world.addEntityToWorld(dropItem.entityId, (Entity)dropItem);
                        }
                        if (n2 == n3) {
                            break;
                        }
                        ++n2;
                    }
                }
                final int n4 = n;
                final EntityPlayerSP player4 = Method3895().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                final ItemStack getHeldItemMainhand = player4.getHeldItemMainhand();
                Intrinsics.checkExpressionValueIsNotNull((Object)getHeldItemMainhand, "mc.player.heldItemMainhand");
                final int i = n4 * getHeldItemMainhand.getCount();
                final EntityPlayerSP player5 = Method3895().player;
                final StringBuilder append = new StringBuilder().append("I just uses TheLavaDupe and got ").append(i).append(' ');
                final EntityPlayerSP player6 = Method3895().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player6, "mc.player");
                final ItemStack getHeldItemMainhand2 = player6.getHeldItemMainhand();
                Intrinsics.checkExpressionValueIsNotNull((Object)getHeldItemMainhand2, "mc.player.heldItemMainhand");
                player5.sendChatMessage(append.append(getHeldItemMainhand2.getDisplayName()).append(", thanks to ").append(Class1796.Method6783()).toString());
            }
            final Class44 field12025 = this.Field12023;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12025, "kismansDupe");
            field12025.Method366(false);
        }
        final Class44 field12026 = this.Field12023;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12026, "kismansDupe");
        this.Field12026 = field12026.Method365();
    }
    
    private final void Method3893() {
        if (!this.Field12025) {
            final Class44 field12021 = this.Field12021;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12021, "sneakSpam");
            if (field12021.Method365()) {
                this.Field12024.Method2801();
            }
        }
        final Class44 field12022 = this.Field12021;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12022, "sneakSpam");
        if (field12022.Method365()) {
            final Class650 field12023 = this.Field12024;
            final Class44 field12024 = this.Field12022;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12024, "ssDelay");
            if (field12023.Method2797(field12024.Method369())) {
                this.Field12024.Method2801();
                Method3895().gameSettings.keyBindSneak.pressed = !Method3895().gameSettings.keyBindSneak.pressed;
            }
        }
        final Class44 field12025 = this.Field12021;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12025, "sneakSpam");
        this.Field12025 = field12025.Method365();
    }
    
    private final void Method3894() {
        final Class44 field12020 = this.Field12020;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12020, "pigPov");
        if (field12020.Method365()) {
            Method3895().player.eyeHeight = Float.intBitsToFloat(1058642330);
            final Map entityRenderMap = Method3895().renderManager.entityRenderMap;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityRenderMap, "mc.renderManager.entityRenderMap");
            entityRenderMap.put(EntityPig.class, new Class1804(Method3895().renderManager, Method3895()));
        }
        else {
            final EntityPlayerSP player = Method3895().player;
            final EntityPlayerSP player2 = Method3895().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            player.eyeHeight = player2.getDefaultEyeHeight();
            final Map entityRenderMap2 = Method3895().renderManager.entityRenderMap;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityRenderMap2, "mc.renderManager.entityRenderMap");
            entityRenderMap2.put(EntityPig.class, new RenderPig(Method3895().renderManager));
        }
    }
    
    public Class943() {
        super("Funny", "Just get fun.", Class97.Field8343);
        this.Field12020 = this.Method23(new Class44("Pig POV", (Class42)this, false));
        this.Field12021 = this.Method23(new Class44("Sneak Spam", (Class42)this, false));
        this.Field12022 = this.Method23(new Class44("SS Delay", (Class42)this, Double.longBitsToDouble((long)161699069 ^ 0x4059000009A354FDL), 0.0, Double.longBitsToDouble((long)1935694934 ^ 0x408F400073605C56L), Class467.Field9943).Method313((Supplier)new Class659(this)));
        this.Field12023 = this.Method23(new Class44("Kismans Dupe", (Class42)this, false));
        this.Field12024 = new Class650();
    }
    
    public static final Minecraft Method3895() {
        return Class42.Field8052;
    }
    
    public static final void Method3896(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method3897(final Class943 class943) {
        return class943.Field12021;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1A19 ^ 0x69));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
