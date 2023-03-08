//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import com.kisman.cc.util.*;

public class Class1701
{
    private Class42 Field15875;
    private int Field15876;
    private float Field15877;
    private boolean Field15878;
    private boolean Field15879;
    private String Field15880 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1701() {
        this.Field15878 = false;
        this.Field15879 = false;
    }
    
    public void Method6523(final Class42 field15875, final int n, final float n2) {
        if (field15875 == this.Field15875) {
            this.Field15876 = n;
            this.Field15877 = n2;
            this.Field15878 = true;
        }
        else if (n > this.Field15876 || !this.Field15878) {
            this.Field15875 = field15875;
            this.Field15876 = n;
            this.Field15877 = n2;
            this.Field15878 = true;
        }
    }
    
    public void Method6524(final Class42 class42) {
        if (this.Field15875 == class42) {
            this.Field15878 = false;
        }
    }
    
    public void Method6525() {
        if (Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null) {
            Minecraft.getMinecraft().timer.tickLength = Float.intBitsToFloat(1112014848);
            return;
        }
        if (this.Field15879 && Class602.Field10562.Method2604() > Double.longBitsToDouble(4593671619917905920L)) {
            Minecraft.getMinecraft().timer.tickLength = Math.min(Float.intBitsToFloat(1140457472), Float.intBitsToFloat(1112014848) * (Float.intBitsToFloat(1101004800) / Class602.Field10562.Method2604()));
        }
        else {
            Minecraft.getMinecraft().timer.tickLength = (this.Field15878 ? (Float.intBitsToFloat(1112014848) / this.Field15877) : Float.intBitsToFloat(1112014848));
        }
    }
    
    public boolean Method6526() {
        return this.Field15879;
    }
    
    public void Method6527(final boolean field15879) {
        this.Field15879 = field15879;
    }
}
