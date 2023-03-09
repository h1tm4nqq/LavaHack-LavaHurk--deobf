//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.Vec3i
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import lavahack.client.Class1036;
import lavahack.client.Class129;
import lavahack.client.Class1496;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.input.Mouse;

public class Class1789
extends Class42 {
    private Class129 Field16207 = new Class129(null);
    private String Field16208 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1789() {
        super("SelectionPlacer", Class97.Field8343);
    }

    @Override
    public void Method45() {
        if (Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!Class129.Method862(this.Field16207)) {
            this.Method20();
        }
        if (!Class129.Method862(this.Field16207)) {
            return;
        }
        Class1496 class1496 = new Class1496((Vec3i)this.Field16207.Field8442, (Vec3i)this.Field16207.Field8443, null);
        this.Method6768(class1496);
    }

    private void Method6768(Class1496 class1496) {
        if (!Class1496.Method5995(class1496)) {
            return;
        }
        if (!(Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() instanceof ItemBlock)) {
            return;
        }
        Class1036.Method4208(Class1496.Method5996(class1496), EnumHand.MAIN_HAND, false, false);
    }

    private void Method20() {
        if (!Mouse.isButtonDown((int)0)) {
            return;
        }
        Class129.Method863(this.Field16207, Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0x6A1B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

