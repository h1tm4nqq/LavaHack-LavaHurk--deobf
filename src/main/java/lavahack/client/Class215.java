//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class215 extends Class158
{
    private String Field8922 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class215() {
        super("shutdown");
    }
    
    public String Method447() {
        return "shuts down Minecraft";
    }
    
    public String Method448() {
        return "shutdown client/hard/crash";
    }
    
    public void Method443(final String s, final String[] array) {
        if (array[0].equals("client")) {
            Class215.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.shutdownMinecraftApplet();
        }
        else if (array[0].equals("hard")) {
            Class215.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.shutdown();
        }
        else if (array[0].equals("crash")) {
            System.exit(1);
        }
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x14BF ^ 0xEC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
