//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class597 extends RuntimeException
{
    private String Field10541 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class597(final String message) {
        super(message);
        this.setStackTrace(new StackTraceElement[0]);
    }
    
    @Override
    public String toString() {
        return "URLReaderException error! Please create ticket in TheDiscord about the crash!";
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
    
    private static String Method2581(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6752 ^ 0xD0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
