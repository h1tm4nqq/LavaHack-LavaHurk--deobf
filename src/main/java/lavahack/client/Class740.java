//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;

public class Class740 extends Class42
{
    private Class44 Field11122;
    private Class44 Field11123;
    private String Field11124 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class740() {
        super("MiddleClick", "MiddleClick", Class97.Field8344);
        this.Field11122 = new Class44("Mode", (Class42)this, (Enum)Class819.Field11498);
        this.Field11123 = new Class44("SwitchMode", (Class42)this, (Enum)Class102.Field8355);
        Class740.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11122);
        Class740.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11123);
    }
    
    public boolean Method52() {
        return true;
    }
    
    public void Method45() {
        if (Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && Mouse.isButtonDown(2)) {
            final int currentItem = Class740.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            final String method359 = this.Field11122.Method359();
            switch (method359.hashCode()) {
                case 70141: {
                    if (method359.equals("Exp")) {
                        break;
                    }
                    break;
                }
                case 76987430: {
                    if (method359.equals("Pearl")) {
                        break;
                    }
                    break;
                }
                case 2450826: {
                    if (method359.equals("Obby")) {
                        break;
                    }
                    break;
                }
            }
            if (this.Field11123.Method359().equals(Class102.Field8355.name()) && currentItem != -1) {
                Class9.Method110(currentItem, true);
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1026 ^ 0xC6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
