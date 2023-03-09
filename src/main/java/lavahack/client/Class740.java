//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import lavahack.client.Class102;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class819;
import lavahack.client.Class9;
import lavahack.client.Class97;
import org.lwjgl.input.Mouse;

public class Class740
extends Class42 {
    private Class44 Field11122 = new Class44("Mode", (Class42)this, Class819.Field11498);
    private Class44 Field11123 = new Class44("SwitchMode", (Class42)this, Class102.Field8355);
    private String Field11124 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class740() {
        super("MiddleClick", "MiddleClick", Class97.Field8344);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11122);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11123);
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method45() {
        if (Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null) return;
        if (!Mouse.isButtonDown((int)2)) return;
        int n = Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        String string = this.Field11122.Method359();
        int n2 = -1;
        switch (string.hashCode()) {
            case 70141: {
                if (string.equals("Exp")) {
                    n2 = 0;
                }
                break;
            }
            case 76987430: {
                if (string.equals("Pearl")) {
                    n2 = 1;
                }
                break;
            }
            case 2450826: {
                if (string.equals("Obby")) {
                    n2 = 2;
                }
                break;
            }
        }
        if (!this.Field11123.Method359().equals(Class102.Field8355.name())) return;
        if (n == -1) return;
        Class9.Method110(n, true);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 198;
            cArray2[n] = (char)(cArray[n] ^ (0x1026 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

