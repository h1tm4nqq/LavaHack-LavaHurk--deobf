//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1334;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class453;
import lavahack.client.Class618;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.util.EnumHand;

@Class1887
@Deprecated
public class Class253
extends Class42 {
    private boolean Field9125 = true;
    private int Field9126;
    @Class1801
    private final Class618 Field9127 = new Class618(this::Method1368, new Predicate[0]);
    @Class1801
    private final Class618 Field9128 = new Class618(this::Method1367, new Predicate[0]);
    private int Field9129;

    public Class253() {
        super("HandMine", Class97.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
        this.Field9125 = true;
    }

    private void Method1367(Class453 class453) {
        Class1393.Method5505().Method1886("damage");
        if (!this.Field9125) return;
        class453.Method158();
    }

    private void Method1368(Class1334 class1334) {
        if (Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.isKeyDown()) {
            return;
        }
        Class1393.Method5505().Method1886("move");
        int n = Class9.Method109(Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos());
        int n2 = Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (n != 1) {
            Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        }
        this.Field9125 = false;
        Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos(), Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit);
        this.Field9125 = true;
        if (n == -1) return;
        Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 164;
            cArray2[n] = (char)(cArray[n] ^ (0x48AD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

