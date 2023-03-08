//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

@Class2012
public class Class679 extends Class42
{
    private int Field10885;
    
    public Class679() {
        super("AutoRespawn", "Automatically respawn after death", Class97.Field8341);
    }
    
    public void Method45() {
        if (Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() == 0.0f) {
            Class679.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.respawnPlayer();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4D0C ^ 0x12));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
