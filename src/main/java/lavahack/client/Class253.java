//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.util.*;

@Class1887
@Deprecated
public class Class253 extends Class42
{
    private boolean Field9125;
    private int Field9126;
    @Class1801
    private final Class618 Field9127;
    @Class1801
    private final Class618 Field9128;
    private int Field9129;
    
    public Class253() {
        super("HandMine", Class97.Field8344);
        this.Field9125 = true;
        this.Field9127 = new Class618(this::Method1368, new Predicate[0]);
        this.Field9128 = new Class618(this::Method1367, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
        this.Field9125 = true;
    }
    
    private void Method1367(final Class453 class453) {
        Class1393.Method5505().Method1886("damage");
        if (this.Field9125) {
            class453.Method158();
        }
    }
    
    private void Method1368(final Class1334 class1334) {
        if (Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.isKeyDown()) {
            return;
        }
        Class1393.Method5505().Method1886("move");
        final int method109 = Class9.Method109(Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos());
        final int currentItem = Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (method109 != 1) {
            Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method109;
            Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        }
        this.Field9125 = false;
        Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos(), Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit);
        this.Field9125 = true;
        if (method109 != -1) {
            Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
            Class253.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x48AD ^ 0xA4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
