//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class115;
import lavahack.client.Class1703;
import lavahack.client.Class1917;
import lavahack.client.Class1989;
import lavahack.client.Class394;
import lavahack.client.Class44;
import lavahack.client.Class961;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$3", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "boost", "", "getBoost", "()Z", "setBoost", "(Z)V", "distance", "", "getDistance", "()D", "setDistance", "(D)V", "speed", "getSpeed", "setSpeed", "stage", "", "getStage", "()I", "setStage", "(I)V", "onEnable", "", "update", "kisman.cc"})
public final class Class1714
implements Class1703 {
    private int Field15909 = 4;
    private double Field15910;
    private double Field15911;
    private boolean Field15912;
    private int Field15913;

    public final int Method6560() {
        return this.Field15909;
    }

    public final void Method6561(int n) {
        this.Field15909 = n;
    }

    public final double Method6562() {
        return this.Field15910;
    }

    public final void Method6563(double d) {
        this.Field15910 = d;
    }

    public final double Method6564() {
        return this.Field15911;
    }

    public final void Method6565(double d) {
        this.Field15911 = d;
    }

    public final boolean Method6566() {
        return this.Field15912;
    }

    public final void Method6567(boolean bl) {
        this.Field15912 = bl;
    }

    @Override
    public void Method6529() {
        this.Field15909 = 4;
        this.Field15911 = Class1917.Method7157();
        this.Field15910 = Class1917.Method7153();
    }

    @Override
    public void Method6530() {
        double d;
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isElytraFlying()) return;
        Class44 class44 = Class1989.Field17152.Method7376();
        if (class44 == null) {
            Intrinsics.throwNpe();
        }
        if (class44.Method365() && Class115.Field8400.Method837(250)) {
            Class394.Method1952(Float.intBitsToFloat(1066098124));
        }
        Class44 class442 = Class1989.Field17152.Method7383();
        if (class442 == null) {
            Intrinsics.throwNpe();
        }
        if (!Class115.Field8400.Method837(class442.Method335())) {
            return;
        }
        switch (this.Field15909) {
            case 1: {
                if (!Class1917.Method7159()) break;
                double d2 = Double.longBitsToDouble(4608758678669597082L);
                Class44 class443 = Class1989.Field17152.Method7380();
                if (class443 == null) {
                    Intrinsics.throwNpe();
                }
                boolean bl = class443.Method365();
                Class44 class444 = Class1989.Field17152.Method7379();
                if (class444 == null) {
                    Intrinsics.throwNpe();
                }
                this.Field15910 = d2 * Class1917.Method7154(bl, class444.Method367()) - Double.longBitsToDouble(4576918229304087675L);
                break;
            }
            case 2: {
                if (!Class1917.Method7159() || !Class2142.Field17803.player.onGround) break;
                Class2142.Field17803.player.motionY = Double.longBitsToDouble((long)433985284 ^ 0x3FD997F632B4F0D1L) + Class1917.Method7155();
                this.Field15910 *= this.Field15912 ? Double.longBitsToDouble((long)555842640 ^ 0x3FFAEF9D930C7206L) : Double.longBitsToDouble((long)19448368 ^ 0x3FF651EB84367A62L);
                break;
            }
            case 3: {
                double d3 = Double.longBitsToDouble(4604119971053405471L);
                Class44 class445 = Class1989.Field17152.Method7380();
                if (class445 == null) {
                    Intrinsics.throwNpe();
                }
                boolean bl = class445.Method365();
                Class44 class446 = Class1989.Field17152.Method7379();
                if (class446 == null) {
                    Intrinsics.throwNpe();
                }
                this.Field15910 = this.Field15911 - d3 * (this.Field15911 - Class1917.Method7154(bl, class446.Method367()));
                this.Field15912 = !this.Field15912;
                break;
            }
            default: {
                WorldClient worldClient = Class2142.Field17803.world;
                EntityPlayerSP entityPlayerSP2 = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
                if ((worldClient.getCollisionBoxes(null, entityPlayerSP2.getEntityBoundingBox().offset(0.0, Class2142.Field17803.player.motionY, 0.0)).size() > 0 || Class2142.Field17803.player.collidedHorizontally) && this.Field15909 > 0) {
                    this.Field15909 = Class1917.Method7159() ? 1 : 0;
                }
                this.Field15910 = this.Field15911 - this.Field15911 / (double)159;
            }
        }
        double d4 = this.Field15910;
        double d5 = Class961.Field12102.Method6679();
        Class1714 class1714 = this;
        boolean bl = false;
        class1714.Field15910 = d = Math.min(d4, d5);
        d4 = this.Field15910;
        Class44 class447 = Class1989.Field17152.Method7380();
        if (class447 == null) {
            Intrinsics.throwNpe();
        }
        boolean bl2 = class447.Method365();
        Class44 class448 = Class1989.Field17152.Method7379();
        if (class448 == null) {
            Intrinsics.throwNpe();
        }
        d5 = Class1917.Method7154(bl2, class448.Method367());
        class1714 = this;
        bl = false;
        class1714.Field15910 = d = Math.max(d4, d5);
        Class1917.Method7158((float)this.Field15910);
        if (!Class1917.Method7159()) return;
        int n = this.Field15909;
        this.Field15909 = n + 1;
    }

    Class1714() {
    }

    private static String Method6568(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 176;
            cArray2[n] = (char)(cArray[n] ^ (0xCEA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

