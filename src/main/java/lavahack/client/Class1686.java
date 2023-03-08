//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.text.*;

public class Class1686 extends Class42
{
    private Class44 Field15833;
    public static Class1686 Field15834;
    @Class1801
    private final Class618 Field15835;
    private String Field15836 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1686() {
        super("NameProtect", "NameProtect", Class97.Field8343);
        this.Field15833 = new Class44("Name", this, "Kisman", "Kisman", true);
        this.Field15835 = new Class618(this::Method6491, new Predicate[0]);
        Class1686.Field15834 = this;
        Class1686.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15833);
    }
    
    @Override
    public boolean Method52() {
        return true;
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field15835);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field15835);
    }
    
    private boolean Method6490(final String s) {
        if (Class1686.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return false;
        }
        Class1393.Method5508(s.replace(Class1686.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName(), this.Field15833.Method359()));
        return true;
    }
    
    private void Method6491(final Class544 class544) {
        final SPacketChat sPacketChat;
        if (class544.Method982() instanceof SPacketChat && (sPacketChat = (SPacketChat)class544.Method982()).getType() != ChatType.GAME_INFO && this.Method6490(sPacketChat.getChatComponent().getFormattedText())) {
            class544.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x607C ^ 0x46));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
