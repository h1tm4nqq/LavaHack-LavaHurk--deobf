//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import com.kisman.cc.util.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import net.minecraft.client.Minecraft;

public class gdKZuZQ3zBNwCAUkBQYaVetDDusT2Abq {
    private WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field15875;
    private int Field15876;
    private float Field15877;
    private boolean Field15878 = (int)((long)222406307 ^ (long)222406307);
    private boolean Field15879 = (int)-403351279L ^ 0xE7F55911;
    private String Field15880 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method6523(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, int n, float f) {
        if (wjjBVRrUqJUKhloA7ANknrTEODhuGa0J == this.Field15875) {
            this.Field15876 = n;
            this.Field15877 = f;
            this.Field15878 = (int)-950451344L ^ 0xC7594371;
            return;
        }
        if (n <= this.Field15876) {
            if (this.Field15878) return;
        }
        this.Field15875 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field15876 = n;
        this.Field15877 = f;
        this.Field15878 = (int)((long)-65062561 ^ (long)-65062562);
    }

    public void Method6524(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        if (this.Field15875 != wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) return;
        this.Field15878 = (int)880574215L ^ 0x347C7F07;
    }

    public void Method6525() {
        if (Minecraft.getMinecraft().world == null || Minecraft.getMinecraft().player == null) {
            Minecraft.getMinecraft().timer.tickLength = Float.intBitsToFloat((int)2040466465L ^ 0x3BD70C21);
            return;
        }
        if (this.Field15879 && (double)Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro.Field10562.Method2604() > Double.longBitsToDouble(0x1ABFC2176C9714B9L ^ 0x257FC2176C9714B9L)) {
            Minecraft.getMinecraft().timer.tickLength = Math.min(Float.intBitsToFloat(0x2E6F758A ^ 0x6D95758A), Float.intBitsToFloat((int)296550369L ^ 0x53E4FFE1) * (Float.intBitsToFloat((int)((long)220479129 ^ (long)1283735193)) / Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro.Field10562.Method2604()));
            return;
        }
        Minecraft.getMinecraft().timer.tickLength = this.Field15878 ? Float.intBitsToFloat(0x1535C740 ^ 0x577DC740) / this.Field15877 : Float.intBitsToFloat((int)1713403529L ^ 0x24687689);
    }

    public boolean Method6526() {
        return this.Field15879;
    }

    public void Method6527(boolean bl) {
        this.Field15879 = bl;
    }
}

