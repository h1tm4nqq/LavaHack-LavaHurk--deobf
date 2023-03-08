//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.text.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1945 implements Runnable
{
    final Class295 Field16993;
    private int Field16994;
    
    @Override
    public final void run() {
        final ArrayList<String> list = new ArrayList<String>();
        int n = 0;
        final List playerEntities = Class295.Method1548().world.playerEntities;
        Intrinsics.checkExpressionValueIsNotNull((Object)playerEntities, "mc.world.playerEntities");
        for (final EntityPlayer entityPlayer : (List<EntityPlayer>)playerEntities) {
            if (Intrinsics.areEqual((Object)entityPlayer, (Object)Class295.Method1548().player) ^ true) {
                final float getDistance = Class295.Method1548().player.getDistance((Entity)entityPlayer);
                final double n2 = getDistance;
                final Class44 method1550 = Class295.Method1550(this.Field16993);
                Intrinsics.checkExpressionValueIsNotNull((Object)method1550, "range");
                if (n2 <= method1550.Method367()) {
                    final Class44 method1551 = Class295.Method1551(this.Field16993);
                    Intrinsics.checkExpressionValueIsNotNull((Object)method1551, "limit");
                    if (method1551.Method335() > n) {
                        final ArrayList<String> list2 = list;
                        final StringBuilder sb = new StringBuilder();
                        final EntityPlayer entityPlayer2 = entityPlayer;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayer2, "player");
                        final StringBuilder append = sb.append((int)(entityPlayer2.getHealth() + entityPlayer.absorptionAmount)).append(' ');
                        Object obj = null;
                        Label_0238: {
                            if (Class726.Field11086.Method3042(entityPlayer)) {
                                final Class44 method1552 = Class295.Method1552(this.Field16993);
                                Intrinsics.checkExpressionValueIsNotNull((Object)method1552, "friendHighlight");
                                if (method1552.Method365()) {
                                    obj = TextFormatting.AQUA;
                                    break Label_0238;
                                }
                            }
                            if (Class1696.Field15860.Method6506(entityPlayer)) {
                                final Class44 method1553 = Class295.Method1553(this.Field16993);
                                Intrinsics.checkExpressionValueIsNotNull((Object)method1553, "targetHighlight");
                                if (method1553.Method365()) {
                                    obj = TextFormatting.RED;
                                    break Label_0238;
                                }
                            }
                            obj = "";
                        }
                        list2.add(append.append(obj).append(' ').append(entityPlayer.getName()).append(TextFormatting.RESET).append(' ').append((int)getDistance).toString());
                    }
                }
            }
            ++n;
        }
        Class295.Method1548().addScheduledTask((Runnable)new Class1107(this, (List)list));
    }
    
    Class1945(final Class295 field16993) {
        this.Field16993 = field16993;
    }
    
    private static String Method7228(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4CF ^ 0x2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
