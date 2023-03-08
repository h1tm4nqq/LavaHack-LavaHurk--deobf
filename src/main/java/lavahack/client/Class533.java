//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class533 implements Runnable
{
    private static Class533 Field10254;
    private Class1416 Field10255;
    private String Field10256 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Class533 Method2419(final Class1416 field10255) {
        if (Class533.Field10254 == null) {
            Class533.Field10254 = new Class533();
            Class533.Field10254.Field10255 = field10255;
        }
        return Class533.Field10254;
    }
    
    @Override
    public void run() {
        if (this.Field10255.Field14535.Method309("While")) {
            while (this.Field10255.Method35() && this.Field10255.Field14535.Method309("While")) {
                if (Class1416.Method5667(this.Field10255).get()) {
                    Class1416.Method5667(this.Field10255).set(false);
                    Class1416.Method5668(this.Field10255).Method2801();
                    Class1416.Method5669(this.Field10255).interrupt();
                }
                Class1416.Method5670(this.Field10255).set(true);
                this.Field10255.Method20();
                Class1416.Method5670(this.Field10255).set(false);
                Thread.sleep(this.Field10255.Field14536.Method369());
            }
        }
        else if (!this.Field10255.Field14535.Method309("None")) {
            Class1416.Method5670(this.Field10255).set(true);
            this.Field10255.Method20();
            Class1416.Method5670(this.Field10255).set(false);
        }
    }
    
    private static String Method2420(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x63D6 ^ 0xB6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
