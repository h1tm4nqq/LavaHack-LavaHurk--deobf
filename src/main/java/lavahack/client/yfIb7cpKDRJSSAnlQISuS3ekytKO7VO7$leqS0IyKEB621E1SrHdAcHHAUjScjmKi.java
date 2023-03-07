//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7;
import lavahack.client.yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 Field16993;
    private int Field16994;

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        var2_1 = (int)((long)2117788642 ^ (long)2117788642);
        var1_2 = new ArrayList<E>();
        var2_1 = (int)((long)-166443994 ^ (long)-166443994);
        v0 = yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1548().world.playerEntities;
        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mc.world.playerEntities");
        var4_3 = ((Iterable)v0).iterator();
        while (true) {
            block4: {
                block6: {
                    block5: {
                        if (!var4_3.hasNext()) {
                            yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1548().addScheduledTask((Runnable)new yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1(this, var1_2));
                            return;
                        }
                        var3_4 = (EntityPlayer)var4_3.next();
                        if ((Intrinsics.areEqual((Object)var3_4, (Object)yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1548().player) ^ (int)((long)-988150960 ^ (long)-988150959)) == 0) break block4;
                        var5_5 = yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1548().player.getDistance((Entity)var3_4);
                        v1 = var5_5;
                        v2 = yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1550(this.Field16993);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"range");
                        if (!(v1 <= v2.Method367())) break block4;
                        v3 = yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1551(this.Field16993);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"limit");
                        if (v3.Method335() <= var2_1) break block4;
                        v4 = new StringBuilder();
                        v5 = var3_4;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"player");
                        v6 = v4.append((int)(v5.getHealth() + var3_4.absorptionAmount)).append((int)((long)-733156242 ^ (long)-733156241) << 5);
                        if (!n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3042(var3_4)) break block5;
                        v7 = yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1552(this.Field16993);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"friendHighlight");
                        if (!v7.Method365()) break block5;
                        v8 = TextFormatting.AQUA;
                        break block6;
                    }
                    if (!lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K.Field15860.Method6506(var3_4)) ** GOTO lbl-1000
                    v9 = yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7.Method1553(this.Field16993);
                    Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"targetHighlight");
                    if (v9.Method365()) {
                        v8 = TextFormatting.RED;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v8 = "";
                    }
                }
                var1_2.add(v6.append((Object)v8).append(((int)1602406418L ^ 1602406419) << 5).append(var3_4.getName()).append(TextFormatting.RESET).append(((int)1074697075L ^ 1074697074) << 5).append((int)var5_5).toString());
            }
            ++var2_1;
        }
    }

    yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(yfIb7cpKDRJSSAnlQISuS3ekytKO7VO7 yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72) {
        this.Field16993 = yfIb7cpKDRJSSAnlQISuS3ekytKO7VO72;
    }

    private static String Method7228(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-297675755 ^ (long)-297675755);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-840301470 ^ (long)-840301411);
            int n2 = ((int)-1210447196L ^ 0xB7DA0AA5) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-807398770L ^ 0xCFE01641 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

