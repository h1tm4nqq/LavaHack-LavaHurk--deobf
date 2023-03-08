//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import org.lwjgl.input.*;

public class Class1789 extends Class42
{
    private Class129 Field16207;
    private String Field16208 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1789() {
        super("SelectionPlacer", Class97.Field8343);
        this.Field16207 = new Class129((Class286)null);
    }
    
    @Override
    public void Method45() {
        if (Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!Class129.Method862(this.Field16207)) {
            this.Method20();
        }
        if (!Class129.Method862(this.Field16207)) {
            return;
        }
        this.Method6768(new Class1496((Vec3i)this.Field16207.Field8442, (Vec3i)this.Field16207.Field8443, (Class286)null));
    }
    
    private void Method6768(final Class1496 class1496) {
        if (!Class1496.Method5995(class1496)) {
            return;
        }
        if (!(Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() instanceof ItemBlock)) {
            return;
        }
        Class1036.Method4208(Class1496.Method5996(class1496), EnumHand.MAIN_HAND, false, false);
    }
    
    private void Method20() {
        if (!Mouse.isButtonDown(0)) {
            return;
        }
        Class129.Method863(this.Field16207, (Object)Class1789.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos());
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6A1B ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
