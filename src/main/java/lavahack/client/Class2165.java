//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.entity.player.*;

public class Class2165 extends Class42
{
    private Class44 Field17901;
    private Class44 Field17902;
    private Class44 Field17903;
    private int Field17904;
    private String Field17905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2165() {
        super("TargetStrafe", "TargetStrafe", Class97.Field8340);
        this.Field17901 = this.Method23(new Class44("Radius", this, Double.longBitsToDouble(4615288897914535936L), Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble(4619567317775286272L), false));
        this.Field17902 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble(4614365660205673349L), Double.longBitsToDouble((long)1121852626 ^ 0x3FC3333302DE1CD2L), Double.longBitsToDouble(4632233691727265792L), false));
        this.Field17903 = this.Method23(new Class44("Auto Jump", this, false));
    }
    
    @Override
    public void Method45() {
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || !Class1796.Field16241.Field16254.Method1162("KillAuraRewrite").Method35()) {
            return;
        }
        final EntityPlayer method1924 = Class394.Method1924(Float.intBitsToFloat(1086324736));
        if (method1924 == null) {
            super.Method43("[Radius: " + this.Field17901.Method335() + " | Speed: " + this.Field17902.Method335() + "]");
            return;
        }
        super.Method43("[" + ((Entity)method1924).getName() + " | Radius: " + this.Field17901.Method335() + " | Speed: " + this.Field17902.Method335() + "]");
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            this.Field17904 = -this.Field17904;
        }
        if (this.Field17903.Method365() && Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        }
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.isKeyDown()) {
            this.Field17904 = 1;
        }
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.isKeyDown()) {
            this.Field17904 = -1;
        }
        Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward = 0.0f;
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)method1924) <= this.Field17901.Method367()) {
            this.Method7805(this.Field17902.Method335() - (Double.longBitsToDouble(4596373779694328218L) - this.Field17902.Method367() / Double.longBitsToDouble((long)1501061020 ^ 0x4059000059785F9CL)), Class1568.Method6183((Entity)method1924)[0], this.Field17904, 0.0);
        }
        else {
            this.Method7805(this.Field17902.Method335() - (Double.longBitsToDouble((long)1616962302 ^ 0x3FC99999F9F97B64L) - this.Field17902.Method367() / Double.longBitsToDouble((long)393502091 ^ 0x4059000017745D8BL)), Class1568.Method6183((Entity)method1924)[0], this.Field17904, 1.0);
        }
    }
    
    private void Method7805(final double n, final float n2, final double n3, final double n4) {
        double longBitsToDouble = n4;
        double n5 = n3;
        float n6 = n2;
        if (longBitsToDouble == 0.0 && n5 == 0.0) {
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        else {
            if (longBitsToDouble != 0.0) {
                if (n5 > 0.0) {
                    n6 += ((longBitsToDouble > 0.0) ? -45 : 45);
                }
                else if (n5 < 0.0) {
                    n6 += ((longBitsToDouble > 0.0) ? 45 : -45);
                }
                n5 = 0.0;
                if (longBitsToDouble > 0.0) {
                    longBitsToDouble = 1.0;
                }
                else if (longBitsToDouble < 0.0) {
                    longBitsToDouble = Double.longBitsToDouble(-4616189618054758400L);
                }
            }
            final double cos = Math.cos(Math.toRadians(n6 + Float.intBitsToFloat(1119092736)));
            final double sin = Math.sin(Math.toRadians(n6 + Float.intBitsToFloat(1119092736)));
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = longBitsToDouble * n * cos + n5 * n * sin;
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = longBitsToDouble * n * sin - n5 * n * cos;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x51BB ^ 0xB4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
