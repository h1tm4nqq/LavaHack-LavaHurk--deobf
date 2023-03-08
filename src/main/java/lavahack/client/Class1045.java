//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

class Class1045 implements UncaughtExceptionHandler
{
    final Class1622 Field12633;
    final Class1187 Field12634;
    private int Field12635;
    
    Class1045(final Class1187 field12634, final Class1622 field12635) {
        this.Field12634 = field12634;
        this.Field12633 = field12635;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        Class1622.Method6353(this.Field12634.Field13382).error("Uncaught exception in thread {}: {}", (Object)thread.getName(), (Object)t);
    }
    
    private static String Method4277(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF89 ^ 0x11));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
