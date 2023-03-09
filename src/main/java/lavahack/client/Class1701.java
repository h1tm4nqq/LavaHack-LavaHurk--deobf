//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import com.kisman.cc.util.Class602;
import lavahack.client.Class42;
import net.minecraft.client.Minecraft;

public class Class1701 {
    private Class42 Field15875;
    private int Field15876;
    private float Field15877;
    private boolean Field15878 = false;
    private boolean Field15879 = false;
    private String Field15880 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method6523(Class42 class42, int n, float f) {
        if (class42 == this.Field15875) {
            this.Field15876 = n;
            this.Field15877 = f;
            this.Field15878 = true;
            return;
        }
        if (n <= this.Field15876) {
            if (this.Field15878) return;
        }
        this.Field15875 = class42;
        this.Field15876 = n;
        this.Field15877 = f;
        this.Field15878 = true;
    }

    public void Method6524(Class42 class42) {
        if (this.Field15875 != class42) return;
        this.Field15878 = false;
    }

    public void Method6525() {
        if (Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null) {
            Minecraft.getMinecraft().timer.tickLength = Float.intBitsToFloat(1112014848);
            return;
        }
        if (this.Field15879 && (double)Class602.Field10562.Method2604() > Double.longBitsToDouble(4593671619917905920L)) {
            Minecraft.getMinecraft().timer.tickLength = Math.min(Float.intBitsToFloat(1140457472), Float.intBitsToFloat(1112014848) * (Float.intBitsToFloat(1101004800) / Class602.Field10562.Method2604()));
            return;
        }
        Minecraft.getMinecraft().timer.tickLength = this.Field15878 ? Float.intBitsToFloat(1112014848) / this.Field15877 : Float.intBitsToFloat(1112014848);
    }

    public boolean Method6526() {
        return this.Field15879;
    }

    public void Method6527(boolean bl) {
        this.Field15879 = bl;
    }
}

