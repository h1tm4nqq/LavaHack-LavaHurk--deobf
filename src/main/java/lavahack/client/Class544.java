//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.*;

public class Class544 extends Class145
{
    private int Field10319;
    
    public Class544(final Packet packet) {
        super(packet);
    }
    
    public String Method163() {
        return "packet_receive";
    }
    
    public boolean Method2443(final String anotherString) {
        if (Class1796.Field16247) {
            return Class942.Field12018.containsKey(anotherString) && Class942.Field12018.get(anotherString).getSimpleName().equalsIgnoreCase(this.Method982().getClass().getSimpleName());
        }
        return this.Method982().getClass().getSimpleName().equalsIgnoreCase(anotherString);
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xC11 ^ 0x31));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
