//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016?\u0006\u001a" }, d2 = { "com/kisman/cc/features/module/movement/speed/SpeedModes$3", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "boost", "", "getBoost", "()Z", "setBoost", "(Z)V", "distance", "", "getDistance", "()D", "setDistance", "(D)V", "speed", "getSpeed", "setSpeed", "stage", "", "getStage", "()I", "setStage", "(I)V", "onEnable", "", "update", "kisman.cc" })
public final class Class1714 implements Class1703
{
    private int Field15909;
    private double Field15910;
    private double Field15911;
    private boolean Field15912;
    private int Field15913;
    
    public final int Method6560() {
        return this.Field15909;
    }
    
    public final void Method6561(final int field15909) {
        this.Field15909 = field15909;
    }
    
    public final double Method6562() {
        return this.Field15910;
    }
    
    public final void Method6563(final double field15910) {
        this.Field15910 = field15910;
    }
    
    public final double Method6564() {
        return this.Field15911;
    }
    
    public final void Method6565(final double field15911) {
        this.Field15911 = field15911;
    }
    
    public final boolean Method6566() {
        return this.Field15912;
    }
    
    public final void Method6567(final boolean field15912) {
        this.Field15912 = field15912;
    }
    
    public void Method6529() {
        this.Field15909 = 4;
        this.Field15911 = Class1917.Method7157();
        this.Field15910 = Class1917.Method7153();
    }
    
    public void Method6530() {
        final EntityPlayerSP player = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        if (!player.isElytraFlying()) {
            final Class44 method7376 = Class1989.Field17152.Method7376();
            if (method7376 == null) {
                Intrinsics.throwNpe();
            }
            if (method7376.Method365() && Class115.Field8400.Method837(250)) {
                Class394.Method1952(Float.intBitsToFloat(1066098124));
            }
            final Class115 field8400 = Class115.Field8400;
            final Class44 method7377 = Class1989.Field17152.Method7383();
            if (method7377 == null) {
                Intrinsics.throwNpe();
            }
            if (!field8400.Method837(method7377.Method335())) {
                return;
            }
            switch (this.Field15909) {
                case 1: {
                    if (Class1917.Method7159()) {
                        final double longBitsToDouble = Double.longBitsToDouble(4608758678669597082L);
                        final Class44 method7378 = Class1989.Field17152.Method7380();
                        if (method7378 == null) {
                            Intrinsics.throwNpe();
                        }
                        final boolean method7379 = method7378.Method365();
                        final Class44 method7380 = Class1989.Field17152.Method7379();
                        if (method7380 == null) {
                            Intrinsics.throwNpe();
                        }
                        this.Field15910 = longBitsToDouble * Class1917.Method7154(method7379, method7380.Method367()) - Double.longBitsToDouble(4576918229304087675L);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (Class1917.Method7159() && Class2142.Field17803.player.onGround) {
                        Class2142.Field17803.player.motionY = Double.longBitsToDouble((long)433985284 ^ 0x3FD997F632B4F0D1L) + Class1917.Method7155();
                        this.Field15910 *= (this.Field15912 ? Double.longBitsToDouble((long)555842640 ^ 0x3FFAEF9D930C7206L) : Double.longBitsToDouble((long)19448368 ^ 0x3FF651EB84367A62L));
                        break;
                    }
                    break;
                }
                case 3: {
                    final double field8401 = this.Field15911;
                    final double longBitsToDouble2 = Double.longBitsToDouble(4604119971053405471L);
                    final double field8402 = this.Field15911;
                    final Class44 method7381 = Class1989.Field17152.Method7380();
                    if (method7381 == null) {
                        Intrinsics.throwNpe();
                    }
                    final boolean method7382 = method7381.Method365();
                    final Class44 method7383 = Class1989.Field17152.Method7379();
                    if (method7383 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.Field15910 = field8401 - longBitsToDouble2 * (field8402 - Class1917.Method7154(method7382, method7383.Method367()));
                    this.Field15912 = !this.Field15912;
                    break;
                }
                default: {
                    final WorldClient world = Class2142.Field17803.world;
                    final Entity entity = null;
                    final EntityPlayerSP player2 = Class2142.Field17803.player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    if ((world.getCollisionBoxes(entity, player2.getEntityBoundingBox().offset(0.0, Class2142.Field17803.player.motionY, 0.0)).size() > 0 || Class2142.Field17803.player.collidedHorizontally) && this.Field15909 > 0) {
                        this.Field15909 = (Class1917.Method7159() ? 1 : 0);
                    }
                    this.Field15910 = this.Field15911 - this.Field15911 / 159;
                    break;
                }
            }
            this.Field15910 = Math.min(this.Field15910, Class961.Field12102.Method6679());
            final double field8403 = this.Field15910;
            final Class44 method7384 = Class1989.Field17152.Method7380();
            if (method7384 == null) {
                Intrinsics.throwNpe();
            }
            final boolean method7385 = method7384.Method365();
            final Class44 method7386 = Class1989.Field17152.Method7379();
            if (method7386 == null) {
                Intrinsics.throwNpe();
            }
            this.Field15910 = Math.max(field8403, Class1917.Method7154(method7385, method7386.Method367()));
            Class1917.Method7158((float)this.Field15910);
            if (Class1917.Method7159()) {
                this.Field15909++;
            }
        }
    }
    
    Class1714() {
        this.Field15909 = 4;
    }
    
    private static String Method6568(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xCEA ^ 0xB0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
