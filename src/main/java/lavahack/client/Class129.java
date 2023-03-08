//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

class Class129
{
    Object Field8442;
    Object Field8443;
    private String Field8444 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class129() {
        this.Field8442 = null;
        this.Field8443 = null;
    }
    
    private void Method860(final Object o) {
        if (this.Field8442 == null) {
            this.Field8442 = o;
            return;
        }
        if (this.Field8443 == null) {
            if (o == this.Field8442) {
                return;
            }
            this.Field8443 = o;
        }
    }
    
    private boolean Method861() {
        return this.Field8442 != null && this.Field8443 != null;
    }
    
    Class129(final Class286 class286) {
        this();
    }
    
    static boolean Method862(final Class129 class129) {
        return class129.Method861();
    }
    
    static void Method863(final Class129 class129, final Object o) {
        class129.Method860(o);
    }
}
