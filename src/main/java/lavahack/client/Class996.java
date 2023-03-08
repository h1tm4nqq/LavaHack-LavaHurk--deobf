//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.lang.reflect.*;

class Class996
{
    private final Method Field12283;
    private final Class Field12284;
    private final Class Field12285;
    private final Object Field12286;
    private final Class1786 Field12287;
    private String Field12288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class996(final Method field12283, final Object field12284, final Class1786 field12285) {
        field12283.setAccessible(true);
        final Class<?>[] parameterTypes = field12283.getParameterTypes();
        this.Field12283 = field12283;
        this.Field12284 = field12283.getDeclaringClass();
        this.Field12285 = parameterTypes[0];
        this.Field12286 = field12284;
        this.Field12287 = field12285;
    }
    
    public static Class996 Method4027(final Class1528 class1528) {
        final Method method6067 = class1528.Method6067();
        final Object method6068 = class1528.Method6068();
        if (!Method4033(method6067)) {
            return null;
        }
        return new Class996(method6067, method6068, method6067.getAnnotation(Class1786.class));
    }
    
    public void Method4028(final Object o) {
        this.Field12283.invoke(this.Field12286, o);
    }
    
    public Class Method4029() {
        return this.Field12284;
    }
    
    public Class Method4030() {
        return this.Field12285;
    }
    
    public Object Method4031() {
        return this.Field12286;
    }
    
    public Class1786 Method4032() {
        return this.Field12287;
    }
    
    public static boolean Method4033(final Method method) {
        return method.getParameterTypes().length == 1 && method.getAnnotation(Class1786.class) != null;
    }
}
